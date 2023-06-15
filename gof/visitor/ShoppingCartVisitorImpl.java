package gof.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{
    @Override
    public int visit(Fruit fruit) {
        return fruit.getPricePerKG() * fruit.getWeight();
    }

    @Override
    public int visit(Book book) {
        return book.getPrice();
    }
}
