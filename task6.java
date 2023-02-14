import java.io.File;

/**
 * Напишите метод, который определит тип (расширение) файлов из 
текущей папки и выведет в консоль результат вида
1 Расширение файла: txt
2 Расширение файла: pdf
3 Расширение файла: 
4 Расширение файла: jpg

 */
public class task6 {

    public static void main(String[] args) {
        folderContains(System.getProperty("user.dir"));           
        
    }
    static void folderContains(String pathName) {
        final File folder = new File(pathName);
        for (final File file : folder.listFiles()) {
            String name = file.getName();
            System.out.println(name);          
            if (file.isFile()) {
                String[] nameSplit = name.split("\\.");
                if (nameSplit.length > 1) {
                    String ext = nameSplit[1];
                    System.out.printf("Расширение файла: %s\n", ext);
                }
            }
        }        
    }
}
