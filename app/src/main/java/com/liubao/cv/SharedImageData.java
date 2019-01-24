package com.liubao.cv;

import android.graphics.Bitmap;

import java.nio.ByteBuffer;

/**
 * Create By Liubao
 * On 2019/1/25 0025
 */
public class SharedImageData {

    public byte[] buffer;
    public int width;
    public int height;

    SharedImageData(Bitmap bitmap){
        this.width = bitmap.getWidth();
        this.height = bitmap.getHeight();

        int bytes = bitmap.getByteCount();
        ByteBuffer byteBuffer = ByteBuffer.allocate(bytes);

        bitmap.copyPixelsToBuffer(byteBuffer);
        this.buffer = byteBuffer.array();
    }

    public Bitmap getImageBitmap() {
        Bitmap bitmap =  Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
        bitmap.copyPixelsFromBuffer(ByteBuffer.wrap(this.buffer));

        return bitmap;
    }

}
