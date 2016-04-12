package ligandfas.rasptest;

import android.os.AsyncTask;



import java.io.*;
import java.net.*;




public class Network extends AsyncTask<Void, Void, Void> {
    private Socket sock ;
    private String serverIP,mes;
    private ObjectOutputStream output;



    public Network(String host,String lol){
        serverIP=host;
        mes=lol;

    }


    private void EstabCo() throws IOException {

        sock= new Socket(InetAddress.getByName(serverIP), 6789);


        System.out.println("Connection Established! Connected to: " + sock.getInetAddress().getHostName());
    }

    private void SetupStreams () throws IOException{


        output= new ObjectOutputStream(sock.getOutputStream());
        output.flush();

    }

    private void closeConnection(){

        try{
            output.close();

            sock.close();
        }catch(IOException ioException){
            ioException.printStackTrace();
        }

    }

    private void sendMessage(String message){

        try{
            output.writeObject(message);
            output.flush();

        }catch(IOException ioException){
            System.out.println("\n Oops! Something went wrong!");
        }
    }
    public void startRunning()  {
        try{

            EstabCo();

            SetupStreams();
            sendMessage(mes);

        }catch(EOFException eofException){
            System.out.println("\n Client terminated the connection");
        }catch(IOException ioException){
            ioException.printStackTrace();
        }finally{
            closeConnection();
        }
    }

    @Override
    protected Void doInBackground(Void... params) {
        startRunning();
        return null;
    }

}
