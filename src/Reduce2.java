public class Reduce2 {
    public static int main(int n) {
        int count = 0;

        while (n > 0){
            if (n % 2 == 0){
                n = n / 2;
            }
            else{
                n = n - 1;
            }

            count++;
        }

        return count;
        //System.out.println("It took " + count + " steps to get to 0 from 100.");
    }
}
