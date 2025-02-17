package astrazione;

public class AstrazioneTest {
    public static void main(String[] args) {
        Persona p1 = new Studente("Matteo","maschio",2);
        Persona p2 = new Studente("Giacomo","maschio",5);
        Persona p3 = new Studente("Melanie","femmina",8);
        Persona p4 = new Studente("Francesco","maschio",3);
        Persona p5 = new Studente("Valeria","femmina",9);
        p1.studying();
        p2.studying();
        p3.studying();
        p4.studying();
        p5.studying();
        Studente s = new Studente("matteo","maschio");
        s.addizione();
    }
}
