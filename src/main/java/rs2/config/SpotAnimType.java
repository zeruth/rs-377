package rs2.config;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.datastruct.LruCache;
import rs2.graphics.Model;
import rs2.io.Jagfile;
import rs2.io.Packet;

@OriginalClass("client!MNZYLKNY")
public class SpotAnimType {

    @OriginalMember(owner = "client!MNZYLKNY", name = "c", descriptor = "I")
    private int field1295 = -214;

    @OriginalMember(owner = "client!MNZYLKNY", name = "h", descriptor = "I")
    public int field1300 = -1;

    @OriginalMember(owner = "client!MNZYLKNY", name = "j", descriptor = "[I")
    public int[] field1302 = new int[6];

    @OriginalMember(owner = "client!MNZYLKNY", name = "k", descriptor = "[I")
    public int[] field1303 = new int[6];

    @OriginalMember(owner = "client!MNZYLKNY", name = "l", descriptor = "I")
    public int resizeh = 128;

    @OriginalMember(owner = "client!MNZYLKNY", name = "m", descriptor = "I")
    public int resizev = 128;

    @OriginalMember(owner = "client!MNZYLKNY", name = "a", descriptor = "B")
    private static byte field1293 = 6;

    @OriginalMember(owner = "client!MNZYLKNY", name = "b", descriptor = "Z")
    private static boolean field1294 = true;

    @OriginalMember(owner = "client!MNZYLKNY", name = "q", descriptor = "LRHNYLZZL;")
    public static LruCache field1309 = new LruCache(30, -572);

    @OriginalMember(owner = "client!MNZYLKNY", name = "d", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!MNZYLKNY", name = "f", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!MNZYLKNY", name = "g", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!MNZYLKNY", name = "n", descriptor = "I")
    public int spotAngle;

    @OriginalMember(owner = "client!MNZYLKNY", name = "o", descriptor = "I")
    public int ambient;

    @OriginalMember(owner = "client!MNZYLKNY", name = "p", descriptor = "I")
    public int contrast;

    @OriginalMember(owner = "client!MNZYLKNY", name = "i", descriptor = "LFHWCLIAS;")
    public SeqType seq;

    @OriginalMember(owner = "client!MNZYLKNY", name = "e", descriptor = "[LMNZYLKNY;")
    public static SpotAnimType[] instances;

    @OriginalMember(owner = "client!MNZYLKNY", name = "a", descriptor = "(LATJMVOZR;I)V")
    public static void method437(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(true, arg0.method2("spotanim.dat", null));
        field1296 = var2.g2();
        if (arg1 != 36135) {
            field1294 = !field1294;
        }
        if (instances == null) {
            instances = new SpotAnimType[field1296];
        }
        for (int var3 = 0; var3 < field1296; var3++) {
            if (instances[var3] == null) {
                instances[var3] = new SpotAnimType();
            }
            instances[var3].field1298 = var3;
            instances[var3].method438(field1293, var2);
        }
    }

    @OriginalMember(owner = "client!MNZYLKNY", name = "a", descriptor = "(BLMFMVIYHT;)V")
    public void method438(byte arg0, Packet arg1) {
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            this.field1295 = 458;
        }
        while (true) {
            while (true) {
                int var4 = arg1.g1();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1299 = arg1.g2();
                } else if (var4 == 2) {
                    this.field1300 = arg1.g2();
                    if (SeqType.field775 != null) {
                        this.seq = SeqType.field775[this.field1300];
                    }
                } else if (var4 == 4) {
                    this.resizeh = arg1.g2();
                } else if (var4 == 5) {
                    this.resizev = arg1.g2();
                } else if (var4 == 6) {
                    this.spotAngle = arg1.g2();
                } else if (var4 == 7) {
                    this.ambient = arg1.g1();
                } else if (var4 == 8) {
                    this.contrast = arg1.g1();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1302[var4 - 40] = arg1.g2();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1303[var4 - 50] = arg1.g2();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!MNZYLKNY", name = "a", descriptor = "()LLZYQDKJV;")
    public Model getModel() {
        Model var1 = (Model) field1309.method458((long) this.field1298);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method359(this.field1299);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1302[0] != 0) {
                var2.method373(this.field1302[var3], this.field1303[var3]);
            }
        }
        field1309.method459(var2, (long) this.field1298, 5);
        return var2;
    }
}
