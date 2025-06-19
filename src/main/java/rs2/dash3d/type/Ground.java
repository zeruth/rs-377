package rs2.dash3d.type;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.datastruct.Linkable;

@OriginalClass("client!RIEEXHOP")
public class Ground extends Linkable {

    @OriginalMember(owner = "client!RIEEXHOP", name = "e", descriptor = "Z")
    private boolean field1379 = false;

    @OriginalMember(owner = "client!RIEEXHOP", name = "q", descriptor = "[LBHOSVTIT;")
    public Location[] locs = new Location[5];

    @OriginalMember(owner = "client!RIEEXHOP", name = "r", descriptor = "[I")
    public int[] locSpan = new int[5];

    @OriginalMember(owner = "client!RIEEXHOP", name = "f", descriptor = "I")
    public int groundLevel;

    @OriginalMember(owner = "client!RIEEXHOP", name = "i", descriptor = "I")
    public int occludeLevel;

    @OriginalMember(owner = "client!RIEEXHOP", name = "g", descriptor = "I")
    public int x;

    @OriginalMember(owner = "client!RIEEXHOP", name = "h", descriptor = "I")
    public int z;

    @OriginalMember(owner = "client!RIEEXHOP", name = "p", descriptor = "I")
    public int locCount;

    @OriginalMember(owner = "client!RIEEXHOP", name = "s", descriptor = "I")
    public int locSpans;

    @OriginalMember(owner = "client!RIEEXHOP", name = "t", descriptor = "I")
    public int drawLevel;

    @OriginalMember(owner = "client!RIEEXHOP", name = "x", descriptor = "I")
    public int checkLocSpans;

    @OriginalMember(owner = "client!RIEEXHOP", name = "y", descriptor = "I")
    public int blockLocSpans;

    @OriginalMember(owner = "client!RIEEXHOP", name = "z", descriptor = "I")
    public int inverseBlockLocSpans;

    @OriginalMember(owner = "client!RIEEXHOP", name = "A", descriptor = "I")
    public int backWallTypes;

    @OriginalMember(owner = "client!RIEEXHOP", name = "n", descriptor = "LMOLUZZPG;")
    public GroundDecor groundDecoration;

    @OriginalMember(owner = "client!RIEEXHOP", name = "o", descriptor = "LDVWJFUCK;")
    public ObjStack objStack;

    @OriginalMember(owner = "client!RIEEXHOP", name = "B", descriptor = "LRIEEXHOP;")
    public Ground bridge;

    @OriginalMember(owner = "client!RIEEXHOP", name = "k", descriptor = "LJQCVNYYR;")
    public TileOverlay overlay;

    @OriginalMember(owner = "client!RIEEXHOP", name = "j", descriptor = "LAYYYSATX;")
    public TileUnderlay underlay;

    @OriginalMember(owner = "client!RIEEXHOP", name = "l", descriptor = "LWQXKHZYN;")
    public Wall wall;

    @OriginalMember(owner = "client!RIEEXHOP", name = "m", descriptor = "LSEMZHDXN;")
    public Decor wallDecoration;

    @OriginalMember(owner = "client!RIEEXHOP", name = "u", descriptor = "Z")
    public boolean groundVisible;

    @OriginalMember(owner = "client!RIEEXHOP", name = "v", descriptor = "Z")
    public boolean update;

    @OriginalMember(owner = "client!RIEEXHOP", name = "w", descriptor = "Z")
    public boolean containsLocs;

    @OriginalMember(owner = "client!RIEEXHOP", name = "<init>", descriptor = "(III)V")
    public Ground(int arg0, int arg1, int arg2) {
        this.occludeLevel = this.groundLevel = arg0;
        this.x = arg1;
        this.z = arg2;
    }
}
