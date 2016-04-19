/**
* This class is used to demo access modifiers
*/
package p1;
class AccessSub {
    
    public static void main(String[] args){
        AccessDemo a = new AccessDemo();
        //System.out.println(a.pr1);
        System.out.println(a.pu1);
        System.out.println(a.po);
        System.out.println(a.de);
        
        //Demo for calling methods
        int po = a.getProtected();
        System.out.println(po);
    }
    
    
}