import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hitung extends Remote {
    public int hitung(int x, int y) throws RemoteException;
}