public class Objective2Lab5{
  public static void main(String[] args) {
    double side1, side2, hypotenuse;
    side1 = Math.pow(10.0, 2);
    side2 = Math.pow(8.0, 2);
    //hypotenuse = Math.sqrt(side1) + Math.sqrt(side2);
    hypotenuse = Math.sqrt((side1 + side2));

    System.out.println(hypotenuse);
  }
}
