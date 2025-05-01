import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
        ArrayList<Livro> listaLivros = new ArrayList<Livro>();
        Scanner sc = new Scanner(System.in);
        String titulo;
        String autor;
        int anoPublicacao;
        String escolhaContinuar;

        public void adicionarLivro(){
            System.out.println("Título: ");
            titulo = sc.nextLine();
            while (!titulo.equals("0")) {
                System.out.println("Autor: ");
                autor = sc.nextLine();
                System.out.println("Ano de publicação: ");
                anoPublicacao = sc.nextInt();
                sc.nextLine();

                Livro novoLivro = new Livro(titulo, autor, anoPublicacao);
                listaLivros.add(novoLivro);

                System.out.println("Deseja Adicionar um novo livro?(S/N)");
                escolhaContinuar = sc.nextLine();

                if (escolhaContinuar.equals("S") || escolhaContinuar.equals("s")){
                    System.out.println("Título: ");
                    titulo = sc.nextLine();

                }
                else if (escolhaContinuar.equals("N") || escolhaContinuar.equals("n")){
                    break;
                }
                else{
                    System.out.println("Escolha uma opção válida");
                    System.out.println("Deseja Adicionar um novo livro?(S/N)");
                    escolhaContinuar = sc.nextLine();
                }


            }
        }

        public void exibirLivros(){
            if (listaLivros.isEmpty()){
                System.out.println("Sua biblioteca ainda está vazia, use a opção 1 para adicionar novos livros!! <3");

            }else{
                System.out.println("------Livros da Biblioteca------");
                int cont = 0;
                for (Livro livro : listaLivros) {
                    System.out.println("Livro "+cont+ "- "+livro);
                    cont++;
                }

            }
        }

        public void removerLivros(){
            //adicionar um exceção para quando digitarem numeros fora do array da lista de livros

          if (listaLivros.isEmpty()){
              System.out.println("Sua biblioteca ainda está vazia, use a opção 1 para adicionar novos livros!! <3");
              return;
          }
          else{
              exibirLivros();
          }

            while (true){
                System.out.println("Digite o número do livro que você quer remover:");
                int opcao = sc.nextInt();
                sc.nextLine();
                listaLivros.remove(opcao);
                System.out.println("Livro removido com sucesso");

                System.out.println("Deseja remover mais um livro?(S/N):");
                String escolharSair = sc.nextLine();

                if (escolharSair.equals("S") || escolharSair.equals("s")){
                    System.out.println("Digite o número do livro que você quer remover:");
                    opcao = sc.nextInt();
                    listaLivros.remove(opcao);
                    System.out.println("Livro removido com sucesso");

                }
                else if (escolharSair.equals("N") || escolharSair.equals("n")){
                    break;
                }
                else{
                    System.out.println("Escolha uma opção válida");
                    System.out.println("Deseja Removar um novo livro?(S/N)");
                    escolharSair = sc.nextLine();
                }
            }


        }





}
