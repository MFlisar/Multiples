package com.michaelflisar.multiples;

/**
 * Created by flisar on 13.10.2016.
 */

public class Quadruple<Q, R, S, T> extends Tuple {
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
    protected final Object[] getAllValues()
    {
        return new Object[]{first, second, third, fourth};
    }

    @Override
    protected final int getValueCount()
    {
        return 4;
    }

    public static <A, B, C, D> Quadruple<A, B, C, D> create(A a, B b, C c, D d) {
        return new Quadruple<A, B, C, D>(a, b, c, d);
    }
}
