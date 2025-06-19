package rs2.dash3d.type;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.dash3d.entity.Entity;

@OriginalClass("client!WQXKHZYN")
public class Wall {

    @OriginalMember(owner = "client!WQXKHZYN", name = "i", descriptor = "B")
    public byte info;

    @OriginalMember(owner = "client!WQXKHZYN", name = "a", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!WQXKHZYN", name = "b", descriptor = "I")
    public int field1533;

    @OriginalMember(owner = "client!WQXKHZYN", name = "c", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!WQXKHZYN", name = "d", descriptor = "I")
    public int typeA;

    @OriginalMember(owner = "client!WQXKHZYN", name = "e", descriptor = "I")
    public int typeB;

    @OriginalMember(owner = "client!WQXKHZYN", name = "h", descriptor = "I")
    public int typecode;

    @OriginalMember(owner = "client!WQXKHZYN", name = "f", descriptor = "LZOXDNIET;")
    public Entity entityA;

    @OriginalMember(owner = "client!WQXKHZYN", name = "g", descriptor = "LZOXDNIET;")
    public Entity entityB;

    public Wall(byte info, int field1532, int field1533, int field1534, int typeA, int typeB, int typecode, Entity entityA, Entity entityB) {
        this.info = info;
        this.field1532 = field1532;
        this.field1533 = field1533;
        this.field1534 = field1534;
        this.typeA = typeA;
        this.typeB = typeB;
        this.typecode = typecode;
        this.entityA = entityA;
        this.entityB = entityB;
    }
}
