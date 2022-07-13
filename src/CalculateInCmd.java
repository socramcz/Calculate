public class CalculateInCmd {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Dar pra substituir o "==" por ".equals()", que da no mesmo, como nos exemplos a seguir.
        // OBS => So pode usar um dessa opções acima, os simbolos de igualdade ou o .equals().
        if (args[0].equals("somar")){
            sum(x, y);
        } else if (args[0].equals("subtrair")) {
            minus(x, y);
        } else if (args[0].equals("dividir")) {
            division(x, y);
        } else if (args[0].equals("multiplicar")) {
            multiply(x, y);
        } else {
            System.out.println("Nenhuma Instrucao definida");
        }
    }

    static void sum(int x, int y) {
        System.out.println("Resultado da soma: " + (x + y));
    }

    static void minus(int x, int y) {
        System.out.println("Resultado da subtracao: " + (x - y));
    }

    static void division(int x, int y) {
        System.out.println("Resultado da divisao: " + (x / y));
    }

    static void multiply(int x, int y) {
        System.out.println("Resultado da multiplicacao: " + (x * y));
    }
}
