package be.intecbrussel.eatables;

public class Magnum implements Eatable{
    private MagnumType type;

    public Magnum () {

    }

    public Magnum (MagnumType type) {
        this.type = type;
    }

    @Override
    public void eat () {
        System.out.println("you are now eating a " + this.type + " Magnum");
    }

    public MagnumType getType () {
        return this.type;
    }
}
