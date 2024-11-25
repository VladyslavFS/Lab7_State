public class LightingControl {
    public static void main(String[] args) {
        LightingContext lightingContext = new LightingContext();

        // Користувач натискає кнопку кілька разів
        lightingContext.pressButton(); // Вмикаємо світло
        lightingContext.pressButton(); // Вмикаємо нічний режим
        lightingContext.pressButton(); // Вимикаємо світло
    }
}
