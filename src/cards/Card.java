package cards;

public class Card
{
	public final static int SPADES = 0;   // Codes for the 4 suits, plus Joker.
	public final static int HEARTS = 1;
	public final static int DIAMONDS = 2;
	public final static int CLUBS = 3;

	public final static int ACE = 1;      // Codes for the non-numeric cards.
	public final static int JACK = 11;    // Cards 2 through 10 have their
	public final static int QUEEN = 12;   // numerical values for their codes.
	public final static int KING = 13;

	private final int suite;
	private final int value;

	private final Card[] protoDeck = new Card[52];

	public Card(int suite, int value)
	{
		this.suite = suite;
		this.value = value;

		createProtoDeck();
	}

	public int getSuite()
	{
		return suite;
	}

	public int getValue()
	{
		return value;
	}

	private void createProtoDeck()
	{
		for (int i = 0; i < 4; i++)
		{
			for (int j = 1; j < 14; j++)
			{
				protoDeck[i * 13 + (j - 1)] = new Card(i, j);
			}
		}
	}

	public Card[] createNewDeck()
	{
		final Card[] deck = new Card[52];

		for (int i = 0; i < 52; i++)
		{
			deck[i] = protoDeck[i];
		}

		return deck;
	}
}
