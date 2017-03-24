class Main{

  public static void main(String args[]){

      ParImpar jogo = new ParImpar();
      jogo.escolherParParaOJogador1();
      jogo.escolherValorParaOJogador1(1);
      jogo.escolherValorParaOJogador2(2);
      jogo.calcularResultado();

      Jogador ganhador = jogo.quemGanhou();
      System.out.println(ganhador.nome);
  }
}

class ParImpar{
  Jogador j1;
  Jogador j2;
  int resultado;

  public ParImpar(){
    this.j1 = new Jogador();
    this.j1.nome = "J1";
    this.j2 = new Jogador();
    this.j2.nome = "J2";
    this.resultado = 0;
  }

  public void escolherParParaOJogador1(){
    this.j1.escolheuPar = true;
    this.j2.escolheuPar = false;
  }
  public void escolherParParaOJogador2(){
    this.j1.escolheuPar = false;
    this.j2.escolheuPar = true;
  }

  public void escolherValorParaOJogador1(int i){
    this.j1.valorEscolhido = i;
  }

  public void escolherValorParaOJogador2(int i){
    this.j2.valorEscolhido = i;
  }

  public void calcularResultado(){
    this.resultado = this.j1.valorEscolhido + this.j2.valorEscolhido;
  }

  public Jogador quemGanhou(){
    Jogador ganhador = null;
    if(this.j1.escolheuPar && this.resultado%2 == 0){
      ganhador = this.j1;
    }
    else if(this.j2.escolheuPar && this.resultado%2 == 0){
      ganhador = this.j2;
    }
    if(!this.j1.escolheuPar && this.resultado%2 == 1){
      ganhador = this.j1;
    }
    else if(!this.j2.escolheuPar && this.resultado%2 == 1){
      ganhador = this.j2;
    }
    return ganhador;
  }
}

class Jogador{
  String nome;
  int valorEscolhido;
  boolean escolheuPar;

  public Jogador(){
    this.valorEscolhido = 0;
    this.escolheuPar = false;
    this.nome = "";
  }
}

