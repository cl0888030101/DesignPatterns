package gof.visitor;

public class ShoppingTest {

    public static void main(String[] args) {
        Book b = new Book(100, "book");
        Fruit f = new Fruit(10,"fruit",100);

        ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImpl();
        b.accept(shoppingCartVisitor);
        f.accept(shoppingCartVisitor);
    }
}
