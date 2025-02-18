package primaLezione.astrazione;

public abstract class Persona {
private String nome;
private String genere;

    public Persona(String nome, String genere) {
        this.nome = nome;
        this.genere = genere;
    }

    public abstract void studying();


    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }

}
