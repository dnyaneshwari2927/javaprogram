import java.util.*;
class p5{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of element to be inserted in array : ");
                int n = sc.nextInt();
                int arr[]=new int[n];
                for(int i = 0;i<n;i++){
                        arr[i] = sc.nextInt();
                }
                 for(int i = 0;i<n;i++){
			 if(arr[i]<10)
                                System.out.print(arr[i] + "is less then 10 ");
                        }


}
}
