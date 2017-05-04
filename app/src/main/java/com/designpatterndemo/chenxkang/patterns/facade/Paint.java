package com.designpatterndemo.chenxkang.patterns.facade;

import android.util.Log;

import static com.designpatterndemo.chenxkang.patterns.facade.FacadeFragment.FACADE_TAG;

/**
 * author: chenxkang
 * time  : 17/4/25
 * desc  : 画笔，绘图
 */

public class Paint implements Pen {

    @Override
    public void draw() {
        Log.i(FACADE_TAG, "画笔绘图");
    }

}
