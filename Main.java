import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter a word:");
    String inputString = myScanner.nextLine();
    //Your code will return the length of the entered String

    System.out.println(inputString.length());
  }
}
