package com.example.myapplication442;

import android.media.AudioAttributes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BasketBallActivity extends AppCompatActivity {

    private TextView mTeamA;
    private TextView mTeamB;
    private TextView mTeamA_Point;
    private TextView mTeamB_Point;

    private Button mTeamA_3Point;
    private Button mTeamA_2Point;
    private Button mTeamA_FrerThrow;
    private Button mTeamB_3Point;
    private Button mTeamB_2Point;
    private Button mTeamB_FrerThrow;
    private Button mReset;

    private int mTeamA_Count = 0;
    private int mTeamB_Count = 0;
    private int mReset_Count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket_ball);

        mTeamA_3Point = (Button) findViewById(R.id.teamA_3Point);
        mTeamA_2Point = (Button) findViewById(R.id.teamA_2Point);
        mTeamA_FrerThrow = (Button) findViewById(R.id.teamA_FreeThrow);

        mTeamB_3Point = (Button) findViewById(R.id.teamB_3Point);
        mTeamB_2Point = (Button) findViewById(R.id.teamB_2Point);
        mTeamB_FrerThrow = (Button) findViewById(R.id.teamB_FreeThrow);

        mReset = (Button) findViewById(R.id.reset);


        mTeamA = (TextView) findViewById(R.id.teamA);
        mTeamB = (TextView) findViewById(R.id.teamB);
        mTeamA_Point = (TextView) findViewById(R.id.teamA_Point);
        mTeamB_Point = (TextView) findViewById(R.id.teamB_Point);



        mTeamA_3Point.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mTeamA_Count = mTeamA_Count + 3;

                mTeamA_Point.setText("" + mTeamA_Count);
            }
        });

        mTeamA_2Point.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mTeamA_Count = mTeamA_Count + 2;

                mTeamA_Point.setText("" + mTeamA_Count);
            }
        });

        mTeamA_FrerThrow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mTeamA_Count = mTeamA_Count + 1;

                mTeamA_Point.setText("" + mTeamA_Count);
            }
        });

        mTeamB_3Point.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mTeamB_Count = mTeamB_Count + 3;

                mTeamB_Point.setText("" + mTeamB_Count);
            }
        });

        mTeamB_2Point.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mTeamB_Count = mTeamB_Count + 2;

                mTeamB_Point.setText("" + mTeamB_Count);
            }
        });

        mTeamB_FrerThrow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mTeamB_Count = mTeamB_Count + 1;

                mTeamB_Point.setText("" + mTeamB_Count);
            }
        });

        mReset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mTeamA_Count =  0;
                mTeamA_Point.setText("" + mTeamA_Count);
                mTeamB_Count =  0;
                mTeamB_Point.setText("" + mTeamB_Count);
            }
        });




    }
}


















