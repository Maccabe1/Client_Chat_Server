package main;

import java.io.IOException;
import java.net.ServerSocket;

public interface IServerSocketFactory {
    ServerSocket createServerSocket(int port) throws IOException;
}