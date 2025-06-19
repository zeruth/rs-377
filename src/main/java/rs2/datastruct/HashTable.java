package rs2.datastruct;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JLFXAIRK")
public class HashTable {
    @OriginalMember(owner = "client!JLFXAIRK", name = "c", descriptor = "I")
    private int bucketCount;

    @OriginalMember(owner = "client!JLFXAIRK", name = "d", descriptor = "[LZUOIJLRD;")
    private Linkable[] buckets;

    @OriginalMember(owner = "client!JLFXAIRK", name = "<init>", descriptor = "(BI)V")
    public HashTable(int size) {
        this.bucketCount = size;
        this.buckets = new Linkable[size];
        for (int i = 0; i < size; i++) {
            Linkable sentinel = this.buckets[i] = new Linkable();
            sentinel.next = sentinel;
            sentinel.prev = sentinel;
        }
    }

    @OriginalMember(owner = "client!JLFXAIRK", name = "a", descriptor = "(J)LZUOIJLRD;")
    public Linkable get(long key) {
        Linkable start = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
        for (Linkable node = start.next; node != start; node = node.next) {
            if (node.key == key) {
                return node;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!JLFXAIRK", name = "a", descriptor = "(ILZUOIJLRD;J)V")
    public void put(long key, Linkable value) {
        if (value.prev != null) {
            value.unlink();
        }
        Linkable sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
        value.prev = sentinel.prev;
        value.next = sentinel;
        value.prev.next = value;
        value.next.prev = value;
        value.key = key;
    }
}
