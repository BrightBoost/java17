package sealedclasses;

public class SealedExercise {
//        Create a class Vehicle
//        Give it a method move
//        Allow it to be extended by Car and Boat
//        Allow Car and Boat to have two subtypes as well
//        The subtypes of boat are not sealed, the subtypes of Car cannot be extended
//        Overwrite the method move in every subtype, add a custom method to every subtype of Car and Boat

}

sealed class Vehicle permits Car, Boat {
    public void move() {
        System.out.println("vehicle moving");
    }
    public static void switchVehicle(Vehicle v) {

        switch(v) {
            case Boat b -> {
                System.out.println("Boat");
                b.move();
            }
            case Car c -> {
                System.out.println("Car");
                c.move();
            }
            default -> throw new IllegalStateException("Unexpected value: " + v);
        };
    }
}

sealed class Car extends Vehicle permits Truck, Van {

}

final class Truck extends Car {

}

final class Van extends Car {

}
sealed class Boat extends Vehicle permits SlowBoat, FastBoat {

}

non-sealed class SlowBoat extends Boat {

}

non-sealed class FastBoat extends Boat {

}

