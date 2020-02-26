package com.company;

public class Main {

    public static void main(String[] args) {

            int myValue = 10000;

            int myMinIntValue = Integer.MIN_VALUE;
            int myMaxIntValue = Integer.MAX_VALUE;

            System.out.println("Integer Minimum Value = " + myMinIntValue);
            System.out.println("Integer Maximum Value = " + myMaxIntValue);
            System.out.println("Busted MAX Int Value = " + (myMaxIntValue + 1));
            System.out.println("Busted MIN Int Value = " + (myMinIntValue - 1));

            byte myMinByteValue = Byte.MIN_VALUE;
            byte myMaxByteValue = Byte.MAX_VALUE;

            System.out.println("Byte Minimum Value = " + myMinByteValue);
            System.out.println("Byte Maximum Value = " + myMaxByteValue);

            float myMinFloatValue = Float.MIN_VALUE;
            float myMaxFloatValue = Float.MAX_VALUE;

            System.out.println("Float Minimum Value = " + myMinFloatValue);
            System.out.println("Float Maximum Value = " + myMaxFloatValue);

            short myMinShortValue = Short.MIN_VALUE;
            short myMaxShortValue = Short.MAX_VALUE;

            System.out.println("Short Minimum Value = " + myMinShortValue);
            System.out.println("Short Maximum Value = " + myMaxShortValue);

            double myMinDoubleValue = Double.MIN_VALUE;
            double myMaxDoubleValue = Double.MAX_VALUE;

            System.out.println("Double Minimum Value = " + myMinDoubleValue);
            System.out.println("Double Maximum Value = " + myMaxDoubleValue);

            long myLongValue = 100;

            long myMinLongValue = Long.MIN_VALUE;
            long myMaxLongValue = Long.MAX_VALUE;

            System.out.println("Long Minimum Value = " + myMinLongValue);
            System.out.println("Long Maximum Value = " + myMaxLongValue);

            long bigLongLiteralValue = 2_147_483_647_234L;
            System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue /2);

        byte myNewByteValue = (byte) (myMinByteValue /2);

        short myNewShortValue = (short) (myMinShortValue /2);

        System.out.println(myNewShortValue);

    }
}
