class Graph:
    def __init__(self,VERTEX_NO):
        self.count=VERTEX_NO
        self.ADJ_VERTEX=[[0]*VERTEX_NO for e in range(VERTEX_NO)]

    def INSERT_VERTEX(self,u,v,weight=1):
        if 0<=v<self.count and 0<=u<self.count:
            self.ADJ_VERTEX[u][v]=weight
            self.ADJ_VERTEX[v][u]=weight

    def DELETE_VERTEX(self,u,v):
        if 0<=v<self.count and 0<=v<self.count:
            self.ADJ_VERTEX[u][v]=0
            self.ADJ_VERTEX[v][u]=0

    def HAS_EDGE(self,u,v):
        if 0<=u<self.count and 0<=v<self.count:
            if self.ADJ_VERTEX[u][v]!=1:
                print("No Such edge")
            else:
                print("hass edge")

    def PRINTING(self):
        for i in self.ADJ_VERTEX:
            print("  ".join(map(str,i)))

G5=Graph(4)
G5.INSERT_VERTEX(0,3)
G5.INSERT_VERTEX(1,2)
G5.INSERT_VERTEX(2,0)
G5.INSERT_VERTEX(0,0)

print("1 shows the vertex of graph")
G5.PRINTING()
print("After Deleting vertex")
G5.DELETE_VERTEX(1,2)
G5.PRINTING()

G5.HAS_EDGE(2,1)
