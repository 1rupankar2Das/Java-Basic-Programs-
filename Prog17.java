//A Java program to demonstrate the use of labeled for loop
public class Prog17{
    public static void main(String args[])
    {
        //Using label for outer and for loop
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==3){
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}