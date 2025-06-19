package rs2.datastruct;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CZYJUOKA")
public class DoublyLinkList {
    @OriginalMember(owner = "client!CZYJUOKA", name = "b", descriptor = "LDPPNUUMQ;")
    public DoublyLinkable head = new DoublyLinkable();

    @OriginalMember(owner = "client!CZYJUOKA", name = "c", descriptor = "LDPPNUUMQ;")
    private DoublyLinkable current;

    @OriginalMember(owner = "client!CZYJUOKA", name = "<init>", descriptor = "(Z)V")
    public DoublyLinkList() {
        this.head.next2 = this.head;
        this.head.prev2 = this.head;
    }

    @OriginalMember(owner = "client!CZYJUOKA", name = "a", descriptor = "(LDPPNUUMQ;)V")
    public void push(DoublyLinkable node) {
        if (node.prev2 != null) {
            node.unlink2();
        }
        node.prev2 = this.head.prev2;
        node.next2 = this.head;
        node.prev2.next2 = node;
        node.next2.prev2 = node;
    }

    @OriginalMember(owner = "client!CZYJUOKA", name = "a", descriptor = "()LDPPNUUMQ;")
    public DoublyLinkable pop() {
        DoublyLinkable node = this.head.next2;
        if (this.head == node) {
            return null;
        } else {
            node.unlink2();
            return node;
        }
    }

    @OriginalMember(owner = "client!CZYJUOKA", name = "b", descriptor = "()LDPPNUUMQ;")
    public DoublyLinkable startIteration() {
        DoublyLinkable first = this.head.next2;
        if (this.head == first) {
            this.current = null;
            return null;
        } else {
            this.current = first.next2;
            return first;
        }
    }

    @OriginalMember(owner = "client!CZYJUOKA", name = "a", descriptor = "(I)LDPPNUUMQ;")
    public DoublyLinkable nextIteration() {
        DoublyLinkable current = this.current;
        if (this.head == current) {
            this.current = null;
            return null;
        }
        this.current = current.next2;
        return current;
    }

    @OriginalMember(owner = "client!CZYJUOKA", name = "c", descriptor = "()I")
    public int size() {
        int count = 0;
        for (DoublyLinkable current = this.head.next2; current != this.head; current = current.next2) {
            count++;
        }
        return count;
    }
}
