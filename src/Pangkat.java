import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Pangkat extends Remote {
    public int pangkat(int x, int y) throws RemoteException;
}
