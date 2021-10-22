package open_close;

class Calculator {
    int add(int a, int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }
}
class UpgradedCalculator extends Calculator {
    int mul(int a, int b){
        return a*b;
    }
    float div(int a, int b){
        return b!=0 ? a/(float)b : 0;
    }
}


//classes should be open for extension but close for modification
public class OpenClose {
    public static void main(String[] args) {
        System.out.println(new UpgradedCalculator().div(1,2));
        
    }
}
