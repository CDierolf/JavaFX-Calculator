package calculator.classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author Name: Christopher K. Dierolf
 * @Date: Sep 9, 2019
 * @Subclass CalculatorClass Description: 
 */
//Imports

//Begin Subclass CalculatorClass
public class CalculatorClass {
    
    private String input;
    private Queue<String> calculation = new LinkedList<>();
    private Queue<String> calculationHistory = new LinkedList<>();
    
    
    
    public void setInput(String input) {
        this.input = input;
        String balls = "";
    }
  
    /**
     * Remove each element of the queue and format it into a string
     * for display.
     * @return String output.
     */
    @Override
    public String toString() {
        String output = "";
        
        for (String s : calculation) {
            output += calculation.remove() + " ";
        }
        
        return output;
        
    }
    
    
    
    
    
    
    
    
    

} //End Subclass CalculatorClass