package DecoratorPattern;

public class Milk implements Beverage{
    private final int cost = 50;

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getIngredients() {
        return "Milk ";
    }
}
