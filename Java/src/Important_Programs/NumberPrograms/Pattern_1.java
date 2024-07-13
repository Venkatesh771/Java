package Important_Programs.NumberPrograms;
//Left Half Pyramid.
public class Pattern_1 {
    public static void main(String[] args) {
        int N=6,i,j;

        for (i=1;i<=N;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
