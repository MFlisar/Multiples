package com.michaelflisar.multiples;

/**
 * Created by flisar on 13.10.2016.
 */

public class Decuple<Q, R, S, T, U, V, W, X, Y, Z> extends Tuple {
    public final Q first;
    public final R second;
    public final S third;
    public final T fourth;
    public final U fifth;
    public final V sixth;
    public final W seventh;
    public final X eighth;
    public final Y ninth;
    public final Z tenth;

    public Decuple(Q first, R second, S third, T fourth, U fifth, V sixth, W seventh, X eighth, Y ninth, Z tenth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eighth = eighth;
        this.ninth = ninth;
        this.tenth = tenth;
    }

    @Override
    protected final Object[] getAllValues()
    {
        return new Object[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
    }

    @Override
    protected final int getValueCount()
    {
        return 10;
    }

    public static <A, B, C, D, E, F, G, H, I, J> Decuple<A, B, C, D, E, F, G, H, I, J> create(A a, B b, C c, D d, E e, F f, G g, H h, I i, J j) {
        return new Decuple<A, B, C, D, E, F, G, H, I, J>(a, b, c, d, e, f, g, h, i, j);
    }
}
