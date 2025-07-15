package ISP;

import ISP.Exceptions.ConnectionException;

public interface Network {
    public void connect() throws ConnectionException;
    public void disconnect() throws ConnectionException;
    public void info() ;
}
