import java.util.Scanner;
public class freq{
  public static void main(String args[]){
    int i;
    String a;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string to check freq");
    a=sc.nextLine();
    int n = a.length();
    System.out.println("Enter the character to check frequency in the string");
    char character = sc.nextLine().charAt(0);
    int count=0;
    for(i=0;i<n;i++){
      if(character==a.charAt(i)){
        count++;
      }
    }
    System.out.println("The frequency of the given character is "+count);
  }
}
