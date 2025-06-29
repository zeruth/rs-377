package rs2.dash3d.entity;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.config.LocType;
import rs2.config.SeqType;
import rs2.config.VarbitType;
import rs2.client.client;
import rs2.graphics.Model;

@OriginalClass("client!NRPYRAWK")
public class LocEntity extends Entity {

    @OriginalMember(owner = "client!NRPYRAWK", name = "m", descriptor = "Z")
    private boolean field1328 = false;

    @OriginalMember(owner = "client!NRPYRAWK", name = "s", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client!NRPYRAWK", name = "t", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client!NRPYRAWK", name = "u", descriptor = "I")
    private int field1336;

    @OriginalMember(owner = "client!NRPYRAWK", name = "n", descriptor = "I")
    private int field1329;

    @OriginalMember(owner = "client!NRPYRAWK", name = "o", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client!NRPYRAWK", name = "p", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!NRPYRAWK", name = "q", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client!NRPYRAWK", name = "w", descriptor = "LFHWCLIAS;")
    private SeqType seq;

    @OriginalMember(owner = "client!NRPYRAWK", name = "C", descriptor = "I")
    private int seqFrame;

    @OriginalMember(owner = "client!NRPYRAWK", name = "B", descriptor = "I")
    private int seqCycle;

    @OriginalMember(owner = "client!NRPYRAWK", name = "x", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "client!NRPYRAWK", name = "y", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!NRPYRAWK", name = "z", descriptor = "[I")
    public int[] field1341;

    @OriginalMember(owner = "client!NRPYRAWK", name = "r", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client!NRPYRAWK", name = "A", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client!NRPYRAWK", name = "v", descriptor = "Lclient;")
    public static client field1337;

    @OriginalMember(owner = "client!NRPYRAWK", name = "a", descriptor = "(I)LYMYTDPVW;")
    public final LocType method440(int arg0) {
        int var2 = -1;
        if (arg0 != 0) {
            this.field1342 = 109;
        }
        if (this.field1339 != -1) {
            VarbitType var3 = VarbitType.field1760[this.field1339];
            int var4 = var3.field1762;
            int var5 = var3.field1763;
            int var6 = var3.field1764;
            int var7 = client.field510[var6 - var5];
            var2 = field1337.field335[var4] >> var5 & var7;
        } else if (this.field1340 != -1) {
            var2 = field1337.field335[this.field1340];
        }
        return var2 < 0 || var2 >= this.field1341.length || this.field1341[var2] == -1 ? null : LocType.method561(this.field1341[var2]);
    }

    @OriginalMember(owner = "client!NRPYRAWK", name = "<init>", descriptor = "(IIIIIBIZII)V")
    public LocEntity(int index, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, boolean randomFrame, int arg8, int arg9) {
        this.field1334 = arg6;
        this.field1335 = arg4;
        this.field1336 = arg9;
        this.field1329 = arg8;
        this.field1330 = arg3;
        this.field1331 = arg1;
        this.field1332 = arg2;
        if (index != -1) {
            this.seq = SeqType.instances[index];
            this.seqFrame = 0;
            this.seqCycle = client.loopCycle - 1;
            if (randomFrame && this.seq.replayoff != -1) {
                this.seqFrame = (int) (Math.random() * (double) this.seq.seqFrameCount);
                this.seqCycle -= (int) (Math.random() * (double) this.seq.getDelay(0, this.seqFrame));
            }
        }
        LocType locType = LocType.method561(this.field1334);
        this.field1339 = locType.field1632;
        this.field1340 = locType.field1635;
        this.field1341 = locType.field1659;
        if (arg5 != 3) {
            this.field1333 = -126;
        }
    }

    @OriginalMember(owner = "client!NRPYRAWK", name = "a", descriptor = "(B)LLZYQDKJV;")
    public final Model draw(byte loopCycle) {
        int var2 = -1;
        if (this.seq != null) {
            int var3 = client.loopCycle - this.seqCycle;
            if (var3 > 100 && this.seq.replayoff > 0) {
                var3 = 100;
            }
            label49: {
                do {
                    do {
                        if (var3 <= this.seq.getDelay(0, this.seqFrame)) {
                            break label49;
                        }
                        var3 -= this.seq.getDelay(0, this.seqFrame);
                        this.seqFrame++;
                    } while (this.seqFrame < this.seq.seqFrameCount);
                    this.seqFrame -= this.seq.replayoff;
                } while (this.seqFrame >= 0 && this.seqFrame < this.seq.seqFrameCount);
                this.seq = null;
            }
            this.seqCycle = client.loopCycle - var3;
            if (this.seq != null) {
                var2 = this.seq.seqFrames[this.seqFrame];
            }
        }
        LocType var4;
        if (this.field1341 == null) {
            var4 = LocType.method561(this.field1334);
        } else {
            var4 = this.method440(0);
        }
        return var4 == null ? null : var4.method569(this.field1335, this.field1336, this.field1329, this.field1330, this.field1331, this.field1332, var2);
    }
}
