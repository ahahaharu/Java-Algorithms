package org.example;

import org.example.data.*;

public class NFA {
    private char[] re;// переходы соответствия
    private Digraph G;// e-переходы
    private int M;// колво состояний

    public NFA(String regexp) {
        Stack<Integer> ops = new Stack<>();
        re = regexp.toCharArray();
        M = re.length;
        G = new Digraph(M + 1);

        for (int i = 0; i < M; i++) {
            int lp = i;
            if (re[i] == '(' || re[i] == '|') {
                ops.push(i);
            } else if (re[i] == ')') {
                int or = ops.pop();
                if (re[or] == '|') {
                    lp = ops.pop();
                    G.addEdge(lp, or + 1);
                    G.addEdge(or, i);
                } else
                    lp = or;
            }
            if (i < M - 1 && re[i + 1] == '*') {
                G.addEdge(lp, i + 1);
                G.addEdge(i + 1, lp);
            } // заглядывание вперед
            if (re[i] == '(' || re[i] == '*' || re[i] == ')') {
                G.addEdge(i, i + 1);
            }
        }
    }

    public boolean recognizes(String txt) {
        Bag<Integer> pc = new Bag<>();
        DirectedDFS dfs = new DirectedDFS(G, 0);
        for (int v = 0; v < G.V(); v++) {
            if (dfs.marked(v)) {
                pc.add(v);
            }
        }
        for (int i = 0; i < txt.length(); i++) {
            Bag<Integer> match = new Bag<>();
            for (int v : pc) {
                if (v < M && (re[v] == txt.charAt(i) || re[v] == '.')) {
                    match.add(v + 1);
                }

                pc = new Bag<>();
                dfs = new DirectedDFS(G, match);
                for (v = 0; v < G.V(); v++) {
                    if (dfs.marked(v)) {
                        pc.add(v);
                    }
                }
            }
        }
        for (int v : pc) {
            if (v == M) {
                return true;
            }
        }
        return false;
    }
}
