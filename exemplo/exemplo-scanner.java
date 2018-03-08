//define um dos pacotes que vai ser usado neste programa.
//neste caso específico, queremos usar a classe Scanner, parte do pacote chamada java.util. Mesma ideia do #include do c.
import java.util.Scanner;

//define a classe Main
class Main{

  //método main da classe Main. Ponto de entrada do programa
  public static void main(String args[]){
    
    //cria variáveis para armazenar os valores
    String nome = "";
    int idade = -1;

    //cria o objeto sc da classe Scanner. O System.in, significa que os dados virão por meio do console. 
    Scanner sc = new Scanner(System.in);
    
    //escreve na tela
    System.out.println("Digite um nome:");
    //espera ser digitado algo no console. O programa não continua enquanto algo não for digitado. nextLine é um método do objeto sc, que vai ler tudo que for digitado até encontrar um EOL, depois do Enter.
    nome = sc.nextLine();

    //escreve na tela
    System.out.println("Digite uma idade:");

    //recebe um inteiro.
    idade = sc.nextInt();

    //imprime os valores armazenados.
    System.out.println("nome digitado:"+nome);
    System.out.println("idade digitada:"+idade);
  }
}