
 class Alphabet {

public static void main(String[] args) {

for (int row = 0; row <= 4; row++) {

int alphabet = 65; //ASCII value of “A”

for (int col = 4; col > row; col--) {

System.out.print(" "); //Print Space
}

for (int k = 0; k <= row; k++) {

System.out.print((char) (alphabet + k) ); //Print Alphabet

}

System.out.println();

}

}

}