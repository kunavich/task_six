/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task6.logic;


import java.util.regex.Pattern;

/**
 *
 * @author Lord
 */
public class StringProcessor {

    public String processWithString(String str)
    {
        StringBuilder stringBuilder= new StringBuilder();
        int k=0;
        for (int i=0; i<str.length();i++) {
            char c =str.charAt(i);
            if((c >= 'A' && c <= 'Z')||
                    (c >= 'a' && c <= 'z') ||
                    (c == ' ')) {
                if(k!=0 && c!= ' ' &&
                        stringBuilder.charAt(stringBuilder.length()-1) != ' ')
                {
                    stringBuilder.append(' ');
                }
                stringBuilder.append(str.charAt(i));
                k=0;
            }
            else {
                k++;
            }

        }
        return stringBuilder.toString();
    }
    public String processWithRgx(String str)
    {
        StringBuilder stringBuilder= new StringBuilder();
        String[] strings =str.split("[^a-zA-Z\\s]+");
        for (String string:strings
             ) {
            stringBuilder.append(string);
            stringBuilder.append(" ");

        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }



}
