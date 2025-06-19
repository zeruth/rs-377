package rs2.dash3d.type;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.dash3d.entity.Entity;

@OriginalClass("client!SEMZHDXN")
public class Decor {

    @OriginalMember(owner = "client!SEMZHDXN", name = "h", descriptor = "B")
    public byte info;

    @OriginalMember(owner = "client!SEMZHDXN", name = "a", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!SEMZHDXN", name = "b", descriptor = "I")
    public int x;

    @OriginalMember(owner = "client!SEMZHDXN", name = "c", descriptor = "I")
    public int z;

    @OriginalMember(owner = "client!SEMZHDXN", name = "d", descriptor = "I")
    public int decorType;

    @OriginalMember(owner = "client!SEMZHDXN", name = "e", descriptor = "I")
    public int decorAngle;

    @OriginalMember(owner = "client!SEMZHDXN", name = "g", descriptor = "I")
    public int typecode;

    @OriginalMember(owner = "client!SEMZHDXN", name = "f", descriptor = "LZOXDNIET;")
    public Entity entity;

    public Decor(byte info, int field1406, int field1407, int field1408, int decorType, int decorAngle, int typecode, Entity entity) {
        this.info = info;
        this.field1406 = field1406;
        this.x = field1407;
        this.z = field1408;
        this.decorType = decorType;
        this.decorAngle = decorAngle;
        this.typecode = typecode;
        this.entity = entity;
    }
}
