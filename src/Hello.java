public class Hello {
    public static void main(String []args){
        System.out.println("Hello Rajesh Singh");
        System.out.println("How R u??");

        int myValue=10000;

        int minIntValue= Integer.MIN_VALUE;
        int maxIntValue=Integer.MAX_VALUE;

        System.out.println("Minimum Int value is :"+minIntValue);
        System.out.println("Maximum Int value is :"+maxIntValue);

        System.out.println("My Value is :"+myValue);

        int maxInt = Integer.MAX_VALUE +1;
        System.out.println("maxInt is :"+maxInt);

        int maxIntPlusOne = 2_147_483_647;

        System.out.println(maxIntPlusOne);

        byte minByte= Byte.MIN_VALUE;
        byte maxByte=Byte.MAX_VALUE;

        System.out.println("\nMinimum BYTE value is :"+minByte);
        System.out.println("Maximum BYTE value is :"+maxByte);
        byte newByte=(byte) (minByte/2);
        System.out.println(newByte);

        short minShort= Short.MIN_VALUE;
        short maxShort=Short.MAX_VALUE;

        System.out.println("\nMinimum Short value is :"+minShort);
        System.out.println("Maximum Short value is :"+maxShort);

        long minLong= Long.MIN_VALUE;
        long maxLong=Long.MAX_VALUE;

        System.out.println("\nMinimum Long value is :"+minLong);
        System.out.println("Maximum Long value is :"+maxLong);

        float minFloat= Float.MIN_VALUE;
        float maxFloat=Float.MAX_VALUE;

        System.out.println("\nMinimum Float value is :"+minFloat);
        System.out.println("Maximum Float value is :"+maxFloat);

        float newFloat=(float) 5.255;

        double newDouble=5.25;

        System.out.println(newFloat);
        System.out.println(newDouble);
        //Printing Different characters using their UNICODES
        char myUnicodeD ='\u0044';
        char myCopyrightChar='\u00a9';
        System.out.println(myUnicodeD);
        System.out.println(myCopyrightChar);


    }
}
