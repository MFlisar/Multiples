package com.michaelflisar.multiples;

/**
 * Created by flisar on 13.10.2016.
 */

public class Sextuple<F, S, T, U, V, W> {
    public final F first;
    public final S second;
    public final T third;
    public final U forth;
    public final V fifth;
    public final W sixth;

    public Sextuple(F first, S second, T third, U forth, V fifth, W sixth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.forth = forth;
        this.fifth = fifth;
        this.sixth = sixth;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Sextuple)) {
            return false;
        }
        Sextuple<?, ?, ?, ?, ?, ?> p = (Sextuple<?, ?, ?, ?, ?, ?>) o;
        return objectsEqual(p.first, first) && objectsEqual(p.second, second) && objectsEqual(p.third, third) && objectsEqual(p.forth, forth) && objectsEqual(p.fifth, fifth) && objectsEqual(p.sixth, sixth);
    }

    private static boolean objectsEqual(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    @Override
    public int hashCode() {
        return (first == null ? 0 : first.hashCode()) ^
                (second == null ? 0 : second.hashCode()) ^
                (third == null ? 0 : third.hashCode()) ^
                (forth == null ? 0 : forth.hashCode()) ^
                (fifth == null ? 0 : fifth.hashCode()) ^
                (sixth == null ? 0 : sixth.hashCode());
    }

    public static <A, B, C, D, E, F> Sextuple<A, B, C, D, E, F> create(A a, B b, C c, D d, E e, F f) {
        return new Sextuple<A, B, C, D, E, F>(a, b, c, d, e, f);
    }
}
