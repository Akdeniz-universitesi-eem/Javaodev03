import javax.swing.*;
import java.util.Random;

public class program3 {
    public static void main(String[] args){
        Random rand = new Random();
        int random= rand.nextInt(100);
        int x=101;
        do{
            try {
                x = Integer.parseInt(JOptionPane.showInputDialog(random + "bir a sayisi giriniz"));
            } catch(Exception e){
                JOptionPane.showMessageDialog(null,"yanlis turden deger girisi! \n lutfen tam sayi degeri giriniz.");
               // throw new ArithmeticException("Yanlis turden sayi girisi yaptınnız!");    //opsiyonel koda dahil edilirse kullanıcı hatasında kod durur
            }

        }while(x != random);

         JOptionPane.showMessageDialog(null,"Doğru!");

    }
}
