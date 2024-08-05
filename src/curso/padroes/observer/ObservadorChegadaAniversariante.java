package curso.padroes.observer;

@FunctionalInterface // Usado quando tem apenas um unico método
public interface ObservadorChegadaAniversariante {

    public void chegou(EventoChegadaAniversariante evento);
}
