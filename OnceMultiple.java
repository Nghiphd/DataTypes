public class OnceMultiple
{
    public static void main(String[] args) {
        int [] myArray = {3,8,4,2,1,9,10};
        for (int value : myArray) {
            System.out.println(value);
            System.out.println(value * 2);
        }
    }
}