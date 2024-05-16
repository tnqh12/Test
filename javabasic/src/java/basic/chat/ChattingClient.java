package java.basic.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.function.Consumer;
// *****************************************************************
public class ChattingClient {

	// 서버와 송수신하기 위한 클라이언트 소켓
	private Socket socket;
	// 서버에서 문자를 수신하는 스트림
	private BufferedReader in;
	// 서버에 문자를 송신하는 스트림
	private PrintWriter out;
	// 함수형 인터페이스 Consumer : 메소드의 입력데이터(파라미터들)을 받아서 기능을 수행하고 반환하지 않는다
	private Consumer<String> onMessageReceived; // 서버에서 받았을 때 필요한 컨슈머를 만든다

	// 채팅클라이언트 생성자
	// 파라미터(인자) : 서버주소, 서버포트, Consumer
	public ChattingClient(String serverAddress, int serverPort, Consumer<String> onMessageReceived) throws IOException {
		// 클라이언트 소켓 생성(없으면 채팅이 안됨 . 그림 참고)
		this.socket = new Socket(serverAddress, serverPort);
		// 클라이언트 입력스트림 (서버 -> 클라이언트)
		this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		// 클라이언트 출력스트림 (클라이언트 -> 서버), true : autoflush
		this.out = new PrintWriter(socket.getOutputStream(), true);
		this.onMessageReceived = onMessageReceived;
	}

	// 클라이언트에서 서버로 메세지 전송하는 메소드
	public void sendMessage(String msg) { //메세지가 호출되면
		out.print(msg);
	}

	// 서버에서 클라이언트에 전송하는 메세지를 수신하는 쓰레드
	// 서버에서 온 것을 계속해서 찍어내야해서 쓰레드를 사용한다
	public void startClient() {
		// 클라이언트 쪽 쓰레드
		new Thread(() -> {
			try {
				// 서버에서 전송한 메세지를 저장할 String
				String line;
				// 메세지(line)가 있으면 line 을 onMessageReceived라는 Consumer 에 전달
				// 쉽게 적자면 onMessageReceived를 line 을 주고 수행시킨다.
				while ((line = in.readLine()) != null) {
					// 메세지를 받으면 메세지를 onMessageReceived에 전달한다
					onMessageReceived.accept(line);	// 라인을 입력받고 밀어낸다(반환이 없다) .컨슈머 = 다 써서 없다
					// 쓰레드이고 실행하고 작업하는데 반환값이 없으면 컨슈머이다
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}).start();
	}

}
