package rs2.dash3d.entity;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.config.SpotAnimType;
import rs2.graphics.AnimFrame;
import rs2.graphics.Model;

@OriginalClass("client!KFJRVZCI")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "client!KFJRVZCI", name = "u", descriptor = "Z")
    private boolean field982 = false;

    @OriginalMember(owner = "client!KFJRVZCI", name = "x", descriptor = "B")
    private byte field985 = -41;

    @OriginalMember(owner = "client!KFJRVZCI", name = "G", descriptor = "Z")
    private boolean field994 = true;

    @OriginalMember(owner = "client!KFJRVZCI", name = "I", descriptor = "Z")
    public boolean mobile = false;

    @OriginalMember(owner = "client!KFJRVZCI", name = "m", descriptor = "LMNZYLKNY;")
    private SpotAnimType spotanim;

    @OriginalMember(owner = "client!KFJRVZCI", name = "n", descriptor = "I")
    public int projLevel;

    @OriginalMember(owner = "client!KFJRVZCI", name = "J", descriptor = "I")
    public int srcX;

    @OriginalMember(owner = "client!KFJRVZCI", name = "K", descriptor = "I")
    public int srcZ;

    @OriginalMember(owner = "client!KFJRVZCI", name = "L", descriptor = "I")
    public int srcY;

    @OriginalMember(owner = "client!KFJRVZCI", name = "y", descriptor = "I")
    public int startCycle;

    @OriginalMember(owner = "client!KFJRVZCI", name = "z", descriptor = "I")
    public int lastCycle;

    @OriginalMember(owner = "client!KFJRVZCI", name = "r", descriptor = "I")
    public int peakPitch;

    @OriginalMember(owner = "client!KFJRVZCI", name = "s", descriptor = "I")
    public int projArc;

    @OriginalMember(owner = "client!KFJRVZCI", name = "t", descriptor = "I")
    public int projTarget;

    @OriginalMember(owner = "client!KFJRVZCI", name = "M", descriptor = "I")
    public int projOffsetY;

    @OriginalMember(owner = "client!KFJRVZCI", name = "o", descriptor = "D")
    public double x;

    @OriginalMember(owner = "client!KFJRVZCI", name = "p", descriptor = "D")
    public double z;

    @OriginalMember(owner = "client!KFJRVZCI", name = "q", descriptor = "D")
    public double y;

    @OriginalMember(owner = "client!KFJRVZCI", name = "C", descriptor = "D")
    private double projVelocityX;

    @OriginalMember(owner = "client!KFJRVZCI", name = "D", descriptor = "D")
    private double projVelocityZ;

    @OriginalMember(owner = "client!KFJRVZCI", name = "E", descriptor = "D")
    private double projVelocity;

    @OriginalMember(owner = "client!KFJRVZCI", name = "F", descriptor = "D")
    private double projVelocityY;

    @OriginalMember(owner = "client!KFJRVZCI", name = "H", descriptor = "D")
    private double accelerationY;

    @OriginalMember(owner = "client!KFJRVZCI", name = "v", descriptor = "I")
    public int yaw;

    @OriginalMember(owner = "client!KFJRVZCI", name = "w", descriptor = "I")
    public int pitch;

    @OriginalMember(owner = "client!KFJRVZCI", name = "A", descriptor = "I")
    private int seqFrame;

    @OriginalMember(owner = "client!KFJRVZCI", name = "B", descriptor = "I")
    private int seqCycle;

    @OriginalMember(owner = "client!KFJRVZCI", name = "<init>", descriptor = "(IIIIIIIIBIII)V")
    public ProjectileEntity(int level, int offsetY, int arc, int srcZ, int spotanim, int lastCycle, int peakPitch, int target, int srcY, int srcX, int startCycle) {
        this.spotanim = SpotAnimType.instances[spotanim];
        this.projLevel = level;
        this.srcX = srcX;
        this.srcZ = srcZ;
        this.srcY = srcY;
        this.startCycle = startCycle;
        this.lastCycle = lastCycle;
        this.peakPitch = peakPitch;
        this.projArc = arc;
        this.projTarget = target;
        this.projOffsetY = offsetY;
    }

    @OriginalMember(owner = "client!KFJRVZCI", name = "a", descriptor = "(IIIII)V")
    public final void updateVelocity(int dstX, int dstZ, int dstY, int cycle) {
        if (!this.mobile) {
            double dx = (double) (dstX - this.srcX);
            double dz = (double) (dstZ - this.srcZ);
            double d = Math.sqrt(dx * dx + dz * dz);
            this.x = (double) this.projArc * dx / d + (double) this.srcX;
            this.z = (double) this.projArc * dz / d + (double) this.srcZ;
            this.y = this.srcY;
        }
        double dt = (double) (this.lastCycle + 1 - cycle);
        this.projVelocityX = ((double) dstX - this.x) / dt;
        this.projVelocityZ = ((double) dstZ - this.z) / dt;
        this.projVelocity = Math.sqrt(this.projVelocityZ * this.projVelocityZ + this.projVelocityX * this.projVelocityX);
        if (!this.mobile) {
            this.projVelocityY = -this.projVelocity * Math.tan((double) this.peakPitch * 0.02454369D);
        }
        this.accelerationY = ((double) dstY - this.y - this.projVelocityY * dt) * 2.0D / (dt * dt);
    }

    @OriginalMember(owner = "client!KFJRVZCI", name = "a", descriptor = "(IZ)V")
    public final void update(int delta) {
        this.mobile = true;
        this.x += (double) delta * this.projVelocityX;
        this.z += (double) delta * this.projVelocityZ;
        this.y += this.accelerationY * 0.5D * (double) delta * (double) delta + (double) delta * this.projVelocityY;
        this.projVelocityY += (double) delta * this.accelerationY;
        this.yaw = (int) (Math.atan2(this.projVelocityX, this.projVelocityZ) * 325.949D) + 1024 & 0x7FF;
        this.pitch = (int) (Math.atan2(this.projVelocityY, this.projVelocity) * 325.949D) & 0x7FF;
        if (this.spotanim.seq == null) {
            return;
        }
        this.seqCycle += delta;
        while (this.seqCycle > this.spotanim.seq.getDelay(0, this.seqFrame)) {
            this.seqCycle -= this.spotanim.seq.getDelay(0, this.seqFrame);
            this.seqFrame++;
            if (this.seqFrame >= this.spotanim.seq.field776) {
                this.seqFrame = 0;
            }
        }
    }

    @OriginalMember(owner = "client!KFJRVZCI", name = "a", descriptor = "(B)LLZYQDKJV;")
    public final Model draw(byte loopCycle) {
        Model tmp = this.spotanim.getModel();
        if (tmp == null) {
            return null;
        }
        int var3 = -1;
        if (this.spotanim.seq != null) {
            var3 = this.spotanim.seq.seqDelay[this.seqFrame];
        }
        Model model = new Model(false, false, true, tmp, AnimFrame.method265(this.field994, var3));
        if (var3 != -1) {
            model.createLabelReferences(7);
            model.applyTransform(var3, (byte) 6);
            model.labelFaces = null;
            model.labelVertices = null;
        }
        if (this.spotanim.resizeh != 128 || this.spotanim.resizev != 128) {
            model.scale(this.spotanim.resizev, this.spotanim.resizeh, 9, this.spotanim.resizeh);
        }
        model.rotateX(this.pitch, 341);
        model.calculateNormals(this.spotanim.ambient + 64, this.spotanim.contrast + 850, -30, -50, -30, true);
        return model;
    }
}
