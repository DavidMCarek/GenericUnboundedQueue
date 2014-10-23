package queue;

public class Queue<T>
{
	Node<T> frontNode;
	Node<T> rearNode;
	
	public Queue()
	{
		frontNode = null;
		rearNode = null;
	}
	
	public void enqueue(T newInformation)
	{
		Node newNode = new Node();
		newNode.setNodeInfo(newInformation);
		
		if (isEmpty())
		{
			frontNode = newNode;
			rearNode = newNode;
		}
		else
		{
			rearNode.setNodeLink(newNode);
			rearNode = newNode;
		}
	}
	
	public T dequeue()throws QueueUnderflowException
	{
		T frontNodeData;
		if (!isEmpty())
		{
			frontNodeData = frontNode.getNodeInfo();
			frontNode = frontNode.getNodeLink();
			
			if (frontNode == null)
				rearNode = null;
		}	
		else
		{
			throw new QueueUnderflowException("Cannot dequeue an empty queue");
		}
		return frontNodeData;
	}
	
	public boolean isEmpty()
	{
		return (frontNode == null);
	}
}
