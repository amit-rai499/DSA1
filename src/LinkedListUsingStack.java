class Employee {
    public int empid;
    public String name;
    public int sal;
    public Employee()
    {
        empid=0;
        name=null;
        sal=0;
    }
    public Employee(int empid, String name, int sal) {
        this.empid = empid;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}//end of employee class
    class Node{
    private Employee data;
    private Node next;
    public Node()
    {
        data=null;
        next=null;
    }
    public Node(Employee data,Node next)
    {
        this.data=data;
        this.next=next;
    }

    public Employee getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(Employee data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}//End of the Node
class myStack {
    Node top;

    public myStack() {
        top = null;
    }

    public boolean isempty() {
        return (top == null);
    }

    public void push(Employee val) {
        Node n = new Node();
        n.setData(val);
        n.setNext(top);
        top = n;
    }

    public Employee pop() {
        Employee result;
        if (isempty()) {
            System.out.println("Linked List is Empty");
            return null;
        } else {
            result = top.getData();
            top = top.getNext();
            return result;
        }
    }
    public void display()
    {
        Node temp;
        temp=top;
        if(temp==null)
        {
            System.out.println("Linked List is Empty");
            return;
        }
        else
        {
            while(temp!=null)
            {
                System.out.println(temp.getData()+" "+temp.getNext());
                temp=temp.getNext();
            }//end of while loop
        }//end of else
    }//end of method
    public int count()
    {
        int ctr=0;
        Node temp;
        temp=top;
        while(temp!=null)
        {
            ctr++;
            temp=temp.getNext();
        }
        return ctr;
    }
}
public class LinkedListUsingStack{
    public static void main(String[] args) {
        myStack obj=new myStack();
        Employee e1=new Employee(123,"gdjd",2500);
        Employee e2=new Employee(1244,"dvgagsh",4363);
        Employee e3=new Employee(12388,"hjsafgas",3783);
        obj.push(e1);
        obj.push(e2);
        obj.push(e3);
        System.out.println(obj.count());
        System.out.println(obj.pop());
        System.out.println(obj.count());
        obj.display();
    }
}


