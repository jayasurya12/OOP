package Modules.Interface;

class Car implements Ridable {
    public void ride() {
        System.out.println("You are riding a car");
    }
    @Override
    public void display() {
        System.out.println("this is over ride methods in interface in car");
    }
}
