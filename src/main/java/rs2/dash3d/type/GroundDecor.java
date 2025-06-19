package rs2.dash3d.type;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.dash3d.entity.Entity;

@OriginalClass("client!MOLUZZPG")
public class GroundDecor {

    @OriginalMember(owner = "client!MOLUZZPG", name = "f", descriptor = "B")
    public byte info;

    @OriginalMember(owner = "client!MOLUZZPG", name = "a", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!MOLUZZPG", name = "b", descriptor = "I")
    public int x;

    @OriginalMember(owner = "client!MOLUZZPG", name = "c", descriptor = "I")
    public int z;

    @OriginalMember(owner = "client!MOLUZZPG", name = "e", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "client!MOLUZZPG", name = "d", descriptor = "LZOXDNIET;")
    public Entity entity;

    public GroundDecor(Entity entity, int x, int z, int field1310, int field1314, byte info) {
        this.entity = entity;
        this.x = x;
        this.z = z;
        this.field1310 = field1310;
        this.field1314 = field1314;
        this.info = info;
    }
}
