import br.com.dio.dao.UserDAO;
import br.com.dio.exception.EmptyStorageException;
import br.com.dio.exception.UserNotFoundException;
import br.com.dio.exception.ValidatorException;
import br.com.dio.exception.customException;
import br.com.dio.model.MenuOption;
import br.com.dio.model.UserModel;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static br.com.dio.validator.UserValidator.verifyModel;

public class menu01 {

    private final static UserDAO dao = new UserDAO();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            System.out.println("Bem vindo ao cadatro de usuários, selecione a operação desejada");
            System.out.println("1. Cadastrar");
            System.out.println("2. Atualizar");
            System.out.println("3. Excluir");
            System.out.println("4. Buscar o identificador");
            System.out.println("5. Listar");
            System.out.println("6. Sair");
            var userInput = scanner.nextInt();

            var selectOption = MenuOption.values()[userInput - 1];
            switch (selectOption){
                case SAVE -> {
                    try {
                        var user = dao.save(requestToSave());
                        System.out.printf("Usuário cadastrado %s", user);
                    }catch (customException ex){
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    }
                }
                case UPDATE -> {
                    try {
                        var user = dao.update(requestToUpdate());
                        System.out.printf("Usuário atualizado %s", user);
                    }catch (UserNotFoundException | EmptyStorageException ex) {
                        System.out.println(ex.getMessage());
                    }catch (customException ex) {
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();

                    }finally {
                        System.out.println("======================================");
                    }
                }
                case DELETE -> {
                    try {
                        dao.delete(requestId());
                        System.out.println("Usuário excluído com sucesso");
                    }catch (UserNotFoundException | EmptyStorageException ex) {
                        System.out.println(ex.getMessage());
                    }finally {
                        System.out.println("======================================");
                    }
                }
                case FIND_BY_ID -> {
                    try {
                        var id = requestId();
                        var user = dao.findById(id);
                        System.out.printf("Usuário com id %s ", id);
                        System.out.println(user);
                    }catch (UserNotFoundException | EmptyStorageException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                case FIND_ALL -> {
                    try{
                        var users = dao.findAll();
                        System.out.println("Usuários cadastrados: \n");
                        System.out.println("==================fim=================");
                        users.forEach(System.out::println);
                    }catch (UserNotFoundException | EmptyStorageException ex) {
                        System.out.println(ex.getMessage());
                    }finally {
                        System.out.println("======================================");
                    }
                }
                case EXIT -> System.exit(0);
            }
        }
    }

    private static long requestId(){
        System.out.println("Informe o identificador do usuário:  ");
        return scanner.nextLong();
    }

    private static UserModel requestToSave() {
        System.out.println("Informe o nome do usuário:  ");
        var name = scanner.next();
        System.out.println("Informe o e-mail do usuário:  ");
        var email = scanner.next();
        System.out.println("Informe o data de nascimento do usuário: (dd/MM/yyyy)");
        var birthdayString = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = java.time.LocalDate.parse(birthdayString, formatter);
        return validateInput(0, name, email, birthday);
    }

    private static UserModel validateInput(final long id, final String name, final String email, final LocalDate birthday)  {
        var user = new UserModel(id, name, email, birthday);
        try {

            verifyModel(user);
            return user;
        }catch (ValidatorException ex) {
            throw new customException("O seu usuário contém erros" + ex.getMessage(), ex);
        }
    }

    private static UserModel requestToUpdate() {
        System.out.println("Informe o identificador do usuário:  ");
        var id =  scanner.nextLong();
        System.out.println("Informe o nome do usuário:  ");
        var name =  scanner.next();
        System.out.println("Informe o e-mail do usuário:  ");
        var email =  scanner.next();
        System.out.println("Informe o data de nascimento do usuário: (dd/MM/yyyy) ");
        var birthdayString = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = java.time.LocalDate.parse(birthdayString, formatter);
        return validateInput(id, name, email, birthday);

    }
}

