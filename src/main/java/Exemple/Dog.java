package Exemple;

public  class Dog implements Tamed {
    private String color;
    private String type;
    private int kg;
    public Dog() {
    }
    public Dog(String color, String type, int kg) {
        this.color = color;
        this.type = type;
        this.kg = kg;
    }
    public String getColor() {
        return color;
    }
    public String getType() {
        return type;
    }
    public int getKg() {
        return kg;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public void bark() {
        System.out.println("The dog just bark!");

    }

    @Override
    public void tame() {
        System.out.println("Started Tamed!");

    }
}
