package com.kamin.gltest;

import android.content.Context;
import android.opengl.GLSurfaceView;


public class InstanceGLSurfaceView extends GLSurfaceView {

    public InstanceGLSurfaceView(Context context) {
        super(context);
        InstanceGLSurfaceViewRenderer GLSurfaceViewRenderer  = new InstanceGLSurfaceViewRenderer();
        setEGLContextClientVersion(3);
        setRenderer(GLSurfaceViewRenderer);
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }


}
