package Cards;

import java.util.ArrayList;

public class CardService {

    public static ArrayList<VisaCard> cards = new ArrayList<>();

    public static void displayCards() {



        System.out.println("List of cards: \n");
        for (VisaCard card : cards) {
            System.out.println(card.toString());
        }
    }

    public static VisaCard getCardById(int id) {
        for (VisaCard card : cards) {
            if (card.getID() == id) {
                return card;
            }
        }
        return null;
    }

    public static VisaCard getCard(String number, String pin) {
        for (VisaCard card : cards) {
            if (card.getCardNumber().equals(number) && card.getPin().equals(pin)) {
                return card;
            }
        }
        return null;
    }




    public static ArrayList<VisaCard> addCard(VisaCard card) {

        cards.add(card);
        return cards;
    }



    public static void deleteCard(VisaCard card) {
        cards.remove(card);

    }
}
