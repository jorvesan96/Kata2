package kata2.pkg2021;

import java.util.HashMap;
import java.util.Map;

public class Kata22021 {

    public static void main(String[] args) {
        Integer []data= new Integer[]{1,0,3,33,4,6,-5,100,9,0,100,12,13,14,0};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
    
}
