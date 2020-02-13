public class Pato implements Voador {
    private int energia;

    public Pato(int energia) {
        this.energia = energia;
    }

    @Override
    public void voar() {
        if(energia >= 5) {
            System.out.println("Energia inicial: " + this.energia);
            this.energia -= 5;
            System.out.println("Estou voando como um pato.");
            System.out.println("Energia final: " + this.energia);
        } else {
            System.out.println("O pato está sem energia para voar.");
        }
        System.out.println("--------------");
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

}
