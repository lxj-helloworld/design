package memento;

/**
 * 负责管理备忘录Memoto
 */
public class CareTaker {
    Memoto memoto;

    public Memoto getMemoto() {
        return memoto;
    }

    public void setMemoto(Memoto memoto) {
        this.memoto = memoto;
    }
}
