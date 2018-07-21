package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class TickerModel {
    private String mPrice;

    public String getPrice() {
        return mPrice;
    }

    public static TickerModel fromJSON(JSONObject jsonObject){

        try {
            TickerModel tickerData = new TickerModel();
            tickerData.mPrice = jsonObject.getString("last");
            return tickerData;
        }
        catch (JSONException e){
            e.printStackTrace();

            return null;
        }

    }
}
