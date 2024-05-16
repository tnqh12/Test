package java.basic.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
// *****************************s***********************************
public class ChattingServer {

	// 클라이언트핸들러 리스트 = 클라이언트 소켓 리스트 = 클라이언트 송/수신 리스트
	private static List<ClientHandler> clients = new ArrayList<ClientHandler>(); // Handler 는 스레드 : 채팅을 다수가 치기때문

	public static void main(String[] args) throws IOException {

		// 서버소켓객체를 5000번 포트로 생성
		ServerSocket serverSocket = new ServerSocket(5000);
		if (serverSocket != null) {
			System.out.println("서버 시작됨! 클라이언트 대기중!" + serverSocket);
		}

		// 무한히 블락킹(대기.accept) => accept 는 접속요청이 오면 블락킹을 중지
		while (true) {
			// 접속요청이 오면 클라이언트와 송수신 할 소켓이 생성됨
			Socket clientCommSocket = serverSocket.accept(); // 소켓할당(만들어라) //서버쪽 소켓
			System.out.println("클라이언트 접속 : " + clientCommSocket);

			// 클라이언트핸들러 생성
			ClientHandler clientHandler = new ClientHandler(clientCommSocket, clients);
			// 클라이언트 리스트에 클라이언트 저장
			clients.add(clientHandler); // add 는 값을 저장 // 클라이언트 리스트를 담는다 //클라이언트의 목록을 알아야한다
			// 클라이언트핸들러 스레드 시작 (송수신 시작)
			new Thread(clientHandler).start();
		}

	}

}
