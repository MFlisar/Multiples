package com.michaelflisar.multiples;

/**
 * Created by flisar on 13.10.2016.
 */

public class Triple<Q, R, S> {
    public final Q first;
    public final R second;
    public final S third;

    public Triple(Q first, R second, S third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Triple)) {
            return false;
        }
        Triple<?, ?, ?> p = (Triple<?, ?, ?>) o;
        return objectsEqual(p.first, first) &&
                objectsEqual(p.second, second) &&
                objectsEqual(p.third, third);
    }

    private static boolean objectsEqual(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    @Override
    public int hashCode() {
        return (first == null ? 0 : first.hashCode()) ^
                (second == null ? 0 : second.hashCode()) ^
                (third == null ? 0 : third.hashCode());
    }

    public static <A, B, C> Triple <A, B, C> create(A a, B b, C c) {
        return new Triple<A, B, C>(a, b, c);
    }
}
