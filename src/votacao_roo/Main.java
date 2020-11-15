package votacao_roo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Prefeito> prefeitos = new ArrayList<>();
        ArrayList<Vereador> vereadores = new ArrayList<>();
        int p1 = 0, p2 = 0, p3 = 0, p4 = 0;
        int v1 = 0, v2 = 0, v3 = 0, v4 = 0;

        boolean rodando = true;

        while (rodando) {

            System.out.println("=========| VOTAÇÃO 2020 |=======");
            System.out.println("[1] -         VOTAR            ");
            System.out.println("[2] -  RESULTADO DA VOTAÇÃO    ");
            System.out.println("================================");
            System.out.print("Informe opcao: ");
            int op = Integer.parseInt(scan.nextLine());
            if (op != 1 && op != 2) {
                System.out.println("OPÇÃO DE MENU INVALIDA!TENTE NOVAMENTE");
            } else {

                switch (op) {
                    case 1: {
                        System.out.println("==========| CANDIDATOS A PREFEITO |============");
                        System.out.println("= [13]-> Kleber Amorim | [77] -> Zé do Pátio  =");
                        System.out.println("= [10]-> Luizão        | [25] -> Thiago Muniz =");
                        System.out.println("===============================================");
                        System.out.print("Informe numero para prefeito: ");
                        int candidatop = Integer.parseInt(scan.nextLine());
                        switch (candidatop) {
                            case 13: {
                                p1++;
                                break;
                            }
                            case 10: {
                                p2++;
                                break;
                            }
                            case 77: {
                                p3++;
                                break;
                            }
                            case 25: {
                                p4++;
                                break;
                            }
                        }
                        Prefeito p = new Prefeito();
                        p.setCandidatop(candidatop);

                        prefeitos.add(p);

                        System.out.println("==========| CANDIDATOS A VEREADOR |============");
                        System.out.println("= [13110]-> Antonio   |   [77100] -> Osvaldo  =");
                        System.out.println("= [10220]-> Luciana   |   [25999] -> Falcao   =");
                        System.out.println("===============================================");
                        System.out.print("Informe numero para Vereador: ");
                        int candidatov = Integer.parseInt(scan.nextLine());
                        switch (candidatov) {
                            case 13110: {
                                v1++;
                                break;
                            }
                            case 10220: {
                                v2++;
                                break;
                            }
                            case 77100: {
                                v3++;
                                break;
                            }
                            case 25999: {
                                v4++;
                                break;
                            }
                        }
                        System.out.println("\n");
                        System.out.println("SEU VOTO FOI COMPUTADO!");
                        System.out.println("\n");
                        Vereador v = new Vereador();
                        v.setCandidatov(candidatov);

                        vereadores.add(v);

                        break;
                    }

                    case 2: {
                        if (prefeitos.isEmpty() || vereadores.isEmpty()) {
                            System.out.println("NENHUM VOTO REGISTRADO!");
                        } else {
                            System.out.println("=====| RESULTADO VOTAÇÃO 2020 |===");
                            System.out.println("=============PREFEITO==============");
                            if (p1 > p2 && p1 > p3 && p1 > p4) {
                                System.out.println("Kleber Amorim eleito com " + p1 + " votos");
                            } else if (p2 > p1 && p2 > p3 && p2 > p4) {
                                System.out.println("Luizão eleito com " + p2 + " votos");
                            } else if (p3 > p1 && p3 > p2 && p3 > p4) {
                                System.out.println("Zé do Pátio eleito com " + p3 + " votos");
                            } else if (p4 > p1 && p4 > p2 && p4 > p3) {
                                System.out.println("Thiago Muniz eleito com " + p4 + " votos");
                            }

                            System.out.println("=============VEREADOR==============");
                            if (v1 > v2 && v1 > v3 && v1 > v4) {
                                System.out.println("Antonio eleito com " + v1 + " votos");
                            } else if (v2 > v1 && v2 > v3 && v2 > v4) {
                                System.out.println("Luciana  eleito com " + v2 + " votos");
                            } else if (v3 > v1 && v3 > v2 && v3 > v4) {
                                System.out.println("Osvaldo eleito com " + v3 + " votos");
                            } else if (v4 > v1 && v4 > v2 && v4 > v3) {
                                System.out.println("Falcao eleito com " + v4 + " votos");
                            }

                        }
                        rodando = false;

                    }

                }

            }
        }
    }

}
