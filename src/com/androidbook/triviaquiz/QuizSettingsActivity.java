package com.androidbook.triviaquiz;

import android.os.Bundle;
import com.androidbook.triviaquiz.R;

public class QuizSettingsActivity extends QuizActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }
}