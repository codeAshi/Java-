from collections import deque
class Graph:
    def __init__(self,vno):
        self.vertex=vno
        self.Glist=[[] for _ in range(vno)]

    def add_vertex(self,u,v,weight=1):
        self.Glist[u].append((v,weight))
        self.Glist[v].append((u,weight))
    def printing(self):
        for i in self.Glist:
            print(i)

    def BFS(self,start):
        visited=[False]*self.vertex
        q=deque([start])
        visited[start]=True
        while q:
            node=q.popleft()
            print(node,end=" ")
            for neighbors,_ in self.Glist[node]:
                if not visited[neighbors]:
                    visited[neighbors]=True
                    q.append(neighbors)

    def DFS(self,start):
        visited=[False]*self.vertex
        stack=[start]
        order=[]

        while stack:
            node=stack.pop()          
            if not visited[node]:
                    visited[node]=True
                    order.append(node)
                    print(node,end=" ")
                    for neighbors,_ in reversed(self.Glist[node]):
                        if not visited[neighbors]:
                            
                            stack.append(neighbors)

        return order
    
G6=Graph(6)
G6.add_vertex(0,1)
G6.add_vertex(1,2)
G6.add_vertex(2,4)
G6.add_vertex(2,5)
G6.printing()
print("\nBFS order : ")
G6.BFS(0)
print("\nDFS order : ")
G6.DFS(0)