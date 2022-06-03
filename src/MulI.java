import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MulI extends Remote {
    public int kali(int a, int b) throws RemoteException;

}
