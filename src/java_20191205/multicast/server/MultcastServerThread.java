package java_20191205.multicast.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MultcastServerThread implements Runnable{
	private Socket socket;
	public MultcastServerThread(Socket socket){
		this.socket = socket;		
	}
	@Override
	public void run() {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			boolean isStop = false;
			while(isStop){
				String readLine = br.readLine();
				System.out.println(readLine);
				if (readLine.equals("exit")) {
					isStop = true;
				}else{
					
				}
				bw.write(readLine);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
