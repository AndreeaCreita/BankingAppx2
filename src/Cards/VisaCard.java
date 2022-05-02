package Cards;

import java.util.Calendar;
import java.util.Random;

public class VisaCard {
    private static int nrCards = 0;
    private int ID;
    private String  cardNumber;
    private Calendar createDate;
    private Calendar expirationDate;
    private String pin;
    private String CVV2;
    private Integer idAccount;
    private Random random = new Random(System.currentTimeMillis());

    public VisaCard(int ID, String cardNumber, Calendar createDate, Calendar expirationDate, String pin, String CVV2, Integer idAccount, Random random) {
        this.ID = ID;
        this.cardNumber = cardNumber;
        this.createDate = createDate;
        this.expirationDate = expirationDate;
        this.pin = pin;
        this.CVV2 = CVV2;
        this.idAccount = idAccount;
        this.random = random;
    }

    public static int getNrCards() {
        return nrCards;
    }

    public static void setNrCards(int nrCards) {
        VisaCard.nrCards = nrCards;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Calendar getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Calendar createDate) {
        this.createDate = createDate;
    }

    public Calendar getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCVV2() {
        return CVV2;
    }

    public void setCVV2(String CVV2) {
        this.CVV2 = CVV2;
    }

    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
