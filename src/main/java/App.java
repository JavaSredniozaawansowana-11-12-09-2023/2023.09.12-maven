import org.apache.commons.codec.digest.DigestUtils;

public class App {
    public static void main(String[] args) {
        String password = "janusz123";
        String hash = DigestUtils.md5Hex(password);
        System.out.println(hash);
    }
}
