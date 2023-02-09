/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head){
        struct ListNode *temp = head;
      int len = 0;
        while( temp != NULL) {
                len++;
            temp = temp->next;
        }
        struct ListNode *p ,*q;
        int k = 0;
        int s = len-1;
        p = q = head;
        while ( k < s ) {
                int t=0;
                while( t < s ) {
                    q = q->next;
                    t++;
                }
                int temp = p->val;
                p->val = q->val;
                q->val = temp;
        
        k++;
        s--;
        p = p->next;
        q = head;
}
 return head;
}
