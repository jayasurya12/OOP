package Modules.Abstract;

public class Abstract {
    public static void main(String[] args) {
        String[] nameArr = {"Alice", "Bob"};

//        Student s1 = new Student(nameArr[0]);
//        Teacher t1 = new Teacher(nameArr[1]);
//        Member m1 = new Student("Charlie");

        Member[] m = new Member[4];
        m[0] = new Student("David");
        m[1] = new Teacher("Emma");

        for (Member mVal : m) {
            if (mVal != null) {
                mVal.welcomeMessage();
            }
        }
    }
}
