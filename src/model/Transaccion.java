package model;

import java.sql.SQLOutput;

public class Transaccion{
    private CuentaBancaria cuentaBancariaOrigen;
    private CuentaBancaria cuentaBancariaDestino;
    private double saldoTransaccion;

    public Transaccion(CuentaBancaria cuentaBancariaOrigen, CuentaBancaria cuentaBancariaDestino, double saldoTransaccion) {
        this.cuentaBancariaOrigen = cuentaBancariaOrigen;
        this.cuentaBancariaDestino = cuentaBancariaDestino;
        this.saldoTransaccion = saldoTransaccion;
    }


    public void ejecutarTransaccion(){
     if( cuentaBancariaOrigen.getSaldo()>= saldoTransaccion ){
         System.out.println("Saldo actual de la cuenta origen" + cuentaBancariaOrigen.getSaldo());
         cuentaBancariaOrigen.retirar(saldoTransaccion);
         cuentaBancariaOrigen.depositar(saldoTransaccion);


         System.out.println("Transacción exitosa");
     }
     else{
         System.out.println("No hay fondo para hacer la transacción");
     }


    }



}

