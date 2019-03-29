
package com.example.mylifeline.models;

/**
 * Created by Rishabh Gupta on 29-03-2019
 */

import android.arch.lifecycle.ViewModel;



public class MainActivityViewModel extends ViewModel {

    private boolean mIsSigningIn;

    public MainActivityViewModel() {
        mIsSigningIn = false;
    }

    public boolean getIsSigningIn() {
        return mIsSigningIn;
    }

    public void setIsSigningIn(boolean mIsSigningIn) {
        this.mIsSigningIn = mIsSigningIn;
    }


}
