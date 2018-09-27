package com.company.calc2;

public class Results {

    private double res;
    private boolean flag;
    private String opType = ""; //тип операции

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }
}
