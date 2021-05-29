class JavaBinarySearchTree
{
   // ###############################################################
// Instance Variables
  public Account root;
  public BankBST left, right;

// ###############################################################
// Public Methods
/* Adds an account to a BST */
  public void addAccount(Account acc)
  {
// if the tree is empty, make the new account be the root
    if(root == null)
    {
      root = acc;
// create a left and right subtree
      left = new BankBST();
      right = new BankBST();
      return;
// if tree is not empty
    } 
    else 
    {
// if duplicate return
      if (acc.getKey() == root.getKey()) return;
// and if new account key is less than the root, add to left subtree
      if (acc.getKey() < root.getKey())
      {
        left.addAccount(acc);
      }
// else add to the right subtree
      else
      {
        right.addAccount(acc);         
      }
      return;
    }
  }



         /* Finds an account in a BST */ 
  public Account findAccount(int acckey) //#
  {
// if the tree is empty or if the account number being searched matches the root
    System.out.print(root.getKey() + " ");
    if(root == null || acckey == root.getKey()) 
    {
      return root;
    }
    else
    {

// if the account key is smaller search the left subtree
      if(acckey < root.getKey()) return left.findAccount(acckey);
// else search the right subtree
      else return right.findAccount(acckey);
    } 
  }



         /* Removes an account from a BST */ 
  public Account removeAccount(int acc) // returning an account takes care of the case where the root is being removed re:XProcess
  {
// If the tree is empty do nothing
    if (root == null) return null;  
    System.out.print(root.getKey() + " ");
// If the account number being searched matches the root, return left most in right subtree
    if (acc == root.getKey())
    { 
      System.out.println("CLOSE");
      if(right != null) // covers the case of 1 right child
      {
// return left most in right subtree
        BankBST temp = right;
        while (temp.left != null)
        {
          temp = temp.left;
        }
        temp.left = left; // if there are two children then the left child isn't lost, if there is only one right child then null is saved as the left anyways. Also we know the left child of the temp is empty because it exitted the loop
        return temp.root;
      } else return left.root; // "else" takes care of the case of only 1 left or 0 children
    }
    else 
    {
// if the account number is smaller search left and store the replacing child
      if (acc < root.getKey())
      {
        left.root = left.removeAccount(acc); 
        return root;
      }
// otherwise search the right tree, store the replacing child
      else
      {
        right.root = right.removeAccount(acc);
        return root;
      }
    }      
  }


	 /* traverses the bst and prints all account numbers*/
  public void traverse()
  {
    if (root == null) return;
    else 
    {
      System.out.println(root.getKey());
      left.traverse();
      right.traverse();
    }
  }
}

class Account {
// #############################################
// Instance Variables
  private int _key;
  private double _balance;

// #############################################
// Constructor
  public Account(int key, double balance)
  {
    _key = key;
    _balance = balance;
  }
  
}
