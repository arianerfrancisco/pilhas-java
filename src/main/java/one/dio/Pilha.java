package one.dio;

public class Pilha {
    private No refNoEntradaPilha = null;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha= novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No top(){
        return  refNoEntradaPilha;
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }
}
