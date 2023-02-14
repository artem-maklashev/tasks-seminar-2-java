// Напишите метод, который составит строку, состоящую из 100 
// повторений слова TEST и метод, который запишет эту строку в 
// простой текстовый файл, обработайте исключения
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class task4 {
    public static void main(String[] args) {
        String str = "Тест";
        
        str = str.repeat(100);
        try (FileWriter fw = new FileWriter("file.txt", StandardCharsets.UTF_8, false)) {
            fw.write(str);
            whenWrite("text2.txt");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
    public static void whenWrite(String fileName) throws IOException {
        String str = "Привет";
    
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, StandardCharsets.UTF_8));
    writer.write(str);
    
    writer.close();
} 
}
