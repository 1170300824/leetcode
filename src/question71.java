import java.nio.file.*;
public class question71 {
    public static void main(String[] args) {

    }

    public String simplifyPath(String path) {
        return Paths.get(path).normalize().toString();
    }
}
