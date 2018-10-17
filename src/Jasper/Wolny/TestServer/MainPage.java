package Jasper.Wolny.TestServer;

import Jasper.Wolny.FWeb.Nodes.BrElement;
import Jasper.Wolny.FWeb.Nodes.InternalLinkElement;
import Jasper.Wolny.FWeb.Nodes.TextNode;
import Jasper.Wolny.FWeb.Page.*;

public class MainPage extends Page<TestWebApplication>{
    public void construct()
    {
        body.addNode(new TextNode("Hello world!"));
        body.addNode(new BrElement());
        body.addNode(new TextNode("Hello world!"));
        body.addNode(new InternalLinkElement<TestWebApplication>(this.app.chatPage, "Klick mich!"));
    }

    public String getUrl()
    {
        return "/";
    }
}