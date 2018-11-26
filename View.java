import javafx.scene.layout.*;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.effect.*;
import javafx.scene.Group;

import javafx.scene.text.*;
import javafx.scene.paint.*;
import javafx.scene.image.*;

public class View extends GridPane
{
    private TippDesTagesClient client;
    private Text tipp;

    public View(TippDesTagesClient client_)
    {
        client = client_;
        guiErstellen();
    }

    public void guiErstellen()
    {   
        Text titel = new Text("Der Tipp des Tages!");
        tipp = new Text("Hier steht dann der Tipp");
        Button button = new Button("neuer Tipp");
        button.setOnAction(e -> buttonGedrueckt());
        add(titel,0,0);
        add(tipp,0,1);
        add(button,0,2);

        // Aussehen
        titel.setFont(new Font(30));
        titel.setFill(Color.WHITE);
        tipp.setFont(new Font(20));
        setPadding(new Insets(20));
        setVgap(10);
        setHgap(10);
        setBackground(new Background(new BackgroundFill(Color.SKYBLUE, null, null)));

    }

    public void buttonGedrueckt()
    {
        String neuerTipp = client.neuerTipp();
        tipp.setText(neuerTipp);
    }

}
