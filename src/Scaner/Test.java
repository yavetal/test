package Scaner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test {





    public static void main(String[] args) throws IOException {


        File people = new File("C:\\book\\PEOPLETEST.txt");
        Scanner scanner = new Scanner(people);
        ArrayList<String> peoplenotification = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            peoplenotification.add(scanner.nextLine());
        }
        User[] users = new User[peoplenotification.size()];
        scanner.close();


        for (int i = 0; i < peoplenotification.size(); i++) {
            users[i] = new User(peoplenotification.get(i));
        }


        File fname = new File("C:\\book\\RESname.txt");
        fname.createNewFile();
        FileWriter writername = new FileWriter("C:\\book\\RESname.txt");

        File fid = new File("C:\\book\\RESid.txt");
        fid.createNewFile();
        FileWriter writerid = new FileWriter("C:\\book\\RESid.txt");

        File fborn = new File("C:\\book\\RESborn.txt");
        fborn.createNewFile();
        FileWriter writerborn = new FileWriter("C:\\book\\RESborn.txt");

        sortName(users);
        for (int i = 0; i < users.length; i++) {
            String str = users[i].name + " " + users[i].twoname + " "
                    + users[i].soname + " " + users[i].born + " "
                    + users[i].id;
            writername.write(str);
            writername.write("\n");
            writername.flush();
        }

        sortId(users);
        for (int i = 0; i < users.length; i++) {
            String str = users[i].name + " " + users[i].twoname + " "
                    + users[i].soname + " " + users[i].born + " "
                    + users[i].id;
            writerid.write(str);
            writerid.write("\n");
            writerid.flush();
        }

        sortBorn(users);
        for(int i =0; i < users.length; i++){
            String str = users[i].name + " " + users[i].twoname + " "
                    + users[i].soname + " " + users[i].born + " "
                    + users[i].id;
            writerborn.write(str);
            writerborn.write("\n");
            writerborn.flush();
        }

        writername.close();
        writerid.close();
        writerborn.close();

    }
    public static User[] sortName(User[] users) {
        User temp;
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length - 1 - i; j++) {
                if ((users[j].name.compareTo(users[j + 1].name)) > 0) {
                    temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }

            }

        }
        return users;
    }
    public static User[] sortId(User[] users) {
        User temp;
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length - 1 - i; j++) {
                if (Integer.parseInt(users[j].id) > Integer.parseInt(users[j+1].id)) {
                    temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }

            }

        }
        return users;
    }

    public static User[] sortBorn(User[] users) {
        User temp;
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length - 1 - i; j++) {
                if ((users[j].born1.compareTo(users[j + 1].born1)) > 0) {
                    temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }

            }
        }
        return users;
    }
}
