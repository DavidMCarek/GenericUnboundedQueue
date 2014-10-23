package queue;

public class Node<T>
{
	T nodeInformation;
	
	protected Node<T> linkToNextNode;
	
	protected Node()
	{
		nodeInformation = null;
		linkToNextNode = null;
	}
	
	protected T getNodeInfo()
	{
		return nodeInformation;
	}
	
	protected void setNodeInfo(T newInformation)
	{
		nodeInformation = newInformation;
	}
	
	protected Node<T> getNodeLink()
	{
		return linkToNextNode;
	}
	
	protected void setNodeLink(Node<T> link)
	{
		this.linkToNextNode = link;
	}
}
