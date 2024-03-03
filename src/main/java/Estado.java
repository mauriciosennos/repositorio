import java.util.List;

public class Estado {
    private Integer idEstado;
    private Integer cdEstado;
    private String dsEstado;
    private Boolean inAtivo;
    private Pais pais;
    private List<Municipio> municipios;

    public Estado(Integer idEstado, Integer cdEstado, String dsEstado, Boolean inAtivo, Pais pais,
            List<Municipio> municipios) {
        this.idEstado = idEstado;
        this.cdEstado = cdEstado;
        this.dsEstado = dsEstado;
        this.inAtivo = inAtivo;
        this.pais = pais;
        this.municipios = municipios;
    }

    public Integer getIdEstado() {
        return idEstado;
    }
    
    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getCdEstado() {
        return cdEstado;
    }

    public void setCdEstado(Integer cdEstado) {
        this.cdEstado = cdEstado;
    }

    public String getDsEstado() {
        return dsEstado;
    }

    public void setDsEstado(String dsEstado) {
        this.dsEstado = dsEstado;
    }

    public Boolean getInAtivo() {
        return inAtivo;
    }

    public void setInAtivo(Boolean inAtivo) {
        this.inAtivo = inAtivo;
    }
    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Municipio> getMunicipios() {
        return municipios;
    }
    
    public void setMunicipios(List<Municipio> municipios) {
        this.municipios = municipios;
    }
    
}
