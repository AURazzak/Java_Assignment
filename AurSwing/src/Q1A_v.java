/*
    1
   222
  33333
 4444444
555555555
 */
public class Q1A_v {
    public static void main(String[] args) {
        int n=5;
        int row,digit,space;

        for (row=1;row<=n;row++){
            for (space=1;space<n-row;space++){
                System.out.print(" ");
            }
            for (digit=1;digit<=row*2-1;digit++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
