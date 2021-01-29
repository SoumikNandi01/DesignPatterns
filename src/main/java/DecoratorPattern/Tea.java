package DecoratorPattern;

public class Tea implements Beverage{
    private final int cost = 30;

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getIngredients() {
        return "Tea ";
    }
}
