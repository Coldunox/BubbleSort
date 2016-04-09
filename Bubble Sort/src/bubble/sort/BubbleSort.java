package bubble.sort;
import java.util.Scanner;
import static java.lang.System.out;

class BubbleSort {
    public static void main(String[] args) {
        int n,c,d,temp;
        Scanner in = new Scanner (System.in);
        
        out.println("Input number of integers to sort");
        n=in.nextInt();
        
        int array[]=new int[n];
        
        out.println("Enter "+n+" integers");
        
        for (c=0;c<n;c++)
            array[c]=in.nextInt();
        
        for (c=0;c<(n-1);c++){
            for (d=0;d<n-c-1;d++){
                if (array[d]>array[d+1])
                {
                    temp = array[d];
                    array[d]=array[d+1];
                    array[d+1]=temp;
                }
            }
        }
        

        
        for (c=0;c<n;c++)
            out.println(array[c]);
    }
}
