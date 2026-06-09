class graph:
    def __init__(self,vertexNo):
        self.vertexCount=vertexNo
        self.adj_matrix=[[0]*vertexNo for e in range(vertexNo)]

    def add_vertex(self,u,v,weight=1):
        if 0<=v<self.vertexCount and 0<=u<self.vertexCount:
            self.adj_matrix[u][v]=weight
            self.adj_matrix[v][u]=weight
        

    def printAdj(self):
        for i in self.adj_matrix:
            print("  ".join(map(str,i)))


G2=graph(7)
G2.add_vertex(2,3)
G2.add_vertex(6,1)
G2.add_vertex(5,6)
G2.add_vertex(1,5)
G2.printAdj()

