package decorator;

/**
 * 装饰物
 */
public abstract class PersonCloth extends Person{
    private Person person;

    public PersonCloth(Person person) {
        this.person = person;
    }

    @Override
    public void dressed() {
        person.dressed();
    }
}
