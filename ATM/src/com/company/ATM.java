package com.company;

import java.util.Scanner;

public class ATM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        bank.accountList.add(bank.user1);
        int tries = 3;
        while (true){
        System.out.print("Введите PIN:");
        if(bank.checkPIN()){
            System.out.println("Что вы хотите сделать?");
            System.out.println("01.Проверить Баланс");
            System.out.println("02.Изменить PIN");
            System.out.println("03.Снять");
            System.out.println("04.Положиьт на счёт");

            int n = sc.nextInt();
            if(n == 01){
                bank.checkBalance();
            }
            if(n == 02){
                bank.changePIN();
            }
            if(n == 03){
                bank.topUp();
            }
            if(n == 04){
                bank.withDraw();
            }
        }
        else {
            System.out.println("Не правильный PIN!");
            tries--;
            if(tries == 0)
                System.exit(0);
            }
        }
    }
}
