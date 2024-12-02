public class StringDemo {
    public static void main(String[] args) {
        String name = "Genowefa";

        int dlugoscImienia = name.length();

        String duze, male;

        name = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(name + ", ");

        char inicjal = name.charAt(0);

    }
}
