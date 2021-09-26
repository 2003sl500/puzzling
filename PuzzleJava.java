import java.util.Arrays;
import java.util.Random;

public class PuzzleJava{
    public void randomNum () {
        Random random = new Random();
        int randomNumArray[] = new int[10];
        for(int i = 0; i < randomNumArray.length; i++){
            randomNumArray[i] = (random.nextInt(20) + 1);
        }
       
        System.out.println(Arrays.toString(randomNumArray));
    }

    public char alphabet () {
        char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Random random = new Random();
        int randomNum = random.nextInt(26);
        return letters[randomNum];
    }

    public String passwordGenerator () {
        String pw = "";
        for(int i = 0; i < 8; i++){
            pw += alphabet();
        }
        return pw;
    }

    public String pwArrayGenerator (int len) {
        String pwArray[] = new String[len];
        for(int i = 0; i < len; i++){
            pwArray[i] = passwordGenerator();
        }
        return Arrays.toString(pwArray);
    }
}