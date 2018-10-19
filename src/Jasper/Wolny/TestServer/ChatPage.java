package Jasper.Wolny.TestServer;

import Jasper.Wolny.FWeb.DynmicContent.Action.ActionSequence;
import Jasper.Wolny.FWeb.Nodes.Element.BrElement;
import Jasper.Wolny.FWeb.Nodes.Element.Input.ButtonInputElement;
import Jasper.Wolny.FWeb.Nodes.Element.Input.TextAreaElement;
import Jasper.Wolny.FWeb.Nodes.Element.Input.TextInputElement;
import Jasper.Wolny.FWeb.Nodes.Element.Input.VisitedTextInputElement;
import Jasper.Wolny.FWeb.Page.*;

public class ChatPage extends Page<TestWebApplication> {
    public void construct()
    {
        TextInputElement in = new TextInputElement();
        ButtonInputElement button = new ButtonInputElement("Absenden");
        TextAreaElement ta = new TextAreaElement();

        VisitedTextInputElement vif = in.ofVisitor();

        ActionSequence action = ta.ofAllPageVisitors().doAppendText(vif.doGetValue().doAppendText("\n")).then(vif.doSetValue(""));

        button.setOnClick(action);

        body.addNodes(in, button, new BrElement(), ta);

        System.out.print("hi");
    }

    public String getUrl()
    {
        return "/chat.html";
    }
}