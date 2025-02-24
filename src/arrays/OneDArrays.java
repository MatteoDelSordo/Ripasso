package arrays;

public class OneDArrays {
    public static void main(String[] args) {

        int state1PopulationCOunt = 521;
        int state2PopulationCOunt = 221;
        int state3PopulationCOunt = 311;
        int state4PopulationCOunt = 441;
        int state5PopulationCOunt = 541;


        int[] countryPopulation = new int[]{502, 555, 435, 67, 234};


        System.out.println("Il valore della posizione 0 dell array è: " + countryPopulation[0]);
        System.out.println("Il valore della posizione 1 dell array è: " + countryPopulation[1]);


        for (int i : countryPopulation) {
            System.out.println(i);
//            System.out.println("Country population[" + i + "] is : " + countryPopulation[i]);


        }


    }
}




