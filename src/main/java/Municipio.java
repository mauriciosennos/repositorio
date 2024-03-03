import java.util.List;

public class Municipio {
    private Integer idMunicipio;
    private String dsMunicipio;
    private Boolean inAtivo;
    private Integer idMunicipioIBGE;
    private Estado estado;
    private List<CEP> CEPs;
    
    public Municipio(Integer idMunicipio, String dsMunicipio, Boolean inAtivo, Integer idMunicipioIBGE, Estado estado) {
        this.idMunicipio = idMunicipio;
        this.dsMunicipio = dsMunicipio;
        this.inAtivo = inAtivo;
        this.idMunicipioIBGE = idMunicipioIBGE;
        this.estado = estado;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getDsMunicipio() {
        return dsMunicipio;
    }

    public void setDsMunicipio(String dsMunicipio) {
        this.dsMunicipio = dsMunicipio;
    }

    public Boolean getInAtivo() {
        return inAtivo;
    }

    public void setInAtivo(Boolean inAtivo) {
        this.inAtivo = inAtivo;
    }

    public Integer getIdMunicipioIBGE() {
        return idMunicipioIBGE;
    }

    public void setIdMunicipioIBGE(Integer idMunicipioIBGE) {
        this.idMunicipioIBGE = idMunicipioIBGE;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<CEP> getCEPs() {
        return CEPs;
    }

    public void setCEPs(List<CEP> cEPs) {
        CEPs = cEPs;
    }

    
}
