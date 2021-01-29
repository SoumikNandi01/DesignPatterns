package DecoratorPattern;

public class WhippedCream extends LiquidDecorator {

    private final Beverage beverage;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 5;
    }

    @Override
    public String getIngredients() {
        return beverage.getIngredients() + "Whipped Cream ";
    }
}
