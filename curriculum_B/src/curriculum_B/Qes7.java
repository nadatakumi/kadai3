package curriculum_B;

import java.util.Scanner;

public class Qes7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 生徒の人数を入力
        System.out.print("生徒の人数を入力してください（2以上）: ");
        int numberOfStudents = scanner.nextInt();

        // 入力の確認
        while (numberOfStudents < 2) {
            System.out.print("生徒の人数は2以上である必要があります。再度入力してください: ");
            numberOfStudents = scanner.nextInt();
        }

        // 各生徒の点数を格納する配列
        double[][] scores = new double[numberOfStudents][4];

        // 各生徒の点数を入力
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println((i + 1) + "人目の点数を入力してください:");

            System.out.print("1. 英語の点数を入力してください : ");
            scores[i][0] = scanner.nextDouble();

            System.out.print("2. 数学の点数を入力してください : ");
            scores[i][1] = scanner.nextDouble();

            System.out.print("3. 理科の点数を入力してください : ");
            scores[i][2] = scanner.nextDouble();

            System.out.print("4. 社会の点数を入力してください : ");
            scores[i][3] = scanner.nextDouble();
        }

        // 各生徒の平均点を計算し出力
        double[] studentAverages = new double[numberOfStudents];
        double totalSum = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            double sum = scores[i][0] + scores[i][1] + scores[i][2] + scores[i][3];
            studentAverages[i] = sum / 4;
            totalSum += studentAverages[i];
            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), studentAverages[i]);
        }

        // 各科目の平均点を計算
        double[] subjectSums = new double[4];
        for (int i = 0; i < numberOfStudents; i++) {
            subjectSums[0] += scores[i][0]; // 英語
            subjectSums[1] += scores[i][1]; // 数学
            subjectSums[2] += scores[i][2]; // 理科
            subjectSums[3] += scores[i][3]; // 社会
        }

        // 各科目の平均点を出力
        String[] subjects = {"英語", "数学", "理科", "社会"};
        for (int i = 0; i < subjects.length; i++) {
            double average = subjectSums[i] / numberOfStudents;
            System.out.printf("%sの平均点は%.2f点です。\n", subjects[i], average);
        }

        // 全体の平均点を出力
        double overallAverage = totalSum / numberOfStudents;
        System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);

        scanner.close();
    }
}
