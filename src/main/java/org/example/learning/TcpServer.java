package org.example.learning;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args){
       try( ServerSocket serverSocket = new ServerSocket()){
           serverSocket.bind(new InetSocketAddress(8080));
           while (true){
               Socket socket = serverSocket.accept();
               new Thread(clientHandler(socket)).start();
           }
       }catch (IOException e) {
           e.printStackTrace();
           System.out.println();
       }
    }

    private static Runnable clientHandler(Socket socket){
        return () -> {
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()))){
                String line = "";
                while (!"/quit".equals(line)){
                    line = reader.readLine();
                    System.out.println("~ " + line);
                    printWriter.write(line + "\n");
                    printWriter.flush();
                }
            }catch (IOException e){
                e.printStackTrace();
                System.out.println("Exception in the socket");
            }
        };
    }
}
