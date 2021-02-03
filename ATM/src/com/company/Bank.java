package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank implements BankService{
    ArrayList<Account> accountList = new ArrayList<Account>();
    Account user1 = new Account("Джордж","Оруэлл",777,7472485,1234,11/23,70000);
    Scanner sc = new Scanner(System.in);

    @Override
    public boolean checkPIN() {
        int PIN = sc.nextInt();
        if(user1.getPIN() == PIN) return true;
        else return false;
    }

    @Override
    public void changePIN() {
        System.out.println("Ваш PIN:");
        int newPIN = sc.nextInt();
        System.out.println("Подтвердите ваш PIN:");
        int newPIN2 = sc.nextInt();
        if(newPIN == newPIN2){
            user1.setPIN(newPIN);
            System.out.println("PIN был изменен успешно!");
        }
        else System.out.println("Не правильный PIN!");

    }

    @Override
    public void checkBalance() {
        System.out.println("Баланс: " + user1.getMoney() +"$");;
    }

    @Override
    public void withDraw() {
        System.out.println("Сколько хотите снять?");
        int withdraw = sc.nextInt();
        int possible = user1.getMoney() - withdraw;
        if(possible >= 0){
            user1.setMoney(possible);
            System.out.println("Баланс: " + user1.getMoney() +"$");
        }
        else System.out.println("Не достаточно средств!");
    }

    @Override
    public void topUp() {
        System.out.println("Сколько хотите полполнить?");
        int topup = sc.nextInt();
        int sum = user1.getMoney() + topup;
        user1.setMoney(sum);
        System.out.println("Баланс: " + user1.getMoney() +"$");

    }
}
