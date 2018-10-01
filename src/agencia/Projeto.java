
package agencia;

public class Projeto {
    private String codigo;
    private String titulo;
    private String duracao;
    private String orcamento;
    private String instituicao;
    
    
    public Projeto(){
    }

    public Projeto(String codigo, String titulo, String duracao, String orcamento, String instituicao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracao = duracao;
        this.orcamento = orcamento;
        this.instituicao = instituicao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public String toString() {
        return titulo + "," + " " + duracao + "," + " " + orcamento + "," + " " + instituicao;
    }

    
    
}
