package Integer;

public class Integer24 {
    public static void main(String[] args) {
        //1-365 1 - Monday(1)
        int n = 1;
        System.out.println(n%7);

        //1-365 1 - Thursday(4)
        if (n%7+3 > 6) {
            System.out.println(n%7+3-7);
        } else {
            System.out.println(n%7+3);
        }

        //1-365 1 - Saturday(6)
        if (n%7+5 >6) {
            System.out.println(n%7+5-7);
        } else {
            System.out.println(n%7+5);
        }


    }
}
