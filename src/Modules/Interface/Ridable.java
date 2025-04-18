package Modules.Interface;

//Interface  - What to do but not How to do

interface Ridable {
    void ride();
    default void display() {
        System.out.println("this is abstract method interface");
    }

}
