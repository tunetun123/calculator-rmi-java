import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements AddI, SubI, MulI, DivI, Pangkat, Hitung {
    public CalculatorImpl() throws RemoteException {
        super();
    }

    public int tambah(int a, int b) throws RemoteException {
        return a + b;
    }

    public int kurang(int a, int b) throws RemoteException {
        return a - b;
    }

    public int kali(int a, int b) throws RemoteException {
        return a * b;
    }

    public int bagi(int a, int b) throws RemoteException {
        return a / b;
    }

    public int pangkat(int x, int y) throws RemoteException {
        return (int) Math.pow(x, y);
    }

    public int hitung(int x, int y) throws RemoteException {
        return (x + y) / 2;
    }
}
