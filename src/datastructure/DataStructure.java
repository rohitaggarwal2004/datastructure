/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.ArrayList;

/**
 *
 * @author roaggarw
 */
public class DataStructure {

    public static boolean isPalindrome(String a) {

        int l = 0;
        int r = a.length() - 1;
        while (l < r) {
            char lc = Character.toLowerCase(a.charAt(l));
            char rc = Character.toLowerCase(a.charAt(r));
            if (Character.isLetterOrDigit(lc)) {
                if (Character.isLetterOrDigit(rc)) {
                    {
                        if (lc != rc) {
                            return false;
                        } else {
                            l++;
                            r--;
                        }
                    }
                } else {
                    r--;
                }

            } else {
                l++;
            }

        }

        return true;
    }

    public String longestCommonPrefix(ArrayList<String> A) {
        int min = 999999999;
        for (int i = 0; i < A.size(); i++) {
            min = Math.min(min, A.size());
        }

        for (int i = 0; i < min; i++) {
            for (int k = 0; k < A.size(); k++) {
                
            }

        }
        return "";

    }

    public static String reverseString(String a) {
        char[] cs = a.toCharArray();
        System.out.println("" + new String(cs));
        int l = 0;
        int r = cs.length - 1;
        while (l < r) {
            char temp = cs[l];
            cs[l] = cs[r];
            cs[r] = temp;
            l++;
            r--;
        }

        return new String(cs);
    }

    public static String reverseString1(String a) {

        String str[] = a.split(" ");
        int l = 0;
        int r = str.length - 1;
        while (l < r) {
            String temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++;
            r--;
        }
        StringBuilder strinBuilder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (i == str.length - 1) {
                strinBuilder.append(str[i]);
            } else {
                strinBuilder.append(str[i] + " ");
            }
        }
        return strinBuilder.toString();
    }

    public static void main(String[] args) {
        //System.out.print(" --- " + isPalindrome("A man,a a plan, a canal: Panama"));
        System.out.print("&&&&&&&&&&&&&& > " + reverseString1("rohit is bad"));
    }

}
