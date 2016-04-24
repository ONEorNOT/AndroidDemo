package com.nicerdata.jamsps2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getViews();
        setBtnClicks();
        displayForTeamA(0);
        displayForTeamB(0);
    }

    private TextView scoreViewA;
    private TextView scoreViewB;
    private Button add3ScoresForA;
    private Button add2ScoresForA;
    private Button add1ScoresForA;
    int allScoreForA = 0;
    private Button add3ScoresForB;
    private Button add2ScoresForB;
    private Button add1ScoresForB;
    int allScoreForB = 0;

    private void getViews() {
        scoreViewA = $(R.id.team_a_score);
        scoreViewB = $(R.id.team_b_score);
        add3ScoresForA = $(R.id.add_3_scores_for_A);
        add2ScoresForA = $(R.id.add_2_scores_for_A);
        add1ScoresForA = $(R.id.add_1_scores_for_A);
        add3ScoresForB = $(R.id.add_3_scores_for_B);
        add2ScoresForB = $(R.id.add_2_scores_for_B);
        add1ScoresForB = $(R.id.add_1_scores_for_B);
    }

    private void setBtnClicks() {
        add3ScoresForA.setOnClickListener(this);
        add2ScoresForA.setOnClickListener(this);
        add1ScoresForA.setOnClickListener(this);
        add3ScoresForB.setOnClickListener(this);
        add2ScoresForB.setOnClickListener(this);
        add1ScoresForB.setOnClickListener(this);
    }

    /**
     * Display the given score for Team A
     */
    public void displayForTeamA(int score) {
        scoreViewA.setText(String.valueOf(score));
    }

    /**
     * Display the given score for Team B
     */
    public void displayForTeamB(int score) {
        scoreViewB.setText(String.valueOf(score));
    }

    @SuppressWarnings("unchecked")
    private <T> T $(int id) {
        return (T) findViewById(id);
    }

    public void addScoresForTeamA(int score) {
        allScoreForA += score;
        displayForTeamA(allScoreForA);
    }

    private void addScoresForTeamB(int score) {
        allScoreForB += score;
        displayForTeamB(allScoreForB);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.add_3_scores_for_A:
                addScoresForTeamA(3);
                break;

            case R.id.add_2_scores_for_A:
                addScoresForTeamA(2);
                break;

            case R.id.add_1_scores_for_A:
                addScoresForTeamA(1);
                break;

            case R.id.add_3_scores_for_B:
                addScoresForTeamB(3);
                break;

            case R.id.add_2_scores_for_B:
                addScoresForTeamB(2);
                break;

            case R.id.add_1_scores_for_B:
                addScoresForTeamB(1);
                break;

            default:
                break;
        }

    }

    public void resetScore(View view) {
        displayForTeamA(0);
        displayForTeamB(0);
        allScoreForA = allScoreForB = 0;
    }
}
