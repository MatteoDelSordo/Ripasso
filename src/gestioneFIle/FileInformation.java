package gestioneFIle;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

        File myObj = new File("C:\\Users\\m.delsordo\\IdeaProjects\\eureka\\ripassoConcettiBase.iml");
        if (myObj.exists()) {
            System.out.println("file name: " + myObj.getName());
            System.out.println("file absolute path: " + myObj.getAbsolutePath());
            System.out.println("il file è scrivibile: " + myObj.canWrite());
            System.out.println("il file è leggibile: " + myObj.canRead());
            System.out.println("Grandezza del file in byte: " + myObj.length());
        } else {
            System.out.println("Il file non esiste");
        }


    }


}
