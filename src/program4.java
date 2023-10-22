import javax.swing.*;
import java.util.*;

public class program4 {
    public static void main(String[] args) {
        int third=0;
        int second=0;
        int first=0;
        for(int abc=100;abc<1000;abc++) {
            //basamak degerlerinin bulunmasi
            third = abc % 10;                      //c
            second = ((abc - third) % 100) / 10;   //b
            first = (abc - third - second) / 100;  //a
            //ihtiyacın oldugu sayilarin üretilmesi
            int cba=third*100+second*10+first;
            int ab=first*10+second;
            int bc=second*10+third;
            int cb=third*10+second;
            int ba=second*10+first;
            //koşullar
            if(abc<cba){     //   abc<cba kontrol edilir(ilk kosul)
                 if(isPrime(abc))  //ikinci kosul
                     if(isPrime(cba))  //ücüncü kosul
                         if(isPrime(ab))   //dördüncü
                             if(isPrime(bc))   //besinci
                                 if(isPrime(cb))   //altinci
                                     if(isPrime(ba)) //yedinci
                                         System.out.println(abc);
            }


        }

    }
    static boolean isPrime(int n)     // asal olup olmadıgını veren fonksiyon
    {
        if (n <= 1)
            return false;


        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}
