public class PlataCash implements IPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Platesti " + suma + " cash la livrare");
    }
}
