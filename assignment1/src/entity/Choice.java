package entity;

public class Choice {

    private char option;

    private String option_value;

    public Choice(){

    }

    public Choice(char option, String option_value) {
        this.option = option;
        this.option_value = option_value;
    }

    public char getOption() {
        return option;
    }

    public void setOption(char option) {
        this.option = option;
    }

    public String getOption_value() {
        return option_value;
    }

    public void setOption_value(String option_value) {
        this.option_value = option_value;
    }
}
