package Controler;

import View.ClientJobRequest;
import View.MainWorkerInterface;
import View.UserLogin;

import java.util.ArrayList;

public class JavaPB {
    // Set of arraylist...
    // userInfo holds the current users details
    public static ArrayList<String> userInfo = new ArrayList<String>();
    // Data =  Holds other necessary details in job orders (service,location,sched,time,payment);
    public static ArrayList<String> data = new ArrayList<String>();
    // Holds the username(0) , password(1) , id/no(2) of the current logged in user
    public static ArrayList<String> loggedInUserDetails = new ArrayList<String>();
    public static ArrayList<String> orderInfo = new ArrayList<String>();
    public static Boolean loggedIn = false;
    
    public static void main(String[] args) {
        DataPB.setCon();

        UserLogin.startUserLogin(); // Working on Username and Password log-in
        
        while(loggedIn){
            String accountType = userInfo.get(5);
            if(accountType.equals("Employee")){
                MainWorkerInterface.pendingRequestWorker();
            } else {
                ClientJobRequest.jobRequest();
            }
        }
    }
}
