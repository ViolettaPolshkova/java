import java.io.File;
import java.util.ArrayList;
import java.util.List;

//Используя класс File, получите список всех файлов с заданным
// расширением в заданном каталоге (поиск в подкаталогах выполнять не надо).
public class FileStream {
    public static List<String> getListOfFilesWithGivenExtension(String path, String extension){
        File abc = new File(path);
        String[] files = abc.list();
        List<String> stringList = new ArrayList<>();

        if(files != null){
            for(String file : files){
                if(file.endsWith(extension)){
                    stringList.add(file);
                }
            }
        }
        return stringList;
    }
}