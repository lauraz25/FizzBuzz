public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;

        while (i < 1000){
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;

            if (divBy3 | divBy5){
                count++;
            }
            i++;
        }

        System.out.println("There are " + count + " numbers less than 1000 that are a multiple of 3 or 5.i");
    }
}
