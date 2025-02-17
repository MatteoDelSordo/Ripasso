package incapsulamento;

public class IncapsulamentoTest {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.setAcc_no(12345);
        acc.setEmail("Mail@mail.com");
        acc.setNome("Matteo");
        acc.setQuantita(1999f);
        System.out.println(acc);

    }
}
