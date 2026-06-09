class graph:
    def __init__(self,vno):
        self.vertex_count=vno
        self.adj_matrix=[[0]*vno for e in range(vno)]


    def add_edge(self,u,v,weight=1):
        if 0<=u<self.vertex_count and 0<=v<self.vertex_count:
            self.adj_matrix[u][v]=weight
            self.adj_matrix[v][u]=weight
        else:
            print("Invalid vertex")

    def remove_add(self,u,v):
        if 0<=u<self.vertex_count and 0<=v<self.vertex_count:
            self.adj_matrix[u][v]=0
            self.adj_matrix[v][u]=0
        else:
            print("Invalid Vertex")

    def has_edge(self,u,v):
        if 0<=v<self.adj_matrix and 0<=u<self.adj_matrix:
            return self.adj_matrix[u][v]!=0
        else:
            print("Invalid Vertex")

    def print_adj_matrix(self):
        for row_list in self.adj_matrix:
            print(" ".join(map(str,row_list)))

#implementing BFS in graph
    def BFS(self,start):#here we have to give staring index from where we have to start
        from collections import deque   
        visited=[False]*self.vertex_count  #ceates a visited =[False,False,False ]
        queue=deque([start])
        visited[start]=True
        while queue:
            node=queue.popleft()
            for n,_ in self.GList[node]:
                if not visited[n]:
                    visited[n]=True
                    queue.append(n)

G1=graph(5)
G1.add_edge(0,1)
G1.add_edge(3,0)
G1.add_edge(2,4)
G1.add_edge(3,2)
G1.add_edge(4,4)
G1.print_adj_matrix()



        