package com.michaelflisar.multiples;

/**
 * Created by jahudzik on 2016-10-31.
 */

abstract class Tuple {

  static boolean objectsEqual(Object a, Object b) {
      return a == b || (a != null && a.equals(b));
  }

}
