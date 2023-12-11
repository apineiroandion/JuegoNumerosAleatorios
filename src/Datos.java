public class Datos {
    /**
     * number to guess
     */
    private int randomNumber;
    /**
     * Number to compare
     */
    private int choiceNumber;
    /**
     * Number of success
     */
    private int successNumber;
    /**
     * Number of failures
     */
    private int failuresNumber;
    /**
     * Actual round
     */
    private int actualRound;
    /**
     * Number of round in each game
     */
    private final int ROUND_NUMBER = 10;
    /**
     * Number of trys
     */
    private final int TRYS_NUMBER = 2;

    /**
     * Singleton
     */
    public static Datos instance = null;

    private Datos(int randomNumber, int choiceNumber, int successNumber, int failuresNumber, int actualRound) {
        this.randomNumber = randomNumber;
        this.choiceNumber = choiceNumber;
        this.successNumber = successNumber;
        this.failuresNumber = failuresNumber;
        this.actualRound = actualRound;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public int getChoiceNumber() {
        return choiceNumber;
    }

    public void setChoiceNumber(int choiceNumber) {
        this.choiceNumber = choiceNumber;
    }

    public int getSuccessNumber() {
        return successNumber;
    }

    public void setSuccessNumber(int successNumber) {
        this.successNumber = successNumber;
    }

    public int getFailuresNumber() {
        return failuresNumber;
    }

    public void setFailuresNumber(int failuresNumber) {
        this.failuresNumber = failuresNumber;
    }

    public int getActualRound() {
        return actualRound;
    }

    public void setActualRound(int actualRound) {
        this.actualRound = actualRound;
    }

    public int getROUND_NUMBER() {
        return ROUND_NUMBER;
    }

    public int getTRYS_NUMBER() {
        return TRYS_NUMBER;
    }
    public static Datos getInstance(Datos instance){
        if(instance == null){
            instance=new Datos(randomNumber, choiceNumber, successNumber, failuresNumber, actualRound);
        }
        return instance;
    }

}
