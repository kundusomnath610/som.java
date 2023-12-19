class A {
    void print() {
        System.out.println("Print class a Method");
    }
}

class B extends A {
    void printB() {
        System.out.println("print B Method");
    }
}

class C extends B {
    void printC(){
        System.out.println("Print C Method");
    }
}

class D extends C {
    void printD() {
        System.out.println("print D Method");
    }
}


public class hireInheri {
    public static void main(String[] args) {
        
       B obj = new B();
       C objc = new C();
       
        
      obj.print();
      objc.print();
    }
}
