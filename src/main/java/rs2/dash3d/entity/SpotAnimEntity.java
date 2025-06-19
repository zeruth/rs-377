package rs2.dash3d.entity;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.config.SpotAnimType;
import rs2.graphics.AnimFrame;
import rs2.graphics.Model;

@OriginalClass("client!WHUAOHZM")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "client!WHUAOHZM", name = "q", descriptor = "Z")
    private boolean field1526 = true;

    @OriginalMember(owner = "client!WHUAOHZM", name = "r", descriptor = "Z")
    public boolean seqComplete = false;

    @OriginalMember(owner = "client!WHUAOHZM", name = "u", descriptor = "LMNZYLKNY;")
    private SpotAnimType spotType;

    @OriginalMember(owner = "client!WHUAOHZM", name = "m", descriptor = "I")
    public int spotLevel;

    @OriginalMember(owner = "client!WHUAOHZM", name = "n", descriptor = "I")
    public int x;

    @OriginalMember(owner = "client!WHUAOHZM", name = "o", descriptor = "I")
    public int z;

    @OriginalMember(owner = "client!WHUAOHZM", name = "p", descriptor = "I")
    public int y;

    @OriginalMember(owner = "client!WHUAOHZM", name = "v", descriptor = "I")
    public int startCycle;

    @OriginalMember(owner = "client!WHUAOHZM", name = "s", descriptor = "I")
    private int seqFrame;

    @OriginalMember(owner = "client!WHUAOHZM", name = "t", descriptor = "I")
    private int seqCycle;

    @OriginalMember(owner = "client!WHUAOHZM", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int x, int level, int y, int cycle, int id, int delay, int z) {
        this.spotType = SpotAnimType.instances[id];
        this.spotLevel = level;
        this.x = x;
        this.z = z;
        this.y = y;
        this.startCycle = cycle + delay;
    }

    @OriginalMember(owner = "client!WHUAOHZM", name = "a", descriptor = "(BI)V")
    public final void update(int delta) {
        this.seqCycle += delta;
        while (true) {
            do {
                if (this.seqCycle <= this.spotType.seq.getDelay(0, this.seqFrame)) {
                    return;
                }
                this.seqCycle -= this.spotType.seq.getDelay(0, this.seqFrame);
                this.seqFrame++;
            } while (this.seqFrame < this.spotType.seq.seqFrameCount);
            this.seqFrame = 0;
            this.seqComplete = true;
        }
    }

    @OriginalMember(owner = "client!WHUAOHZM", name = "a", descriptor = "(B)LLZYQDKJV;")
    public final Model draw(byte loopCycle) {
        if (loopCycle != 3) {
            throw new NullPointerException();
        }
        Model tmp = this.spotType.getModel();
        if (tmp == null) {
            return null;
        }
        int delay = this.spotType.seq.seqFrames[this.seqFrame];
        Model model = new Model(false, false, true, tmp, AnimFrame.method265(this.field1526, delay));
        if (!this.seqComplete) {
            model.createLabelReferences(7);
            model.applyTransform(delay, (byte) 6);
            model.labelFaces = null;
            model.labelVertices = null;
        }
        if (this.spotType.resizeh != 128 || this.spotType.resizev != 128) {
            model.scale(this.spotType.resizev, this.spotType.resizeh, 9, this.spotType.resizeh);
        }
        if (this.spotType.spotAngle != 0) {
            if (this.spotType.spotAngle == 90) {
                model.rotateY90(true);
            }
            if (this.spotType.spotAngle == 180) {
                model.rotateY90(true);
                model.rotateY90(true);
            }
            if (this.spotType.spotAngle == 270) {
                model.rotateY90(true);
                model.rotateY90(true);
                model.rotateY90(true);
            }
        }
        model.calculateNormals(this.spotType.ambient + 64, this.spotType.contrast + 850, -30, -50, -30, true);
        return model;
    }
}
