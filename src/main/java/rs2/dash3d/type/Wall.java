package rs2.dash3d.type;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.dash3d.entity.Entity;

@OriginalClass("client!WQXKHZYN")
public class Wall {

    @OriginalMember(owner = "client!WQXKHZYN", name = "i", descriptor = "B")
    public byte field1540;

    @OriginalMember(owner = "client!WQXKHZYN", name = "a", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!WQXKHZYN", name = "b", descriptor = "I")
    public int field1533;

    @OriginalMember(owner = "client!WQXKHZYN", name = "c", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!WQXKHZYN", name = "d", descriptor = "I")
    public int field1535;

    @OriginalMember(owner = "client!WQXKHZYN", name = "e", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!WQXKHZYN", name = "h", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "client!WQXKHZYN", name = "f", descriptor = "LZOXDNIET;")
    public Entity field1537;

    @OriginalMember(owner = "client!WQXKHZYN", name = "g", descriptor = "LZOXDNIET;")
    public Entity field1538;

    public Wall(byte field1540, int field1532, int field1533, int field1534, int field1535, int field1536, int field1539, Entity field1537, Entity field1538) {
        this.field1540 = field1540;
        this.field1532 = field1532;
        this.field1533 = field1533;
        this.field1534 = field1534;
        this.field1535 = field1535;
        this.field1536 = field1536;
        this.field1539 = field1539;
        this.field1537 = field1537;
        this.field1538 = field1538;
    }
}
