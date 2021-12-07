package com.TCPUnit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <p>
 *
 * @author BowenDeng
 * @version 1.0
 * @date 2021/12/7 19:35
 **/
public class RequestListener {

    private static boolean isAvailable;

    private String partnerIp;

    public static void activeListener() {

        try {
            while (true) {
                ServerSocket serverSocket = new ServerSocket(9999);
                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();

                BufferedReader bufferedReader =
                        new BufferedReader(new InputStreamReader(inputStream));
                String command = bufferedReader.readLine();

                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
