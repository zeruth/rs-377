package rs2.dash3d.entity;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.config.SeqType;

@OriginalClass("client!LRUWCBNN")
public abstract class PathingEntity extends Entity {

    @OriginalMember(owner = "client!LRUWCBNN", name = "n", descriptor = "I")
    private int field1128 = -89;

    @OriginalMember(owner = "client!LRUWCBNN", name = "o", descriptor = "I")
    public int chatTimer = 100;

    @OriginalMember(owner = "client!LRUWCBNN", name = "s", descriptor = "[I")
    public int[] routeFlagX = new int[10];

    @OriginalMember(owner = "client!LRUWCBNN", name = "t", descriptor = "[I")
    public int[] routeFlagZ = new int[10];

    @OriginalMember(owner = "client!LRUWCBNN", name = "u", descriptor = "I")
    public int secondarySeqId = -1;

    @OriginalMember(owner = "client!LRUWCBNN", name = "x", descriptor = "[Z")
    public boolean[] routeRun = new boolean[10];

    @OriginalMember(owner = "client!LRUWCBNN", name = "y", descriptor = "Z")
    public boolean field1139 = false;

    @OriginalMember(owner = "client!LRUWCBNN", name = "A", descriptor = "I")
    public int maxY = 200;

    @OriginalMember(owner = "client!LRUWCBNN", name = "B", descriptor = "I")
    public int combatCycle = -1000;

    @OriginalMember(owner = "client!LRUWCBNN", name = "G", descriptor = "I")
    public int field1147 = 32;

    @OriginalMember(owner = "client!LRUWCBNN", name = "H", descriptor = "I")
    public int size = 1;

    @OriginalMember(owner = "client!LRUWCBNN", name = "P", descriptor = "I")
    public int targetId = -1;

    @OriginalMember(owner = "client!LRUWCBNN", name = "U", descriptor = "I")
    public int spotanimId = -1;

    @OriginalMember(owner = "client!LRUWCBNN", name = "Z", descriptor = "I")
    public int seqWalkId = -1;

    @OriginalMember(owner = "client!LRUWCBNN", name = "ab", descriptor = "I")
    public int seqTurnAroundId = -1;

    @OriginalMember(owner = "client!LRUWCBNN", name = "bb", descriptor = "I")
    public int seqTurnLeftId = -1;

    @OriginalMember(owner = "client!LRUWCBNN", name = "cb", descriptor = "I")
    public int seqTurnRightId = -1;

    @OriginalMember(owner = "client!LRUWCBNN", name = "eb", descriptor = "I")
    public int primarySeqId = -1;

    @OriginalMember(owner = "client!LRUWCBNN", name = "jb", descriptor = "I")
    public int seqRunId = -1;

    @OriginalMember(owner = "client!LRUWCBNN", name = "kb", descriptor = "[I")
    public int[] field1177 = new int[4];

    @OriginalMember(owner = "client!LRUWCBNN", name = "lb", descriptor = "[I")
    public int[] field1178 = new int[4];

    @OriginalMember(owner = "client!LRUWCBNN", name = "mb", descriptor = "[I")
    public int[] field1179 = new int[4];

    @OriginalMember(owner = "client!LRUWCBNN", name = "ob", descriptor = "I")
    public int seqStandId = -1;

    @OriginalMember(owner = "client!LRUWCBNN", name = "pb", descriptor = "I")
    public int seqTurnId = -1;

    @OriginalMember(owner = "client!LRUWCBNN", name = "p", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "client!LRUWCBNN", name = "q", descriptor = "I")
    public int dstYaw;

    @OriginalMember(owner = "client!LRUWCBNN", name = "r", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "client!LRUWCBNN", name = "v", descriptor = "I")
    public int secondarySeqFrame;

    @OriginalMember(owner = "client!LRUWCBNN", name = "w", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "client!LRUWCBNN", name = "z", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "client!LRUWCBNN", name = "C", descriptor = "I")
    public int health;

    @OriginalMember(owner = "client!LRUWCBNN", name = "D", descriptor = "I")
    public int totalHealth;

