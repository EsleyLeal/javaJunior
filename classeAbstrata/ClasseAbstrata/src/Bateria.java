public class Bateria extends Instrumento{

    public Bateria(String instrumento) {
        super(instrumento);
    }

    @Override
    public void somDoInstrumento() {
        // TODO Auto-generated method stub
        System.out.println("Essa " + instrumento + " faz esse som - pa pum, do do bu");
    }


    
}
