package com.michaelflisar.multiples;

/**
 * Created by flisar on 13.10.2016.
 */

public class Septuple<Q, R, S, T, U, V, W> extends Tuple {
    public final Q first;
    public final R second;
    public final S third;
    public final T fourth;
    public final U fifth;
    public final V sixth;
    public final W seventh;

    public Septuple(Q first, R second, S third, T fourth, U fifth, V sixth, W seventh) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
    }

    @Override
    protected final Object[] getAllValues()
    {
        return new Object[]{first, second, third, fourth, fifth, sixth, seventh};
    }

    @Override
    protected final int getValueCount()
    {
        return 7;
    }

    public static <A, B, C, D, E, F, G> Septuple<A, B, C, D, E, F, G> create(A a, B b, C c, D d, E e, F f, G g) {
        return new Septuple<A, B, C, D, E, F, G>(a, b, c, d, e, f, g);
    }
}
