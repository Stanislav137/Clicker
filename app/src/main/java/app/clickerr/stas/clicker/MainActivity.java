package app.clickerr.stas.clicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnEasy;
    private Button btnMedium;
    private Button btnHard;

    private int g;
    private int gas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEasy = (Button) findViewById(R.id.btnEasy);
        btnMedium = (Button) findViewById(R.id.btnMedium);
        btnHard = (Button) findViewById(R.id.btnHard);
    }

    public void startEasy(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("difficulty", 1);
        startActivity(intent);
    }

    public void startMedium(View view) {

        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("difficulty", 2);
        startActivity(intent);
    }

    public void startHard(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("difficulty", 3);
        startActivity(intent);
    }
}
