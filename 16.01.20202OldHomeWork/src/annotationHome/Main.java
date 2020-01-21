package annotationHome;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws IOException, IllegalAccessException {

        Auto auto = new Auto("black",5500,1600);
        Main main = new Main();
        main.writeInFile(auto,auto.getClass());

    }

    public void writeInFile(Object o, Class c) throws IOException, IllegalAccessException {
        FileWriter writer = new FileWriter("fileForAnnotation.txt");
       // Writer writer = new BufferedWriter(new FileWriter("fileForAnnotation.txt"));
        Field[] fields = c.getDeclaredFields();
        for(Field f : fields){
            Annotation[] annotations = f.getDeclaredAnnotations();
            System.out.println(annotations.length);
            boolean annotationPresent = f.isAnnotationPresent(MyAnnotation.class);
            if(annotationPresent) {
                String str = f.get(o).toString();
                writer.write(str);
            }
        }
        writer.flush();
    }
}
