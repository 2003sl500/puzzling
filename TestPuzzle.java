public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava pj = new PuzzleJava();
        pj.randomNum();
        System.out.println("Random Letter: " + pj.alphabet());
        System.out.println("Password: " + pj.passwordGenerator());
        System.out.println("Array of Passwords: " + pj.pwArrayGenerator(5));
    }
}
