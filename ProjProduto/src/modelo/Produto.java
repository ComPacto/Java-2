package modelo;

/**
 *
 * @author Müller Gonçalves
 * @since 24/04/2018 - 15:37
 * @version 1.0
 */
public class Produto {

    private String nomeProduto;
    private String serialProduto;
    private int anoLancamento;

    public Produto() {
    }

    public Produto(String nomeProduto, String serialProduto, int anoLancamento) {
        this.nomeProduto = nomeProduto;
        this.serialProduto = serialProduto;
        this.anoLancamento = anoLancamento;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getSerialProduto() {
        return serialProduto;
    }

    public void setSerialProduto(String serialProduto) {
        this.serialProduto = serialProduto;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Nome produto: " + nomeProduto + "\n"
                + "Serial do produto: " + serialProduto + "\n"
                + "Ano de lançamento: " + anoLancamento;
    }

}
