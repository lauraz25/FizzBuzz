public class Multiples2 {

//    public static int main(){
//        return main(1000, 3, 5);
//    }

    public static int main(int n, int a, int b) {
        int count = 0;
        int i = 1;

        while (i < n) {
            boolean divByA = i % a == 0;
            boolean divByB = i % b == 0;

            if (divByA | divByB) {
                count++;
            }
            i++;
        }

        return count;
        //System.out.println("There are " + count + " numbers less than 1000 that are a multiple of 3 or 5.i");

    }

//    public static void main(String[] args) {
//
//    }
}