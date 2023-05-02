package main;

import sp.fateczl.lucas.listaInt.Lista;

public class Principal {

    public static void main(String[] args) throws Exception {

        Lista listaA = new Lista();
        listaA.addFirst(3);
        listaA.addLast(5);
        listaA.addLast(8);
        listaA.addLast(12);
        listaA.addLast(9);
        listaA.addLast(7);
        listaA.addLast(16);

        Lista listaB = new Lista();
        listaB.addFirst(9);
        listaB.addLast(6);
        listaB.addLast(2);
        listaB.addLast(3);
        listaB.addLast(7);

       
        Lista listaI = new Lista();
        Lista listaU = new Lista();

        listaU.addAll(listaA);
  
        for (int i = 0; i < listaA.size(); i++) {
            if (listaB.contains(listaA, listaA.get(i))) {
                listaI.addFirst(listaA.get(i));
            }
        }

        for (int i = 0; i < listaB.size(); i++) {
            if (!listaU.contains(listaB, listaB.get(i))) {
                listaU.addFirst(listaB.get(i));
            }
        }

        System.out.println("Lista I: " + listaI);
        System.out.println("Lista U: " + listaU);

    }
}
