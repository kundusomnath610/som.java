class student {
   private String name;
    private int age;
    private int rollNumber;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getrollNumber() {
        return rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setrollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        student obj = new student();
        obj.setName("Somnath");
        obj.setAge(20);
        obj.setrollNumber(10);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getrollNumber());
    }
}
