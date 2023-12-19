class tiger implements Animal {
    public void run() {
        System.out.println("Tiger Sound");
    } 
}

class lion implements Animal {
    public void run() {
        System.out.println("Lion Sound");
    }
}


interface Animal {
    public void run();
    public static void main(String[] args) {
        Animal bengalTiger = new tiger();
        Animal bigLion = new lion();
        bengalTiger.run();
        bigLion.run();
    }
}




