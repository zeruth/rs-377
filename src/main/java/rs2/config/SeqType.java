package rs2.config;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.graphics.AnimFrame;
import rs2.io.Jagfile;
import rs2.io.Packet;

@OriginalClass("client!FHWCLIAS")
public class SeqType {

    @OriginalMember(owner = "client!FHWCLIAS", name = "b", descriptor = "Z")
    private boolean field773 = false;

    @OriginalMember(owner = "client!FHWCLIAS", name = "i", descriptor = "I")
    public int replayoff = -1;

    @OriginalMember(owner = "client!FHWCLIAS", name = "k", descriptor = "Z")
    public boolean field782 = false;

    @OriginalMember(owner = "client!FHWCLIAS", name = "l", descriptor = "I")
    public int field783 = 5;

    @OriginalMember(owner = "client!FHWCLIAS", name = "m", descriptor = "I")
    public int field784 = -1;

    @OriginalMember(owner = "client!FHWCLIAS", name = "n", descriptor = "I")
    public int field785 = -1;

    @OriginalMember(owner = "client!FHWCLIAS", name = "o", descriptor = "I")
    public int field786 = 99;

    @OriginalMember(owner = "client!FHWCLIAS", name = "p", descriptor = "I")
    public int field787 = -1;

    @OriginalMember(owner = "client!FHWCLIAS", name = "q", descriptor = "I")
    public int seqPriority = -1;

    @OriginalMember(owner = "client!FHWCLIAS", name = "r", descriptor = "I")
    public int field789 = 2;

    @OriginalMember(owner = "client!FHWCLIAS", name = "a", descriptor = "B")
    private static byte field772 = 6;

    @OriginalMember(owner = "client!FHWCLIAS", name = "c", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!FHWCLIAS", name = "e", descriptor = "I")
    public int seqFrameCount;

    @OriginalMember(owner = "client!FHWCLIAS", name = "s", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!FHWCLIAS", name = "t", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!FHWCLIAS", name = "f", descriptor = "[I")
    public int[] seqFrames;

    @OriginalMember(owner = "client!FHWCLIAS", name = "g", descriptor = "[I")
    public int[] field778;

    @OriginalMember(owner = "client!FHWCLIAS", name = "h", descriptor = "[I")
    private int[] field779;

    @OriginalMember(owner = "client!FHWCLIAS", name = "j", descriptor = "[I")
    public int[] field781;

    @OriginalMember(owner = "client!FHWCLIAS", name = "d", descriptor = "[LFHWCLIAS;")
    public static SeqType[] instances;

    @OriginalMember(owner = "client!FHWCLIAS", name = "a", descriptor = "(LATJMVOZR;I)V")
    public static void method213(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(true, arg0.method2("seq.dat", null));
        field774 = var2.g2();
        if (instances == null) {
            instances = new SeqType[field774];
        }
        for (int var3 = 0; var3 < field774; var3++) {
            if (instances[var3] == null) {
                instances[var3] = new SeqType();
            }
            instances[var3].method215(field772, var2);
        }
        if (arg1 == 36135) {
            ;
        }
    }

    @OriginalMember(owner = "client!FHWCLIAS", name = "a", descriptor = "(II)I")
    public int getDelay(int arg0, int arg1) {
        int var3 = this.field779[arg1];
        if (arg0 != 0) {
            return 1;
        }
        if (var3 == 0) {
            AnimFrame var4 = AnimFrame.method264(this.seqFrames[arg1]);
            if (var4 != null) {
                var3 = this.field779[arg1] = var4.field930;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!FHWCLIAS", name = "a", descriptor = "(BLMFMVIYHT;)V")
    public void method215(byte arg0, Packet arg1) {
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            this.field773 = !this.field773;
        }
        while (true) {
            while (true) {
                int var4 = arg1.g1();
                if (var4 == 0) {
                    if (this.seqFrameCount == 0) {
                        this.seqFrameCount = 1;
                        this.seqFrames = new int[1];
                        this.seqFrames[0] = -1;
                        this.field778 = new int[1];
                        this.field778[0] = -1;
                        this.field779 = new int[1];
                        this.field779[0] = -1;
                    }
                    if (this.field787 == -1) {
                        if (this.field781 == null) {
                            this.field787 = 0;
                        } else {
                            this.field787 = 2;
                        }
                    }
                    if (this.seqPriority == -1) {
                        if (this.field781 != null) {
                            this.seqPriority = 2;
                            return;
                        }
                        this.seqPriority = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.seqFrameCount = arg1.g1();
                    this.seqFrames = new int[this.seqFrameCount];
                    this.field778 = new int[this.seqFrameCount];
                    this.field779 = new int[this.seqFrameCount];
                    for (int var5 = 0; var5 < this.seqFrameCount; var5++) {
                        this.seqFrames[var5] = arg1.g2();
                        this.field778[var5] = arg1.g2();
                        if (this.field778[var5] == 65535) {
                            this.field778[var5] = -1;
                        }
                        this.field779[var5] = arg1.g2();
                    }
                } else if (var4 == 2) {
                    this.replayoff = arg1.g2();
                } else if (var4 == 3) {
                    int var6 = arg1.g1();
                    this.field781 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field781[var7] = arg1.g1();
                    }
                    this.field781[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field782 = true;
                } else if (var4 == 5) {
                    this.field783 = arg1.g1();
                } else if (var4 == 6) {
                    this.field784 = arg1.g2();
                } else if (var4 == 7) {
                    this.field785 = arg1.g2();
                } else if (var4 == 8) {
                    this.field786 = arg1.g1();
                } else if (var4 == 9) {
                    this.field787 = arg1.g1();
                } else if (var4 == 10) {
                    this.seqPriority = arg1.g1();
                } else if (var4 == 11) {
                    this.field789 = arg1.g1();
                } else if (var4 == 12) {
                    this.field790 = arg1.g4();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
