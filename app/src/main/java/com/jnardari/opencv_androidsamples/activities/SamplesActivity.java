package com.jnardari.opencv_androidsamples.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jnardari.opencv_androidsamples.R;

public class SamplesActivity extends AppCompatActivity {

    Intent sampleIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samples);
    }

    public void tutorial1(View v) {
        sampleIntent = new Intent(this, Tutorial1Activity.class);
        startActivity(sampleIntent);
    }

    public void tutorial2(View v) {
        sampleIntent = new Intent(this, Tutorial2Activity.class);
        startActivity(sampleIntent);
    }

    public void tutorial3(View v) {
        sampleIntent = new Intent(this, Tutorial3Activity.class);
        startActivity(sampleIntent);
    }

    public void imageManipulations(View v) {
        sampleIntent = new Intent(this, ImageManipulationsActivity.class);
        startActivity(sampleIntent);
    }

    public void faceDetection(View v) {
        // TODO - Create Intent and Start Activity
    }

    public void colorBlobDetection(View v) {
        sampleIntent = new Intent(this, ColorBlobDetectionActivity.class);
        startActivity(sampleIntent);
    }

    public void cameraCalibration(View v) {
        // TODO - Create Intent and Start Activity
    }

    public void puzzle15(View v) {
        // TODO - Create Intent and Start Activity
    }
}
