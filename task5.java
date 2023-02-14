import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

// Напишите метод, который вернет содержимое текущей папки в виде 
// массива строк. 
// Напишите метод, который запишет массив, возвращенный предыдущим 
// методом в файл. 
// Обработайте ошибки с помощью try-catch конструкции. В случае 
// возникновения исключения, оно должно записаться в лог-файл

public class task5 {
    public static void main(String[] args) throws IOException{
            
        try  {
            List<String> list = folderContains(System.getProperty("user.dir"));
            saveFile("text3.txt", list);
        } catch (IOException ex) {
            Logger logger = Logger.getLogger(task5.class.getName());
            logger.setLevel(Level.INFO);          
            ConsoleHandler ch = new ConsoleHandler();
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            ch.setFormatter(sFormat);
            logger.log(Level.WARNING, "Тестовое логирование", StandardCharsets.UTF_8);
            logger.info("Тестовое логирование");
            System.out.println(ex.getMessage());
            
        }
    }

    static List<String> folderContains(String pathName) {
        final File folder = new File(pathName);
        List<String> list = new ArrayList<String>();

        for (final File file : folder.listFiles()) {
            list.add(file.getName());
        }
        return list;
    }

    static void saveFile(String fileName, List<String> list) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, StandardCharsets.UTF_8));

        for (String string : list) {
            writer.write(string + "\n");
        }
        writer.close();
    }
    
   
}

// public void listFilesForFolder(final File folder) {
//     for (final File fileEntry : folder.listFiles()) {
//         if (fileEntry.isDirectory()) {
//             listFilesForFolder(fileEntry);
//         } else {
//             System.out.println(fileEntry.getName());
//         }
//     }
// }