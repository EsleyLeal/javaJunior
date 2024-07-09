public class DispositivoCombinado extends Dispositivo implements Reprodutor, Gravador {

    public DispositivoCombinado(String numeroDeSerie) {
        super(numeroDeSerie);
    }

    @Override
    public String gravar() {
        return "Resultado da gravação do Dispositivo Combinado";
    }

    @Override
    public void processarAudio(String audio) {
        System.out.println("Dispositivo Combinado processando: " + audio);
    }

    @Override
    public void reproduzir(String audio) {
        System.out.println("Dispositivo Combinado reproduzindo: " + audio);
    }

    

   

    

}   
