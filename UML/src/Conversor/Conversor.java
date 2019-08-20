public class Conversor {
    public static void main (String[] a){
        Fahrenheint fahrenheint = new Fahrenheint();
        fahrenheint.setTemperatura(100);
        System.out.println(String.valueOf("Em Celsius fica: " + fahrenheint.toCelsius()));
    }
}
class Fahrenheint{
    private float temperatura;

    double toCelsius(){
        double fahrenheint = (1.8 / (temperatura - 32.0));
        return fahrenheint;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
}