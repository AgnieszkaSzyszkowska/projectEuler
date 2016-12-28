public class FiboSumOfEven{

    static int giveSumOfEven (int max){//counts the sum of even Fibbonacci numbers below max parameter
        int pp=1;//pre-previous
        int p=2;//previous
        int iNumberOfFibo=0;
        int sumOfEven = 2;
        if (max==1){return 1;}
        if (max==2) {return 2;}
        while (iNumberOfFibo<max){
            iNumberOfFibo=pp+p;
            pp=p;
            p=iNumberOfFibo;
            if (iNumberOfFibo % 2==0 && iNumberOfFibo <max){
                sumOfEven=sumOfEven+iNumberOfFibo;
            }
        } return sumOfEven;
    }

    public static void main (String[] args){
        System.out.println("Wynik to: "+giveSumOfEven(4000000));
    }
}
