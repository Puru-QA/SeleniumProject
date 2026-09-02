/*
 * 
 * public class Java { public static void main(String[] args) { String str =
 * "My Name Is Purushotham"; String rev = "";
 * 
 * for (int i = str.length() - 1; i >= 0; i--) { rev += str.charAt(i); }
 * System.out.println(rev); } }
 * 
 * 
 * Prime number, Factorial, Fibonacci, Duplicate numbers/String, First Highest
 * number, Second highest number, lowest number, Reverse String, Palindrome,
 * Upper case, Lower case, Armstrong using For loops.
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
 * 
 * 
 * 
 * public class Java{ public static void main(String[] args) { String str =
 * "Puru"; String rev = "";
 * 
 * for(int i=str.length()-1; i>=0; i--) { rev = rev + str.charAt(i); }
 * 
 * if(str.equals(rev)) { System.out.println("It's a Palindorme"); }else {
 * System.out.println("It's Not"); } } }
 * 
 * 
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
 * 
 * 
 * public class Java{ public static void main(String[] args) { String Sentance =
 * "Java is a Programming Language dvbdkfj svbsdkjbvsd kjbvlasdbvk"; String[]
 * words = Sentance.split(" "); System.out.println("Word count:" +
 * words.length); } }
 * 
 * 
 * 
 * public class Java{ public static void main(String[] args) { String Sentance =
 * "kdfvbkld ifhvihfi iufvivli iuvigvifd iuiqgiqgie"; String[] words =
 * Sentance.split(" "); System.out.println(words.length); } }
 * 
 * 
 * 
 * public class Java { public static void main(String[] args) { String sentance
 * =
 * "fvbskadljf vldsakfvad ivklsdfvblksad skvhlksdhvsdh hvsdhvsd ohvksdvhsdj ovhdshvsod"
 * ; String[] words = sentance.split(" "); System.out.println(words.length); } }
 * 
 * 
 * 
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
 * 
 * 
 * 
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
 * 
 * 
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
 * 
 * 
 * 
 * public class Java{ public static void main(String[] args) { int num = 8; int
 * count = 0;
 * 
 * for(int i=1; i<=num; i++) { if(num%i == 0) { count++; } } if(count == 2) {
 * System.out.println("It's a Prime"); }else {
 * System.out.println("Not a Prime"); } } }
 * 
 * 
 * public class Java{ public static void main(String[] args) { int[] numbers =
 * {1,4,5,2,6,7,17,15,19,16};
 * 
 * for(int num:numbers) { int count = 0; for(int i=1; i<=num; i++) { if(num%i ==
 * 0) { count++; } } if(count == 2) { System.out.println(num); } } } }
 * 
 * 
 * 
 * public class Java{ public static void main(String[] args) { int num = 5; int
 * factorial = 1; for(int i=1; i<=num; i++) { factorial = factorial*i; }
 * System.out.println("Factorial of " +num+ " is " +factorial ); } }
 * 
 * 
 * 
 * public class Java{ public static void main(String[] args) { int a=0; int b=1;
 * System.out.print(a+ " " +b); for(int i=2; i<10; i++) { int c=a+b; a=b; b=c;
 * System.out.print(" "+c); }
 * 
 * } }
 * 
 * 
 * 
 * public class Java {
 * 
 * public static void main(String[] args) {
 * 
 * int[] arr = {2, 4, 8, 6, 8, 5, 4};
 * 
 * for (int i = 0; i < arr.length; i++) {
 * 
 * for (int j = i + 1; j < arr.length; j++) {
 * 
 * if (arr[i] == arr[j]) { System.out.println("Duplicate number: " + arr[i]); }
 * } } } }
 * 
 * 
 * public class Java { public static void main(String[] args) { int[] arr =
 * {2,3,6,2,8,4,8,9,1,9}; for(int i=0;i<arr.length; i++) { for(int
 * j=i+1;j<arr.length;j++) { if(arr[i] == arr[j]) {
 * System.out.print(" "+arr[i]); } } } } }
 * 
 */

/*
 * public class Java { public static void main(String[] args) {
 * 
 * String str = "programming";
 * 
 * for (int i = 0; i < str.length(); i++) {
 * 
 * for (int j = i + 1; j < str.length(); j++) {
 * 
 * if (str.charAt(i) == str.charAt(j)) {
 * 
 * System.out.println(str.charAt(i)); //break; } } } }
 * 
 * }
 */

 

		/*
		 * int a = 0; int b = 1;
		 * 
		 * System.out.print(a); System.out.print(", " +b);
		 * 
		 * for (int i = 2; i < 20; i++) { int c = a + b; System.out.print(", " +c);
		 * 
		 * a = b; b = c;
		 * 
		 * }
		 */

/*		int[] numbers = { 2, 5, 3, 6, 9, 8, 12, 23, 56, 99, 97 };
		for (int num : numbers) {

			int count = 0;

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
				if (count == 2) {
					System.out.println(num);
				} 
		}
	}
}*/
		/*
		 * int[] arr = {10, 20, 30, 40};
		 * 
		 * int index = Arrays.binarySearch(arr, 30);
		 * 
		 * System.out.println(index);
		 */
		
		/*
		 * int[] arr = {1,2,3,4,5,6};
		 * 
		 * int index = Arrays.binarySearch(arr, 7);
		 * 
		 * System.out.println(index);
		 */
		/*
		 * String[] arr1 = {"svb", "etr", "sdcs", "scsc", "sdsdc"}; int index1 =
		 * Arrays.binarySearch("scb", 1); System.out.println(index1);
		 */
		/*
		 * int[] original = {10, 20, 30};
		 * 
		 * int[] copy = Arrays.copyOf(original, original.length);
		 */
		/*
		 * int[] arr = new int[4];
		 * 
		 * Arrays.fill(arr, 5);
		 * 
		 * System.out.println(Arrays.toString(arr));
		 */
		
		/*
		 * int[] arr = new int[5]; Arrays.fill(arr, 6);
		 * System.out.println(Arrays.toString(arr));
		 */
		
		/*
		 * int[] original = {10,20,30,40}; int[] copy = Arrays.copyOf(original,
		 * original.length); System.out.println(Arrays.toString(copy));
		 */