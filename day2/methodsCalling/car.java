class Car {
    
    public static void main(String[] args){
        System.out.println("Hello welcome");
        m1();
    }
    
    static void m1(){
        System.out.println("This is Car");
        Bike.m2();
    }
    
 
}


class Bike{
     static void m2(){
        System.out.println("This is Bike");
    }
}