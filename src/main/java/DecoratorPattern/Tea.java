package DecoratorPattern;

public class Tea implements Beverage{
    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String getIngredients() {
        return "Tea ";
    }
}
