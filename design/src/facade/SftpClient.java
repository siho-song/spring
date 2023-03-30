package facade;

public class SftpClient {
    private Ftp ftp;
    private Reader reader;
    private Writer writer;

    public SftpClient(Ftp ftp,Reader reader , Writer writer){
        this.ftp=ftp;
        this.reader=reader;
        this.writer=writer;
    }
    public SftpClient(String host, int port, String path, String fileName){
        ftp = new Ftp(host,port,path);
        reader = new Reader(fileName);
        writer = new Writer(fileName);
    }

    public void connect(){
        ftp.connect();
        reader.fileConnect();
        writer.fileConnect();
    }

    public void read(){
        reader.fileRead();
    }

    public void write(){
        writer.write();
    }

    public void disconnect(){
        ftp.disConnect();
        reader.fileDisconnect();
        writer.fileDisconnect();
    }

}
