import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner keyBoard = new Scanner(System.in);
    int input = keyBoard.nextInt();
    int res = 0;
    while (input != 0){
      res += input % 10;
      res = res * 10;
      input = input / 10;
    }
    res = res / 10;
    System.out.println(res);
  }
}
