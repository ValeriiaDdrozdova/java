public class CreditCard
{
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newOwner, Money newCredLimit)
    {
        owner = newOwner;
        balance = new Money(0);
        creditLimit = new Money(newCredLimit);
    }

    public Money getBalance()
    {
        return new Money(balance);
    }

    public Money getCreditLimit()
    {
        return new Money(creditLimit);
    }

    public String getPersonals()
    {
        return owner.toString();
    }

    public void charge(Money amount)
    {
        Money newBalance = new Money(balance.add(amount));

        if(newBalance.compareTo(creditLimit) > 0)
        {
            System.out.println("Exceeds credit limit");
        }
        else {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        }

    }

    public void payment(Money amount)
    {
        balance = balance.subtract(amount);
        System.out.println("Paymet: " + amount);
    }
}
