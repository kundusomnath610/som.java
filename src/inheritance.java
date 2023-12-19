class parent {
    void display() {
        System.out.println("It Is a Parent Class");
    }
}

class child extends parent {
    void show() {
        System.out.println("This is child class");
    }
}

class child1 extends child {
    void display1() {
        System.out.println("child class 1");
    }
}


class inheritance {
    public static void main (String [] args) {
        child1 c1 = new child1();
        c1.display();
        System.out.println();
        //c1.display1();
        System.out.println();
        c1.show();
        System.out.println();
        c1.display1();
    }
}
