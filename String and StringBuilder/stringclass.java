import javax.sound.sampled.SourceDataLine;

public class stringclass {
   
    public static void main(String[] args) {
         /*
      Strings are Immutable in java which means that once an object of String is 
      created cannot be changed or destroyed futher, the refernce variable can be made to point on a differnt 
      object 
     */
    String a = "harsh";
    String b = "harsh";
    // In the above example both refernce varibale in stack memory, points towards the 
    // same object in heap, this concept is known is String Pooling
    System.out.println(a);
    a = "vardhan";
    System.out.println(a);
    // In the above example the object is not chnged, it has created a new object and made
    // that refernce varaible a points towards that new object, that's the reason, we're getting
    // 2 outputs. That previous object was not destroyed, it will be managed by garbage collection
    // in java.

    /*
     c
     Basically, there are two ways to compre string in java
     1st, by using a comparitor, like ==, This Particular comparitor will check if 
     the reference variable are pointing towards the same object or not
     */
    String name = "harsh";
    String name2 = "harsh";
    System.out.println(name == name2); // will return true
    // Here both the reference varibale in stack were pointing towards the same object in heap
    // That's why on doing comparision using a comparitor(==), it will return true
    // But if the refernce variable were not pointing towards the same object, it would have
    // return false, eventhough the value is same
    // both name and name2 are in String pool

    /*
     How to Create Differnt Object of same Value
     */
    String a1 = new String("harsh");
    String b1 = new String("harsh");
    /*
      Here, object is created ouside the String pool, but inside the heap memory
      And both the refernce variables will now to point to different objects in different location
     */
    System.out.println(a1 == b1); // will give false
    // So, here if we try to compare both the reference varaibles, it will return false
    // Becuase this comparitor(==) will checking, if the both the refernce variables are
    // pointing towards the same object, but here we have created a new object of same value

    /*
     Comparision of String(Contd.):
     2nd Method, is that if we only want to check the value of the refernce varaibles, ignoring
     to which object they are pointing, we will use .equsls() method.
     This method only check fot the value
     */
    System.out.println(a1.equals(b1)); // will give true

    StringBuilder builer = new StringBuilder();
    
    }
}
