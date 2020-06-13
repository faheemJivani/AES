package com.FaheemJivani;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int key = 10;

        System.out.print("Enter message: ");
        String text = scanner.nextLine();

        System.out.print("Enter key: ");
        String xorKey = scanner.nextLine();

        System.out.println(text);

        char[] chars = text.toCharArray();
        System.out.println("Encrypting...");

        for (int i = 0; i < chars.length; i++)
        {
            chars[i] += key;
            System.out.print(chars[i]);
        }
        char firstChar = chars[0];
        for (int i = 0; i < chars.length; i++)
        {
            if(i == chars.length - 1)
            {
                chars[i] = firstChar;
            }else{
                chars[i] = chars[i + 1];
                System.out.print(chars[i]);
            }
        }

        System.out.println("");
        System.out.println("Decrypting...");

        for (int i = chars.length - 1; i >= 0; i--)
        {
            if(i == 0)
            {
                chars[i] = firstChar;
            }else{
                chars[i] = chars[i - 1];
                System.out.print(chars[i]);
            }
        }
        System.out.println("");
        for (int i = 0; i < chars.length; i++)
        {
            chars[i] -= key;
            System.out.print(chars[i]);
        }
    }
}