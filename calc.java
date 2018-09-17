
import java.util.Scanner;
class calc {
  public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("数値を2つ入力してください。");
        int numA = scanner.nextInt();  //・・・①
        int numB = scanner.nextInt();  //・・・①
        System.out.println("和は " +(numA + numB) +" です。");
        System.out.println("差は " +(numA - numB) +" です。");
        System.out.println("積は " +(numA * numB) +" です。");
        System.out.println("商は " +(numA / numB) +" です。");
        System.out.println("あまりは " +(numA % numB) +" です。");
  }
}
