package com.sealiu.ps2practice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScore(int score, String team) {
        if ("a".equals(team) || "A".equals(team)) {
            TextView textView = (TextView) findViewById(R.id.score_team_a);
            textView.setText(score + "");
        } else if ("b".equals(team) || "B".equals(team)) {
            TextView textView = (TextView) findViewById(R.id.score_team_b);
            textView.setText(score + "");
        }
    }

    public void addThreePointForA(View view) {
        scoreA += 3;
        displayScore(scoreA, "a");
    }

    public void addTwoPointForA(View view) {
        scoreA += 2;
        displayScore(scoreA, "a");
    }

    public void addFreeThrowA(View view) {
        scoreA += 1;
        displayScore(scoreA, "a");
    }

    public void addThreePointForB(View view) {
        scoreB += 3;
        displayScore(scoreB, "b");
    }

    public void addTwoPointForB(View view) {
        scoreB += 2;
        displayScore(scoreB, "b");
    }

    public void addFreeThrowB(View view) {
        scoreB += 1;
        displayScore(scoreB, "b");
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayScore(scoreA, "A");
        displayScore(scoreB, "B");
    }
}
