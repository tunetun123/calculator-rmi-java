import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddI extends Remote {
    public int tambah(int a, int b) throws RemoteException;
}
