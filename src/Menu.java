import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("------Menu------");
        System.out.println("1 - Adicionar Livros");
        System.out.println("2 - Exibir Livros");
        System.out.println("0 - Sair");
        int opcao = sc.nextInt();

        while (opcao != 0){

            switch (opcao){
                case 1 :
                    biblioteca.adicionarLivro();
                    break;
                case 2:
                    biblioteca.exibirLivros();
                case 0:
                    break;
                default:
                    System.out.println("Insira uma opção válida");
            }
            System.out.println("------Menu------");
            System.out.println("1 - Adicionar Livros");
            System.out.println("2 - Exibir Livros");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
        }
        }

        }


