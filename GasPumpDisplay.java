
// By Mohamed Eladl
// Spring 2018 CSCI 125 Project 
// Sub-Class

import java.util.ArrayList;
public class GasPumpDisplay {
    public GasPumpDisplay(int numberOfPositions){
        digits = numberOfPositions;    
    }
    public String nextElement(){
        if(digits>3 || digits <3) return "System Error"; 
    ArrayList<Integer> counter1 = new ArrayList<>();
    ArrayList<Integer> counter2 = new ArrayList<>();
    ArrayList<Integer> counter2A = new ArrayList<>();
    ArrayList<Integer> counter3 = new ArrayList<>();
    ArrayList<Integer> counter3A = new ArrayList<>();
    ArrayList<String> display = new ArrayList<>();
    currentDigit= 0;
    for(int i = 0; i <= ((MAX_DIGIT + 1) *25); i++){
        if (i <=((MAX_DIGIT + 1) *5)-1){
               counter1.add(currentDigit);
        }
               else if(i > ((MAX_DIGIT + 1) *5)-1) {
            currentDigit = 1;
            counter1.add(currentDigit);
            if (i == ((MAX_DIGIT + 1) *10)-1) break;
        }
    }
        for(int j = 49; j <= ((MAX_DIGIT + 1) *25); j++){
        if (j < ((MAX_DIGIT + 1) *15)-1){
            currentDigit = 2;
               counter1.add(currentDigit);
        }
               else if(j >= ((MAX_DIGIT + 1) *15)-1) {
            currentDigit = 3;
            counter1.add(currentDigit);
            if (j == ((MAX_DIGIT + 1) *20)-2) break;
        }
        }
        for(int m = 99; m <= ((MAX_DIGIT + 1) *25); m++){
        currentDigit = 4;
            counter1.add(currentDigit);
    }
        for(int x = 1; x <= ((MAX_DIGIT + 1)*5); x++){
        if (x <= (MAX_DIGIT + 1)){
            currentDigit = 0;
               counter2.add(currentDigit);
        }
               else if(x > (MAX_DIGIT + 1)) {
            currentDigit = 1;
            counter2.add(currentDigit);
            if (x == (MAX_DIGIT + 1)*2) break;
        }
    }
        for(int y = 10; y <= ((MAX_DIGIT + 1) *5); y++){
        if (y < (MAX_DIGIT + 1)*digits){
            currentDigit = 2;
               counter2.add(currentDigit);
        }
               else if(y > (MAX_DIGIT + 1)*digits) {
            currentDigit = 3;
            counter2.add(currentDigit);
            if (y == (MAX_DIGIT + 1)*4) break;
        }
        }
        for(int a = 20; a < ((MAX_DIGIT + 1) *5); a++){
         currentDigit= 4;
            counter2.add(currentDigit);
    }
         for(int f =1; f<= (MAX_DIGIT + 1); f++){
            for(int l =0; l<((MAX_DIGIT + 1) *5);l++){
            counter2A.add(counter2.get(l));
            }
        }
        for(int h = 1; h <= ((MAX_DIGIT + 1)); h++){
        if (h <= ((MAX_DIGIT -3))){
            currentDigit = 0;
               counter3.add(currentDigit);
        }
               else if(h > ((MAX_DIGIT -3))) {
            currentDigit = 1;
            counter3.add(currentDigit);
            if (h == 2) break;
        }
    }
        for(int o = 3; o <= ((MAX_DIGIT + 1)); o++){
        if (o < MAX_DIGIT){
            currentDigit = 2;
               counter3.add(currentDigit);
        }
               else if(o > MAX_DIGIT) {
            currentDigit = 3;
            counter3.add(currentDigit);
            if (o == MAX_DIGIT) break;
        }
        }
        for(int r = 5; r <= ((MAX_DIGIT + 1)); r++){
         currentDigit= 4;
            counter3.add(currentDigit);
    }
         for(int d =1; d <= ((MAX_DIGIT + 1) *5); d++){
            for(int a = 0; a < (MAX_DIGIT+1);a++){
            counter3A.add(counter3.get(a));
            }
        }
        for(int c = 0; c < ((MAX_DIGIT + 1) *25); c++ ){
           display.add(counter1.get(c) + "" +counter2A.get(c) + counter3A.get(c));
    }
        return display +"";
    }
    
    
    public Boolean hasMoreElements(){
        tail = new GasPumpDisplay(3);
        if(tail == null){
        return false;
        }
        else { 
                return true;
                }
    }
private int digits;
private GasPumpDisplay tail;
private int currentDigit ;
private static final int MAX_DIGIT=4;

}


