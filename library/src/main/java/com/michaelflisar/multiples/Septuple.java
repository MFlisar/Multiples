package com.michaelflisar.multiples;

/**
 * Created by flisar on 13.10.2016.
 */

public class Septuple<Q, R, S, T, U, V, W> extends Tuple {
    public final Q first;
    public final R second;
    public final S third;
    public final T forth;
    public final U fifth;
    public final V sixth;
    public final W seventh;

    public Septuple(Q first, R second, S third, T forth, U fifth, V sixth, W seventh) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.forth = forth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Septuple)) {
            return false;
        }
        Septuple<?, ?, ?, ?, ?, ?, ?> p = (Septuple<?, ?, ?, ?, ?, ?, ?>) o;
        return objectsEqual(p.first, first) &&
                objectsEqual(p.second, second) &&
                objectsEqual(p.third, third) &&
                objectsEqual(p.forth, forth) &&
                objectsEqual(p.fifth, fifth) &&
                objectsEqual(p.sixth, sixth) &&
                objectsEqual(p.seventh, seventh);
    }

    @Override
    public int hashCode() {
        return (first == null ? 0 : first.hashCode()) ^
                (second == null ? 0 : second.hashCode()) ^
                (third == null ? 0 : third.hashCode()) ^
                (forth == null ? 0 : forth.hashCode()) ^
                (fifth == null ? 0 : fifth.hashCode()) ^
                (sixth == null ? 0 : sixth.hashCode()) ^
                (seventh == null ? 0 : seventh.hashCode());
    }

    public static <A, B, C, D, E, F, G> Septuple<A, B, C, D, E, F, G> create(A a, B b, C c, D d, E e, F f, G g) {
        return new Septuple<A, B, C, D, E, F, G>(a, b, c, d, e, f, g);
    }
}
