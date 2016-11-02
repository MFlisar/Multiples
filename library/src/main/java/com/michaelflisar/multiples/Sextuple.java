package com.michaelflisar.multiples;

/**
 * Created by flisar on 13.10.2016.
 */

public class Sextuple<Q, R, S, T, U, V> extends Tuple {
    public final Q first;
    public final R second;
    public final S third;
    public final T fourth;
    public final U fifth;
    public final V sixth;

    public Sextuple(Q first, R second, S third, T fourth, U fifth, V sixth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
    }

    @Override
    protected final Object[] getAllValues()
    {
        return new Object[]{first, second, third, fourth, fifth, sixth};
    }

    @Override
    protected final int getValueCount()
    {
        return 6;
    }

    public static <A, B, C, D, E, F> Sextuple<A, B, C, D, E, F> create(A a, B b, C c, D d, E e, F f) {
        return new Sextuple<A, B, C, D, E, F>(a, b, c, d, e, f);
    }
}
