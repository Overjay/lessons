package Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class HouseBroker {
    public static void main(String[] args) {

        ArrayList<House> houses = HouseMaker.housesList();
        houses.stream().forEach((house -> System.out.println(house.getName())));



    }
}
