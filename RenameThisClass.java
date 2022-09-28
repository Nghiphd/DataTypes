
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RenameThisClass
{
    public static void main(String[] args) {
        String[] strarray = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
        for (String bruh : strarray){
            System.out.println(bruh);
        }
        for (String bruh : strarray){
            System.out.print(bruh + "-");
        }
        for ( int i = 0; i < strarray.length ; i++) {
            System.out.print(strarray[i]);
        }
    }
}
