import java.util.List;

public class Pais {
    private Integer cdPais;
    private String dsPais;
    private String dsSigla;
    private List<Estado> estados;
    
    public Pais(Integer cdPais, String dsPais, String dsSigla) {
        this.cdPais = cdPais;
        this.dsPais = dsPais;
        this.dsSigla = dsSigla;
    }

    public Integer getCdPais() {
        return cdPais;
    }

    public void setCdPais(Integer cdPais) {
        this.cdPais = cdPais;
    }

    public String getDsPais() {
        return dsPais;
    }

    public void setDsPais(String dsPais) {
        this.dsPais = dsPais;
    }

    public String getDsSigla() {
        return dsSigla;
    }

    public void setDsSigla(String dsSigla) {
        this.dsSigla = dsSigla;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }
}
