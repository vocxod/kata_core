package ru.odybo.universal;

class CheckInfinity {
    /*
     * This code uncompiled - 1.0 is DOUBLE and native type conversion in this case not apply.
     */
    public static void main(String... args) {


      float f = 1.0 + 1.0F;
      // f = f + 1.0F;
      /*
      float ff = f / 0;

      System.out.println(f);
      System.out.println(ff);
*/
      System.out.println(f/0.0F);

    }

}
