package ro.mirodone;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

      BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
      binaryToDecimal.Conversion(101);


        BinaryToNumber binaryToNumber = new BinaryToNumber();

        System.out.println(binaryToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1,1))));
        System.out.println(binaryToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 0, 1, 1, 0, 1, 1))));


        DecimalToBinary decimal = new DecimalToBinary();
        decimal.decToBinary(219);
        System.out.println("");
        decimal.decToBinary(31);
        System.out.println("");

        CleverBinary clever = new CleverBinary();
        System.out.println(clever.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 0, 1, 1, 0, 1, 1))));


    }
}
