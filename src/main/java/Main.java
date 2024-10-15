public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        Retangulo retangulo = new Retangulo(5, 10);
        Triangulo triangulo = new Triangulo(4, 7);
        Trapezio trapezio = new Trapezio(6, 4, 5);

        VisitorIF desenhar = new VisitorDesenhar();
        VisitorIF calcularArea = new VisitorCalcularArea();
        VisitorIF calcularPerimetro = new VisitorCalcularPerimetro();
        VisitorIF maximizar = new VisitorMaximizar();

        ElementoConcretoIF[] figuras = { circulo, retangulo, triangulo, trapezio };

        for (ElementoConcretoIF figura : figuras) {
            figura.aceitaVisita(desenhar);
            figura.aceitaVisita(calcularArea);
            figura.aceitaVisita(calcularPerimetro);
            figura.aceitaVisita(maximizar);
        }
    }
}
