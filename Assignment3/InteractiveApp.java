package Assignment3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class InteractiveApp {
public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
String string = "";
Set<String> prohibitedWords = new HashSet<>(Arrays.asList("ugly", "racist", "hate"));
System.out.println("Type something then press enter, " + "or type \"end\" to end the program");

while (!(string = scanner.next()).equals("end")) {
if(prohibitedWords.contains(string.toLowerCase())){
	System.out.println("******");
System.out.println("You typed a prohibited word! It has been censored.");
}
else {
	System.out.println("You typed "+string.toUpperCase()+ "!");
}
}
System.out.println("Program ended!");
scanner.close();
}
}

