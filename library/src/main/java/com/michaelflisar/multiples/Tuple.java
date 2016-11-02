package com.michaelflisar.multiples;

/**
 * Created by jahudzik on 2016-10-31.
 */

abstract class Tuple {

    static boolean objectsEqual(Object a, Object b) {
      return a == b || (a != null && a.equals(b));
    }

    protected abstract Object[] getAllValues();

    protected abstract int getValueCount();

    // -------------------
    // Equal/Hash
    // -------------------

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tuple)) {
            return false;
        }
        if (((Tuple)o).getValueCount() != getValueCount()) {
            return false;
        }
        return areObjectsEqual((Tuple)o, this);
    }

    @Override
    public int hashCode() {
        return calcHashCode(this);
    }

    // -------------------
    // Helper functions
    // -------------------

    static <T extends Tuple> boolean areObjectsEqual(T t1, T t2)
    {
        Object[] o1 = t1.getAllValues();
        Object[] o2 = t2.getAllValues();
        boolean isEqual = true;
        for (int i = 0; i < o1.length; i++) {
            isEqual &= objectsEqual(o1[i], o2[i]);
            if (!isEqual)
                return false;
        }
        return isEqual;
    }

    static <T extends Tuple> int calcHashCode(T t)
    {
        Object[] o = t.getAllValues();
        int hash = (o[0] == null ? 0 : o[0].hashCode());
        for (int i = 1; i < o.length; i++)
            hash ^= (o[i] == null ? 0 : o[i].hashCode());
        return hash;
    }

}
