package com.michaelflisar.multiples;

/**
 * Created by flisar on 13.10.2016.
 */

public class Triple<Q, R, S> extends Tuple {
    public final Q first;
    public final R second;
    public final S third;

    public Triple(Q first, R second, S third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    protected final Object[] getAllValues()
    {
        return new Object[]{first, second, third};
    }

    @Override
    protected final int getValueCount()
    {
        return 3;
    }

    public static <A, B, C> Triple <A, B, C> create(A a, B b, C c) {
        return new Triple<A, B, C>(a, b, c);
    }
}
