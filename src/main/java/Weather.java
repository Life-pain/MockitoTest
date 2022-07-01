enum Weather {
    RAINY("Дождливо"),
    STORMY("Сильный ветер"),
    SUNNY("Солнечно"),
    CLOUDY("Облачно");

    private final String weather;

    Weather (String weather) {
        this.weather = weather;
    }
}