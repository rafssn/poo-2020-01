public class Carro{
    String nome;
    String marca;
    int ano;
    boolean completo;

    public static void main(String[] args) {
        Carro palio = new Carro();
            palio.nome = "Palio";
            palio.marca = "Fiat";
            palio.ano = 2020;
            palio.completo = true;
        System.out.println(palio.nome + ", marca " + palio.marca + ", ano " + palio.ano);
    }

}