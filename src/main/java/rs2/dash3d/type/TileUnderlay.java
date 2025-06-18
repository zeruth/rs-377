package rs2.dash3d.type;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AYYYSATX")
public class TileUnderlay {

    @OriginalMember(owner = "client!AYYYSATX", name = "f", descriptor = "Z")
    public boolean flat;

    @OriginalMember(owner = "client!AYYYSATX", name = "a", descriptor = "I")
    public int southwestColor;

    @OriginalMember(owner = "client!AYYYSATX", name = "b", descriptor = "I")
    public int southeastColor;

    @OriginalMember(owner = "client!AYYYSATX", name = "c", descriptor = "I")
    public int northeastColor;

    @OriginalMember(owner = "client!AYYYSATX", name = "d", descriptor = "I")
    public int northwestColor;

    @OriginalMember(owner = "client!AYYYSATX", name = "e", descriptor = "I")
    public int textureId;

    @OriginalMember(owner = "client!AYYYSATX", name = "g", descriptor = "I")
    public int colour;

    @OriginalMember(owner = "client!AYYYSATX", name = "<init>", descriptor = "(IIIIIIZ)V")
    public TileUnderlay(int southwestColor, int southeastColor, int northeastColor, int northwestColor, int textureId, int colour, boolean flat) {
        this.southwestColor = southwestColor;
        this.southeastColor = southeastColor;
        this.northeastColor = northeastColor;
        this.northwestColor = northwestColor;
        this.textureId = textureId;
        this.colour = colour;
        this.flat = flat;
    }
}
