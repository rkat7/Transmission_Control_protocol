import java.io.*; 
import java.net.*; 
class TCPClient { 
public static void main(String argv[]) throws Exception
{ 
String sentence;
String modifiedSentence;
System.out.println("Enter lower case sentence from keyboard \n");
BufferedReader inFromUser=new BufferedReader(new InputStreamReader(System.in));
Socket clientSocket=new Socket("localHost", 6789); 
DataOutputStream outToServer=new DataOutputStream(clientSocket.getOutputStream());
BufferedReader inFromServer=new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
sentence=inFromUser.readLine(); 
outToServer.writeBytes(sentence + '\n'); 
modifiedSentence = inFromServer.readLine(); 
System.out.println("FROM SERVER: " + modifiedSentence); 
clientSocket.close();
} 
} 
