package ArrayListsTest;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0; i<10;i++){
            arrayList.add(i);
        }

        arrayList.remove(5);
        System.out.println(arrayList);

    }
}
