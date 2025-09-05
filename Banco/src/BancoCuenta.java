public class BancoCuenta {
    private double saldo;
    private String nombre;

    public BancoCuenta(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }
    public void depositar(double valor)
    {
        this.saldo += valor;
    }
    public void retirar(double valor){
        if(valor>saldo){
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }
    public double consultar(){
        return this.saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
