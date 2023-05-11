

public class Pilha implements TAD_Pilha {

    private int topo;	//Topo da Pilha
    private int MAX;	//Tamanho da Pilha
    private Object memo[];	//Elementos da Pilha (objeto genérico)

    //Método construtor que inicializa a Pilha no estado vazia
    public Pilha() {
        topo = -1;
        MAX = 30;
        memo = new Object[MAX];
    }

    //Método construtor que inicializa a Pilha com tamanho máximo desejado
    public Pilha(int qtde) {
        topo = -1;
        MAX = qtde;
        memo = new Object[MAX];
    }

    //Método que verifica se a Pilha está Vazia
    @Override
    public boolean isEmpty() {
        return (topo == -1);
    }

    //Método que verifica se a Pilha está cheia
    @Override
    public boolean isFull() {
        return (topo == MAX - 1);
    }

    //Método para inserir um valor na Pilha
    @Override
    public Object push(Object x) {
        if (!isFull()) {
            memo[++topo] = x;
            return x;
        } else {
            return null;
        }
    }

    //Método para retornar o conteúdo da Pilha
    @Override
    public String toString() {
        if (!isEmpty()) {
            String msg = "";
            for (int i = 0; i <= topo; i++) {
                msg += memo[i].toString();
                //if(i!=topo)msg += "\n";
            }
            return (msg);
        } else {
            return "\n Não existem mulheres";
        }
    }

    //Método para retornar o topo da Pilha e remove-lo
    @Override
    public Object pop() {
        if (!isEmpty()) {
            return memo[topo--];
        } else {
            return null;
        }
    }

    //Método que retorna o topo da pilha sem removê-lo
    @Override
    public Object top() {
        if (!isEmpty()) {
            return memo[topo];
        } else {
            return null;
        }
    }

}
