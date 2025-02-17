package incapsulamento;

public class Account {
    private long acc_no;
    private String nome, email;
    private float quantita;

    public Account() {

    }

    public Account(long acc_no, String nome, String email, float quantita) {
        this.acc_no = acc_no;
        this.nome = nome;
        this.email = email;
        this.quantita = quantita;
    }

    public float getQuantita() {
        return quantita;
    }

    public void setQuantita(float quantita) {
        this.quantita = quantita;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    @Override
    public String toString() {
        return "Account{" +
                "acc_no=" + acc_no +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", quantita=" + quantita +
                '}';
    }
}
