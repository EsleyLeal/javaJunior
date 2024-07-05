public class Bateria implements Instrumento{

    @Override
    public String nome() {
        return "Bateria";
    }

    @Override
    public void fazerSom() {
        System.out.println("O som dessa " + nome() + " é do-do-pa");
    }

    

}
