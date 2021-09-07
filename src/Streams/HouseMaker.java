package Streams;

import java.util.ArrayList;
import java.util.List;


public class HouseMaker {
    public static ArrayList<House> housesList(){
        House house1 = new House.HouseObjBuilder(HouseType.OFFICE)
                .setAge(5)
                .setColor("red")
                .setFloors(3)
                .setName("Red Corp.")
                .build();
        House house2 = new House.HouseObjBuilder(HouseType.APARTMENT)
                .setAge(15)
                .setColor("grey")
                .setFloors(9)
                .setName("klopovnik")
                .build();
        House house3 = new House.HouseObjBuilder(HouseType.APARTMENT)
                .setAge(1)
                .setColor("yellow")
                .setFloors(8)
                .setName("CoolTown")
                .build();
        House house4 = new House.HouseObjBuilder(HouseType.RUIN)
                .setAge(2)
                .setColor("grey")
                .setName("ruin")
                .build();
        House house5 = new House.HouseObjBuilder(HouseType.FACTORY)
                .setAge(12)
                .setColor("blue")
                .setName("Broken Things Bakery")
                .setFloors(1)
                .build();
        House house6 = new House.HouseObjBuilder(HouseType.APARTMENT)
                .setAge(10)
                .setColor("grey")
                .setFloors(6)
                .setName("Factory Bunkhouse")
                .build();
        House house7 = new House.HouseObjBuilder(HouseType.STORAGE)
                .setAge(11)
                .setColor("white")
                .setFloors(1)
                .setName("All things Storage")
                .build();
        House house8 = new House.HouseObjBuilder(HouseType.OFFICE)
                .setAge(20)
                .setColor("yellow")
                .setFloors(4)
                .setName("City Hall")
                .build();

        return new ArrayList<House>(List.of(house1,house2,house3,house4,house5,house6,house7,house8));

    }





}
