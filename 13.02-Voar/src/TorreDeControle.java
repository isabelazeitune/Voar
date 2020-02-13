import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {
    List<Voador> listaDeVoadores = new ArrayList();

    public TorreDeControle() {

    }

    public void voemTodos() {
        for(int i = 0; i < listaDeVoadores.size(); i++) {
            listaDeVoadores.get(i).voar();
        }
    }

    public void adicionarVoador(Voador umVoador) {
        listaDeVoadores.add(umVoador);
    }

    public List<Voador> getListaDeVoadores() {
        return listaDeVoadores;
    }

    public void setListaDeVoadores(List<Voador> listaDeVoadores) {
        this.listaDeVoadores = listaDeVoadores;
    }
}
