
import javax.swing.*;
import java.util.Random;


public class program2 {
    public static void main(String[] args) {


        ImageIcon dice1 = new ImageIcon("zar1.jpg");
        ImageIcon dice2 = new ImageIcon("zar2.png");
        ImageIcon dice3 = new ImageIcon("zar3.png");
        ImageIcon dice4 = new ImageIcon("zar4.png");
        ImageIcon dice5 = new ImageIcon("zar5.png");
        ImageIcon dice6 = new ImageIcon("zar6.png");

        ImageIcon[] dices={null,dice1,dice2,dice3,dice4,dice5,dice6};  //resimleri depolamak icin array
                                                                       //kod okunurluğunu kolaylaştırmak için dices[0]=null yapilmistir

        Random rand = new Random();
        int first= rand.nextInt(1,7);   //1 ve 7 arasi rastgele sayi üretir ilk zar icin
        int second= rand.nextInt(1,7);  //1 ve 7 arasi rastgele sayi üretir ikinci zar icin



                                //resimi gösterir
        JOptionPane.showMessageDialog(null,  dices[first]);
        JOptionPane.showMessageDialog(null,  dices[second]);

    }
}

