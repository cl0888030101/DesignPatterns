package gof.visitor;

public interface ShoppingCartVisitor {
    int visit(Fruit fruit);
    int visit(Book book);
}
