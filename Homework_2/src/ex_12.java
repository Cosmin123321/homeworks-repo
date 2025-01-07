public class ex_12 {
    public static void main(String[] args) {
        double[] prices = {10, 11, 60.13, 20.66, 15.18, 99.99, 215, 20, 200000, 19, 999999, 999999999};
        double sum = 0;
        int i = 0;

        while (i < prices.length) {
          if (prices[i] > 100) {
              break;
          }

          sum += prices[i];
          i++;
        }
        System.out.println(sum);
    }
}
