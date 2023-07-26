

public class Serialization {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();

        // Сохранение данных в файл
        fileHandler.save("data.txt");

        // Загрузка данных из файла
        fileHandler.load("data.txt");
    }
}   