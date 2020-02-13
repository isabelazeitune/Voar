public class Aviao implements Voador {
    private int horasDeVoo;

    public Aviao(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    @Override
    public void voar() {
        System.out.println("Horas de voo inicial: " + this.horasDeVoo);
        this.horasDeVoo += 13;
        System.out.println("Estou voando como um avião.");
        System.out.println("Horas de voo final: " + this.horasDeVoo);
        System.out.println("--------------");
    }

    public int getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

}
