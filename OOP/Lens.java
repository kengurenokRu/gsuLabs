package OOP;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Objects;

public class Lens extends phototechnique {
    private String bayonet;  //тип байонета
    private Autofokcus autofokcus;
    private double minimalFocalLength; //минимальное фокусное расстояние
    private double apeture; //светосила объектива
    private int minimalDiafragm; //минимальное значние диафрагмы

    Lens() {
        super("AF-P DX Nikkor 70-300 f/4.5-6.3G ED VR", 2018, Manufacturer.Китай);
        this.bayonet = "Nikon F";
        this.minimalFocalLength = 1.1;
        this.minimalDiafragm = 32;
        this.apeture = 4.5;
        this.autofokcus = Autofokcus.да;
    }

    Lens(String bayonet, double minimalFocalLength, int minimalDiafragm, double apeture, String model,
         int releaseYear, Manufacturer manufacturer, Autofokcus autofokcus) {
        super(model, releaseYear, manufacturer);
        this.bayonet = bayonet;
        this.minimalFocalLength = minimalFocalLength;
        this.minimalDiafragm = minimalDiafragm;
        this.apeture = apeture;
        this.autofokcus = autofokcus;
    }

    public String getBayonet() {
        return bayonet;
    }

    public void setBayonet(String bayonet) {
        this.bayonet = bayonet;
    }

    public double getMinimalFocalLength() {
        return minimalFocalLength;
    }

    public void setMinimalFocalLength(double minimalFocalLength) {
        this.minimalFocalLength = minimalFocalLength;
    }

    public int getMinimalDiafragm() {
        return minimalDiafragm;
    }

    public void setMinimalDiafragm(int minimalDiafragm) {
        this.minimalDiafragm = minimalDiafragm;
    }

    public double getApeture() {
        return apeture;
    }

    public void setApeture(double apeture) {
        this.apeture = apeture;
    }

    public void setAutofokcus(Autofokcus autofokcus) {
        this.autofokcus = autofokcus;
    }

    public Autofokcus getAutofokcus() {
        return autofokcus;
    }

    @Override
    public String toString() {
        return "Объектив:" + super.toString() +
                "\tТип байонета: " + bayonet +
                "\tМинимальное фокусное растояние: " + minimalFocalLength +
                "\tМинимальное значение диафрагмы: " + minimalDiafragm +
                "\tСветосила объектива: " + apeture +
                "\tАвтофокус:" + autofokcus;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((this == null) || (getClass() != o.getClass())) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Lens that = (Lens) o;

        if ((this.bayonet.equals(that.bayonet)) && (this.minimalFocalLength == that.minimalFocalLength) && (this.minimalDiafragm == that.minimalDiafragm) &&
                (this.apeture == that.apeture) && (this.autofokcus == that.autofokcus)) {
            return true;
        } else {
            return false;
        }
    }
}
