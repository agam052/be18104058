import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer V = input.nextInt();
        Integer E = input.nextInt();
        
        Integer[][] edges = new Integer[E][3];
        for(int i=0; i<E; i++) {
            edges[i][0] = input.nextInt();
            edges[i][1] = input.nextInt();
            edges[i][2] = input.nextInt();
        }

        Integer[] dist = new Integer[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        Integer src = input.nextInt();
        Integer dst = input.nextInt();
        dist[src] = 0;

        for(int i=0; i<V-1; i++) {
            for(int j=0; j<E; j++) {
                Integer u = edges[j][0], v = edges[j][1], w = edges[j][2];
                if(dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w;
                } 
            }
        }

        for(int j=0; j<E; j++) {
            Integer u = edges[j][0], v = edges[j][1], w = edges[j][2];
            if(dist[v] > dist[u] + w || dist[v]<0) {
                //System.out.println(dist[v] + Integer.toString(v));
                dist[v] = -1;
            }
        }

        if(dist[dst]!=-1) {
            System.out.println(dist[dst]);
        }
        else {
            System.out.println("Negative cycle exists");
        }

        input.close();
    }
}