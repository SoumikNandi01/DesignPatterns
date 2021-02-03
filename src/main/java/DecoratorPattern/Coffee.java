package DecoratorPattern;

public class Coffee extends LiquidDecorator {
    private final int cost = 100;

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getIngredients() {
        return "Coffee ";
    }
}
