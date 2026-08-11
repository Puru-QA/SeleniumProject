
/*
 * public class Java { public static void main(String[] args) { String str =
 * "My Name Is Purushotham"; String rev = "";
 * 
 * for (int i = str.length() - 1; i >= 0; i--) { rev += str.charAt(i); }
 * System.out.println(rev); } }
 */

/* Prime number, Factorial, Fibonacci, Duplicate numbers/String, First Highest number, Second highest number, lowest number, 
 * Reverse String, Palindrome, Upper case, Lower case, Armstrong using For loops.
 * 
 * 
 * 
 * public class Java { public static void main(String[] args) { String str =
 * "MadaM"; String rev = "";
 * 
 * for (int i = str.length() - 1; i >= 0; i--) { rev = rev + str.charAt(i); }
 * 
 * if (str.equalsIgnoreCase(rev)) { System.out.println("String is Palindrome");
 * } else { System.out.println("String is not a Palindrome"); } }
 * 
 * }
 */

/*
 * public class Java{ public static void main(String[] args) { String str =
 * "Puru"; String rev = "";
 * 
 * for(int i=str.length()-1; i>=0; i--) { rev = rev + str.charAt(i); }
 * 
 * if(str.equals(rev)) { System.out.println("It's a Palindorme"); }else {
 * System.out.println("It's Not"); } } }
 */
/*
 * public class Java { public static void main(String[] args) { String str =
 * "Aadhya mummyaaaa"; int count = 0;
 * 
 * for (int i = 0; i < str.length(); i++) { char ch = str.charAt(i);
 * 
 * if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { count++;
 * }
 * 
 * }
 * 
 * System.out.println("vowels count = " + count);
 * 
 * } }
 */
/*
 * public class Java{ public static void main(String[] args) { String Sentance =
 * "Java is a Programming Language dvbdkfj svbsdkjbvsd kjbvlasdbvk"; String[]
 * words = Sentance.split(" "); System.out.println("Word count:" +
 * words.length); } }
 */

/*
 * public class Java{ public static void main(String[] args) { String Sentance =
 * "kdfvbkld ifhvihfi iufvivli iuvigvifd iuiqgiqgie"; String[] words =
 * Sentance.split(" "); System.out.println(words.length); } }
 */

/*
 * public class Java { public static void main(String[] args) { String sentance
 * =
 * "fvbskadljf vldsakfvad ivklsdfvblksad skvhlksdhvsdh hvsdhvsd ohvksdvhsdj ovhdshvsod"
 * ; String[] words = sentance.split(" "); System.out.println(words.length); } }
 */

/*
 * public class DuplicateCharacters {
 * 
 * public static void main(String[] args) {
 * 
 * String str = "programming";
 * 
 * for (int i = 0; i < str.length(); i++) {
 * 
 * char ch = str.charAt(i); int count = 0;
 * 
 * for (int j = 0; j < str.length(); j++) {
 * 
 * if (ch == str.charAt(j)) { count++; } }
 * 
 * if (count > 1 && str.indexOf(ch) == i) { System.out.println(ch + " repeated "
 * + count + " times"); } } } }
 */

/*
 * public class Java{ public static void main(String[] args) { String str =
 * "Programming";
 * 
 * for(int i=0; i<str.length(); i++) { char ch = str.charAt(i); int count = 0;
 * 
 * for(int j=0;j<str.length(); j++) { if(ch == str.charAt(j)) { count++; } }
 * if(count>1 && str.indexOf(ch) == i) { System.out.println(ch + " repeatd " +
 * count + " times "); }
 * 
 * } } }
 */
/*
 * import java.util.HashSet; import java.util.Set;
 * 
 * public class Java {
 * 
 * public static void main(String[] args) {
 * 
 * int[] arr = {2, 4, 8, 6, 8, 5};
 * 
 * Set<Integer> seen = new HashSet<>(); Set<Integer> duplicates = new
 * HashSet<>();
 * 
 * for (int num : arr) {
 * 
 * if (seen.contains(num)) { duplicates.add(num); } else { seen.add(num); } }
 * 
 * System.out.println("Duplicates: " + duplicates); } }
 */