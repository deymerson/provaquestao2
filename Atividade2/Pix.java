package br.com.Atividade2;

public class Pix extends Pagamento  {
    private static final String getvalorPago = null;
    private boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public Pix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }
    
    public String imprimirCupom(){
        return "Data-Horas:"+ getDataHoraPagamento()+ " - Numero de deposito"+getNumeroPagamento()+ " - Valor:"+ getvalorPago +" - Sucesso :)";
      }
    
}
