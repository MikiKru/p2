package w7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(10_000);
        Thread thIncome = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    try {
                        Thread.currentThread().sleep(1000);
                        int income = new Random().nextInt(100)*10;
                        System.out.println("Income: " + income);
                        account.setSaldo(account.getSaldo() + income);
                        System.out.println("Saldo: " + account.getSaldo());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } } } });
        Thread thOutcome = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 15; i++){
                    try {
                        Thread.currentThread().sleep(1300);
                        int outcome = new Random().nextInt(100)*10;
                        System.out.println("Outcome: " + outcome);
                        if(outcome <= account.getSaldo()) {
                            account.setSaldo(account.getSaldo() - outcome);
                        } else {
                            System.out.println("Not enougth saldo");
                        }
                        System.out.println("Saldo: " + account.getSaldo());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } } } });
        Thread thOutcome2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 15; i++){
                    try {
                        Thread.currentThread().sleep(1300);
                        int outcome = new Random().nextInt(100)*10;
                        System.out.println("Outcome: " + outcome);
                        if(outcome <= account.getSaldo()) {
                            account.setSaldo(account.getSaldo() - outcome);
                        } else {
                            System.out.println("Not enougth saldo");
                        }
                        System.out.println("Saldo: " + account.getSaldo());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } } } });
        // startujemy wątki - równolegle
        thIncome.start();
        thOutcome.start();
        thOutcome2.start();
    }
}
