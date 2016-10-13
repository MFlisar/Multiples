package com.michaelflisar.multiples;

/**
 * Created by flisar on 13.10.2016.
 */

public class Quadruple<F, S, T, U> {
    public final F first;
    public final S second;
    public final T third;
    public final U forth;

    public Quadruple(F first, S second, T third, U forth) {
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
        return objectsEqual(p.first, first) && objectsEqual(p.second, second) && objectsEqual(p.third, third) && objectsEqual(p.forth, forth);
    }

    private static boolean objectsEqual(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
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
