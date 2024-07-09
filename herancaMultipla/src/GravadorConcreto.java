public class GravadorConcreto extends Dispositivo implements Gravador{

    public GravadorConcreto(String numeroDeSerie) {
        super(numeroDeSerie);
    }

    @Override
    public String gravar() {
        return "Áudio gravado";
    }

    @Override
    public void processarAudio(String audio) {
        System.out.println("Gravador processando: " + audio);
    }

    

}
