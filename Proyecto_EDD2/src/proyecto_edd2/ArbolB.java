package proyecto_edd2;

public class ArbolB {

    private final int orden;
    private Nodo raiz;

    public ArbolB(int orden) {
        this.orden = orden;
        this.raiz = new Nodo(null);
    }

    public void insert(Registro registro) {
        this.raiz = this.raiz.insert(registro, orden);
    }

    public Nodo getRaiz() {
        return raiz;
    }
    
    @Override
    public String toString() {
        return "{" + "orden:" + orden + ", raiz:" + raiz + '}';
    }
}
