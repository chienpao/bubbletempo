package bubbletempo.app.wordpress.me.synology.chienpao.bubbletempo;

import android.graphics.Color;

import java.util.Random;
/**
 * Created by pao on 12/23/14.
 */
public class RandomClass {

    static int getRandomColor(int count, int randomNumber){
        Random random = new Random();
        return transferNumber2Color(1 + random.nextInt(randomNumber));
    }

    static int transferNumber2Color(int value){
        switch(value){
            case 1:
                return Color.RED;
            case 2:
                return Color.argb(48, 255, 205, 0);
            case 3:
                return Color.YELLOW;
            case 4:
                return Color.GREEN;
            case 5:
                return Color.BLUE;
            case 6:
                return Color.argb(272, 137, 0, 255);
            case 7:
                return Color.BLACK;
            default:
                return Color.WHITE;
        }
    }
}
