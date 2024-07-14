package org.example.buildergame;

public class Reshape {
    public  String rechapeString(int n, String str) {

        str= str.replace(" ","");
        StringBuilder sb = new StringBuilder(str);
        int insertPostion= n ;
        while (insertPostion<str.length()) {
            sb.insert(insertPostion, " ");
            insertPostion += n+1;
        }
        return sb.toString();
    }
}
