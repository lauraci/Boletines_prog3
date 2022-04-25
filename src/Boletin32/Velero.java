package Boletin32;

public class Velero  extends Barco{
    int nmastiles=0;

    public Velero(int nmastiles) {
        this.nmastiles = nmastiles;
    }

    public Velero(String matricula, float eslora, int nmastiles) {
        super(matricula, eslora);
        this.nmastiles = nmastiles;
    }

    @Override
    public float calcularPrecio(int dias) {
        return (((8*this.nmastiles)+(10*eslora))*dias);
    }
}
