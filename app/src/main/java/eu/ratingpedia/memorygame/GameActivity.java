package eu.ratingpedia.memorygame;

import android.app.Activity;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.logging.Handler;


public class GameActivity extends Activity implements View.OnClickListener {

    private SoundPool soundPool;
    int sample1 = -1;
    int sample2 = -1;
    int sample3 = -1;
    int sample4 = -1;

    //for UI
    TextView textScore;
    TextView textDifficulty;
    TextView textWatchGo;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button buttonReplay;

    //some inits
    int diffcultyLevel = 3;
    //array for randomly generated sequence
    int[] sequenceToCopy = new int[100];
    //handler and sequence flag plus element we are playing
    private Handler myHandler;
    boolean playSequence = false;
    int elementToPlay = 0;
    //players answer
    int playerResponse;
    int playerScore;
    boolean isResponding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


    }


    @Override
    public void onClick(View v) {

    }
}
