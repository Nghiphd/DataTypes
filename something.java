
/**
 * Write a description of class something here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class something
{
    public static void main(String[] args) {
        int [] myArray = {3,8,4,2,1,9,10};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
            myArray[i] = myArray[i] * 2;
            System.out.println(myArray[i]);
        }   
    }
}
