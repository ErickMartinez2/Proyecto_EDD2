package proyecto_edd2;

public class Registro {
    
    public int llave;
    public int offset;
    public int size;

    public Registro(int llave, int offset, int size) {
        this.llave = llave;
        this.offset = offset;
        this.size = size;
    }

    public Registro(int llave) {
        this.llave = llave;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLlave() {
        return llave;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return llave + "";
    }
    
    public String toString2() {
        return llave + ";" + offset + ";" + size + ";";
    }
}