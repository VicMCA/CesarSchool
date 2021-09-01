public class ConversorTemperatura {
    public static void main(String[] args) {
        
        float celsius = 30.0f;

        float fahrenheit = (celsius * 1.8f) + 32f;
        float kelvin = celsius + 273.15f;
        float reaumur = celsius * 0.8f;
        float rankine = (celsius * 1*8f) + 32f + 459.67f;

        System.out.println(celsius + "º celsius são iguais a:");
        System.out.println(fahrenheit+ "º Fahrenheit");
        System.out.println(kelvin + "º Kelvin");
        System.out.println(reaumur+ "º Réaumur");
        System.out.println(rankine + "º Rankine");
    }
}