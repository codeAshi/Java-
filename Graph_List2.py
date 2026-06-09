from collections import deque
class Graph:
    def __init__(self,vno):
        self.vertex=vno
        self.GList=[[]for _ in range (vno)]

    def add_edge(self,v,n,weight=1):
        self.GList[v].append((n,weight))
        self.GList[n].append((v,weight))

    def Print_GList(self):
        for i in self.GList:
            print(i)

    def Remove(self,v,n,weight=1):
        self.GList[v].remove((n,weight))
        self.GList[n].remove((v,weight))

    def BFS(self,start):
        visited=[False]*self.vertex
        q=deque([start])
        visited[start]=True

        while q:
            node=q.popleft()
            print(node,end=" ")
            for neighbors, _ in self.GList[node]:
                if not visited[neighbors]:
                    visited[neighbors]=True
                    q.append(neighbors)


G5=Graph(4)
G5.add_edge(1,3)
G5.Print_GList()
G5.BFS(1)
G5.Remove(1,3)
G5.Print_GList()
G5.BFS(0)