package ex.ex04;

public class Number {


    private int value;
    private double valueDecimal;

    public Number() {
        this.value= 0;

    }

    public Number(double valueDecimal) {
        this.valueDecimal = valueDecimal;
    }

    public double getValueDecimal() {
        return valueDecimal;
    }

    public void setValueDecimal(double valueDecimal) {
        this.valueDecimal = valueDecimal;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
