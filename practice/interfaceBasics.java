interface TemperatureMethods {
    public double CelsiusToFar();
    public double FarToCel();
}

class TempDefinition implements TemperatureMethods {
    double degree;

    TempDefinition(double degree) {
        this.degree = degree;
    }

    public double CelsiusToFar() {
        return (degree * 9 / 5) + 32;
    }

    public double FarToCel() {
        return (degree - 32 * 5 / 9);
    }
}

public class interfaceBasics {
    public static void main(String[] args) {
        TempDefinition td = new TempDefinition(15);
        System.out.println(td.CelsiusToFar());
        System.out.println(td.FarToCel());
    }
}
