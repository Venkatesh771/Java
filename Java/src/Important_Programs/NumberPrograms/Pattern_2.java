package Important_Programs.NumberPrograms;
//Left Half Pyramid Reverse.
public class Pattern_2 {
    public static void main(String[] args) {
        int N=6,i,j;

        for(i=1;i<=N;i++){
            for(j=N;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
