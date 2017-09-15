package com.example.yunda.lotto_listview;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONException;

import java.util.HashMap;

import javax.security.auth.callback.Callback;

/**
 * Created by yun.da on 2017-09-15.
 */

public class NetworkTask extends AsyncTask<Void, Void, HashMap> {

    private String url;
    private Items items;
  /*  private TextView txt;
    private TextView txt1;
    private TextView txt2;
    private TextView txt3;
    private TextView txt4;
    private TextView txt5;
    private TextView txt6;
    private TextView txt7;*/
    Interface_v callback;


    public NetworkTask(String url, Items items, Interface_v callback) {

        this.url = url;
        this.items = items;
        this.callback = callback;

    }




    @Override
    protected HashMap doInBackground(Void... voids) {

        String result;
        RequestHttpURLConnection requestHttpURLConnection = new RequestHttpURLConnection();
        result = requestHttpURLConnection.performPostCall(url, items);
        Log.d("qqq", "aaaaaaaaaaaaaaa");

            /*Gson gson = new Gson();
            Items items = gson.fromJson(result, Items.class);

            Log.d("qqq", items.toString());
            result = "drwNo : " + items.getDrwNo() + "\n" +
                     "drwNoDate : " + items.getDrwNoDate() + "\n" +
                     "DrwtNo1 : " + items.getDrwtNo1() + "\n" +
                     "DrwtNo2 : " + items.getDrwtNo2() + "\n" +
                     "DrwtNo3 : " + items.getDrwtNo3() + "\n" +
                     "DrwtNo4 : " + items.getDrwtNo4() + "\n" +
                     "DrwtNo5 : " + items.getDrwtNo5() + "\n" +
                     "DrwtNo6 : " + items.getDrwtNo6() + "\n" ;

            return result;
        }*/
        JSONParser jsonParser = new JSONParser();
        HashMap map = new HashMap();


        String url = "http://www.nlotto.co.kr/common.do?method=getLottoNumber&drwNo=" + items.getDrwNo();


        try {
            map = jsonParser.JSONParse(result);
            //Log.d("qqq", "aaaaaaaaaaaaabbbbbbbbbbbaa : " );
           /* Log.d("qqq", "Num : " + map.get("drwNo").toString());
            Log.d("qqq", "No1 : " + map.get("drwtNo1").toString());
            Log.d("qqq", "No2 : " + map.get("drwtNo2").toString());
            Log.d("qqq", "No3 : " + map.get("drwtNo3").toString());
            Log.d("qqq", "No4 : " + map.get("drwtNo4").toString());
            Log.d("qqq", "No5 : " + map.get("drwtNo5").toString());
            Log.d("qqq", "No6 : " + map.get("drwtNo6").toString());*/



        } catch (JSONException e) {

            e.printStackTrace();
        }

        Log.d("qqq", "aaa"+map);
        return map;
    }

    @Override
    protected void onPostExecute(HashMap map) {
        Log.d("qqq","15");
        Log.d("qqq", "bbb"+map);callback.Inter(map);
        super.onPostExecute(map);
/*

        txt.setText("Num : " + map.get("drwNo").toString() +"\n");
        txt1.setText("Date : " + map.get("drwNoDate").toString() + "\n");
        txt2.setText("Num1 : " + map.get("drwtNo1").toString() +"\n");
        txt3.setText("Num2 : " + map.get("drwtNo2").toString() +"\n");
        txt4.setText("Num3 : " + map.get("drwtNo3").toString() +"\n");
        txt5.setText("Num4 : " + map.get("drwtNo4").toString() +"\n");
        txt6.setText("Num5 : " + map.get("drwtNo5").toString() +"\n");
        txt7.setText("Num6 : " + map.get("drwtNo6").toString() +"\n");
*/

    }

}
