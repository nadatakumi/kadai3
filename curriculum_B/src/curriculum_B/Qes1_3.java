package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザー名
        System.out.print("ユーザー名を入力してください: ");
        String username = scanner.nextLine();

        // 入力チェック
        if (username == null || username.isEmpty()) {
            System.out.println("「名前を入力してください」");
        } else if (username.length() > 10) {
            System.out.println("「名前を 10 文字以内にしてください」");
        } else if (!username.matches("[a-zA-Z0-9]+")) {
            System.out.println("「半角英数字のみで名前を入力してください」");
        } else {
            // 正常な場合、ユーザー名を登録してじゃんけんを開始
            System.out.println("ユーザー名「" + username + "」を登録しました");

            // じゃんけんシステム
            startJanken(username, scanner);
        }

        scanner.close();
    }

    public static void startJanken(String username, Scanner scanner) {
        Random random = new Random();
        int rounds = 0;  // 勝つまでにかかった合計回数

        // じゃんけんを勝つまでループ
        while (true) {
            rounds++;

            // プレイヤーの手
            System.out.print("じゃんけんの手を入力してください (0: グー, 1: チョキ, 2: パー): ");
            int playerHand = scanner.nextInt();

            // コンピュータの手をランダムに決定
            int computerHand = random.nextInt(3);

            // 手の表示用配列
            String[] hands = { "グー", "チョキ", "パー" };

            // 自分と相手の手を出力
            System.out.println(username + "の手は「" + hands[playerHand] + "」");
            System.out.println("相手の手は「" + hands[computerHand] + "」");

            // 勝敗の判定
            if (playerHand == computerHand) {
                // あいこ
                System.out.println("DRAW あいこ もう一回しましょう！");
            } else if ((playerHand == 0 && computerHand == 1) || // グー vs チョキ
                       (playerHand == 1 && computerHand == 2) || // チョキ vs パー
                       (playerHand == 2 && computerHand == 0)) { // パー vs グー
                // プレイヤーが勝った場合
                System.out.println("やるやん。");
                System.out.println("次は俺にリベンジさせて");
                break;  // ループを終了して勝利を表示
            } else {
                // プレイヤーが負けた場合
                System.out.println("俺の勝ち！");
                if (computerHand == 0) {
                    System.out.println("負けは次につながるチャンスです！");
                    System.out.println("ネバーギブアップ！");
                } else if (computerHand == 1) {
                    System.out.println("たかがじゃんけん、そう思ってないですか？");
                    System.out.println("それやったら次も、俺が勝ちますよ");
                } else if (computerHand == 2) {
                    System.out.println("なんで負けたか、明日まで考えといてください。");
                    System.out.println("そしたら何かが見えてくるはずです");
                }
            }
        }

        // 勝つまでにかかった合計回数を表示
        System.out.println("勝つまでにかかった合計回数は" + rounds + "回です");
    }
}