    @OriginalMember(owner = "client!LRUWCBNN", name = "E", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!LRUWCBNN", name = "F", descriptor = "I")
    public int field1146;

    @OriginalMember(owner = "client!LRUWCBNN", name = "I", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!LRUWCBNN", name = "J", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!LRUWCBNN", name = "K", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "client!LRUWCBNN", name = "L", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "client!LRUWCBNN", name = "M", descriptor = "I")
    public int field1153;

    @OriginalMember(owner = "client!LRUWCBNN", name = "N", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!LRUWCBNN", name = "O", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!LRUWCBNN", name = "Q", descriptor = "I")
    public int y;

    @OriginalMember(owner = "client!LRUWCBNN", name = "R", descriptor = "I")
    public int x;

    @OriginalMember(owner = "client!LRUWCBNN", name = "S", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "client!LRUWCBNN", name = "T", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "client!LRUWCBNN", name = "V", descriptor = "I")
    public int spotanimFrame;

    @OriginalMember(owner = "client!LRUWCBNN", name = "W", descriptor = "I")
    public int spotanimCycle;

    @OriginalMember(owner = "client!LRUWCBNN", name = "X", descriptor = "I")
    public int spotanimLastCycle;

    @OriginalMember(owner = "client!LRUWCBNN", name = "Y", descriptor = "I")
    public int spotanimOffset;

    @OriginalMember(owner = "client!LRUWCBNN", name = "db", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!LRUWCBNN", name = "fb", descriptor = "I")
    public int primarySeqFrame;

    @OriginalMember(owner = "client!LRUWCBNN", name = "gb", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "client!LRUWCBNN", name = "hb", descriptor = "I")
    public int primarySeqDelay;

    @OriginalMember(owner = "client!LRUWCBNN", name = "ib", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "client!LRUWCBNN", name = "nb", descriptor = "I")
    public int routeLength;

    @OriginalMember(owner = "client!LRUWCBNN", name = "m", descriptor = "Ljava/lang/String;")
    public String chat;

    @OriginalMember(owner = "client!LRUWCBNN", name = "a", descriptor = "(I)V")
    public final void method350(int arg0) {
        this.routeLength = 0;
        this.field1160 = 0;
    }

    @OriginalMember(owner = "client!LRUWCBNN", name = "b", descriptor = "(I)Z")
    public boolean isVisibleNow(int arg0) {
        return false;
    }

    @OriginalMember(owner = "client!LRUWCBNN", name = "a", descriptor = "(ZII)V")
    public final void step(boolean running, int direction) {
        int nextX = this.routeFlagX[0];
        int nextZ = this.routeFlagZ[0];
        if (direction == 0) {
            nextX--;
            nextZ++;
        }
        if (direction == 1) {
            nextZ++;
        }
        if (direction == 2) {
            nextX++;
            nextZ++;
        }
        if (direction == 3) {
            nextX--;
        }
        if (direction == 4) {
            nextX++;
        }
        if (direction == 5) {
            nextX--;
            nextZ--;
        }
        if (direction == 6) {
            nextZ--;
        }
        if (direction == 7) {
            nextX++;
            nextZ--;
        }
        if (this.primarySeqId != -1 && SeqType.instances[this.primarySeqId].seqPriority == 1) {
            this.primarySeqId = -1;
        }
        if (this.routeLength < 9) {
            this.routeLength++;
        }
        for (int i = this.routeLength; i > 0; i--) {
            this.routeFlagX[i] = this.routeFlagX[i - 1];
            this.routeFlagZ[i] = this.routeFlagZ[i - 1];
            this.routeRun[i] = this.routeRun[i - 1];
        }
        this.routeFlagX[0] = nextX;
        this.routeFlagZ[0] = nextZ;
        this.routeRun[0] = running;
    }

    @OriginalMember(owner = "client!LRUWCBNN", name = "a", descriptor = "(IZII)V")
    public final void method353(int arg0, boolean arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < 4; var5++) {
            if (this.field1179[var5] <= arg0) {
                this.field1177[var5] = arg2;
                this.field1178[var5] = arg3;
                this.field1179[var5] = arg0 + 70;
                return;
            }
        }
        if (arg1) {
            this.field1128 = -52;
        }
    }

    @OriginalMember(owner = "client!LRUWCBNN", name = "a", descriptor = "(IBZI)V")
    public final void move(int z, boolean teleport, int x) {
        if (this.primarySeqId != -1 && SeqType.instances[this.primarySeqId].seqPriority == 1) {
            this.primarySeqId = -1;
        }
        if (!teleport) {
            int dx = x - this.routeFlagX[0];
            int dz = z - this.routeFlagZ[0];
            if (dx >= -8 && dx <= 8 && dz >= -8 && dz <= 8) {
                if (this.routeLength < 9) {
                    this.routeLength++;
                }
                for (int var7 = this.routeLength; var7 > 0; var7--) {
                    this.routeFlagX[var7] = this.routeFlagX[var7 - 1];
                    this.routeFlagZ[var7] = this.routeFlagZ[var7 - 1];
                    this.routeRun[var7] = this.routeRun[var7 - 1];
                }
                this.routeFlagX[0] = x;
                this.routeFlagZ[0] = z;
                this.routeRun[0] = false;
                return;
            }
        }
        this.routeLength = 0;
        this.field1160 = 0;
        this.field1170 = 0;
        this.routeFlagX[0] = x;
        this.routeFlagZ[0] = z;
        this.y = this.routeFlagX[0] * 128 + this.size * 64;
        this.x = this.routeFlagZ[0] * 128 + this.size * 64;
    }
}
