import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DivI extends Remote {
    public int bagi(int a, int b) throws RemoteException;

}
