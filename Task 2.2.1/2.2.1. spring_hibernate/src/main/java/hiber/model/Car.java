package hiber.model;

import javax.persistence.*;

@Entity
@Table (name = "Cars")
public class Car {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "model_car")
    private String model;
    @Column (name = "serial_car")
    private int series;

    @OneToOne (mappedBy = "userCar")
    private User user;



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car() {

    }
}