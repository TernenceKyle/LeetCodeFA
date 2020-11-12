package com.ezzra.Medium;

import javax.management.ListenerNotFoundException;
import java.util.List;

public class 链表逆序存储的两数之和 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(7);
        ListNode ls1 = addTwoNumbers(l1, l2);
        while (ls1 != null) {
            if (ls1.next != null) {
                System.out.print(ls1.val + "->");
            } else {
                System.out.println(ls1.val);
            }
            ls1 = ls1.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            int sum = num1 + num2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (carry > 0) {
                tail.next = new ListNode(carry);
            }
        }
        return head;
    }


    //Description: 给出两个非空的链表用来表示两个非负的整数，它们各自的位数是按照
    //逆序的方式存储的，并且它们的每个节点只能储存一位数字。
    public static ListNode addTwoNumbwes(ListNode l1, ListNode l2) {
        ListNode head = null;//创建头节点用于保存链表的开头
        ListNode tail = null;//尾节点用于迭代操作数据
        int carry = 0;//用于记录是否两数相加超过10 从而向下进1.
        while (l1 != null || l2 != null) {
            //两链表长度不一致时，空缺处默认用0补齐。
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            int sum = num1 + num2 + carry;
            //对头链表进行第一次初始化，之后所有的新建或设置链表值交由tail处理
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            //当两数相加超过10往下进一。
            if (carry > 0) {
                tail.next = new ListNode(carry);
            }
        }
        return head;
    }


}
