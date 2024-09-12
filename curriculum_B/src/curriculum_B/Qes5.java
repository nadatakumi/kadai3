package curriculum_B;

public class Qes5 {
    public static void main(String[] args) {
        // 右側の数字を1から9まで固定
        for (int rightNumber = 1; rightNumber <= 9; rightNumber++) {
            for (int leftNumber = 1; leftNumber <= 20; leftNumber++) {
                // 数値を3桁にそろえて表示
                System.out.print(String.format("| %03d * %03d = %03d |", leftNumber, rightNumber, leftNumber * rightNumber));
            }
            // 各行の計算が終わったら改行
            System.out.println();
        }
    }
}
