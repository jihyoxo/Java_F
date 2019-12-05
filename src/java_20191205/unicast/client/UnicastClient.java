package java_20191205.unicast.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UnicastClient implements ActionListener{
	private JFrame jframe;
	private JTextArea jta;
	private JButton jbtn;
	private JTextField jtf;
	private String id;
	private String ip;
	private int port;
	private BufferedReader br;
	private BufferedWriter bw;
	
	public UnicastClient(String id, String ip, int port){
		this.id = id;
		this.ip = ip;
		this.port = port;
		
		jframe  = new JFrame("Unicast Chatting");	//창 이름
		/********************북쪽시작********************/
		JPanel j1 = new JPanel();
		JLabel jl1 = new JLabel("User ID : [" + id + "]");
		JLabel jl2 = new JLabel("Server IP : " + ip);
		j1.setLayout(new BorderLayout());
		j1.add(jl1, BorderLayout.CENTER);
		j1.add(jl2, BorderLayout.EAST);
		/********************북쪽끝********************/
		
		/********************중앙시작********************/
		jta = new JTextArea("", 20, 50);		//JTextArea 크기 설정
		JScrollPane jsp = new JScrollPane(jta,		//JTextArea에 스크롤 만들기
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setBackground(new Color(255,230,230));
		jta.setEditable(false); //jta 수정 금지
		/********************중앙끝********************/
		
		/********************남쪽시작********************/
		JPanel j2 = new JPanel();
		jtf = new JTextField();
		jbtn = new JButton("SEND");
		j2.setLayout(new BorderLayout());
		j2.add(jtf, BorderLayout.CENTER);
		j2.add(jbtn, BorderLayout.EAST);
		/********************남쪽끝********************/
		
		jframe.add(j1, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);	//창에 JTextArea 추가
		jframe.add(j2, BorderLayout.SOUTH);
		
		jframe.pack();
		jframe.setResizable(true);	//창 크기 조절 가능
		jframe.setVisible(true);		//창 보이기
		
		jbtn.addActionListener(this);
		jtf.addActionListener(this);
		
		
		//창끄면 terminate 되게 하기
		jframe.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent  e) {
				try {
					bw.write("exit");
					bw.newLine();
					bw.flush();
					
					String readLine = br.readLine();
					if(readLine.equals("exit")){
						System.exit(0);
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.exit(0);
			}
			//창 시작하면 채팅창에 입력 포커스
			public void windowOpend(WindowEvent e){
				jtf.requestFocus();
			}
		});
	}
	
	//서버와 연결하기
	public void connect() {
		try {
			Socket socket = new Socket(ip, port);
			
//			OutputStream out = socket.getOutputStream();
//			OutputStreamWriter osw = new OutputStreamWriter(out);
//			BufferedWriter bw = new BufferedWriter(osw); 	
			//맨위에 BufferedReader br 선언해서 아래처럼
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
//			InputStream in = socket.getInputStream();
//			InputStreamReader isr = new InputStreamReader(in);
//			BufferedReader br = new BufferedReader(isr);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);	//창 디자인 바뀜
		new UnicastClient("Jihyo", "192.168.0.202", 3000).connect();;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		String message = jtf.getText();
		if (obj == jbtn) {		//sned 누르면 전송
//			jta.append(jtf.getText()+"\n");	//jtf에 친걸 jta로 보내기
//			jta.append(id + " : " + message + "\n");	
//			jtf.setText(""); 	//send하면 jtf 내용 리셋			
			try {
				bw.write(id + ": " + message);
				bw.newLine();
				bw.flush();
				
				String readLine = br.readLine();
				
				jta.append(readLine + "\n");	
				jtf.setText(""); 
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}else if(obj == jtf){		//엔터치면 전송
//			jta.append(id + " : " + message + "\n");	
//			jtf.setText(""); 
			try {
				bw.write(id + ":"+message);
				bw.newLine();
				bw.flush();
				
				String readLine = br.readLine();
				
				jta.append(readLine+"\n");
				jtf.setText("");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
