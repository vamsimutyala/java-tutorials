/**
* This class is used to demo access modifiers
*/

package p1;
public class AccessDemo {
    private int pr1 = 10; //Class level
    public int pu1 = 20; // Project level
    protected int po = 30; //Package level can be used in another by extending
    int de = 40;  // Only package level
    
    public static void main(String[] args){
        AccessDemo a = new AccessDemo();
        System.out.println(a.pr1);
        System.out.println(a.pu1);
        System.out.println(a.po);
        System.out.println(a.de);
    }
    
    public int getProtected(){
        return this.po;
    }
    
    
}