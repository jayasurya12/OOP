package Modules.Abstract;

abstract class Member {
    private String name;
    abstract void welcomeMessage();

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
