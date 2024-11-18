package com.sunbeam;

import com.sunbeam.BstTreeAddNode.Node;

public class SearchBst {
	
	
	static class Node
	{
		private int data;
		private Node left,right;
		public Node(int value)
		{
			data=value;
			left=right=null;
		}
	}

		private Node root;
		public SearchBst()
		{
			root=null;
		}
		
		
		public boolean isEmpty()
		{
			return root==null;
		}
		
		
		public void addNode(int val,Node n)
		{
			
			Node nn=new Node(val);
			
			if(root==null)
			{
				root=nn;
				System.out.println("Node Added Successfully on root node:"+nn.data);

			}
			else
			{
				Node trav=n;
				
				if(val<trav.data)
				{
					if(trav.left==null)
					{
						trav.left=nn;
						System.out.println("Node Added Successfully on left child:"+nn.data);

						return ;
					}
					else
					{
						addNode(val,trav.left);
					}
						
				}
				else
				{
					if(trav.right==null)
					{
						trav.right=nn;
						System.out.println("Node Added Successfully on right child:"+nn.data);
						return ;
					}
					else
					{
						addNode(val,trav.right);
					}
				}
			}
		}
		
		
		private void searchBst(int val,Node trav)
		{
			
			if(root==null)
			{
				
				System.out.println("Tree Does Not Contain any Node.");
				return  ;

			}
			else
			{
				
			
				if(trav.data==val)
				{
					System.out.println("\nElement found");
						return ;
				}
					
				
				else if(val<trav.data)
				{
					searchBst(val, trav.left);
				}
				else
				{
					searchBst(val, trav.right);
				}
				
			}
			

			
		}
		
		
		public void addNode(int val)
		{
			addNode(val, root);
			
		}
		
		private void preOrder(Node trav)
		{
			
			
			if(trav==null)
			{
				return ;
			}
			
			
				System.out.print(trav.data+" ");
				preOrder(trav.left);
				preOrder(trav.right);
			
		}
		
		public void searchBst(int val)
		{
			searchBst(val,root);
		}
		
		public void preOrder()
		{
			System.out.println("PreOrder:");
			preOrder(root);
		}
		
		
		
		
		public static void main(String[] args) {
			{
				SearchBst b1=new SearchBst();
				 b1.addNode(10);
				 b1.addNode(20);
				 b1.addNode(30);
				 b1.addNode(1);
				 b1.addNode(29);
				 b1.addNode(9);
				 b1.preOrder();
				 b1.searchBst(1);
				
				 
			}
		}

	

}
