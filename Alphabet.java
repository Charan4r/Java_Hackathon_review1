public class Alphabet {
    public static void main(String[] args) {
        int rows = 4; 

        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            char letter = '1';
            for (int j = 1; j <= i; j++) {
                System.out.print(letter);
                letter++;
            }
               letter -= 2; 
            for (int k = 1; k < i; k++) {
                System.out.print(letter);
                letter--;
            }
            System.out.println();
        }
    }
}
