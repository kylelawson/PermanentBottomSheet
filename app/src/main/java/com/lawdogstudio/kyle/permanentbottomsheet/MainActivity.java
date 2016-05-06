package com.lawdogstudio.kyle.permanentbottomsheet;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Example and template of a permanent bottom sheet, best used to display details of something
 * from the main screen, make sure to include compile 'com.android.support:design:23.3.0' in
 * build.gradle(Module:app) or else none of this works
 */


public class MainActivity extends AppCompatActivity {

    BottomSheetBehavior mBottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View bottomSheet = findViewById(R.id.bottom_sheet);

        mBottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
        mBottomSheetBehavior.setPeekHeight(300);
        mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

    }
}
