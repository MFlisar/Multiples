package com.michaelflisar.multiples;

/**
 * Created by flisar on 13.10.2016.
 */

public class Quadruple<Q, R, S, T> extends Tuple {
    public final Q first;
    public final R second;
    public final S third;
    public final T forth;

    public Quadruple(Q first, R second, S third, T forth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.forth = forth;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Quadruple)) {
            return false;
        }
        Quadruple<?, ?, ?, ?> p = (Quadruple<?, ?, ?, ?>) o;
        return objectsEqual(p.first, first) &&
                objectsEqual(p.second, second) &&
                objectsEqual(p.third, third) &&
                objectsEqual(p.forth, forth);
    }

    @Override
    public int hashCode() {
        return (first == null ? 0 : first.hashCode()) ^
                (second == null ? 0 : second.hashCode()) ^
                (third == null ? 0 : third.hashCode()) ^
                (forth == null ? 0 : forth.hashCode());
    }

    public static <A, B, C, D> Quadruple<A, B, C, D> create(A a, B b, C c, D d) {
        return new Quadruple<A, B, C, D>(a, b, c, d);
    }
}
