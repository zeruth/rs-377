package rs2.dash3d.entity;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.config.ObjType;
import rs2.graphics.Model;

@OriginalClass("client!HRIUIFAV")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "client!HRIUIFAV", name = "m", descriptor = "I")
    public int objId;

    @OriginalMember(owner = "client!HRIUIFAV", name = "o", descriptor = "I")
    public int objQuantity;

    @OriginalMember(owner = "client!HRIUIFAV", name = "a", descriptor = "(B)LLZYQDKJV;")
    public final Model draw(byte loopCycle) {
        ObjType type = ObjType.get(this.objId);
        return type.getModel(this.objQuantity);
    }
}
