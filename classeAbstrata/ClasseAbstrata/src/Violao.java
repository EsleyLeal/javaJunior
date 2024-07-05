public class Violao extends Instrumento{

    public Violao(String instrumento) {
        super(instrumento);
    }

    @Override
    public void somDoInstrumento() {
       System.out.println("Esse " + instrumento + " faz esse som - Diling dom");
    }



}
