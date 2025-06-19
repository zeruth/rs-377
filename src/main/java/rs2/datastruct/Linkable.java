package rs2.datastruct;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZUOIJLRD")
public class Linkable {

    @OriginalMember(owner = "client!ZUOIJLRD", name = "a", descriptor = "J")
    public long key;

    @OriginalMember(owner = "client!ZUOIJLRD", name = "b", descriptor = "LZUOIJLRD;")
    public Linkable next;

    @OriginalMember(owner = "client!ZUOIJLRD", name = "c", descriptor = "LZUOIJLRD;")
    public Linkable prev;

    @OriginalMember(owner = "client!ZUOIJLRD", name = "d", descriptor = "Z")
    public static boolean field1772;

    @OriginalMember(owner = "client!ZUOIJLRD", name = "a", descriptor = "()V")
    public void unlink() {
        if (this.prev != null) {
            this.prev.next = this.next;
            this.next.prev = this.prev;
            this.next = null;
            this.prev = null;
        }
    }
}
