import javax.swing.*;

public class program5 {
    public static void main(String[] args){
        //*****************************************************************
        //Bu kısım metodun denenmesi icin olusturulmustur******************

        int x=1;
        do{
            x= Integer.parseInt(JOptionPane.showInputDialog("deger giriniz"));
            JOptionPane.showMessageDialog(null,isPrimeX(x));
        }while(!isPrimeX(x));

        //*****************************************************************
        //*****************************************************************

    }
    //******************************************************************************************************************
    //ODEVDE İSTENİLEN KISIM*******************************************************************************************
    public static boolean isPrimeX(int a){
        do{
        if (isPrime(a))
            a=getSum(a);
        else
            return false;
         }while(getSum(a)!=a);

        return true;
    }
    //******************************************************************************************************************
    //******************************************************************************************************************

    static boolean isPrime(int n)     // asal olup olmadıgını veren metod (program 4 te de kullanılmıstı)
    {
        if (n <= 1)
            return false;


        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    static int getSum(int n)         //basamakları toplamaya yarayan metod
    {
        int sum = 0;

        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }

        return sum;
    }}