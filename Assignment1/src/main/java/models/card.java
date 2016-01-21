package models;

/**
 * Created by Michael on 1/21/2016.
 */
public class card {

    private int suit;
    private int rank;

    public card(int suit, int rank){

        this.suit = suit;
        this.rank = rank;

    }

    public int getSuit(){
        return this.suit;
    }

    public int getRank(){
     return this.rank;
    }
}

