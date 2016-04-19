/**
* This class is used to demo access modifiers
*/

package p2;
import p1.AccessDemo;

//Demos protected and default  if extended can be used to demo default access also
class AccessPak extends AccessDemo{
    
    public static void main(String[] args){
        AccessDemo a = new AccessDemo();
        //System.out.println(a.pr1); // Only class level
        System.out.println(a.pu1);  //project level
        System.out.println(a.po); //If not extended then we will have CE
        //System.out.println(a.de); //Will have CE as it has default access and can only be access in the package level
    }
    
    
}

