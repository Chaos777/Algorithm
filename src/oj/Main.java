package oj;

import java.util.Scanner;
class Node {
        int distance ;
        int cost ;
        public Node(){
                distance = 100000000;
                cost = 100000000;
        }
}

class MGraph {
        int vertexNum ;
        int edgeNum ;
        Node [][] edges  ;
}

class Dijkstra {
        public void dijkstra(MGraph g,int v,int dist[],int path[],int cost[]){
                int set[] = new int [dist.length];
                int min=0,i=0,j=0,u=0;
                int INF = 1000000000;
                for(i = 1 ; i <=g.vertexNum ; i++){
                        dist[i] = g.edges[v][i].distance;
                        cost[i] = g.edges[v][i].cost;
                        set[i] = 0 ; 
                        if(g.edges[v][i].distance < INF){
                                path[i] = v;
                        }else{
                                path[i]=-1;
                        }
                }
                cost[v] = 0;
                set[v] = 1;
                path[v] = -1;
                for(i = 1 ; i <= g.vertexNum ; i++){
                        min = INF;
                        Node firstNode = new Node();
                        for(j = 1 ; j <=g.vertexNum ;j++ ){
                                if(set[j]==0&&dist[j]<=min){
                                        if(dist[j]==min&& cost[j] < firstNode.cost){
                                                u = j ;
                                                min = dist[j];
                                                firstNode = g.edges[v][j];
                                        }else if(dist[j] < min){
                                                u = j;
                                                min = dist[j];
                                                firstNode = g.edges[v][j];
                                        }
                                        
                                }
                        }
                        set[u] = 1;
                        for(j = 1 ; j <=g.vertexNum ; j++){
                                if(set[j]==0&&dist[j]>=dist[u]+g.edges[u][j].distance){
                                        if(dist[j] == dist[u]+g.edges[u][j].distance && cost[j] > cost[u]+g.edges[u][j].cost){
                                                dist[j] = dist[u]+g.edges[u][j].distance;
                                                path[j] = u;
                                                cost[j] = cost[u] + g.edges[u][j].cost;
                                        }else if(dist[j] > dist[u]+g.edges[u][j].distance){
                                                dist[j] = dist[u]+g.edges[u][j].distance;
                                                path[j] = u;
                                                cost[j] = cost[u] + g.edges[u][j].cost;
                                        }
                                        
                                }
                        }
                }
        }
        public void printPath(int [] path ,int a){
                int top=-1;
                int stack[] = new int[path.length];
                while(path[a]!=-1){
                        stack[++top] = a;
                        a =path[a];
                }
                stack[++top] = a;
                while(top!=-1){
                        System.out.print(stack[top--]);
                }
                System.out.println();
        }
}


public class Main{
        public static void main(String [] args){
                Scanner in = new Scanner(System.in);
                while(in.hasNext()){
                        MGraph graph = new MGraph();
                        int vertexNum = in.nextInt();
                        int edgeNum = in.nextInt();
                        if(vertexNum==0&&edgeNum==0){
                                break;
                        }
                        graph.vertexNum =vertexNum;
                        graph.edgeNum = edgeNum;
                        int INF = 0;
                        graph.edges  = new Node [vertexNum+1][vertexNum+1];
                        for(int i = 1 ; i <= vertexNum ;i++){
                                for(int j = 1 ; j <= vertexNum ; j++){
                                        graph.edges[i][j] = new Node();
                                }
                        }
                        for(int i = 0 ; i < edgeNum ; i++){
                                int previousVertexNum = in.nextInt();
                                int lastVertexNum = in.nextInt();
                                int distance = in.nextInt();
                                int cost = in.nextInt();
                                Node node = new Node();
                                node.distance = distance;
                                node.cost = cost;
                                graph.edges[previousVertexNum][lastVertexNum] = node;
                        }
                        int startNodeNum =in.nextInt();
                        int endNodeNum = in.nextInt();
                        int [] dist = new int[vertexNum+1];
                        int [] path = new int[vertexNum+1];
                        int [] cost = new int[vertexNum+1];
                        Dijkstra dij = new Dijkstra();
                        dij.dijkstra(graph, startNodeNum, dist, path,cost);
                        System.out.println(dist[endNodeNum]+" "+cost[endNodeNum]);
                        
                        
                }
                
        }
}