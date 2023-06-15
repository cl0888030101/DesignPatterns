package gof.visitor;

public interface Item {
    int accept(ShoppingCartVisitor visitor);
}
