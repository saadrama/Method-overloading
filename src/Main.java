public class Main {
    static int plusMethod(int x,int y){
        return x+y;
    }
    static double plusMethod(double x, double y){
        return x+y;
    }
    public static void main(String[] args) {
        int mySum1= plusMethod(8,7);
        double mySum2=plusMethod(4.5,8.43);
        System.out.println(mySum1);
        System.out.println(mySum2);
        /*Multiple methods can have the same name as long as
        * the number and/or type of parameters are different*/
    }

}