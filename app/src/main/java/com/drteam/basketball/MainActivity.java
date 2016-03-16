package com.drteam.basketball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtTeamA, edtTeamB;
    private Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidget();
    }

    private void initWidget() {
        edtTeamA = (EditText) findViewById(R.id.edt_teamA_name);
        edtTeamB = (EditText) findViewById(R.id.edt_teamB_name);

        final Intent intent = new Intent(this, MatchActivity.class);

        btnPlay = (Button) findViewById(R.id.btn_play);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("teamA", edtTeamA.getText().toString());
                intent.putExtra("teamB", edtTeamB.getText().toString());
                startActivity(intent);
            }
        });
    }

}
