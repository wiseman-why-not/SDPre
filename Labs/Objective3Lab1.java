import java.util.Scanner;

public class Objective3Lab1{
  public static void main(String[] args) {
    String userInput = "";
    Scanner input = new Scanner(System.in);

    System.out.println("Please type a word: ");

    userInput = input.next(); //input.nextLine() would capture all the text vs. one word
    System.out.println(userInput);

    input.close();
  }
}
