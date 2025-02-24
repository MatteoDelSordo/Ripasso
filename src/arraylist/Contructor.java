package arraylist;

import javax.sound.midi.SoundbankResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Contructor {

    public static void main(String[] args) {


        ArrayList<String> a = new ArrayList<>();
        int counter = 0;
        for (String s : a) {
            counter++;
            System.out.println("sei qui" + counter);
        }
        int counter2 = 0;
        ArrayList<String> b = new ArrayList<>(30);
        for (String s : b) {
            counter2++;
            System.out.println("ora sei qui" + counter2);

        }
        String sArray[] = {"aaa", "bho", "ciao", "eheh"};


        ArrayList<String> c = new ArrayList<>(List.of(sArray));


        for (String s : c) {
            System.out.println("arrayList c element " + s);
        }
        System.out.println(c);

        ArrayList<String> al = new ArrayList();
        al.add("ciao");
        al.add("pippo");
        al.add("bhozzi");

        /*System.out.println(
                "Questa arraylist è stata istanziata senza un tipo, perchè gli è stato autoasssegnato nel momento in "
                        + "cui è stato aggiunto il primo parametro. La sia grandezza è " + al.size() + ", mentre il "
                         + "contenuto è il seguente " + al);*/


        al.remove("ciao");

        System.out.println(al);

        al.add("ciao");
        al.add("Ciao");
        System.out.println("Affiunto Ciao e ciao");

        System.out.println(al);

        al.removeIf(bho -> bho.equalsIgnoreCase("ciao"));
        System.out.println("Rimosso ciao");
        System.out.println(al);

        /*
        al.add("ciao");
        al.add("Ciao");
        System.out.println("Affiunto Ciao e ciao");

        al = (ArrayList) al.stream().filter(pippo -> !pippo.equals("ciao")).collect(Collectors.toList());
        System.out.println("Rimosso ciao");
        System.out.println(al);*/


    }


}
