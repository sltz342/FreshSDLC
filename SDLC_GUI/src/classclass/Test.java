/* D Makhdoom
 * A "Test" class, used to write and recieve information from the user in multiple choice format
 * May 12 2023
 */
package classclass;

import java.util.ArrayList;


public class Test {
    
    // Declaring Variables
    private int score = 0;
    private boolean pass;
    private ArrayList<Question> q;
    
    /**
     * Primary Constructor
     */
    public Test() {
        pass = false;
    }
    
    /**
     * Secondary Constructor
     * @param q - the ArrayList of questions to display
     */
    public Test(ArrayList<Question> q) {
        this.q = q;
        pass = false;
    }
    
    /**
     * Cycles through every element in the question ArrayList and counts correct answer
     * @return the score (amt of times user answered correctly)
     */
    public int calcScore() {
        // Looping for the amount of questions, which is concretely 10 but just incase otherwise
        for ( int i = 0; i < q.size(); i++ ) {
            if ( q.get(i).isCorrect() == true ) score++;
        }
        return score;
    }
    
    /**
     * If the user answers over 5 questions correctly, they pass!
     * @return 
     */
    public boolean isPass() {
        if ( calcScore() >= 5 ) return true;
        return false;
    }
    
    // Getters/Setters
    
    /**
     * Accessor
     * @return the current score
     */
    public int getScore() {
        return score;
    }
    
    /**
     * Mutator
     * @param s - the new score of the test
     */
    public void setScore(int s) {
        score = s;
    }
    
    /**
     * Accessor
     * @return the current state of passing
     */
    public boolean getPass(){
        return pass;
    }
    
    /**
     * Mutator
     * @param p- the new state of passing 
     */
    public void setPass(boolean p ) {
        pass = p;
    }
    
    /**
     * Accessor
     * @return the ArrayList of questions 
     */
    public ArrayList<Question> getQuestionList() {
        return q;
    }
    
    /**
     * Mutator
     * @param nQ the new ArrayList of 
     */
    public void setQuestionList(ArrayList<Question> nQ ){
        q = nQ;
    }
    /**
     * String representation of the test
     * @return that same block of text
     */
    public String toString() {
        return "Questions: " + q + "\nCurrent Score: " + score + "\nHas passed?: " + pass;
    }
            
}
