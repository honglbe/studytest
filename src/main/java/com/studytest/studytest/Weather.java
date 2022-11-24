package com.studytest.studytest;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Weather extends Thread{
    String note = "";
    int port = 8188;
    InetAddress address = null;
    MulticastSocket socket = null;
    Weather(){
        try{
            address = InetAddress.getByName("224.225.0.0");
            socket = new MulticastSocket(port);
            socket.setTimeToLive(1);
            socket.joinGroup(address);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void run() {
        while (true){
            DatagramPacket packet = null;
            byte[] data = note.getBytes();
            packet = new DatagramPacket(data, data.length, address, port);
            System.out.println(new String(data));
            try{
                socket.send(packet);
                sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Weather w = new Weather();
        w.start();
    }
}
