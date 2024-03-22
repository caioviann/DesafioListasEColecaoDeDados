package henrique.caio.compras.cartao;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private int limite;
    private int saldo;
    private List<Compra> compras;

    public CartaoDeCredito(int limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if(this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }else {
            return false;
        }
    }

    public int getLimite() {
        return limite;
    }

    public int getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
