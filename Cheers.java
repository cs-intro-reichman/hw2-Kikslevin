//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

String cheer = args[0].toUpperCase();

int letters = cheer.length();

for (int i = 0; i < letters; i++) {
char letter = cheer.charAt(i);

if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'H' || letter == 'F' || letter == 'L' || letter == 'M' || letter == 'N' || letter == 'R' || letter == 'S' || letter == 'X') {
System.out.println("Give me an " + letter + ": " + letter + "!");
} else {
System.out.println("Give me a  " + letter + ": " + letter + "!");
}
}

int repititions = Integer.parseInt(args[1]);

System.out.println("What does that spell?");

for (int in = 0; in < repititions; in++) {
System.out.println(cheer + "!!!");
        }
        }
}