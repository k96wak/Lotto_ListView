package com.example.yunda.lotto_listview;

import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by yun.da on 2017-09-12.
 */

public class JSONParser {
    private TextView tv;
    private JSONArray jsonObject;
    private JSONObject its;
    private List<HashMap<String, String>> iteminfoList = null;

    public HashMap JSONParse(String result) throws JSONException {
        Log.d("qqq","10");
        //StringBuffer sb = new StringBuffer();

        //JSONObject its = jsonObject.getJSONObject(Integer.parseInt(""));
        //JSONArray jsonArray = its.getJSONArray("Lotto");
        try {
            Log.d("qqq","11");
            JSONObject itemsinfo = new JSONObject(result);
            Iterator keys = itemsinfo.keys();
            HashMap<String, String> iteminfoMap = new HashMap<String, String>();
            while (keys.hasNext()){
                String key = keys.next().toString();
                iteminfoMap.put(key, itemsinfo.getString(key));
                /*sb.append(
                        key +
                        itemsinfo.getString(key)
                );*/
                //Log.d("qqq", "key :" + keys.next().toString()+", value : "+itemsinfo.getString(key));
            }
            return iteminfoMap;

        } catch (JSONException e) {
            e.printStackTrace();
            //Log.e("qqq", Log.getStackTraceString(e));
            Log.d("qqq","14");
            return null;
        }

    }
}
