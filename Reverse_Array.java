import java.util.* ;
import java.util.ArrayList;

public class Reverse_Array
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int left=m+1;
        int right=arr.size()-1;

        while(left<right){
            int temp=arr.get(left);
            arr.set(left,arr.get(right));
            arr.set(right,temp);

            left++;
            right--;
        }
    }
    public static void main(String[]args){
        ArrayList<Integer>arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        reverseArray(arr,m);

        for(int ele:arr){
            System.out.println(ele + " ");
        }
    }
}

