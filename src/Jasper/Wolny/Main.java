package Jasper.Wolny;

import Jasper.Wolny.FWeb.Server.ServerManager;
import Jasper.Wolny.FWeb.Server.Server;
import Jasper.Wolny.TestServer.TestWebApplication;

public class Main {

    public static void main(String[] args) {
        ServerManager.singleton().addServer("127.0.0.1", (short)9092).start(new TestWebApplication());
    }
}
