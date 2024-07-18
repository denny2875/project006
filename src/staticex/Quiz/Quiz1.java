package staticex.Quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		Card card1 = new Card();
		card1.cardName = "신한";
		System.out.println(card1.cardName + "의 번호는" + card1.cardNumber + "입니다.");
		

		Card card2 = new Card();
		card1.cardName = "신한";
		System.out.println(card1.cardName + "의 번호는" + card1.cardNumber + "입니다.");
		

		Card card3 = new Card();
		card1.cardName = "신한";
		System.out.println(card1.cardName + "의 번호는" + card1.cardNumber + "입니다.");
		
		
		
		
	}

}

class Card{
	
	static int count = 0;
	int cardNumber = 100;
	String cardName;
	
	public Card() {
		count++;
		cardNumber = count;
		
	}
	
	
	
	
}
