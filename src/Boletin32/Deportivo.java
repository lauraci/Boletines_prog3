package Boletin32;

public class Deportivo extends Barco {

    float potencia;

    public Deportivo(float potencia) {
        this.potencia = potencia;
    }

    public Deportivo(String matricula, float eslora, float potencia) {
        super(matricula, eslora);
        this.potencia = potencia;
    }


    @Override
    public float calcularPrecio(int dias) {
        return ((2*this.potencia +(10*this.eslora))*dias);
    }
}
