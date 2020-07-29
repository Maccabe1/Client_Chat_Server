package test;

import main.IServerSocketFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketFactoryMock implements IServerSocketFactory {

    private int port;
    public int getPort() {
        return port;
    }

    @Override
    public ServerSocket createServerSocket(int port) throws IOException {
        this.port = port;
        return new ServerSocket() {
            @Override
            public Socket accept() {
                return new Socket();
            }
        };
    }
}
