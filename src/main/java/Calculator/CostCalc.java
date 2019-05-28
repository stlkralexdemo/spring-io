package Calculator;

public class CostCalc {

    public int costCalculator(int km, Box box, int kgCost, int kmCost) {
        return box.getWeight() * kgCost + km * kmCost;
    }
}
