import java.util.*;
public class PrimeFactors {



        public static boolean czyToLiczbaPierwsza (int liczba){
            boolean toLiczbaPierwsza= true;
            if (liczba%2==0){toLiczbaPierwsza=false;return toLiczbaPierwsza;}
            for (int i = 3; i<=Math.sqrt(liczba); i=i+2){
                if (i%3!=0){
                    if (liczba%i==0){
                        toLiczbaPierwsza=false;
                        return toLiczbaPierwsza;
                    }
                }
            } return toLiczbaPierwsza;
        }

        public static void main (String[] args){

            long  wczytanaLiczba=600851475143L;
            int pierwiastek= (int) Math.sqrt(wczytanaLiczba);

            int max=0;
            for (int b=3; b<=pierwiastek;b=b+2){
                if (czyToLiczbaPierwsza(b)&&wczytanaLiczba%b==0){
                    max=b;
                }
            }
                System.out.println(max);


        }
    }
