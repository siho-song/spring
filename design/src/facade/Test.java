package facade;

public class Test {
    public static void main(String[] args) {

        Ftp ftpClient = new Ftp("www.naver.com",8080,"/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("test.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("test.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();

        SftpClient sftpClient1 = new SftpClient("www.naver.com",8080,"/home/etc","test.tmp");
        sftpClient1.connect();
        sftpClient1.write();
        sftpClient1.read();
        sftpClient1.disconnect();


    }
}
