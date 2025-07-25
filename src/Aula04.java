public class Aula04 {
    public static void main(String[] args) {
        int value1 =6;
        String binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número de operação %s (representação binária %s)\n", value1, binary1);

        int value2 =5;
        String binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número de operação %s (representação binária %s)\n", value2, binary2);
        var result = value1 | value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s | %s = %s (Representação binária %s)\n", value1, value2, result, binaryResult);

    }
    /* << empurra pra esquerda e completa com 0 e >> empura pra direita e completa com 0 ou 1 & >>> empurra pra direita e completa com 0 e 1
     criou a seguinte conta:
    0 = false 1 = true
    110
    101
    resultado
    111
     */
}
