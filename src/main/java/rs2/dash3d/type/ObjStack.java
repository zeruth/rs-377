package rs2.dash3d.type;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.dash3d.entity.Entity;

@OriginalClass("client!DVWJFUCK")
public class ObjStack {

    @OriginalMember(owner = "client!DVWJFUCK", name = "a", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "client!DVWJFUCK", name = "b", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "client!DVWJFUCK", name = "c", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "client!DVWJFUCK", name = "g", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!DVWJFUCK", name = "h", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "client!DVWJFUCK", name = "d", descriptor = "LZOXDNIET;")
    public Entity field639;

    @OriginalMember(owner = "client!DVWJFUCK", name = "e", descriptor = "LZOXDNIET;")
    public Entity field640;

    @OriginalMember(owner = "client!DVWJFUCK", name = "f", descriptor = "LZOXDNIET;")
    public Entity field641;

    public ObjStack(int field636, int field637, int field638, int field642, int field643, Entity field639, Entity field640, Entity field641) {
        this.field636 = field636;
        this.field637 = field637;
        this.field638 = field638;
        this.field642 = field642;
        this.field643 = field643;
        this.field639 = field639;
        this.field640 = field640;
        this.field641 = field641;
    }
}
