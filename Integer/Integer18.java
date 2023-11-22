package Integer;

public class Integer18 {
    public static void main(String[] args) {
        String n = "1234578";
        int k = Integer.parseInt(n);
        System.out.println(k%10000/1000);
        //13 System.out.println(n/10%10+""+n/100+""+n%10);
        //14 System.out.println(123%100+""+n/100);
    }
}
