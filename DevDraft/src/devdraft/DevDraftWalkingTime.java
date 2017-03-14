/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devdraft;
import java.io.*;
import java.util.*;

/**
 * This program calculates the shortest possible walk time for a theme-park
 * guest to visit all of their desired rides.
 * @author Brooklyn
 */
public class DevDraftWalkingTime {

    /**
     * @param args the command line arguments
     */
    private static List<Integer> counterClockwise = new ArrayList<>();
    private static List<Integer> clockwise = new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Boolean test = true;
        int attractions = 0;
            do {
                int testValue = input.nextInt();
                if(testValue > 0 && testValue <= 100){
                    attractions = testValue;
                    test = false;
                }
                else{
                    System.out.println("Out of range. Enter new value.");
                }
            }
            while(test);
        for(int i = 0; i < attractions; i++){
            counterClockwise.add(input.nextInt());
        }
        clockwise.addAll(counterClockwise);
        Collections.reverse(clockwise);
        int users = 0;
        test = true;
            do{
                int testValue = input.nextInt();
                if(testValue >= 0 && testValue < 100){
                    users = testValue;
                    test = false;
                }
                else{
                    System.out.println("Out of range. Enter new value.");
                }
            }
            while(test);
        for(int i = 0; i < users; i++){
            int rides = 0;
                test = true;
                do{
                    int testValue = input.nextInt();
                    if(testValue > 0 && testValue <= attractions){
                        rides = testValue;
                        test = false;
                    }
                    else{
                        System.out.println("Out of range. Enter new value.");
                    }
                }
                while(test);
            List<Integer> rideIndex = new ArrayList<>(rides);
            for(int j = 0; j < rides; j++){
                rideIndex.add(input.nextInt());
            }
            int walkingTime = 0;
            for (int j = 0, k = 1; k < rides; j++, k++){
                int start = rideIndex.get(j);
                int destination = rideIndex.get(k);
                int clockwiseTime = goClockwise(start, destination);
                int counterClockwiseTime = goCounterClockwise(start, destination);
                if(clockwiseTime < counterClockwiseTime){
                    walkingTime += clockwiseTime;
                }
                else {
                    walkingTime += counterClockwiseTime;
                }
            }
            System.out.println(walkingTime);
        }
    }
    public static int goClockwise(int start, int destination){
        int time = 0;
        int travel;
        List<Integer> walkTime = new ArrayList<>();
        walkTime.addAll(clockwise);
        if (start == 0){
            travel = clockwise.size() - destination;
        }
        else {
            Collections.rotate(walkTime, start);
            if(start > destination){
                travel = start - destination;
            }
            else{
                travel = clockwise.size() - (destination - start);
            }
        }
        for(int i = 0; i < travel; i++){
            time += walkTime.get(i);
        }
        return time;
    }
    public static int goCounterClockwise(int start, int destination){
        int time = 0;
        int travel;
        List<Integer> walkTime = new ArrayList<>();
        walkTime.addAll(counterClockwise);
        if (start == 0){
            travel = destination;
        }
        else {
            Collections.rotate(walkTime, (counterClockwise.size() - start));
            if (start > destination){
                travel = counterClockwise.size() - (start - destination);
            }
            else{
                travel = destination - start;
            }
        }
        for(int i = 0; i < travel; i++){
            time += walkTime.get(i);
        }
        return time;
    }
}
