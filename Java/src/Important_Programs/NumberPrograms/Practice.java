package Important_Programs.NumberPrograms;
import java.util.Scanner;
//Practice For Number Programs.
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int Num = sc.nextInt();
        int i,Count=0;
        for(i=1;i<=Num;i++){
            if(Num%i==0){
                Count++;
                System.out.println("Factors Are: "+i);
            }
        }

        if(Count==2){
            System.out.println(Num+" Is A Prime Number:");
        }
        else{
            System.out.println(Num+" Is Not A Prime Number:");
        }
    }
}

