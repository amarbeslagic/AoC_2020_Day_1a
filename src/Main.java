import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_1a.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<Integer> listOfInteger = new ArrayList<>();

        String s;
        //put Strings in array
        while ((s = br.readLine()) != null) {
            if (s.isBlank()) continue;

            listOfInteger.add(Integer.parseInt(s));
        }

        for(int i=0; i< listOfInteger.size()/2; i++){
            for(int j=0; j< listOfInteger.size(); j++){
                if(listOfInteger.get(i) + listOfInteger.get(j) == 2020){
                    System.out.println(listOfInteger.get(i));
                    System.out.println(listOfInteger.get(j));
                    System.out.println(listOfInteger.get(i) * listOfInteger.get(j));
                }
            }
        }
    }
}