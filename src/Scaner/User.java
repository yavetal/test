package Scaner;

public class User {
    public String name;
    String twoname;
    String soname;
    String born;
    String id;
    String born1;

    public User(String str) {
        String[] string = str.split(" ");
        this.soname = string[0];
        this.name = string[1];
        this.twoname = string[2];
        this.born = string[3];
        this.id = string[4];
        String[] data = born.split("\\.");
        String day = data[0];
        String month = data[1];
        String year = data[2];
        if (Integer.parseInt(day) < 10) data[0] = " " + day;
        if (Integer.parseInt(month) < 10) data[1] = " " + month;
        this.born1 = data[2] + data[1] + data[0];

    }
}