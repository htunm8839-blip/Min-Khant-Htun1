public class Car extends Vehicle {

    public String modelName = "BMW";
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.sound();
            System.out.println(myCar.brand + " and " + myCar.modelName);
        }
    }

