public class Main {

    public static void main(String[] args) {
        Pato pato1 = new Pato(10);
        Aviao aviao1 = new Aviao(10);
        SuperHomem superHomem1 = new SuperHomem(10);

        TorreDeControle torreDeControle1 = new TorreDeControle();

        torreDeControle1.adicionarVoador(pato1);
        torreDeControle1.adicionarVoador(aviao1);
        torreDeControle1.adicionarVoador(superHomem1);

        torreDeControle1.voemTodos();

    }
}
