package rs2.datastruct;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RHNYLZZL")
public class LruCache {
    @OriginalMember(owner = "client!RHNYLZZL", name = "d", descriptor = "LDPPNUUMQ;")
    private DoublyLinkable flagNode = new DoublyLinkable();

    @OriginalMember(owner = "client!RHNYLZZL", name = "h", descriptor = "LCZYJUOKA;")
    private DoublyLinkList cacheHistory = new DoublyLinkList();

    @OriginalMember(owner = "client!RHNYLZZL", name = "e", descriptor = "I")
    private int capacity;

    @OriginalMember(owner = "client!RHNYLZZL", name = "f", descriptor = "I")
    private int cacheAvailable;

    @OriginalMember(owner = "client!RHNYLZZL", name = "g", descriptor = "LJLFXAIRK;")
    private final HashTable hashtable = new HashTable(1024);

    @OriginalMember(owner = "client!RHNYLZZL", name = "<init>", descriptor = "(II)V")
    public LruCache(int size) {
        this.capacity = size;
        this.cacheAvailable = size;
    }

    @OriginalMember(owner = "client!RHNYLZZL", name = "a", descriptor = "(J)LDPPNUUMQ;")
    public DoublyLinkable get(long key) {
        DoublyLinkable node = (DoublyLinkable) this.hashtable.get(key);
        if (node != null) {
            this.cacheHistory.push(node);
        }
        return node;
    }

    @OriginalMember(owner = "client!RHNYLZZL", name = "a", descriptor = "(LDPPNUUMQ;JI)V")
    public void put(DoublyLinkable value, long key) {
        if (this.cacheAvailable == 0) {
            DoublyLinkable node = this.cacheHistory.pop();
            node.unlink();
            node.unlink2();
            if (this.flagNode == node) {
                DoublyLinkable node1 = this.cacheHistory.pop();
                node1.unlink();
                node1.unlink2();
            }
        } else {
            this.cacheAvailable--;
        }
        this.hashtable.put(key, value);
        this.cacheHistory.push(value);
    }

    @OriginalMember(owner = "client!RHNYLZZL", name = "a", descriptor = "()V")
    public void clear() {
        while (true) {
            DoublyLinkable node = this.cacheHistory.pop();
            if (node == null) {
                this.cacheAvailable = this.capacity;
                return;
            }
            node.unlink();
            node.unlink2();
        }
    }
}
