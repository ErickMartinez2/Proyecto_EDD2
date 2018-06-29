package proyecto_edd2;

public class Posicion {
    
    public int offset;
    public int size;

    public Posicion(int offset, int size) {
        this.offset = offset;
        this.size = size;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Posicion{" + "offset=" + offset + ", size=" + size + '}';
    }
    
    
}
