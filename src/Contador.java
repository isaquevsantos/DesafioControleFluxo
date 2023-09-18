import java.util.Scanner;

// Defina a classe ParametrosInvalidosException
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o se10gundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException erro1) {
            System.out.println("Parametro Um deve ser maior que o Parametro Dois");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifique se parametroUm é MAIOR que parametroDois e lance a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Inicialize a variável contagem
        int contagem = parametroDois - parametroUm;

        // Realize o loop para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}
