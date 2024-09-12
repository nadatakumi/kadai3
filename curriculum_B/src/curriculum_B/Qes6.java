package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 入力を受け取る
        System.out.println("商品の名前を入力してください（「、」区切り）：");
        String input = scanner.nextLine();
        String[] products = input.split("、");

        // 商品リスト
        String[] validProducts = {"パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器", "テレビ", "ディスプレイ"};

        // 商品ごとの残り台数を出力
        for (String product : products) {
            boolean isValidProduct = false;
            int stock = random.nextInt(12); // 0〜11のランダムな値

            switch (product) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    System.out.println(product + "の残り台数は" + stock + "台です。");
                    isValidProduct = true;
                    break;
                case "テレビ":
                case "ディスプレイ":
                    // テレビまたはディスプレイの場合、ランダム値を使用
                    System.out.println("テレビの残り台数は" + stock + "台です。");
                    System.out.println("ディスプレイの残り台数は" + (11 - stock) + "台です。");
                    isValidProduct = true;
                    break;
                default:
                    break;
            }

            // 指定商品以外の場合の出力
            if (!isValidProduct) {
                System.out.println("『" + product + "』は指定の商品ではありません。");
            }
        }

        scanner.close();
    }
}
