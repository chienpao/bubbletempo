package bubbletempo.app.wordpress.me.synology.chienpao.bubbletempo;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;

public class GameActivity extends Activity {

    final int BUTTON_NUMBER = 9;
    private Button[] button;
    private int resID;
    private String buttonID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);

        button = new Button[BUTTON_NUMBER];
        resID = 0;
        buttonID = "";

        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                for(int i=0; i<BUTTON_NUMBER; i++) {
                    buttonID = "button" + (i + 1);
                    //Log.i("Pao", buttonID);
                    resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                    //Log.i("Pao", Integer.toString(resID));
                    button[i]= ((Button) findViewById(resID));
                }
                initButtonColor();
            }
        });

    }

    public void onClickButtonFunc(View view){
        for(int i=0; i<BUTTON_NUMBER; i++) {
            button[i].setBackgroundColor(RandomClass.getRandomColor(0, 7));
        }
    }

    void initButtonColor(){
        for(int i=0; i<BUTTON_NUMBER; i++) {
            button[i].setBackgroundColor(RandomClass.getRandomColor(0, 7));
        }
    }
}
