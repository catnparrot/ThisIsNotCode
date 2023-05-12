package dpm05.d11.secServ;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

public class NewsServer {
	private static DatagramSocket dsk = null;
	
	public static void main(String[] args) {
		System.out.println("-------------------------------");
		System.out.println("서버를 종료하려면 q누르고 엔터 눌러라");
		System.out.println("-------------------------------");
		
		//UDP 서버 시작
		startServer();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		sc.close();
		
		//TCP 서버종료
		stopServer();
	}
	
	public static void startServer() {
		//작업 스레드 정의
		Thread thread = new Thread() {

			
			@Override
			public void run() {
				try {
					//DatagramSocket 생성 및 Port 바인딩
					dsk = new DatagramSocket(50001);
					System.out.println("서버 시작");
				
					while(true) {
						//클라이언트가 구독하고 싶은 뉴스 주제 얻기
						DatagramPacket receivePacket = new DatagramPacket
								(new byte[1024], 1024);
						dsk.receive(receivePacket);
						String newsKind =
								new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
					
						//클라이언트의 IP와 Port 얻기
						SocketAddress socketAddress = receivePacket.getSocketAddress();
					
						for (int i = 0; i <=10; i++) {
							String data = newsKind + ": 뉴스" + i;
							byte[] bytes = data.getBytes("UTF-8");
							DatagramPacket sendPacket =
									new DatagramPacket(bytes, 0, bytes.length, socketAddress);
							dsk.send(sendPacket);
						}
					}
				} catch(Exception e) {
					System.out.println("서버 "+ e.getMessage());
				}
			}
					
			
		};
		//스레드 시작
		thread.start();
	}
	
	public static void stopServer() {
		//DatagramSocket 닫고 Port 언바인딩
		dsk.close();
		System.out.println("서버 종료");
	}
}


//q만 누르면 종료되는 기능 말고 특정한 커맨드를 두 번 입력해야 종료하는 기능
