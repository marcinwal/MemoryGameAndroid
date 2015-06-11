package eu.ratingpedia.memorygame;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    SharedPreferences prefs;
    String dataName = "MyData";
    String intName = "MyString";
    int defaultInt = 0;
    public static int hiScore; //both ativities will see it

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reading data
        prefs = getSharedPreferences(dataName, MODE_PRIVATE);
        hiScore = prefs.getInt(intName, defaultInt);
        TextView textHiScore = (TextView)findViewById(R.id.textHighScore);
        textHiScore.setText("Hi:"+hiScore);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent i;
        i = new Intent(this,GameActivity.class);
        startActivity(i);
    }
}
