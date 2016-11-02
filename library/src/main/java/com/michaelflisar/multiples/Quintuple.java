package com.michaelflisar.multiples;

/**
 * Created by flisar on 13.10.2016.
 */

public class Quintuple<Q, R, S, T, U> extends Tuple {
    public final Q first;
    public final R second;
    public final S third;
    public final T fourth;
    public final U fifth;

    public Quintuple(Q first, R second, S third, T fourth, U fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
    }

    @Override
    protected final Object[] getAllValues()
    {
        return new Object[]{first, second, third, fourth, fifth};
    }

    @Override
    protected final int getValueCount()
    {
        return 5;
    }

    public static <A, B, C, D, E> Quintuple<A, B, C, D, E> create(A a, B b, C c, D d, E e) {
        return new Quintuple<A, B, C, D, E>(a, b, c, d, e);
    }
}
