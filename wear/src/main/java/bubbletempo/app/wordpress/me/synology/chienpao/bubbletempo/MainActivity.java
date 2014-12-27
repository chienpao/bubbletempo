package bubbletempo.app.wordpress.me.synology.chienpao.bubbletempo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                button = (Button) stub.findViewById(R.id.button);
            }
        });
    }

    public void onButtonFunc(View view){
        Log.i("Pao", "success");
    }

    public void onStartFunc(View view){
        Intent intent = new Intent();
        intent.setClass(this, GameActivity.class);
        startActivity(intent);
    }
}
