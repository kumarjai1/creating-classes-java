public class Animal {
    private int numLegs;
    private int topSpeed;
    private boolean isEndangered;
    private String name;

    //constructor name has to be the class name  - to create an object of the class
    public Animal(int numLegs, int topSpeed, boolean isEndangered, String name){
        //Set properties here
        this.numLegs = numLegs; //using this because this refers to the class scope variable, which is the instance
        this.topSpeed = topSpeed;
        this.isEndangered = isEndangered;
        this.name = name;
    }

    //Put getters and setters here
    public int getNumLegs(){
        return numLegs;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public boolean getIsEndangered () {
        return isEndangered;
    }

    public String getName() {
        return name;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setIsEndangered (boolean bool) {
        this.isEndangered = isEndangered;
    }

    public void setName (String name) {
        this.name = name;
    }



}
