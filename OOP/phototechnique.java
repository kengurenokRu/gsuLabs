package OOP;

import java.util.Objects;

public abstract class phototechnique {
    private String model;
    private Manufacturer manufacturer;
    private int releaseYear;

    phototechnique() {
        this.model = "Nikon";
        this.releaseYear = 2020;
        this.manufacturer = Manufacturer.Китай;
    }

    phototechnique(String model, int releaseYear, Manufacturer manufacturer) {
        this.model = model;
        this.releaseYear = releaseYear;
        this.manufacturer = manufacturer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String toString() {
        return "\tГод выпуска:" + releaseYear + ";\tСтрана выпуска: " + manufacturer + "\tМодель: " + model + ";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        phototechnique that = (phototechnique) o;
        if ((this.model.equals(that.model)) && (this.manufacturer == that.manufacturer) && (this.releaseYear == that.releaseYear)) {
            return true;
        } else {
            return false;
        }
    }
}