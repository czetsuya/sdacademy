package pro.sdacademy.designpatterns.behavioral.iterator;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JavaFile implements Iterable<String> {

  private String fileName;
  private String className;
  private List<String> linesContent = new ArrayList<>();

  public void addLine(final String line) {
    linesContent.add(line);
  }

  @Override
  public String toString() {
    return "JavaFile{" +
        "fileName='" + fileName + '\'' +
        ", className='" + className + '\'' +
        ", linesContent=" + String.join("\n", linesContent) +
        '}';
  }

  @Override
  public Iterator<String> iterator() {
    return linesContent.iterator();
  }
}