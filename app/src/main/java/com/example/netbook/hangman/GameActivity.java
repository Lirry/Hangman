package com.example.netbook.hangman;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.Random;

public class GameActivity extends ActionBarActivity {

    private String[] words;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        // Removes the word from the users sight.

        // Takes the input of the user and checks it in combination with the word
        // Adds one to the hangman if false




    }

    @Override
    protected void onStart() {
        words = getResources().getStringArray(R.array.words);
        TextView randomText = (TextView)findViewById(R.id.display_word);
        String randomWord = words[randomizer()];
        Log.d("test", randomWord);
        randomText.setText(randomWord);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    public int randomizer() {
        Random r = new Random();
        return r.nextInt(words.length - 1);
    }
}
