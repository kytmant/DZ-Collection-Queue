class Person {
    protected String name;
    protected String surname;
    protected int tickets;
    private String text;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    String message() {
        text = name + " " + surname + " прокатился на аттракционе";
        return text;
    }

    public boolean ticket() {
        if (tickets >= 1) {
            tickets -= 1;
            return true;
        }
        return false;
    }


}