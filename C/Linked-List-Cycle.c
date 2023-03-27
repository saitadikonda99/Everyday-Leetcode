/**
 * Definition for singly-linked list.
 *  struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {

        // base condition 

        if( head == NULL ) return false;


    // let's consider two pointers 
    // initially both points to head 
    // first pointer will move two nodes
    // but second pointer will move one node
    struct ListNode *first = head;
    struct ListNode *second = head;

    while( first != NULL && first->next != NULL ) {
        // second move to next node
        second = second->next;
        
        // first move to next, next node
        first = first->next->next;
         
        // if the two pointers meet at any point it means 
        // the linked list makes cycle 
        if( first == second ) {
            // we found the answer
            // return the true
            return true;
        }
        
    }
// if the two pointers didn't meet at any point it means 
    // the linked list doesn't makes cycle 
    // hence, return false
    return false;
}

 
