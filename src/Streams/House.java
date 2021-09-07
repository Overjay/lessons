package Streams;


public class House {
    private int age;
    private String color;
    private HouseType type;
    private int floors;
    private String name;

    //constructor
    private House(HouseObjBuilder builder){
        this.type = builder.type;
        this.age = builder.age;
        this.color = builder.color;
        this.floors = builder.floors;
        this.name = builder.name;
    }

    //getters
    public int getAge(){
        return age;
    }

    public int getFloors(){
        return floors;
    }

    public String getColor(){
        return color;
    }

    public HouseType getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    //builder class
    public static class HouseObjBuilder{

        private int age;
        private String color;
        private HouseType type;
        private int floors;
        private String name;

        public HouseObjBuilder(HouseType type){
            this.type = type;
        }

        public HouseObjBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public HouseObjBuilder setColor(String color){
            this.color = color;
            return this;
        }
        public HouseObjBuilder setFloors(int floors){
            this.floors = floors;
            return this;
        }

        public HouseObjBuilder setName (String name){
            this.name = name;
            return this;
        }

        public House build(){
            House house = new House(this);
            return house;
        }



    }


}
