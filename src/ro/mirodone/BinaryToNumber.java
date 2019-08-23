package ro.mirodone;

import java.util.List;

public class BinaryToNumber {


    public  int ConvertBinaryArrayToInt(List<Integer> binary) {

        int result = 0;
        int power = 0;


        for (int i = binary.size() - 1; i >= 0; i--) {

            double temp = binary.get(i) * Math.pow(2, power);
            power++;

            result = result + (int) temp;
        }

        return result;
    }
}
