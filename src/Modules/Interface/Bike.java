package Modules.Interface;

class Bike implements Ridable {
    @Override
    public void ride() {
        System.out.println("Hello fro ridable interface bike");
    }
}
