package kata2.pkg2021;

import java.util.HashMap;
import java.util.Map;

public class Kata22021 {

    public static void main(String[] args) {
        String []data= new String[]{"Rosa", "Gato", "Gata", "Rojo", "Gato", "Coche", "Leche", "Leche"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        for (String key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
    
}
