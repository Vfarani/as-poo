public class Quadrilatero {
    private double altura;
    private double largura;
    private double lado;
    private double baseMenor;
    private double baseMaior;
}

//area do retangulo
double calcularArea(double baseMaior, double baseMenor) {
    return baseMaior * baseMenor;
}

//area do quadrado
double calcularArea(double lado) {
    return lado * lado;
}

// area do trapezio
double calcularArea(double baseMaior, double baseMenor, double altura) {
    return ((baseMaior + baseMenor) * altura) / 2;
}

