public class CEP {
    private Integer idCEP;
    private Long nrCEP;
    private String nmLogradouro;
    private String nmBairro;
    private String dsComplemento;
    private Long nrEnderecoCEP;
    private Municipio municipio;

    public CEP(Integer idCEP, Long nrCEP, String nmLogradouro, String nmBairro, String dsComplemento,
            Long nrEnderecoCEP, Municipio municipio) {
        this.idCEP = idCEP;
        this.nrCEP = nrCEP;
        this.nmLogradouro = nmLogradouro;
        this.nmBairro = nmBairro;
        this.dsComplemento = dsComplemento;
        this.nrEnderecoCEP = nrEnderecoCEP;
        this.municipio = municipio;
    }

    public Integer getIdCEP() {
        return idCEP;
    }

    public void setIdCEP(Integer idCEP) {
        this.idCEP = idCEP;
    }

    public Long getNrCEP() {
        return nrCEP;
    }

    public void setNrCEP(Long nrCEP) {
        this.nrCEP = nrCEP;
    }

    public String getNmLogradouro() {
        return nmLogradouro;
    }

    public void setNmLogradouro(String nmLogradouro) {
        this.nmLogradouro = nmLogradouro;
    }

    public String getNmBairro() {
        return nmBairro;
    }

    public void setNmBairro(String nmBairro) {
        this.nmBairro = nmBairro;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public Long getNrEnderecoCEP() {
        return nrEnderecoCEP;
    }

    public void setNrEnderecoCEP(Long nrEnderecoCEP) {
        this.nrEnderecoCEP = nrEnderecoCEP;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    
}
