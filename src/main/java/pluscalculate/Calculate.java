package pluscalculate;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Calculate {

    public static int[] splitString(String no) {
        String[] data = no.split(GubunType.comma.getType());
        int [] arr = new int[data.length];
        for(int i=0; i< arr.length; i++){
            arr[i] = Integer.parseInt(data[i]);
        }
        return arr;
    }


    public static int plus(int[] result) {
        int sum = 0;
        for(int i=0; i<result.length; i++){
            sum += result[i];
        }
        return sum;
    }

    public static int splitAndSum(String text){
        if(text == null || text.isEmpty()){
            return 0;
        }
        int[] split = splitString(text);
        return plus(split);

    }
}
