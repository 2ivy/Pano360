package com.martin.ads.vrlib.constant;

import android.hardware.Sensor;

/**
 * Created by Ads on 2016/6/25.
 */
public class Constants {
    public static final int FLOAT_SIZE_BYTES = 4;

    //Sensor
    public static final int SENSOR_ACC= Sensor.TYPE_ACCELEROMETER;
    public static final int SENSOR_MAG=Sensor.TYPE_MAGNETIC_FIELD;
    public static final int SENSOR_ROT=Sensor.TYPE_ROTATION_VECTOR;

    //Texture
    public static final int NO_TEXTURE=0;
    //i.e. GLES11Ext.GL_TEXTURE_EXTERNAL_OES
    public static final int GL_TEXTURE_EXTERNAL_OES = 0x8D65;
}
