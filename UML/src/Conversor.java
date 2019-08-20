public class Conversor {
    public static void main (String[] a){
        Fahrenheint fahrenheint = new Fahrenheint();
        fahrenheint.setTemperatura(100);
        System.out.println(String.valueOf("Em celsios fica: " + fahrenheint.toCelsius()));
    }
}
class Fahrenheint{
    private float temperatura;

    float toCelsius(){
        float fahrenheint = (5/9) * (temperatura - 32);
        return fahrenheint;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
}