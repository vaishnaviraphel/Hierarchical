package Java_practice2.hierarchical;

public class Vehicle {
    Vehicle(){
        System.out.println("Vehicle's DC");
    }

    void speed(){
        System.out.println("The speed is "+getClass().getSimpleName());
    }
}
