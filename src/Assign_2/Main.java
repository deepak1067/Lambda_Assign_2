package Assign_2;

public class Main {
    public static void main(String[] args) {
        Assign_2Interface lambda= l-> (l%2!=0) ? l+1:l+2 ;
        System.out.println(lambda.nextEven(199999));
    }
}