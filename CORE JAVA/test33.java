public class test33 {
    public static void main(String[] args) {
        String s = "     ";
        System.out.println(s.length());
        s = s.trim();
        System.out.println(s.length());
        String s1 = "Harsh";
        String s2 = "Harsh";
        if(s1.equals(s2))
        {
            System.out.println("Matched");
        }
        else{
            System.out.println("Not Matched");
        }
    }
}
