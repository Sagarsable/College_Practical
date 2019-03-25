package com.ietk.manual;

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import java.net.*;
import java.io.*;
public class ServerDemo_12
{
public static void main(String args[])
{
try
{
ServerSocket ss=new ServerSocket(3456);
Socket s1=ss.accept();
System.out.println("Got Client");
InputStream is=s1.getInputStream();
OutputStream os=s1. getOutputStream();

DataInputStream dis=new DataInputStream(is);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
String line=dis.readUTF();
System.out.println("line");
System.out.println("Enter Data");

String str=br.readLine();
//dos.writeUTF(str);

}
}
catch(Exception e)
{
}
}
}


