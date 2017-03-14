/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devdraftwaitingtime;
import java.io.*;
import java.util.*;

/**
 *
 * @author Brooklyn
 */
public class DevDraftWaitingTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Boolean tester = true;
        Scanner input = new Scanner(System.in);
        int rides = 0;
            do{
                int temp = input.nextInt();
                if(0 < temp && temp < 1000){
                    rides = temp;
                    tester = false;
                }
                else {
                    System.out.println("Out of bounds, try again.");
                }
            }
            while(tester);
        int hours = 0;
            do {
                tester = true;
                int temp = input.nextInt();
                if(1 <= temp && temp <= 23){
                    hours = temp;
                    tester = false;
                }
                else {
                    System.out.println("Out of bounds, try again.");
                }
            }
            while(tester);
        int[][] timeTable = new int[rides][];
        for(int i = 0; i < rides; i++){
            for(int j = 0; j < hours; j++){
                timeTable[i][j] = input.nextInt();
            }
        }
        int queries = 0;
            do {
                tester = true;
                int temp = input.nextInt();
                if(0 <= temp && temp < 100){
                    queries = temp;
                    tester = false;
                }
                else {
                    System.out.println("Out of bounds, try again.");
                }
            }
            while(tester);
        for (int i = 0; i < queries; i++){ //code for each query
            int arrival = input.nextInt();
            int toRide = input.nextInt();
            ArrayList<Integer> rideList = new ArrayList<>();
            for (int j = 0; j < toRide; j++){ // populate ride index array
                rideList.add(input.nextInt());
            }
            int currentMinutes = arrival; //counter to track the time
            int currentHour = 0; //counter to use with time table
            int waiting = 0; //counter of total time waiting
            if (arrival > 0){
                double temporary = arrival/60;
                currentHour = (int) temporary;
            }
            ArrayList<Integer> waitTimes = new ArrayList<>();
            for (int j = 0; j < toRide; j++){ //wait time for each ride index
                Integer rideIndex = rideList.get(j);
                waitTimes.add(timeTable[rideIndex][currentHour]);
            }
            waiting += Collections.min(waitTimes);
        }       
    }   
}
