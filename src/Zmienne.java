public class Zmienne {
    public static void main(String[] args) {

        int liczba;
        liczba = 13;

        double liczba2 = 17.7;

        System.out.println("Moja zmienna: " + liczba + ", " + liczba2);

        int hours = 8;
        int days = 5;
        int weeks = 52;
        // time of work
        int workHoursPerYear = hours * days * weeks;

        System.out.println("Wynik: " + workHoursPerYear);

        char znak = '#';

        String napis = "Dzisiaj \njest \"zimno\"";
        napis += ".";

        System.out.println("Mój napis: " + napis );
        System.out.print("Mój\t napis: " + napis + "\n");
        System.out.print("Mój napis: " + napis);

        boolean sun = true; //false
        

    }
}
