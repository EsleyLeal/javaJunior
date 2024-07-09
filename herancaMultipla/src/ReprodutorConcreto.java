public class ReprodutorConcreto extends Dispositivo implements Reprodutor {

    public ReprodutorConcreto(String numeroDeSerie) {
        super(numeroDeSerie);
    }
    

    @Override
    public void processarAudio(String audio) {
        System.out.println("Reproduzindo: " + audio);
    }


    @Override
    public void reproduzir(String audio) {
        System.out.println("Reproduzindo: " + audio);
    }

    

    

}
