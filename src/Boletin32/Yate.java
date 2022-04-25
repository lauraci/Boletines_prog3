package Boletin32;

public class Yate extends Barco{

    float potencia;
    int camarote;

    public Yate(float potencia, int camarote) {
        this.potencia = potencia;
        this.camarote = camarote;
    }

    public Yate(String matricula, float eslora, float potencia, int camarote) {
        super(matricula, eslora);
        this.potencia = potencia;
        this.camarote = camarote;
    }


    @Override
    public float calcularPrecio(int dias) {
        return (((2*this.potencia)+(10*this.eslora)+(25*camarote))*dias);
    }
}
