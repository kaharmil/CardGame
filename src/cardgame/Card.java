/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

/**
 *
 * @author harmilan
 */
public class Card {
    
    private int numbers; 
    private String suit;
    
    public static final String[] SUITS = {"diamonds","spades","clubs","hearts"};
    public int getValue() {
        return numbers;
    }

   
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    
    public String getSuit() {
        return suit;
    }

    
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public Card(int numbers, String suit) {
        this.numbers = numbers;
        this.suit = suit;
    }
   
    
}


