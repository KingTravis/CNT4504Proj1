

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author Evelyn
 */
public class Methods {
        
        public static String getMemoryUse() {
           // local declarations
             String cmd = "free";
             String s;
             String M = "";
             Process p;
                try{
                        p = Runtime.getRuntime().exec(cmd);
                        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        while((s = br.readLine())!= null){
                                M += s + "\n"; //store string
                        }
                        p.destroy();
                }catch(IOException e){
                        e.printStackTrace();
                }

                return M;
        }
        
        public static String getDateandTime() {
                // local declarations
                String cmd = "date";
                String s;
                String M = "";
                Process p;
                try{
                        p = Runtime.getRuntime().exec(cmd);
                        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        while((s = br.readLine())!= null){
                                M = s; // store string
                        }
                        p.destroy();
                }catch(IOException e){
                        e.printStackTrace();
                }

                return M;
        }
        
        public static String getCurrentProccesses() {
                //
                 String cmd = "ps -e";
                 String s;
                 String M = "";
                 Process p;
                try{
                        p = Runtime.getRuntime().exec(cmd);
                        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        while((s = br.readLine())!= null){
                                M += s + "\n"; //store string
                        }
                        p.destroy();
                }catch(IOException e){
                        e.printStackTrace();
                }

                return M;
        }
        
          public static String getUptime() {
                // 
                 String cmd = "uptime";
                 String s;
                 String M = "";
                 Process p;
                try{
                        p = Runtime.getRuntime().exec(cmd);
                        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        while((s = br.readLine())!= null){
                                M = s; //store string
                        }
                        p.destroy();
                }catch(IOException e){
                        e.printStackTrace();
                }

                return M;
        }


           public static String getNetstat() {
                // 
                 String cmd = "netstat";
                 String s;
                 String M = "";
                 Process p;
                try{
                        p = Runtime.getRuntime().exec(cmd);
                        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        while((s = br.readLine())!= null){
                                M += s +"\n"; //store string
                        }
                        p.destroy();
                }catch(IOException e){
                        e.printStackTrace();
                }

                return M;
        }

            public static String getCurrentUsers() {
                //
                 String cmd = "whoami";
                 String s;
                 String M = "";
                 Process p;
                try{
                        p = Runtime.getRuntime().exec(cmd);
                        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        while((s = br.readLine())!= null){
                                M = s; //store string
                        }
                        p.destroy();
                }catch(IOException e){
                        e.printStackTrace();
                }

                return M;
        }

           
}
