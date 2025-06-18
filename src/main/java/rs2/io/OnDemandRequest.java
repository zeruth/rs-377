package rs2.io;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.datastruct.DoublyLinkable;

@OriginalClass("client!QSLIGKQQ")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "client!QSLIGKQQ", name = "l", descriptor = "Z")
    public boolean field1367 = true;

    @OriginalMember(owner = "client!QSLIGKQQ", name = "h", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!QSLIGKQQ", name = "i", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!QSLIGKQQ", name = "j", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!QSLIGKQQ", name = "k", descriptor = "[B")
    public byte[] field1366;
}
