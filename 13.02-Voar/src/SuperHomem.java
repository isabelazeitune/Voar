public class SuperHomem implements Voador {
    private int experiencia;

    public SuperHomem(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void voar() {
        System.out.println("Experiência inicial: " + this.experiencia);
        this.experiencia += 3;
        System.out.println("Estou voando como um campeão.");
        System.out.println("Experiência final: " + this.experiencia);
        System.out.println("--------------");
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

}
