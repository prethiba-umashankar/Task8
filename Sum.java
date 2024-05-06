package Task8;

public class Sum {

    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        int firstSum = a + b;
        int secondSum = c + d;

        if (firstSum > secondSum)
        {
            System.out.println("sum of a and b is greater than sum of c and d");
        } else {
            System.out.println("sum of c and d is greater than sum of a and b");
        }

    }

}
