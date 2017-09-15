package com.example.yunda.lotto_listview;

import android.content.ContentValues;
import android.renderscript.Sampler;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.Map;

/**
 * Created by yun.da on 2017-09-12.
 */

public class RequestHttpURLConnection {

   public String performPostCall(String requestUrl, Items items){

        Log.d("qqq", "5");
        URL url;
        String respones = "";
        //String Url = "http://www.nlotto.co.kr/common.do?method=" + items.drwNo;
        //String paramName = "method";
        //String paramValue= "getLottoNumber";
        try{
            Log.d("qqq", "6 url : "+"http://www.nlotto.co.kr/common.do?method=getLottoNumber&drwNo=" + items.getDrwNo() );
            url = new URL("http://www.nlotto.co.kr/common.do?method=getLottoNumber&drwNo=" + items.getDrwNo());
            Log.d("qqq", "7");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setReadTimeout(15000);
            conn.setConnectTimeout(15000);
            conn.setRequestMethod("GET");
            conn.setDoInput(true);
            conn.setDoOutput(true);
            OutputStream os = conn.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
            //writer.write(getPostDataString(postDataParams));
            writer.flush();  Log.d("qqq", "8");
            writer.close();

            int responseCode = conn.getResponseCode();

            if(responseCode == HttpURLConnection.HTTP_OK){ Log.d("qqq", "9");
                String line;
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

                while ((line = br.readLine()) != null){
                   respones += (line + "\n");
                }
            }else{
                respones = "";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        Log.d("qqq", "ResPonse > " + respones);
        return respones;

    }
   /* public String request(String _url, ContentValues _params){
        URL url = null;
        String Url = "http://www.nlotto.co.kr/common.do";
        String paramName = "method";
        String paramValue= "getLottoNumber";
        // HttpURLConnection 참조 변수.
        HttpURLConnection urlConn = null;
        // URL 뒤에 붙여서 보낼 파라미터.
        StringBuffer sbParams = new StringBuffer();


         *//* 1. StringBuffer에 파라미터 연결*//*

        // 보낼 데이터가 없으면 파라미터를 비운다.
        if (_params == null)
            sbParams.append("");
            // 보낼 데이터가 있으면 파라미터를 채운다.
        else {
            // 파라미터가 2개 이상이면 파라미터 연결에 &가 필요하므로 스위칭할 변수 생성.
            boolean isAnd = false;
            // 파라미터 키와 값.
            String key = "method";
            String value = "getLottoNumber";

            for(Map.Entry<String, Object> parameter : _params.valueSet()){
                key = parameter.getKey();
                value = parameter.getValue().toString();

                // 파라미터가 두개 이상일때, 파라미터 사이에 &를 붙인다.
                if (isAnd)
                    sbParams.append("&");

                sbParams.append(key).append("=").append(value);

                // 파라미터가 2개 이상이면 isAnd를 true로 바꾸고 다음 루프부터 &를 붙인다.
                if (!isAnd)
                    if (_params.size() >= 2)
                        isAnd = true;
            }
        }

            *//*2. HttpURLConnection을 통해 web의 데이터를 가져온다.*//*
        try{
            url = new URL(Url + "?" + paramName + "=" + paramValue);
            urlConn = (HttpURLConnection) url.openConnection();

            // [2-1]. urlConn 설정.
            urlConn.setRequestMethod("GET"); // URL 요청에 대한 메소드 설정 : POST.
            urlConn.setRequestProperty("Accept-Charset", "UTF-8"); // Accept-Charset 설정.
            urlConn.setRequestProperty("Context_Type", "http://www.nlotto.co.kr/common.do; cahrset=UTF-8");

            // [2-2]. parameter 전달 및 데이터 읽어오기.
            String strParams = sbParams.toString(); //sbParams에 정리한 파라미터들을 스트링으로 저장. 예)id=id1&pw=123;
            OutputStream os = urlConn.getOutputStream();
            os.write(strParams.getBytes("UTF-8")); // 출력 스트림에 출력.
            os.flush(); // 출력 스트림을 플러시(비운다)하고 버퍼링 된 모든 출력 바이트를 강제 실행.
            os.close(); // 출력 스트림을 닫고 모든 시스템 자원을 해제.

            // [2-3]. 연결 요청 확인.
            // 실패 시 null을 리턴하고 메서드를 종료.
            if (urlConn.getResponseCode() != HttpURLConnection.HTTP_OK)
                return null;

            // [2-4]. 읽어온 결과물 리턴.
            // 요청한 URL의 출력물을 BufferedReader로 받는다.
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream(), "UTF-8"));

            // 출력물의 라인과 그 합에 대한 변수.
            String line;
            String page = "";

            // 라인을 받아와 합친다.
            while ((line = reader.readLine()) != null){
                page += line;
            }

            return page;

        } catch (MalformedURLException e) { // for URL.
            e.printStackTrace();
        } catch (IOException e) { // for openConnection().
            e.printStackTrace();
        } finally {
            if (urlConn != null)
                urlConn.disconnect();
        }

        return null;

    }*/
     String rs;
     JSONParser jsonParser = new JSONParser();
     //rs = JSONParser.iteminfoMap(key, itemsinfo.getString(key));
}

