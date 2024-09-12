package curriculum_B;

public class Qes4{
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                // 数値を2桁にするために String.format を使用
                System.out.print(String.format("| %02d * %02d = %02d |", i, j, i * j));
            }
            // 各行が終わったら改行
            System.out.println();
        }
    }
}
