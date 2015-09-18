import java.io.*;
import javax.microedition.io.*;
import javax.bluetooth.*;

public class RFCOMMServer {

 public static void main( String args[] ) {
   try {
   
    StreamConnectionNotifier service = (StreamConnectionNotifier) 
           Connector.open( "btspp://localhost:" + 
                                        new UUID( 0x1101 ).toString() + 
                                        ";name=helloService");

    StreamConnection conn = (StreamConnection) 
                                                        service.acceptAndOpen();
    InputStream is = conn.openInputStream();

    byte buffer[] = new byte[80];
    int bytes_read = is.read( buffer );
    String received = new String(buffer, 0, bytes_read);
    System.out.println("received: " + received);

    conn.close();
   } catch ( IOException e ) {   System.err.print(e.toString());    }
 }
}