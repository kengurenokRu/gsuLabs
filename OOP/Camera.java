package OOP;

import java.util.Objects;

public class Camera extends phototechnique {
    private String typeCamera;
    private String sizeMatrix;
    private String typeMatrix;
    private double countMatrixPoint;

    Camera() {
        super("D3100", 2010, Manufacturer.Китай);
        this.countMatrixPoint = 14.2;
        this.sizeMatrix = "1.5 crop";
        this.typeMatrix = "CMOS";
        this.typeCamera = "Зеркальная";

    }

    Camera(String typeCamera, String sizeMatrix, String typeMatrix, double countMatrixPoint, String model, int releaseYear, Manufacturer manufacturer) {
        super(model, releaseYear, manufacturer);
        this.countMatrixPoint = countMatrixPoint;
        this.sizeMatrix = sizeMatrix;
        this.typeMatrix = typeMatrix;
        this.typeCamera = typeCamera;
    }

    public double getCountMatrixPoint() {
        return countMatrixPoint;
    }

    public void setCountMatrixPoint(double countMatrixPoint) {
        this.countMatrixPoint = countMatrixPoint;
    }

    public String getSizeMatrix() {
        return sizeMatrix;
    }

    public void setSizeMatrix(String sizeMatrix) {
        this.sizeMatrix = sizeMatrix;
    }

    public String getTypeMatrix() {
        return typeMatrix;
    }

    public void setTypeMatrix(String typeMatrix) {
        this.typeMatrix = typeMatrix;
    }

    public String getTypeCamera() {
        return typeCamera;
    }

    public void setTypeCamera(String typeCamera) {
        this.typeCamera = typeCamera;
    }

    public String toString() {
        return "Фотоаппарат:" + super.toString() +
                "\tТип камеры: " + typeCamera +
                "\tРазмер матрицы: " + sizeMatrix +
                "\tТип матрицы: " + typeMatrix +
                "\tКоличество мегапикселей: " + countMatrixPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }
        if (!super.equals(o))
            return false;

        Camera that = (Camera) o;
        if ((this.typeMatrix.equals(that.typeMatrix)) && (this.countMatrixPoint == that.countMatrixPoint) &&
                (this.sizeMatrix.equals(that.sizeMatrix)) && (this.typeCamera.equals(that.typeCamera))) {
            return true;
        } else {
            return false;
        }
    }


}
