// package CipherSuites ;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
public class SecureSocket{
    public static void main(String[] args) {
        try {
            SSLSocketFactory factory=(SSLSocketFactory)SSLSocketFactory.getDefault();
            SSLSocket socket=(SSLSocket) factory.createSocket("www.google.com",443);
            String[] suites=socket.getSupportedCipherSuites();
            socket.setEnabledCipherSuites(suites);
            socket.addHandshakeCompletedListener(new myHandShake());
            socket.startHandshake();
            System.out.println("connected to"+socket.getRemoteSocketAddress());
        } catch (Exception e) {
            System.out.println("Error"+e);
            // TODO: handle exception
        }
    }
}
    class myHandShake implements HandshakeCompletedListener{
        @Override
        public void handshakeCompleted(HandshakeCompletedEvent e){
            System.out.println("Session Info"+e.getSession());
        }
    }