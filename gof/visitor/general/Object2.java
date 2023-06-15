package gof.visitor.general;

public class Object2 implements Item{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
