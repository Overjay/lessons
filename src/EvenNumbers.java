import java.util.ArrayList;

import java.util.Arrays;




public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> resultArr = new ArrayList<>();
        for(int i: numbers){
            if(numbers[i]%divider>0){
                continue;
            }else{
                resultArr.add(numbers[i]);
            }

        }
        int[] resultPrim = new int[resultArr.size()];
        Arrays.setAll(resultPrim, resultArr::get);
        return resultPrim;
    }

   


}
