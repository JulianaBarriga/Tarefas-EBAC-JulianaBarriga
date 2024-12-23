public class SemContrato extends Factory {
    @Override
    Carro retorneCarro(String escolha) {
        if(escolha.equals("1")) {
            return new Fiat_Argo_Car(77,"80", "Cinza");
        } else if (escolha.equals("2")) {
            return new Volkswagem_Polo_Car(116,"85", "Vermelho");
        } else if (escolha.equals("3")) {
            return new Fiat_Mobi_Car(74,"100", "Branco");
        } else if (escolha.equals("4")) {
            return new Hyundai_HB20_Car(80,"100", "Prata");
        }
        return null;
    }
}
