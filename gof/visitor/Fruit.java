package gof.visitor;

public class Fruit implements Item{
    private int pricePerKG;
    private String name;
    private int weight;

    public Fruit(int pricePerKG, String name, int weight) {
        this.pricePerKG = pricePerKG;
        this.name = name;
        this.weight = weight;
    }

    public int getPricePerKG() {
        return pricePerKG;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
