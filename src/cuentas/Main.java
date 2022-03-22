package cuentas;
/**
 * 
 * @author vbinimelis
 * Main del projecte
 */

public class Main {

    public static void main(String[] args) {
        /**
         * Instanciam la classe CCuenta
         */
        CCuenta cuenta1;
        /**
         * Declaram la variable saldoActual
         */
        double saldoActual;

        /**
         * Afegim els atributs a la cuenta1
         * Cridam al mètode saldoActual, i l'imprimim el saldo actual
         * @see saldoActual
         */
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        
        /**
         * Cridam al mètode operativa_cuenta
         * Cridam al mètode saldoActual, i l'imprimim el saldo actual
         * @see operativa_cuenta
         * @see saldoActual
         */
        cuenta1.operativa_cuenta(100, 200, cuenta1, 2.5f);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        
    }
}
