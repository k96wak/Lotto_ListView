package com.example.yunda.lotto_listview;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by yun.da on 2017-09-11.
 */

public class Items implements Serializable{

    public String bnusNo;
    public String firstAccumamnt;
    public String returnValue;
    public String firstWinamnt;
    public String totSellamnt;
    public String drwtNo3;
    public String drwtNo2;
    public String drwtNo1;
    public String drwtNo6;
    public String drwtNo5;
    public String drwtNo4;
    public String drwNoDate;
    public String drwNo;
    public String firstPrzwnerCo;
    public String getBnusNo() {return bnusNo;}
    public void setBnusNo(String bnusNo) {
        this.bnusNo = bnusNo;
    }
    public String getFirstAccumamnt() {
        return firstAccumamnt;
    }
    public void setFirstAccumamnt(String firstAccumamnt) {
        this.firstAccumamnt = firstAccumamnt;
    }
    public String getReturnValue() {
        return returnValue;
    }
    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue;
    }
    public String getFirstWinamnt() {
        return firstWinamnt;
    }
    public void setFirstWinamnt(String firstWinamnt) {
        this.firstWinamnt = firstWinamnt;
    }
    public String getTotSellamnt() {
        return totSellamnt;
    }
    public void setTotSellamnt(String totSellamnt) {
        this.totSellamnt = totSellamnt;
    }
    public String getDrwtNo3() {
        return drwtNo3;
    }
    public void setDrwtNo3(String drwtNo3) {
        this.drwtNo3 = drwtNo3;
    }
    public String getDrwtNo2() {
        return drwtNo2;
    }
    public void setDrwtNo2(String drwtNo2) {
        this.drwtNo2 = drwtNo2;
    }
    public String getDrwtNo1() {
        return drwtNo1;
    }
    public void setDrwtNo1(String drwtNo1) {
        this.drwtNo1 = drwtNo1;
    }
    public String getDrwtNo6() {
        return drwtNo6;
    }
    public void setDrwtNo6(String drwtNo6) {
        this.drwtNo6 = drwtNo6;
    }
    public String getDrwtNo5() {
        return drwtNo5;
    }
    public void setDrwtNo5(String drwtNo5) {
        this.drwtNo5 = drwtNo5;
    }
    public String getDrwtNo4() {
        return drwtNo4;
    }
    public void setDrwtNo4(String drwtNo4) {
        this.drwtNo4 = drwtNo4;
    }
    public String getDrwNoDate() {
        return drwNoDate;
    }
    public void setDrwNoDate(String drwNoDate) {
        this.drwNoDate = drwNoDate;
    }
    public String getDrwNo() {
        return drwNo;
    }
    public void setDrwNo(String drwNo) {
        this.drwNo = drwNo;
    }
    public String getFirstPrzwnerCo() {
        return firstPrzwnerCo;
    }
    public void setFirstPrzwnerCo(String firstPrzwnerCo) {
        this.firstPrzwnerCo = firstPrzwnerCo;
    }

    @Override
    public String toString() {
        return "bnusNo=" + bnusNo + "\n" + "firstAccumamnt=" + firstAccumamnt + "\n"+"returnValue=" + returnValue
                + "\n"+"firstWinamnt=" + firstWinamnt + "\n"+"totSellamnt=" + totSellamnt + "\n"+"drwtNo3=" + drwtNo3
                + "\n"+"drwtNo2=" + drwtNo2 + "\n"+"drwtNo1=" + drwtNo1 + "\n"+"drwtNo6=" + drwtNo6 + "\n"+"drwtNo5=" + drwtNo5
                + "\n"+"drwtNo4=" + drwtNo4 + "\n"+"drwNoDate=" + drwNoDate + "\n"+"drwNo=" + drwNo + "\n"+"firstPrzwnerCo="
                + firstPrzwnerCo ;
    }


}
