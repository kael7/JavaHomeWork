package java2hw6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerLauncher {
    private static int PORT = 8189;

    public ServerLauncher() {
        ServerSocket server = null;
        Socket socket = null;

        try {
            server = new ServerSocket(PORT);
            System.out.println("Сервер запущен");

            socket = server.accept();
            System.out.println("Клиент подключился");

            new Client(socket);
            while (true) {
                if (socket.isClosed()) {
                    System.out.println("Клиент отключился");
                    break;
                }
            }

            server.close();
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        new ServerLauncher();
    }
}
