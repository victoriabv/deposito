package cuentas;

/**
 * @author vbinimelis
 * @version 1.0
 * Classe CCUenta
 */
public class CCuenta {

    /**
     * Atributs classe CCuenta
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sense atributs
     */
    public CCuenta() {
    }

    /**
     * Constructor per defecte
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Mètode estado
     * Retorna el saldo del compte
     * @return getSaldo
     * @see getSaldo
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Mètode ingresar
     * Ingresa una quantitat en el compte
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Mètode retirar
     * Retira una quantiat del compte
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Retira una quantitat, ingresa una quantiat, d'un compte passar per paràmetre
     * @param cant_retirar
     * @param cant_ingresar
     * @param cuenta1
     * @param cantidad
     * @see retirar
     * @see ingresar
     */
    public void operativa_cuenta(double cant_retirar, double cant_ingresar, CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(cant_retirar);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cant_ingresar);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
