public class BancoCuenta {
    private double saldo;
    private String nombre;

    public BancoCuenta(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void retirar(double valor){
        this.saldo -= valor;
    }
    public double consultar(){
        return this.saldo;
    }
}
