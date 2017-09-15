package com.example.yunda.lotto_listview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import org.json.JSONException;

import java.util.HashMap;

/**
 * Created by yun.da on 2017-09-11.
 */

public class ItemView extends Activity implements Interface_v{
    private TextView txt;
    private TextView txt1;
    private TextView txt2;
    private TextView txt3;
    private TextView txt4;
    private TextView txt5;
    private TextView txt6;
    private TextView txt7;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        txt = (TextView) findViewById(R.id.item_info);
        txt1 = (TextView) findViewById(R.id.item_info1);
        txt2 = (TextView) findViewById(R.id.item_info2);
        txt3 = (TextView) findViewById(R.id.item_info3);
        txt4 = (TextView) findViewById(R.id.item_info4);
        txt5 = (TextView) findViewById(R.id.item_info5);
        txt6 = (TextView) findViewById(R.id.item_info6);
        txt7 = (TextView) findViewById(R.id.item_info7);

        Intent intent = getIntent();
        Items items = new Items();
        HashMap map = new HashMap<String, String>();
        items.setDrwNo(intent.getStringExtra("drwNo"));
        //String info = intent.getStringExtra("Info");
        //JSONParser jsonParser = new JSONParser();
        String url = "http://www.nlotto.co.kr/common.do?method=getLottoNumber&drwNo=" + items.getDrwNo();
        Log.d("qqq", "aaaaaaaaaaaaaaa" + items.drwNo);


        NetworkTask networkTask = new NetworkTask(url, items, this);
        networkTask.execute();

    }

    @Override
    public void Inter(HashMap map) {
        txt.setText("Num : " + map.get("drwNo").toString() +"\n");
        txt1.setText("Date : " + map.get("drwNoDate").toString() + "\n");
        txt2.setText("Num1 : " + map.get("drwtNo1").toString() +"\n");
        txt3.setText("Num2 : " + map.get("drwtNo2").toString() +"\n");
        txt4.setText("Num3 : " + map.get("drwtNo3").toString() +"\n");
        txt5.setText("Num4 : " + map.get("drwtNo4").toString() +"\n");
        txt6.setText("Num5 : " + map.get("drwtNo5").toString() +"\n");
        txt7.setText("Num6 : " + map.get("drwtNo6").toString() +"\n");
    }
}



