package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        
        cuenta1.operativa_cuenta(100, 200, cuenta1, 2.5f);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        
    }
}
