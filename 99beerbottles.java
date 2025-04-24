public class NinetyNineBeers {

    public static void main(String[] args) {

        String[] verse = new String[2];
        verse[0] = " bottles of beer on the wall, ";
        verse[1] = " bottles of beer.";

        int bottles = 99; 
        int takeDown = 1;  

        while (bottles > 0) {
            System.out.print(bottles);
            System.out.print(verse[0]);
            System.out.print(bottles);
            System.out.println(verse[1]);

            System.out.print("Take ");
            System.out.print(takeDown);
            System.out.print(" down, pass it around, ");

            bottles = bottles - takeDown;

            if (bottles > 0) {
                System.out.print(bottles);
                System.out.print(" bottles of beer on the wall.");
            } else {
                System.out.print("no more bottles of beer on the wall.");
            }
            System.out.println();
            System.out.println();
        }
    }
}
