package boxing;

public class Boxing {
    public  static void execute() {
        System.out.println("=== ボクシング ===");
        long startTime = System.currentTimeMillis();
        int sum1 = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum1 += i;
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("実行時間: " + executionTime + " ミリ秒");

        System.out.println("=== アンボクシング ===");
        startTime = System.currentTimeMillis();
        int sum2 = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum2 += i;
        }
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("実行時間: " + executionTime + " ミリ秒");

        System.out.println("=== 文字列結合 ===");
        int count = 100000;
        startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < count; i++) {
            str += i;
        }
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("実行時間: " + executionTime + " ミリ秒");

        System.out.println("=== StringBuilder ===");
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(i);
        }
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("実行時間: " + executionTime + " ミリ秒");
    }

}
