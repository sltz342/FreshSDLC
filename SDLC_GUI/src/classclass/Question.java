/* D Makhdoom
 * Question class, sets and retrieves individual answers put on a test
 */
package classclass;

import java.util.ArrayList;
import javax.swing.JRadioButton;

abstract public class Question extends Test {

    //Declaring variable
    private String text;
    private ArrayList<String> diffAns;
    private ArrayList<String> feedback;
    private int correctAns;
    private int userInput;

    /**
     * Primary Constructor.
     */
    public Question() {
        text = null;
        diffAns = null;
        feedback = null;
    }

    /**
     * Secondary Constructor
     *
     * @param text - the question appearing to the user
     * @param diffAns - an ArrayList containing the different choices
     * @param feedback - an ArrayList containing the feedback for why each
     * incorrect answer is incorrect
     * @param correctAns - the index of the correct answer sfor the diffAns
     * array
     */
    public Question(String text, ArrayList<String> diffAns, ArrayList<String> feedback, int correctAns) {
        this.text = text;
        this.diffAns = diffAns;
        this.feedback = feedback;
        this.correctAns = correctAns;
    }

    /**
     * Checks for correctness when a user inputs an answer on a question
     *
     * @return true/false depending on if the index of the correct answer aligns
     * with the userInput index
     */
    public boolean isCorrect() {
        if (userInput == correctAns) {
            return true;
        }
        return false;
    }

    /**
     * Returns the feedback string corresponding to the question specified, solong that it's not the
     * correct answer
     * @param index - the question specified
     * @return 
     */
    public String returnFeeback(int index) {
        if ( index != correctAns ) {
            return feedback.get(correctAns);
        }
        return "N/A";
    }
    
    // Getters & Setters
    
    /**
     * Accessor
     * @return the question String
     */
    public String getText() {
        return text;
    }
    
    /**
     * Mutator
     * @param s - the new text question
     */
    public void setText(String s) {
        text = s;
    }
    
    /**
     * Accessor
     * @return the ArrayList containing questions
     */
    public ArrayList<String> getDiffAns() {
        return diffAns;
    }
    
    /**
     * Mutator
     * @param s - the new ArrayList of questions
     */
    public void setDiffAns(ArrayList<String> s) {
        diffAns = s;
    }
    
    /**
     * Accessor
     * @return the ArrayList containing feedback 
     */
    public ArrayList<String> getFeedback() {
        return feedback;
    }
    
    /**
     * Mutator
     * @param f - new ArrayList per question 
     */
    public void setFeedback(ArrayList<String> f ) {
        feedback = f;
    }
    
    /**
     * Accessor
     * @return the index of the correct answer
     */
    public int getCorrectAns() {
        return correctAns;
    }
    
    /**
     * Mutator
     * @param s - the new correct answer index
     */
    public void setCorrectAns(int s) {
        correctAns = s;
    }
    
    /**
     * Accessor
     * @return the current option selected by the user (index)
     */
    public int getUserInput() {
        return userInput;
    }
    
    /**
     * Mutator
     * @param u - the new index selected by the user
     */
    public void setUserInput(int u ) {
        userInput = u;
    }
    
    public String toString() {
        return "Question: " + text + "\n 1: " + diffAns.get(0) + "\n2: " + diffAns.get(1) + "\n3: " + diffAns.get(2)
                + "\n4: " + diffAns.get(3) + "\nFeedback: \n1: " + feedback.get(0)  + "\n2: " + feedback.get(1) + "\n3: " + feedback.get(2) 
                + "\n4: " + feedback.get(3) + "\nCorrect Answer: " + correctAns + "\nCurrent selected answer: " + userInput;
    }
}
