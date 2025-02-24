package linkedLIst;

import java.nio.file.attribute.AclEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ListTest {


    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();


        list.add("Ciao, ");
        list.add("benvenuto ");
        list.add("in ");
        list.add("questo ");
        list.add("viaggio. ");

        Collection<String> collection = new ArrayList<>();
        collection.add("Oggi ");
        collection.add("scopriremo ");
        collection.add("qualcosa ");
        collection.add("di ");
        collection.add("nuovo ");
        collection.add("credo...");

        System.out.println("Questa è la lista prima di usare list.addAll: " + list);
        list.addAll(collection);
        System.out.println("Questa è la lista dopo aver usato list.addAll" + list);

        list.clear();

        System.out.println("Questa è la lista dopo aver usato .clear: " + list);


        System.out.println(
                "-̴̧̛̱͉̰̩̟͍̲͊͑̉͒̈́̎́͐͋̎͊̅̓͝-̴̣͉̦̤͍̯̗̖͍̤͉͙̝̇͂̊̅̋͒̈͂̚͝ͅ-̶̢̺̲͚̥̜͍͈̞̫̌̂͆̾́-̶̢̙̳̬̘̩̙̤̳͓̪̈́̈́̔̐͒̈͜͝-̸̛̞̲̲̞̐͛̂͂̇̈́̏̏̇͑̔͐͆͝-̵̹̗͚̭͍̓̏̏̓͠-̷̧̡̩͔͎̭͖͇͎͕͚̪̉͝-̶͉͍̥̖͉̞͓̫̱̬̠̾̊ͅ-̴̢͉̣̤̜̱̺̲̥͊̆̂̈́̑̐̓͋-̷̳͓̯̲̲̼̮͎̐̓̀̓̾̕̕͠͝͠͠-̶̨̡̣̟̫̭͈̪̩͙̂͊̓̄̌̾̾͌͂͒̏̾͘-̵̛̼͉͇̯̫͖̫̠͈̺͎̒͆͗̊͐̄͒́̅̌̃̃͝-̷̛̝͎͍͍̬͙̊͋́̊̃̌̈́̐̿̄̚-̸̧̨̳̤̤͍͍̟̹̳̲͓̭̗̋̈́͠-̶̘̘̘̭͎̈́̇͋̔͑̀͛̃͂̾̕-̸̗͔̘̱̰̙̜͉̃͋͗͜ͅ-̷̧̠̼͉̙̲̞̱̬̊͑͊̓͠ͅͅ-̵̤̹̠̮̾̈́̊̒̏̎̇͌̍̑̈́́̿͆̚-̸̩̈́̒̉̇̒̈̆-̸̧̼̙̠̬̱͔͍̌̀͑̋̽͜͠-̸̡̡̧͎̤̙̫̖͉̹͇̈̄͛͗͐̈́̕͝-̶̧̣̫̝̠̞̬̗̭̈̈̊͊͛̒͌̓̍̌̓͊͆͘͘͜-̴̥̦͖̩̥̯̝̲͔̪̼̦̹̈̀͑̉̉̀́̎͛͆̓-̸̥̗̞̻̰̼̂̊͐̍̅́͋̈́͝-̴̢̢̠̰̥̝̓̈͆̏͌̐̑̈́̔͒̒͒̚͘͜͝ͅ-̴̡̢̛̲̮̲͈͓͖͍̲͖̪̣̈́̽̂̂̂̆̓͜͜͝-̴̢̢͖̼̤͉͎͚̻̤̗͚͐̇̈̂̓̊̉̚̕ͅͅͅ-̵̜̣̭̲͚̹̠̙̲̈́̆͑̑̃͘̕-̷͇̖͙̹͇̱͔̝̮̘̗̼̻̘̿͋-̵̼̮͙̤̳̣͉̳̬̆͆̊̊̊͑̔̀͒̆̀̔-̷̼̇̽̓̈͊̇̒̓̀͘-̴̛͍̺̟͈̜͉̜̺̪̹̰̬̐̃͊̿̌̇̀̚-̵͚̙͈̰̱̖̘̇̃̚͝-̷̨̞̜̼̦͉̈́̀͘͝-̵̝̦̜̟̲̗͍͔͍̬͓̼̈́̓̓̓͠-̸̗̠̊̿̚-̷̢͍̝̯̩̫̪̭̘̭͎̳̣͕͐̑̉̕͜-̷̧͈̝͙̼̳͈̝̗̲̋͜͜͝-̷̛̩̱̻͕̑̂̀͌͗̎̋́̊̑̍̌̑͂-̴̡͉̩̰̝̘͎̱͚̻̆̌͂̀̿͂̇̀̎̚͝͠͝ͅ-̴̼̩̮̪̦͚͛̂̑-̵̡̡̦̤̘̰̫̰͔̭̻͕̏̃͒-̶̨̨̖̠̬̝̤̺̜̮̥̮́-̷̡̡̳̗̪͕̟̖̲̝͔̮͛́̑̊̽̀͂-̶̢̜̯̻̥̻̠̪͈̻͑̍͝͝ͅ-̷̡̢͔͎̖̙̟̫̝̼̊̔̾͌-̸̝͙̿̏͛̋͜");


        LinkedList<String> immagina = new LinkedList<>();
        immagina.add("pippo");
        immagina.add("ma");
        immagina.add("oggi");
        immagina.add("ho");
        immagina.add("deciso");
        immagina.add("di");
        immagina.add("smettere");


        Collection<String> puoi = new ArrayList<>();

        puoi.add("na");
        puoi.add("cifra");
        puoi.add("pure");
        puoi.add("la");
        puoi.add("colla");

        System.out.println("questa è la lista prima di addAll usando uno come index");
        System.out.println(immagina);
        immagina.addAll(1, puoi);
        System.out.println("questa invece è dopo");
        System.out.println(immagina);

        System.out.println("-----------------------------");


        LinkedList<String> lista2 = new LinkedList<>();

        lista2.add(0, "Questo è l'indice in posizione zero");
        lista2.add(1, "Questo è l'indice in posizione uno ");
        lista2.add(2, "Questo è indice in posizione due");
        System.out.println(lista2);

        System.out.println("-----------------------------");

        LinkedList<String> listaDaClonare = new LinkedList<>();
        listaDaClonare.add("ciao");
        listaDaClonare.add("ciao1");
        listaDaClonare.add("ciao2");
        listaDaClonare.add("ciao3");
        LinkedList<String> listaClonata = (LinkedList<String>) listaDaClonare.clone();
        LinkedList<String> listaClonataDue = new LinkedList<>();
        listaClonataDue = (LinkedList<String>) listaDaClonare.clone();
        System.out.println(listaDaClonare);
        System.out.println(listaClonata);
        System.out.println(listaClonataDue);

        System.out.println("-----------------------------");

        LinkedList<String> recupero = new LinkedList<>();
        recupero.add("Usa");
        recupero.add("indexOf");
        recupero.add("per");
        recupero.add("trovare");
        recupero.add("le");
        recupero.add("parole");


        System.out.println("La prima ricorrenza di index è " + recupero.indexOf("indexOf"));
        System.out.println(STR."La prima ricorrenza di index è \{recupero.indexOf("indexOf")}");
        recupero.offerFirst("Questo elemento è stato aggiunto con offerFirst");
        recupero.offerLast("Questo elemento è stato aggiunto con offerLast");
        System.out.println(recupero);

        System.out.println("-----------------------------");

        LinkedList<String> spesa = new LinkedList<>();

        spesa.add("pasta");
        spesa.add("pollo");
        spesa.add("pane");
        spesa.add("pomodori");
        spesa.add("prociutto");
        spesa.add("formaggio");
        System.out.println(STR."la lista della spesa è\{spesa}");
        spesa.remove();
        System.out.println("ora invece è " + spesa);
        spesa.set(0, "Acqua");
        System.out.println(spesa);
        System.out.println("La lista della spesa ha " + spesa.size() + " elementi");


    }
}
