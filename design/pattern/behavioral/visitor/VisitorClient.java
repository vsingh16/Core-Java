package com.company.design.pattern.behavioral.visitor;

/**
 * Created by vishal on 13-Apr-18.
 * <p>
 * Visitor design pattern is used when we want to perform an operation on series of similar kind of objects.
 * <p>
 * Advantage:
 * We can also do the same in class itself.
 * But with visitor, logic is in one place, in case if this changes,
 * we only need to make changes in visitor class ,no changes required in item itself.
 *
 * Disadvantage:
 * We must know the return type of visitor while designing the interface
 */
public class VisitorClient {

    public static void main(String[] args) {
        Item items[] = {new Fruits(100.0), new Fruits(505.5), new Stationary(300.45)};
        Visitor visitor = new ShoppingCartVisitor();
        Double total = 0.0;
        for (int i = 0; i < items.length; i++) {
            total += items[i].accept(visitor);
        }
        System.out.println(total);
    }
}
