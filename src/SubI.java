import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SubI extends Remote {
    public int kurang(int a, int b) throws RemoteException;

}
