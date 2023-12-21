class A {
    void print() {
        System.out.println("Print class a Method");
    }
}

class som extends A {
    void printB() {
        System.out.println("print som Method");
    }
}

class kundu extends som {
    void printC(){
        System.out.println("Print kundu Method");
    }
}

class D extends kundu {
    void printD() {
        System.out.println("print D Method");
    }
}


public class hireInheri {
    public static void main(String[] args) {
        
       som obj = new som();
       kundu objc = new kundu();
       
        
      obj.print();
      objc.print();
    }
}
