package DecoratorPattern;

public class WhippedCream extends LiquidDecorator {

    private final Beverage beverage;
    private final int cost = 5;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + cost;
    }

    @Override
    public String getIngredients() {
        return beverage.getIngredients() + "Whipped Cream ";
    }
}
