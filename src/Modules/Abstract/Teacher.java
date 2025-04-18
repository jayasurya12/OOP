package Modules.Abstract;

class Teacher extends Member {

    public Teacher(String name) {
        super(name);
    }

    @Override
    void welcomeMessage() {
        System.out.println("Hello Teacher ..." + getName());
    }
}
