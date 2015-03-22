package LoginServer;

import java.net.Socket;

/**
 * ��������ڴ洢client����Ϣ
 * 
 * @author Wangweiguang
 * 
 */
public class ClientStructs {
	private Socket client = null;					// client��socket��Ϣ
	private int CLIENT_PORT = 0; 				//�ͷ��˶˿�
	private String address = null;				//�ͻ��˵�ַ
    private int _ID = 0;									//�ͻ�ID
    private byte[] msg;								//�ͻ��˵���Ϣ
	public ClientStructs(Socket client) {
		this.client = client;
		this.CLIENT_PORT = client.getPort();
		this.address = client.getInetAddress().getHostAddress();
		msg = new byte[Utils.BUFF_LENGTH];
	}
public String toString(){
	return "Current Socket Address: "+address+":"+this.CLIENT_PORT;
}
public Socket getClientSocket() {
	return client;
}
//public void setClient(Socket client) {
//	this.client = client;
//}
public int getClientPort() {
	return CLIENT_PORT;
}
//public void setCLIENT_PORT(int cLIENT_PORT) {
//	CLIENT_PORT = cLIENT_PORT;
//}
public String getClientAddress() {
	return address;
}
//public void setAddress(InetAddress address) {
//	this.address = address;
//}
public int getId(){
	return _ID;
}
public void setId(int id){
	this._ID = id;
}
public byte[] getMsg() {
	return msg;
}
public void setMsg(byte[] msg) {
	this.msg = msg;
}
public Socket getClient() {
	return client;
}
public void setClient(Socket client) {
	this.client = client;
}

}
