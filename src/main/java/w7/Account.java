package w7;

public class Account {
    private int saldo;
    public Account(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }
    // WĄTKI NIE WYKONUJĄCE AKTUALNIE METODY W STATUSIE BLOCKED!
    public synchronized void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
