package rs2.graphics;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.io.Packet;

@OriginalClass("client!VPIFXIOD")
public class AnimBase {

    @OriginalMember(owner = "client!VPIFXIOD", name = "a", descriptor = "I")
    public int animLength;

    @OriginalMember(owner = "client!VPIFXIOD", name = "b", descriptor = "[I")
    public int[] animTypes;

    @OriginalMember(owner = "client!VPIFXIOD", name = "c", descriptor = "[[I")
    public int[][] animLabels;

    @OriginalMember(owner = "client!VPIFXIOD", name = "<init>", descriptor = "(LMFMVIYHT;I)V")
    public AnimBase(Packet arg0, int arg1) {
        this.animLength = arg0.g1();
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.animTypes = new int[this.animLength];
        this.animLabels = new int[this.animLength][];
        for (int var3 = 0; var3 < this.animLength; var3++) {
            this.animTypes[var3] = arg0.g1();
        }
        for (int var4 = 0; var4 < this.animLength; var4++) {
            int var5 = arg0.g1();
            this.animLabels[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.animLabels[var4][var6] = arg0.g1();
            }
        }
    }
}
