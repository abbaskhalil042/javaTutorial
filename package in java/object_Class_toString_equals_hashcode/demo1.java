// package object_Class_toString_equals_hashcode;

class Laptop {
    String model;
    int price;

    public String toString() {
        return model + " : " + price;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}

public class demo1 {
    public static void main(String[] args) {

        Laptop obj1 = new Laptop();
        obj1.model = "lenovo";
        obj1.price = 50000;

        Laptop obj2 = new Laptop();
        obj2.model = "lenovo";
        obj2.price = 50000;

        // System.out.println(obj.toString());// even if you don't mentioned it calls
        // toString method. OR

        // boolean resutl=obj1==obj2; OR
        boolean resutl = obj1.equals(obj2);
        System.out.println(resutl);// false

        // this is how we work with object class method
        // even if you don't mentioned it will be coming or called automatically by the
        // obj of class
    }

}
