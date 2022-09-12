import java.util.Scanner;

public class Frequency {  
    private int visited = -1;
    private int arr1[] = new int[10];
    private int fr1[] = new int[10];
    public Frequency(int n,int[] arr,int[] fr)
    {
        this.arr1 = arr;
        this.fr1 = fr;
    }
    
    public void Count(){
        for(int i = 0; i < arr1.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr1.length; j++){  
                if(arr1[i] == arr1[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr1[j] = visited;  
                }  
            }  
            if(fr1[i] != visited)  
                fr1[i] = count;  
        }
        // return fr1;
    }
    public void display(){ 
        System.out.println("Element Frequency");  
        for(int i = 0; i < fr1.length; i++){  
            if(fr1[i] != visited)  
                System.out.println(arr1[i] + "\t" + fr1[i]);  
        }  
    }

      
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        int [] arr = new int [n];   
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        int [] fr = new int [arr.length];  
        Frequency F = new Frequency(n,arr,fr); 
        F.Count();
        F.display();
    }  
}  