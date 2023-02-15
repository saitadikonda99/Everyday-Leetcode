/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head){

        if( head == NULL ) {
            return NULL;
        }
     struct ListNode *temp = head;
     struct ListNode *t;

     while( temp->next != NULL ) {

         if( temp->val == temp->next->val) {
           t = temp->next->next;
           free( temp->next);
           temp->next = t;
         }
         else {
         temp = temp->next;
         }
     }
     return head;
}
