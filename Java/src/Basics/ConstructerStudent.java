package Basics;

public class ConstructerStudent {
    String Name;
    int RollNo;
    ConstructerStudent(){
        Name = "Venkat";
        RollNo = 1657;
    }
    public static void main(String[] args) {
        ConstructerStudent st = new ConstructerStudent();
        System.out.println(st.Name);
        System.out.println(st.RollNo);
    }
}
