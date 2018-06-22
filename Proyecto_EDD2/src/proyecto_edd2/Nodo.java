package proyecto_edd2;

import java.util.ArrayList;

public class Nodo {

    private ArrayList<Registro> llaves;
    private ArrayList<Nodo> hijos;
    private Nodo padre;

    public Nodo(Nodo father) {
        llaves = new ArrayList();
        hijos = new ArrayList();
        this.padre = father;
    }

    public Nodo insert(Registro registro, int orden) {
        Nodo searchedNode = search(registro);
        searchedNode.forceInsert(registro, orden);
        if (this.padre != null) {
            return this.padre;
        }
        return this;
    }

    private void forceInsert(Registro registro, int orden) {
        this.llaves.add(registro);
        Registro temp;
        for (int i = 0; i < this.llaves.size(); i++) {
            for (int j = 1; j < this.llaves.size() - i; j++) {
                if (this.llaves.get(j - 1).llave > this.llaves.get(j).llave) {
                    temp = this.llaves.get(j - 1);
                    this.llaves.set(j - 1, this.llaves.get(j));
                    this.llaves.set(j, temp);
                }
            }
        }
        if (!this.isValid(orden)) {
            Nodo newNodo = this.split(orden);
            if (this.padre == null) {
                int index = orden / 2;
                if (orden % 2 == 0) {
                    index--;
                }
                Nodo h1 = newNodo.hijos.get(0);
                Nodo h2 = newNodo.hijos.get(1);
                for (int i = 0; i <= index && !this.hijos.isEmpty(); i++) {
                    h1.addChild(this.hijos.get(i));
                }
                for (int i = index + 1; i < this.hijos.size() && !this.hijos.isEmpty(); i++) {
                    h2.addChild(this.hijos.get(i));
                }
                this.padre = newNodo;
                this.hijos = newNodo.hijos;
                this.llaves = newNodo.llaves;
            } else {
                Nodo h1 = newNodo.hijos.get(0);
                Nodo h2 = newNodo.hijos.get(1);
                h1.padre = this.padre;
                h2.padre = this.padre;
                this.padre.replaceChilds(this, h1, h2, orden);
                this.padre.forceInsert(newNodo.llaves.get(0), orden);
            }
        }
    }

    private Nodo split(int orden) {
        int index = orden / 2;
        if (orden % 2 == 0) {
            index--;
        }
        Nodo padreTemp = new Nodo(null);
        padreTemp.llaves.add(this.llaves.get(index));
        Nodo hijo1 = new Nodo(padreTemp);
        Nodo hijo2 = new Nodo(padreTemp);
        for (int i = 0; i < index; i++) {
            hijo1.llaves.add(this.llaves.get(i));
        }
        for (int i = index + 1; i < this.getLlaves().size(); i++) {
            hijo2.llaves.add(this.llaves.get(i));
        }
        padreTemp.addChild(hijo1);
        padreTemp.addChild(hijo2);
        return padreTemp;
    }

    public ArrayList<Registro> getLlaves() {
        return llaves;
    }

    public boolean isValid(int orden) {
        return llaves.size() < orden;
    }

    @Override
    public String toString() {
        return "{" + "llaves:" + llaves + ", hijos:" + hijos + '}';
    }

    void addChild(Nodo hijo) {
        hijos.add(hijo);
        hijo.padre = this;
    }

    private Nodo search(Registro registro) {
        if (this.hijos.isEmpty()) {
            return this;
        }
        int index = searchNodeIndex(registro);
        return hijos.get(index).search(registro);
    }
    
    public Registro searchOff(Registro registro){
        Nodo buscado = search(registro);
        for (int i = 0; i < buscado.llaves.size(); i++) {
            if(buscado.llaves.get(i).llave == registro.llave){
                return buscado.llaves.get(i);
            }
        }
        return null;
    }

    private int searchNodeIndex(Registro registro) {
        for (int i = 0; i < llaves.size(); i++) {
            if (registro.llave < llaves.get(i).llave) {
                return i;
            }
        }
        return llaves.size();
    }

    private void replaceChilds(Nodo node, Nodo child1, Nodo child2, int orden) {
        int index = orden / 2;
        if (orden % 2 == 0) {
            index--;
        }
        for (int i = 0; i <= 1 && !node.hijos.isEmpty(); i++) {
            child1.addChild(node.hijos.get(i));
        }
        for (int i = 1 + 1; i < node.hijos.size() && !node.hijos.isEmpty(); i++) {
            child2.addChild(node.hijos.get(i));
        }
        index = hijos.indexOf(node);
        child1.padre = this;
        child2.padre = this;
        hijos.set(index, child1);
        hijos.add(index + 1, child2);
    }
}
