package com.drteam.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MatchActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    private TextView tvTeamAName, tvTeamBName;
    private TextView tvTeamAScore, tvTeamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        initWidget();
    }

    private void initWidget() {
        tvTeamAName = (TextView) findViewById(R.id.tv_teamA_name);
        tvTeamAName.setText(getIntent().getStringExtra("teamA"));
        tvTeamBName = (TextView) findViewById(R.id.tv_teamB_name);
        tvTeamBName.setText(getIntent().getStringExtra("teamB"));

        tvTeamAScore = (TextView) findViewById(R.id.tv_teamA_score);
        tvTeamBScore = (TextView) findViewById(R.id.tv_teamB_score);
    }

    public void addThreeForTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    private void displayForTeamA(int score) {
        tvTeamAScore.setText(String.valueOf(score));
    }

    private void displayForTeamB(int score) {
        tvTeamBScore.setText(String.valueOf(score));
    }
}
