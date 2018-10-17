package Jasper.Wolny.TestServer;

import Jasper.Wolny.FWeb.Nodes.*;
import Jasper.Wolny.FWeb.Page.*;

public class ChatPage extends Page<TestWebApplication>{
    public void construct()
    {
        TextInputElement in = new TextInputElement();
        ButtonInputElement button = new ButtonInputElement("Absendenn");
        TextAreaElement ta = new TextAreaElement();

        body.addNodes(in, button, new BrElement(), ta);

        /*VisitedInputField vif = in.ofVisitor();
        ActionSequence first = in.doAppend(vif.doGetText().doAppend("\n"));
        ActionSequence action = first.then(vif.doSetText(""));

        button.onClick(action);*/
    }

    public String getUrl()
    {
        return "/chat.html";
    }
}