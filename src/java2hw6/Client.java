package java2hw6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Scanner in;
    private Scanner input;
    private PrintWriter out;

    public Client(Socket socket) {
        try {
            in = new Scanner(socket.getInputStream());
            input = new Scanner(System.in);
            out = new PrintWriter(socket.getOutputStream(), true);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String str = input.nextLine();
                        out.println(str);
                        if (str.equals("/end")) {
                            break;
                        }
                    }
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String str = in.nextLine();
                        System.out.println(str);
                        if (str.equals("/end")) {
                            break;
                        }
                    }
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
