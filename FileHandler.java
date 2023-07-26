


import java.io.*;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandler implements Writable {
    public void save(String fileName) {
       try {
            // Создание объекта класса FileWriter для записи в файл
            FileWriter fileWriter = new FileWriter(fileName);
            
            // Создание объекта класса BufferedWriter для более эффективной записи в файл
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            
            bufferedWriter.write("Пример сохраняемых данных");
            
            // Закрытие потоков записи файла
            bufferedWriter.close();
            fileWriter.close();
            
            System.out.println("Данные успешно сохранены в файл " + fileName);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }  
   

    public void load(String fileName) {
        // Здесь вставьте код для загрузки данных из файла
        try {
            // Создание объекта класса FileReader для чтения файла
            FileReader fileReader = new FileReader(fileName);
            
            // Создание объекта класса BufferedReader для более эффективного чтения файла
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            
            // Чтение файла построчно
            while ((line = bufferedReader.readLine()) != null) {
                // Обработка прочитанной строки
                System.out.println(line);
            }
            
            // Закрытие потоков чтения файла
            bufferedReader.close();
            fileReader.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
