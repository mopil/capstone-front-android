package com.cookandroid.capstone_front_android.data;

import com.google.gson.annotations.SerializedName;

public class BooleanDTO {
    @SerializedName("result")
    private boolean result;

    public boolean getresult() {
        return result;
    }
}