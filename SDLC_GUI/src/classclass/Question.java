/* D Makhdoom
 * Question class, sets and retrieves individual answers put on a test
 */
package classclass;

import java.util.ArrayList;

 public class Question {

    //Declaring variable
    private String text;
    private ArrayList<String> diffAns;
    private int correctAns;
    private int userInput;

    /**
     * Primary Constructor.
     */
    public Question() {
        text = null;
        diffAns = null;
    }
    
    /**
     * Secondary constructor
     * @param text - the text for the question
     */
    public Question(String text) {
        this.text = text;
        diffAns = null;
    }

    /**
     * Tertiary Constructor
     *
     * @param text - the question appearing to the user
     * @param diffAns - an ArrayList containing the different choices
     * @param correctAns - the index of the correct answer sfor the diffAns
     * array
     */
    public Question(String text, ArrayList<String> diffAns, int correctAns) {
        this.text = text;
        this.diffAns = diffAns;
        this.correctAns = correctAns;
    }

    /**
     * Checks for correctness when a user inputs an answer on a question
     *
     * @return true/false depending on if the index of the correct answer aligns
     * with the userInput index
     */
    public boolean isCorrect(int userInput) {
        if (userInput == correctAns) {
            return true;
        }
        return false;
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
    
    /**
     * Text representation of a given question
     * @return the block of text representing the question
     */
    public String toString() {
        return "\nQuestion: " + text + "\n 1: " + diffAns.get(0) + "\n2: " + diffAns.get(1) + "\n3: " + diffAns.get(2)
                + "\n4: " + diffAns.get(3) + "\nCorrect Answer: " + correctAns + "\nCurrent selected answer: " + userInput;
    }
}
