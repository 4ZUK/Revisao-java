package cap04_estruturas_decisao;

public class Exemplo09_ComandoIfElse {

    public static void main(String[] args) {

        int numero = 813;
        System.out.println("definida variavel numero = "+numero);

        System.out.println("vai verificar se numero == 10");
        if (numero == 10) {
            // bloco de código para caso a condição do IF for satisfeita
            System.out.println("vai imprimir isso no console se numero == 10");
        } else {
            // bloco de código para caso a condição do IF NÃO for satisfeita
            System.out.println("vai imprimir isso no console se numero != 10");
        }

        System.out.println("vai imprimir isso de qualquer forma, pois o código está fora do bloco do IF-ELSE");

        // OBSERVAÇÕES:
        //
        // Troque o valor da variável numero e execute o metódo main() novamente para observar o comportamento do código.

    }
}
