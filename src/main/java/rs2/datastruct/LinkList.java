package rs2.datastruct;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BOHLFXVX")
public class LinkList {
    @OriginalMember(owner = "client!BOHLFXVX", name = "c", descriptor = "LZUOIJLRD;")
    public Linkable sentinel = new Linkable();

    @OriginalMember(owner = "client!BOHLFXVX", name = "d", descriptor = "LZUOIJLRD;")
    private Linkable current;

    @OriginalMember(owner = "client!BOHLFXVX", name = "<init>", descriptor = "(Z)V")
    public LinkList() {
        this.sentinel.next = this.sentinel;
        this.sentinel.prev = this.sentinel;
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "(LZUOIJLRD;)V")
    public void addTail(Linkable node) {
        if (node.prev != null) {
            node.unlink();
        }
        node.prev = this.sentinel.prev;
        node.next = this.sentinel;
        node.prev.next = node;
        node.next.prev = node;
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "(BLZUOIJLRD;)V")
    public void addHead(Linkable node) {
        if (node.prev != null) {
            node.unlink();
        }
        node.prev = this.sentinel;
        node.next = this.sentinel.next;
        node.prev.next = node;
        node.next.prev = node;
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "()LZUOIJLRD;")
    public Linkable removeHead() {
        Linkable node = this.sentinel.next;
        if (this.sentinel == node) {
            return null;
        } else {
            node.unlink();
            return node;
        }
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "b", descriptor = "()LZUOIJLRD;")
    public Linkable head() {
        Linkable node = this.sentinel.next;
        if (this.sentinel == node) {
            this.current = null;
            return null;
        } else {
            this.current = node.next;
            return node;
        }
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "(Z)LZUOIJLRD;")
    public Linkable tail() {
        Linkable node = this.sentinel.prev;
        if (this.sentinel == node) {
            this.current = null;
            return null;
        } else {
            this.current = node.prev;
            return node;
        }
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "a", descriptor = "(I)LZUOIJLRD;")
    public Linkable next() {
        Linkable node = this.current;
        if (this.sentinel == node) {
            this.current = null;
            return null;
        }
        this.current = node.next;
        return node;
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "b", descriptor = "(I)LZUOIJLRD;")
    public Linkable prev() {
        Linkable node = this.current;
        if (this.sentinel == node) {
            this.current = null;
            return null;
        } else {
            this.current = node.prev;
            return node;
        }
    }

    @OriginalMember(owner = "client!BOHLFXVX", name = "c", descriptor = "()V")
    public void clear() {
        if (this.sentinel.next == this.sentinel) {
            return;
        }
        while (true) {
            Linkable node = this.sentinel.next;
            if (this.sentinel == node) {
                return;
            }
            node.unlink();
        }
    }
}
