public class largestPalindromeProductProjectEuler {
    public static int largestPalindromeProduct () {
        int max=0;
        for (int a=999; a>=100; a--){
            for (int b=a;b>=100;b--){
                int product = a*b;
                if (largestPalindromeProductProjectEuler.isPalindrome(product)&&product>max){
                    max=product;
                }
            }
        }
        return max;
    }
    public static boolean isPalindrome(int i){
        boolean palindrome = true;
        String asText = Integer.toString(i);
        int c=0;
        int d=asText.length()-1;
        if(d==0){
            palindrome = false;
            System.out.println("To liczba 1-cyfrowa");
            return palindrome;
        }
        while(c<d){
            if(asText.charAt(c) !=asText.charAt(d)){
                palindrome = false;
                return palindrome;
            }
            c++;
            d--;
        }
        return palindrome;
    }
    public static void main (String[]args){
        System.out.println(largestPalindromeProductProjectEuler.largestPalindromeProduct());

    }
}
