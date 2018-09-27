package com.company.calc2;

public class Operacionist {

    private double x;
    private double y;
    private Results res;

    //Alt + insert - сгенерировать getter и setter

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //конструктор
    public Operacionist(double x, double y) {
        this();
        this.x = x;
        this.y = y;
    }

    //    конструктор для явной инициализации переменных
    public Operacionist() {
        this.x = 0;
        this.y = 0;
        this.res = new Results();
    }


    //операции
    //сумма
    public Results getSum() {
//        вариант-1
//        return  x + y;
//        вариант-2
        doCalc(x + y, true, "SUM");
        return res;
    }

    private void doCalc(double v, boolean b, String sum) {
        this.res.setRes(v);
        res.setFlag(b);
        res.setOpType(sum);
    }

    public Results getDiv() {
        if(y == 0) {
            doCalc(-1, false, "DIV");
        } else {
            doCalc(x / y, true, "DIV");
        }
        return res;
    }

    public Results getRes(){
        return  res;
    }

// ctrl + alt + l выравнивает код
// alt + enter
}
