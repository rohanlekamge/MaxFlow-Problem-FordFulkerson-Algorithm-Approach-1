/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell-PC
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Graph {

	int MAXSIZE=51;
	int adj[][]=new int[MAXSIZE][MAXSIZE];
	int cf[][]=new int[MAXSIZE][MAXSIZE];

	int visited[]=new int [MAXSIZE];
	int n;
	
	Graph(int x)
	{
		n=x;
	}
	public Graph() {
		// TODO Auto-generated constructor stub
	}
	void createGraph()

	{
		int i,j,parent,adj_parent;
		int  ans=0,ans1=0;

		for ( i=1;i<=n;i++)
			for( j=1;j<=n;j++)
				{
					adj[i][j]=0;
				
					cf[i][j]=0;
				}


		/*All graph nodes are unvisited, hence assigned zero to visited field of each node */
		for (int c=1;c<=50;c++)
			visited[c]=0;
		System.out.println("\nEnter graph structure");

		do
		{
			System.out.print("\nEnter parent node :");
			parent=getNumber();
			do
			{
				System.out.print("\nEnter adjacent node for node "+parent+ " : ");
				adj_parent=getNumber();
				adj[parent][adj_parent]=1;
				System.out.print("\nEnter the capacity flow for edge "+parent+ " , "+adj_parent+ " : ");
				cf[parent][adj_parent]=getNumber();
				System.out.print("\nContinue to add adjacent node for "+parent+"(1/0)?");
				ans1= getNumber();
			} while (ans1==1);
			System.out.print("\nContinue to add graph node?(1/0)");
			ans= getNumber();
		}while (ans ==1);


		System.out.print("\nAdjacency matrix for your graph is :\n");
		for (i=1;i<=n;i++)
		{
			for (j=1;j<=n;j++)
			System.out.print(" "+adj[i][j]);
			System.out.print("\n");
		}
		
		System.out.print("\nCapacity Flow matrix for your graph is :\n");
		for (i=1;i<=n;i++)
		{
			for (j=1;j<=n;j++)
			System.out.print(" "+cf[i][j]);
			System.out.print("\n");
		}


		System.out.println("\nYour Directed Graph is :");
		for (i=1;i<=n;i++)
		{
			System.out.print("\nVertex "+i+"is connected to : ");
			for (j=1;j<=n;j++)
			{
			if (adj[i][j]==1)
			System.out.print(" "+j+" with capacity edge flow of "+cf[i][j]+"; ");
			}
		}
		

	}

	int getNumber()
 	{
 		 String str;
 		 int ne=0;
 		try
		 {
 		
 		 InputStreamReader input=new InputStreamReader(System.in);
 		 BufferedReader in=new BufferedReader(input);
 		 
 			 str=in.readLine();
 			 ne=Integer.parseInt(str);
 		 }
 		catch(Exception e)
 		 {
 			System.out.println("I/O Error");
 		 }
 		
 		 return ne;
	}


}
