package DecoratorPattern;

public class Chocolate extends LiquidDecorator {
    private final Beverage beverage;
    private final int cost = 10;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + cost;
    }

    @Override
    public String getIngredients() {
        return "Chocolate " + beverage.getIngredients();
    }
}
