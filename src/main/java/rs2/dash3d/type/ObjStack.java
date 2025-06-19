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
    public int offset;

    @OriginalMember(owner = "client!DVWJFUCK", name = "d", descriptor = "LZOXDNIET;")
    public Entity topObj;

    @OriginalMember(owner = "client!DVWJFUCK", name = "e", descriptor = "LZOXDNIET;")
    public Entity bottomObj;

    @OriginalMember(owner = "client!DVWJFUCK", name = "f", descriptor = "LZOXDNIET;")
    public Entity middleObj;

    public ObjStack(int field636, int field637, int field638, int field642, int offset, Entity field639, Entity bottomObj, Entity middleObj) {
        this.field636 = field636;
        this.field637 = field637;
        this.field638 = field638;
        this.field642 = field642;
        this.offset = offset;
        this.topObj = field639;
        this.bottomObj = bottomObj;
        this.middleObj = middleObj;
    }
}
