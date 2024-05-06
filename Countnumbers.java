package Task8;

public class Countnumbers {
    
    
        public static void main(String[] args) {

            int num = 2147483647;

            int count = 0;

            while (num>0) {

                num = num/10;
        
                count++;
                
            }
            System.out.println("The Count of the number is " + count);
        }
    
    }

        
