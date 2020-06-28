package test;
import main.Server;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServerTest {
    private ServerSocketFactoryMock serverSocketFactory = new ServerSocketFactoryMock();

    @Test
    public void serverStartsListeningOnSpecificPort() {
        Server server = new Server(serverSocketFactory, 5678);
        server.run();
        assertEquals(5678, serverSocketFactory.getPort());
    }

}
