/*
    1
   212
  32123
 4321234
543212345
 */

public class Q1A_vi {
    public static void main(String[] args) {
        int n=5;
        int row,digit,space;

        for (row=1;row<=n;row++){
            for(space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for (digit=row;digit>=1;digit--){    //print decreasing numbers
                System.out.print(digit);
            }
            for (digit=2;digit<=row;digit++){    //print increasing numbers
                System.out.print(digit);
            }
            System.out.println();
        }
    }
}
