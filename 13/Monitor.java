public class Monitor{
    String nome;
    String marca;
    int ano;
    double polegadas;

    public static void main(String[] args) {
        Monitor V226HQL = new Monitor();
            V226HQL.nome = "V226HQL";
            V226HQL.marca = "Acer";
            V226HQL.ano = 2016;
            V226HQL.polegadas = 21.5;
        System.out.println(V226HQL.nome + ", marca " + V226HQL.marca + ", ano " + V226HQL.ano + ", tamanho: " + V226HQL.polegadas + " polegadas.");
    }

}