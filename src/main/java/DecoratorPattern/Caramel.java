package DecoratorPattern;

public class Caramel extends LiquidDecorator {

    private final Beverage beverage;
    private final int cost = 10;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + cost;
    }

    @Override
    public String getIngredients() {
        return "Caramel " + beverage.getIngredients();
    }
}
