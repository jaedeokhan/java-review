package coding._02_Generic;

public class GenericBox<E> { // 가상 클래스 E를 사용, 실제로 존재하는 클래스는 아니다.
    private E obj;

    public void setObj(E obj){
        this.obj = obj;
    }

    public E getObj(){
        return obj;
    }
}
