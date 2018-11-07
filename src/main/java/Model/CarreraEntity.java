package Model;

import javax.persistence.*;

@Entity
@Table(name = "CARRERA", schema = "SEMVG", catalog = "")
public class CarreraEntity {
    private long codCar;
    private String abrcar;
    private String nameCar;
    private String abrmod;
    private String modCar;
    private String yearCar;
    private String estCar;
    private String estcul;
    private Long hormod;

    @Id
    @Column(name = "COD_CAR")
    public long getCodCar() {
        return codCar;
    }

    public void setCodCar(long codCar) {
        this.codCar = codCar;
    }

    @Basic
    @Column(name = "ABRCAR")
    public String getAbrcar() {
        return abrcar;
    }

    public void setAbrcar(String abrcar) {
        this.abrcar = abrcar;
    }

    @Basic
    @Column(name = "NAME_CAR")
    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    @Basic
    @Column(name = "ABRMOD")
    public String getAbrmod() {
        return abrmod;
    }

    public void setAbrmod(String abrmod) {
        this.abrmod = abrmod;
    }

    @Basic
    @Column(name = "MOD_CAR")
    public String getModCar() {
        return modCar;
    }

    public void setModCar(String modCar) {
        this.modCar = modCar;
    }

    @Basic
    @Column(name = "YEAR_CAR")
    public String getYearCar() {
        return yearCar;
    }

    public void setYearCar(String yearCar) {
        this.yearCar = yearCar;
    }

    @Basic
    @Column(name = "EST_CAR")
    public String getEstCar() {
        return estCar;
    }

    public void setEstCar(String estCar) {
        this.estCar = estCar;
    }

    @Basic
    @Column(name = "ESTCUL")
    public String getEstcul() {
        return estcul;
    }

    public void setEstcul(String estcul) {
        this.estcul = estcul;
    }

    @Basic
    @Column(name = "HORMOD")
    public Long getHormod() {
        return hormod;
    }

    public void setHormod(Long hormod) {
        this.hormod = hormod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarreraEntity that = (CarreraEntity) o;

        if (codCar != that.codCar) return false;
        if (abrcar != null ? !abrcar.equals(that.abrcar) : that.abrcar != null) return false;
        if (nameCar != null ? !nameCar.equals(that.nameCar) : that.nameCar != null) return false;
        if (abrmod != null ? !abrmod.equals(that.abrmod) : that.abrmod != null) return false;
        if (modCar != null ? !modCar.equals(that.modCar) : that.modCar != null) return false;
        if (yearCar != null ? !yearCar.equals(that.yearCar) : that.yearCar != null) return false;
        if (estCar != null ? !estCar.equals(that.estCar) : that.estCar != null) return false;
        if (estcul != null ? !estcul.equals(that.estcul) : that.estcul != null) return false;
        if (hormod != null ? !hormod.equals(that.hormod) : that.hormod != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (codCar ^ (codCar >>> 32));
        result = 31 * result + (abrcar != null ? abrcar.hashCode() : 0);
        result = 31 * result + (nameCar != null ? nameCar.hashCode() : 0);
        result = 31 * result + (abrmod != null ? abrmod.hashCode() : 0);
        result = 31 * result + (modCar != null ? modCar.hashCode() : 0);
        result = 31 * result + (yearCar != null ? yearCar.hashCode() : 0);
        result = 31 * result + (estCar != null ? estCar.hashCode() : 0);
        result = 31 * result + (estcul != null ? estcul.hashCode() : 0);
        result = 31 * result + (hormod != null ? hormod.hashCode() : 0);
        return result;
    }
}
