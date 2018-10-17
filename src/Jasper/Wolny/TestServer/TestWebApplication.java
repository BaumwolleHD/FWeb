package Jasper.Wolny.TestServer;

import Jasper.Wolny.FWeb.Server.WebApplication;
import Jasper.Wolny.FWeb.Page.Page;
import java.util.List;

public class TestWebApplication extends WebApplication{

    MainPage mainPage = new MainPage();
    ChatPage chatPage = new ChatPage();

    public List<Page> getPages()
    {
        return List.of(mainPage, chatPage);
    }
}
