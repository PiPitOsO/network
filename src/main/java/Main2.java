import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Main2 {
    public static void main(String[] args) throws IOException {
        String host = "ru.i";
        int port = 11566;
        try (Socket clientSocket = new Socket(host, port);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String resp = in.readLine();
            System.out.println(resp);
        }
    }
}