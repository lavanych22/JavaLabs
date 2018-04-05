package chemicalsupplystore;

public final class Customer {

    private String name;
    private String surname;
    private double availableAmountOfMoney;
    private int numberOfNecessaryGoods;

    public Customer(final String name, final String surname, final double availableAmountOfMoney, final int numberOfNecessaryGoods) {
        setName(name);
        setSurname(surname);
        setAvailableAmountOfMoney(availableAmountOfMoney);
        setNumberOfNecessaryGoods(numberOfNecessaryGoods);
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Surname = " + getSurname() + " Available Amount Of Money = "
                + getAvailableAmountOfMoney() + " Number Of Necessary Goods = " + getNumberOfNecessaryGoods();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public double getAvailableAmountOfMoney() {
        return availableAmountOfMoney;
    }

    public void setAvailableAmountOfMoney(final double availableAmountOfMoney) {
        this.availableAmountOfMoney = availableAmountOfMoney;
    }

    public int getNumberOfNecessaryGoods() {
        return numberOfNecessaryGoods;
    }

    public void setNumberOfNecessaryGoods(final int numberOfNecessaryGoods) {
        this.numberOfNecessaryGoods = numberOfNecessaryGoods;
    }


}
