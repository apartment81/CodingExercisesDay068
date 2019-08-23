package ro.mirodone;

import java.util.List;

public class CleverBinary {

    public  int convertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }

}
