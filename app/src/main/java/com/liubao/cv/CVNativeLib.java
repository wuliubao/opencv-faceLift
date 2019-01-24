package com.liubao.cv;

import android.graphics.Bitmap;

/**
 * Create By Liubao
 * On 2019/1/25 0025
 */
public class CVNativeLib {

    static {
        System.loadLibrary("native-lib");
    }

    static native SharedImageData nativeProcess(SharedImageData sharedImageData);

    public Bitmap process(Bitmap originBitmap) {
        SharedImageData originSharedImageData = new SharedImageData(originBitmap);

        SharedImageData dstSharedImageData = nativeProcess(originSharedImageData);

        Bitmap dstBitmap = dstSharedImageData.getImageBitmap();

        return dstBitmap;

    }

}
