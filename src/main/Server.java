package main;

import java.io.IOException;
import java.net.ServerSocket;

public class Server implements Runnable {

    private final IServerSocketFactory serverSocketFactory;
    private final int port;

    public Server(IServerSocketFactory serverSocketFactory, int port) {
        this.serverSocketFactory = serverSocketFactory;
        this.port = port;
    }

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = serverSocketFactory.createServerSocket(port);
            serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
