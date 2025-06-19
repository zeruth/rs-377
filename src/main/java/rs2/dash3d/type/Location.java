package rs2.dash3d.type;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.dash3d.entity.Entity;

@OriginalClass("client!BHOSVTIT")
public class Location {

    @OriginalMember(owner = "client!BHOSVTIT", name = "n", descriptor = "B")
    public byte info;

    @OriginalMember(owner = "client!BHOSVTIT", name = "a", descriptor = "I")
    public int level;

    @OriginalMember(owner = "client!BHOSVTIT", name = "b", descriptor = "I")
    public int field77;

    @OriginalMember(owner = "client!BHOSVTIT", name = "c", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!BHOSVTIT", name = "d", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "client!BHOSVTIT", name = "f", descriptor = "I")
    public int field81;

    @OriginalMember(owner = "client!BHOSVTIT", name = "g", descriptor = "I")
    public int tileX;

    @OriginalMember(owner = "client!BHOSVTIT", name = "h", descriptor = "I")
    public int maxSceneTileX;

    @OriginalMember(owner = "client!BHOSVTIT", name = "i", descriptor = "I")
    public int tileZ;

    @OriginalMember(owner = "client!BHOSVTIT", name = "j", descriptor = "I")
    public int maxSceneTileZ;

    @OriginalMember(owner = "client!BHOSVTIT", name = "k", descriptor = "I")
    public int distance;

    @OriginalMember(owner = "client!BHOSVTIT", name = "l", descriptor = "I")
    public int cycle;

    @OriginalMember(owner = "client!BHOSVTIT", name = "m", descriptor = "I")
    public int typecode;

    @OriginalMember(owner = "client!BHOSVTIT", name = "e", descriptor = "LZOXDNIET;")
    public Entity entity;

    public Location(byte info, int level, int field77, int field78, int field79, int field81, int tileX, int field83, int tileZ, int field85, int distance, int cycle, int typecode, Entity entity) {
        this.info = info;
        this.level = level;
        this.field77 = field77;
        this.field78 = field78;
        this.field79 = field79;
        this.field81 = field81;
        this.tileX = tileX;
        this.maxSceneTileX = field83;
        this.tileZ = tileZ;
        this.maxSceneTileZ = field85;
        this.distance = distance;
        this.cycle = cycle;
        this.typecode = typecode;
        this.entity = entity;
    }
}
