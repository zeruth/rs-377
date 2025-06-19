package rs2.dash3d.type;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.dash3d.entity.Entity;

@OriginalClass("client!SEMZHDXN")
public class Decor {

    @OriginalMember(owner = "client!SEMZHDXN", name = "h", descriptor = "B")
    public byte field1413;

    @OriginalMember(owner = "client!SEMZHDXN", name = "a", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!SEMZHDXN", name = "b", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!SEMZHDXN", name = "c", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!SEMZHDXN", name = "d", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!SEMZHDXN", name = "e", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!SEMZHDXN", name = "g", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!SEMZHDXN", name = "f", descriptor = "LZOXDNIET;")
    public Entity field1411;

    public Decor(byte field1413, int field1406, int field1407, int field1408, int field1409, int field1410, int field1412, Entity field1411) {
        this.field1413 = field1413;
        this.field1406 = field1406;
        this.field1407 = field1407;
        this.field1408 = field1408;
        this.field1409 = field1409;
        this.field1410 = field1410;
        this.field1412 = field1412;
        this.field1411 = field1411;
    }
}
