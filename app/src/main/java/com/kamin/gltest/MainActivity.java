package com.kamin.gltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final InstanceGLSurfaceView glSurfaceView = new InstanceGLSurfaceView(this);
        glSurfaceView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                glSurfaceView.requestRender();
                return true;
            }
        });
        super.onCreate(savedInstanceState);
        setContentView(glSurfaceView);
        Log.d("LOG_TAG","OK");
    }
}
