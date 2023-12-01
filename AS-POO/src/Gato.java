public class Gato extends Animal {
    public String nome;
}

    Gato(String nome) {
        this.nome = nome;
    }


@Override
public void fazerBarulho() {
    System.out.println("miau miau");
}

@Override
public void andar() {
   System.out.println("Saindo do lugar");
}




