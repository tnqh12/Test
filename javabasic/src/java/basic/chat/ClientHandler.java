package java.basic.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;


// Runnable 인터페이스를 구현한 쓰레드
// 역할 : 동시적으로 클라이언트들과 데이터를 송수신

public class ClientHandler implements Runnable {

		
	//클라리언트 소켓
	private Socket clientSocket;
	//클라이언트들의 리스트(서버에서 어떤 클라이언트의 메세지를 수신하면 전체에게 메세지를 보내야함)
	private List<ClientHandler> clients;
	// 문자송신스트림
	private PrintWriter out;
	// 문자수신스트림
	private BufferedReader in;

	// 클라이언트핸들러는 클라이언트소켓과 클라이언트들의 리스트가 있으면 만들어진다
	public ClientHandler(Socket socket, List<ClientHandler> clients) throws IOException {
		this.clientSocket = socket;
		this.clients = clients;
		//클라이언트에 송신하는 스트림
		//아래 둘 다 서버쪽에 있는 애들이다
		this.out = new PrintWriter(clientSocket.getOutputStream(), true);
		//클라이언트에 수신하는 스트림
		this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	}

	@Override
	public void run() {
		try {
			String inputLine;
			// 무한히 한줄씩 입력받아서
			while ((inputLine = in.readLine()) != null) {
				// 전체 클라이언트에게 메세지를 전송
				for (ClientHandler clientHandler : clients) {		// 입력한 메세지를 모두에게 다 보낸다
					clientHandler.out.println(inputLine);
				}
			}
		} catch (IOException ioe) {
			System.out.println("클라이언트 종료!" + ioe.getMessage());
		} finally {
			try {
				in.close();
				out.close();
				clientSocket.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}

} // class
