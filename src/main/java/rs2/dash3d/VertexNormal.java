package rs2.dash3d;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VOUTABRU")
public class VertexNormal {

    @OriginalMember(owner = "client!VOUTABRU", name = "a", descriptor = "I")
    public int x;

    @OriginalMember(owner = "client!VOUTABRU", name = "b", descriptor = "I")
    public int y;

    @OriginalMember(owner = "client!VOUTABRU", name = "c", descriptor = "I")
    public int z;

    @OriginalMember(owner = "client!VOUTABRU", name = "d", descriptor = "I")
    public int w;
}
