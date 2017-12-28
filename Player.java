

public class Player
{

 
    private Hand playerHand;
    private double fundsbalance;
    private double currentBet;
    
    
    public Player(double balance)
    {
        playerHand = new Hand();
        fundsbalance = balance;
        currentBet = 0;
    }

    public void deal(Card c)
    {
        playerHand.addCard(c);
    }

   
    public Card[] discard()
    {
        Card[] card = new Card[0];
        return card;
    }

  
    public double wager(double minimum)
    {
    		if (minimum == 0)
    		{
    			return 0;
    		}
        return -1.0;
    }

    //Returns this player's hand
    public Hand showHand()
    {
        playerHand.printHand();
        return playerHand;
    }

    //Returns this player's current balance
    public double getBalance()
    {
        return fundsbalance;
    }
    
    public double getCurrentBet()
    {
        return currentBet;
    }

    //Increase player's balance by the amount specified in the parameter,
    //then reset player's hand in preparation for next round. Amount will
    //be 0 if player has lost hand
    public void winnings(double amount)
    {
        fundsbalance += amount;
        currentBet = 0;
        playerHand.clear();
    }

}