public class Finery extends Person{

    protected Person person;

    public Finery() {
    }

    public void Decorator(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null)
            person.show();
    }
}
