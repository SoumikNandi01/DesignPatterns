package DecoratorPattern;

public class Milk implements Beverage{
    @Override
    public int getCost() {
        return 50;
    }

    @Override
    public String getIngredients() {
        return "Milk ";
    }
}
