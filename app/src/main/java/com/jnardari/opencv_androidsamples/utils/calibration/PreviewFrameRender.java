package com.jnardari.opencv_androidsamples.utils.calibration;

import org.opencv.android.CameraBridgeViewBase;
import org.opencv.core.Mat;

public class PreviewFrameRender extends FrameRender {
    @Override
    public Mat render(CameraBridgeViewBase.CvCameraViewFrame inputFrame) {
        return inputFrame.rgba();
    }
}