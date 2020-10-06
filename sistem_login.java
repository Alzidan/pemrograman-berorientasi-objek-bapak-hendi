package com.PBOALZIDAN;

import java.util.Scanner;

public class sistem_login {

    public static void main(String[] args) {
        String id;
        String pass;
        int i = 1;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("login system");
        System.out.println("silahkan masukkan :");

        while (i < 4) {

            //input id username
            System.out.print("username: ");
            id = inputUser.next();

            //input password
            System.out.print("password: ");
            pass = inputUser.next();

            // compare string id dan pass

            if (id.equals("zidan") && pass.equals("amiraz")) {
                System.out.println("selamat datang");
                return;
            } else {
                System.out.println("username atau password salah, silahkan coba sampai 3x +" + i);
            }
            i++;

        }
        System.out.println("percobaan sudah mencapai batas maksimal yaitu 3x");

    }

    }
