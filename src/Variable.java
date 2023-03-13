public class Variable {
    public static void main(String[] args) {
        int pizzas = 6;
        int personas = 2;
        int pizzasTotal = pizzas / personas;

        System.out.printf("Si hay %d personas, y hay %d pizzas, a cada uno le tocas %d pizzas \n", personas, pizzas
        , pizzasTotal);

        String Carro = "Ferrari";
        double Velocidad = 120.12;

        System.out.printf("Un carro %s va a exceso de velocidad a %f km/h \n", Carro, Velocidad);

        int PrecioJamon = 10;
        double PrecioHuevo = 5.20;
        int PrecioPan = 20;

        double PrecioTotal = PrecioHuevo + PrecioJamon + PrecioPan;

        System.out.printf("El precio total de la compra es = %f \n", PrecioTotal );

    }
}
