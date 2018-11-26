// aus Java von Kopf bis Fu8
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TippDesTagesClient {
    String serverAdresse;
    int portNummer;

    public TippDesTagesClient()
    {
        serverAdresse = "127.0.0.1"; //Localhost // Ersetze diese Adresse!
        portNummer = 4242;
    }

    public String neuerTipp() {
        String tipp = "";
        try {
            Socket socket = new Socket(serverAdresse, portNummer);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            tipp = reader.readLine();
            reader.close();
        } catch(IOException ex) {
            //ex.printStackTrace();
        }
        if (tipp != "")
        {
            return tipp;
        }
        else
        {
            return "Heute leider kein neuer Tipp.";
        }
    }

}

