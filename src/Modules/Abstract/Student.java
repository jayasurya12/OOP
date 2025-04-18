package Modules.Abstract;

class Student extends Member {

    public Student(String name) {
        super(name);
    }

    @Override
    void welcomeMessage() {
        System.out.println("Hello Student ..." + getName());
    }
}
