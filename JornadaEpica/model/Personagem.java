public abstract class Personagem {
    protected String nome;
    private String raca;
    private String classe;

    public Personagem(String novoNome, String novaRaca, String novaClasse) {
        nome = novoNome;
        raca = novaRaca;
        classe = novaClasse;
    }
}
