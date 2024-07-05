public class Violao implements Instrumento {

    @Override
    public String nome() {
      return "Violao";
    }

    @Override
    public void fazerSom() {
      System.out.println("O som desse " + nome() + " é plin-plin");
    }

   

}
