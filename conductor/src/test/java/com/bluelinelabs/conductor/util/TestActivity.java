package com.bluelinelabs.conductor.util;

import android.support.v4.app.FragmentActivity;

public class TestActivity extends FragmentActivity {

    public boolean isChangingConfigurations = false;
    public boolean isDestroying = false;

    @Override
    public boolean isChangingConfigurations() {
        return isChangingConfigurations;
    }

    @Override
    public boolean isDestroyed() {
        return isDestroying || super.isDestroyed();
    }
}
