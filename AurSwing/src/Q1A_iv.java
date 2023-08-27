/*
    *
   ***
  *****
 *******
*********
 */
public class Q1A_iv {
    public static void main(String[] args) {
        int n=5;
        int row,star,space;

        for(row=1;row<=n;row++){
            for(space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for (star=1;star<=row*2-1;star++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
