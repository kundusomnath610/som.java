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

class inheritance {
    public static void main (String [] args) {
        child c1 = new child();
        c1.display();
        c1.show();
    }
}
