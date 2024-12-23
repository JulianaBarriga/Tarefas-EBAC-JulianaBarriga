public class ComContrato extends Factory {
    @Override
    Carro retorneCarro(String escolha) {
        if(escolha.equals("1")) {
            return new Land_RangeRoverEvoque_Car(249,"100", "Azul");
        } else if (escolha.equals("2")) {
            return new Chrysler_DodgeChargerRT90_Car(208,"70", "Preto");
        } else if (escolha.equals("3")) {
            return new RollsRoyce_Phantom_Car(460,"90", "Amarelo");
        } else if (escolha.equals("4")) {
            return new Volvo_C40_Car(238,"100", "Branco");
        }
        return null;
    }
}
