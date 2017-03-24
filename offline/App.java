class App{

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
