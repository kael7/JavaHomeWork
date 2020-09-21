package java2hw6;

import java.io.IOException;
import java.net.Socket;

public class ClientLauncher {
    private final String IP_ADDRESS = "localhost";
    private final int PORT = 8189;

    public ClientLauncher() {
        try {

            Socket socket = new Socket(IP_ADDRESS, PORT);
            new Client(socket);

            while (true) {
                if (socket.isClosed()) {
                    System.out.println("Сервер отключился");
                    break;
                }
            }

            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ClientLauncher();
    }
}
