package cuentas;

/**
 * La clase {@code CCuenta}  gestiona una cuenta bancaria,
 * realizar consultas del saldo, ingresos y retiro de dinero.
 */

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor por defecto {@code CCuenta}.
     */

    public CCuenta()
    {
    }

    /**
     * Constructor {@code CCuenta} inicializa los siguientes datos..
     *
     * @param nombre Nombre.
     * @param cuenta Número de la cuenta.
     * @param saldo Saldo inicial.
     * @param tipoInteres Tipo de interés.
     */

    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres)
    {
        this.nombre =nombre;
        this.cuenta=cuenta;
        this.saldo=saldo;
        this.tipoInteres = tipoInteres;
    }

    /**
     * Recibe el nombre.
     *
     * @return El nombre.
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Fijar el nombre.
     *
     * @param nombre El nombre.
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Recibe el número de cuenta.
     *
     * @return El número de cuenta.
     */

    public String getCuenta() {
        return cuenta;
    }

    /**
     * Fijar el número de cuenta.
     *
     * @param cuenta El nuevo número de cuenta.
     */

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Recibe el saldo actual.
     *
     * @return El saldo actual.
     */

    public double getSaldo() {
        return saldo;
    }

    /**
     * Fijar el saldo de la cuenta.
     *
     * @param saldo El nuevo saldo de la cuenta.
     */

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Recibe el tipo de interés.
     *
     * @return El tipo de interés.
     */

    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Fijar el tipo de interés.
     *
     * @param tipoInteres El nuevo tipo de interés.
     */

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Consulta el saldo actual.
     *
     * @return El saldo actual.
     */

    public double estado()
    {
        return saldo;
    }
    /**
     * Ingresa una cantidad a la cuenta.
     *
     * @param cantidad La cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de dinero.
     *
     * @param cantidad La cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
