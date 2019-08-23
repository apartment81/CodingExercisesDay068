package ro.mirodone;

public class BinaryToDecimal {

    public void Conversion (long binaryNun){


        long j =1 , reminder ,decimalNum = 0;

        while (binaryNun !=0) {

            reminder = binaryNun % 10;
            decimalNum = decimalNum + reminder*j;
            j = j*2 ;
            binaryNun = binaryNun /10 ;

        }

        System.out.println("Decimal number: " + decimalNum);


    }

}
