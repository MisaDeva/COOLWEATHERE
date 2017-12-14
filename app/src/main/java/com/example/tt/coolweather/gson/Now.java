package com.example.tt.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TT on 2017/12/13.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}
