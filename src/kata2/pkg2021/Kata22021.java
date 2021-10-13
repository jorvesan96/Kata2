package kata2.pkg2021;

import java.util.HashMap;
import java.util.Map;

public class Kata22021 {

    public static void main(String[] args) {
        int []data= new int[]{1,0,3,33,4,6,-5,100,9,0,100,12,13,14,0};
        Map<Integer,Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }
        }
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
    
}
