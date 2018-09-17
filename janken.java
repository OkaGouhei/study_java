import java.util.Scanner;
public class janken {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("グー(1)、チョキ(2)、パー(3)いずれかを入力してください。");
        int numA = scanner.nextInt();  //・・・①
        int numB = scanner.nextInt();  //・・・①
    if(numA == 1){
      if(numB == 1){
        System.out.println("アイコです");
      }else if(numB == 2){
        System.out.println("1人目が勝ちです");
      }else if(numB == 3){
        System.out.println("2人目が勝ちです");
      }
    }else if(numA == 2){
      if(numB == 1){
        System.out.println("2人目が勝ちです");
      }else if(numB == 2){
        System.out.println("アイコです");
      }else if(numB == 3){
        System.out.println("1人目が勝ちです");
      }
    }else if(numA == 3){
      if(numB == 1){
       System.out.println("1人目が勝ちです");
      }else if(numB == 2){
        System.out.println("2人目が勝ちです");
      }else if(numB == 3){
        System.out.println("アイコです");
      }
    }
  }
}
