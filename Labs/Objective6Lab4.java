public class Objective6Lab4{
  public static void main(String[] args) {
    int sumTotal = 0;
    int counter = 1;

    while (counter <= 20) {
      sumTotal = sumTotal + counter;
      // this will display the sum each time during EACH iteration.
      //System.out.println(sumTotal);
      counter = counter + 1;
    }
    // printing here will display the sum at the END of the iteration.
    System.out.println(sumTotal);
  }
}
