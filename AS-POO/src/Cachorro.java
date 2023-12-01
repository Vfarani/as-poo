public class Cachorro extends Animal {
    public String nome;
}

    Cachorro(String nome) {
        this.nome = nome;
    }


@Override
public void fazerBarulho() {
    System.out.println("Au au au au");
}

@Override
public void andar() {
    System.out.println("Saindo do lugar");
}
