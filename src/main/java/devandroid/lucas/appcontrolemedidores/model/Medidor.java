package devandroid.lucas.appcontrolemedidores.model;

public class Medidor {

    private int id;
    private String numeroMedidor;
    private String numeroDaNota;
    private String endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroMedidor() {
        return numeroMedidor;
    }

    public void setNumeroMedidor(String numeroMedidor) {
        this.numeroMedidor = numeroMedidor;
    }

    public String getNumeroDaNota() {
        return numeroDaNota;
    }

    public void setNumeroDaNota(String numeroDaNota) {
        this.numeroDaNota = numeroDaNota;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
