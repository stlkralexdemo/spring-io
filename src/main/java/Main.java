import Calculator.Box;
import Calculator.CostCalc;

public class Main {
    public static void main(String[] args) {

        Box box = new Box(21);

        CostCalc costCalc = new CostCalc();
        int i = costCalc.costCalculator(100, box, 110, 10);
        System.out.println(i);
    }
}
