public class Conversor {
    public static void main (){
        Fahrenheint fahrenheint = new Fahrenheint();
        fahrenheint.setTemperatura(10);
        System.out.println(String.valueOf(fahrenheint.toCelsius()));
    }
}
class Fahrenheint{
    private float temperatura;

    float toCelsius(){
        float fahrenheint = (temperatura - 32) * (5/9);
        return fahrenheint;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
}