/**
*This class is used to demo type casting
*/

class TypeCasting{
     public static void main(String[] args){
         //Widening int is changed to float with 8 bytes
         int i = 10; //4
         float f = i; //4
         System.out.println(f);
         
         float f1 = 10.0f;
         //int i1 = f1;
        int i1 = (int)f1;  //This is explict type casting
         
         System.out.println(i1);
         
     }
}