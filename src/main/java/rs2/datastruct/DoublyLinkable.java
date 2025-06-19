package rs2.datastruct;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DPPNUUMQ")
public class DoublyLinkable extends Linkable {
    @OriginalMember(owner = "client!DPPNUUMQ", name = "e", descriptor = "LDPPNUUMQ;")
    public DoublyLinkable next2;

    @OriginalMember(owner = "client!DPPNUUMQ", name = "f", descriptor = "LDPPNUUMQ;")
    public DoublyLinkable prev2;

    @OriginalMember(owner = "client!DPPNUUMQ", name = "b", descriptor = "()V")
    public void unlink2() {
        if (this.prev2 != null) {
            this.prev2.next2 = this.next2;
            this.next2.prev2 = this.prev2;
            this.next2 = null;
            this.prev2 = null;
        }
    }
}
