package aula06.ex3;

public class Conjunto {
    private int[] conjunto;
    private int size;

    public Conjunto() {
        conjunto = new int[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public Conjunto(int size) {
        conjunto = new int[size];
        size = 0;
    }

    public void insert(int el) {
        if (size == conjunto.length) {
            int[] temp = new int[conjunto.length * 2];
            for (int i = 0; i < conjunto.length; i++) {
                temp[i] = conjunto[i];
            }
            conjunto = temp;
        }
        conjunto[size++] = el;
    }

    public void remove(int el) {
        for (int i = 0; i < size; i++) {
            if (conjunto[i] == el) {
                for (int j = i; j < size - 1; j++) {
                    conjunto[j] = conjunto[j + 1];
                }
                size--;
                return;
            }
        }
    }
    
    public boolean contains(int el) {
        for (int i = 0; i < size; i++) {
            if (conjunto[i] == el) {
                return true;
            }
        }
        return false;
    }

    public Conjunto unir(Conjunto c) {
        Conjunto temp = new Conjunto(size + c.size());
        for (int i = 0; i < size; i++) {
            temp.insert(conjunto[i]);
        }
        for (int i = 0; i < c.size(); i++) {
            temp.insert(c.conjunto[i]);
        }
        return temp;
    }

    public Conjunto interset(Conjunto c) {
        Conjunto temp = new Conjunto(size + c.size());
        for (int i = 0; i < size; i++) {
            if (c.contains(conjunto[i])) {
                temp.insert(conjunto[i]);
            }
        }
        return temp;
    }

    public Conjunto subtrair(Conjunto c) {
        Conjunto temp = new Conjunto(size + c.size());
        for (int i = 0; i < size; i++) {
            if (!c.contains(conjunto[i])) {
                temp.insert(conjunto[i]);
            }
        }
        return temp;
    }

    public void empty() {
        size = 0;
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < size; i++) {
            temp += conjunto[i] + " ";
        }
        return temp;
    }
    
}
