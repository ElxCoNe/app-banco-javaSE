package model;

public class CuentaBancaria{
    private int numCuenta;
    private double saldo;
    private Cliente cliente;

    public CuentaBancaria(CuentaBancaria cuentaBancaria, int numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar (double monto){
        this.saldo+=monto;
    }

    public void retirar (double monto){
        if(this.saldo >= monto){
            this.saldo-=monto;
            System.out.println("Transacción exitosa");
        }
        else {
            System.out.println("No hay fondos suficientes");
        }
    }

}

