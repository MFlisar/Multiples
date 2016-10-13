package com.michaelflisar.multiples;

/**
 * Created by flisar on 13.10.2016.
 */

public class Nonuple<Q, R, S, T, U, V, W, X, Y> {
    public final Q first;
    public final R second;
    public final S third;
    public final T forth;
    public final U fifth;
    public final V sixth;
    public final W seventh;
    public final X eigth;
    public final Y ninth;

    public Nonuple(Q first, R second, S third, T forth, U fifth, V sixth, W seventh, X eigth, Y ninth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.forth = forth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eigth = eigth;
        this.ninth = ninth;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Nonuple)) {
            return false;
        }
        Nonuple<?, ?, ?, ?, ?, ?, ?, ?, ?> p = (Nonuple<?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
        return objectsEqual(p.first, first) &&
                objectsEqual(p.second, second) &&
                objectsEqual(p.third, third) &&
                objectsEqual(p.forth, forth) &&
                objectsEqual(p.fifth, fifth) &&
                objectsEqual(p.sixth, sixth) &&
                objectsEqual(p.seventh, seventh) &&
                objectsEqual(p.eigth, eigth) &&
                objectsEqual(p.ninth, ninth);
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
                (sixth == null ? 0 : sixth.hashCode()) ^
                (seventh == null ? 0 : seventh.hashCode()) ^
                (eigth == null ? 0 : eigth.hashCode()) ^
                (ninth == null ? 0 : ninth.hashCode());
    }

    public static <A, B, C, D, E, F, G, H, I> Nonuple<A, B, C, D, E, F, G, H, I> create(A a, B b, C c, D d, E e, F f, G g, H h, I i) {
        return new Nonuple<A, B, C, D, E, F, G, H, I>(a, b, c, d, e, f, g, h, i);
    }
}
