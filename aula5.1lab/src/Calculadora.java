public class Calculadora {

    private static float pi = 3.141592f;

    public static double cincunferencia(double raio){
        return (2*pi*raio);
    }

    public static double volumeEsfera(double raio){
        return (Math.pow(raio,2)*pi*4)/3;
    }

    public static double volumeCilindro(double raio, double altura){
        return pi*Math.pow(raio,2)*altura;
    }

}
