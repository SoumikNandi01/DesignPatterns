package DecoratorPattern;

public class Coffee extends LiquidDecorator {
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getIngredients() {
        return "Coffee ";
    }
}
