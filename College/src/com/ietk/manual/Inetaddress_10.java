package com.ietk.manual;
import java.net.*;
class Inetaddress_10
{
public static void main(String args[]) throws
UnknownHostException
{
InetAddress Address = InetAddress.getLocalHost();
System.out.println(Address);
Address=InetAddress.getByName("msbte.org");
System.out.println(Address);

Address = InetAddress.getByName("google.com");
System.out.println(Address);
}
}