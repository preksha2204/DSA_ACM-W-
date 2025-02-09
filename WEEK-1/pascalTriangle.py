from typing import *

def pascalTriangle(n: int) -> List[List[int]]:
    triangle=[[0]*(i+1)for i in range(n)]  

    for i in range(n):
        for j in range(i+1):
            if j==0 or j==i:
                triangle[i][j]=1  
            else:
                triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j]  
    return triangle
    pass