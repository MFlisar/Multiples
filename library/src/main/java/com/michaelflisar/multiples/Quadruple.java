package com.michaelflisar.multiples;

/**
 * Created by flisar on 13.10.2016.
 */

public class Quadruple<Q, R, S, T> {
    public final Q first;
    public final R second;
    public final S third;
    public final T fourth;

    public Quadruple(Q first, R second, S third, T fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
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
                objectsEqual(p.fourth, fourth);
    }

    private static boolean objectsEqual(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    @Override
    public int hashCode() {
        return (first == null ? 0 : first.hashCode()) ^
                (second == null ? 0 : second.hashCode()) ^
                (third == null ? 0 : third.hashCode()) ^
                (fourth == null ? 0 : fourth.hashCode());
    }

    public static <A, B, C, D> Quadruple<A, B, C, D> create(A a, B b, C c, D d) {
        return new Quadruple<A, B, C, D>(a, b, c, d);
    }
}
