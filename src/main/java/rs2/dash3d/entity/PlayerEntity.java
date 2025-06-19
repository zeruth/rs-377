package rs2.dash3d.entity;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.client.client;
import rs2.config.*;
import rs2.datastruct.JString;
import rs2.datastruct.LruCache;
import rs2.graphics.AnimFrame;
import rs2.graphics.Model;
import rs2.io.Packet;

@OriginalClass("client!ZGNGQRPJ")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "ub", descriptor = "Z")
    private boolean field1669 = false;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "vb", descriptor = "I")
    public int field1670 = -1;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "wb", descriptor = "J")
    public long field1671 = -1L;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "zb", descriptor = "[I")
    public int[] appearances = new int[12];

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Db", descriptor = "I")
    public int field1678 = -1;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Fb", descriptor = "Z")
    public boolean playerVisible = false;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Hb", descriptor = "[I")
    public int[] colors = new int[5];

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Jb", descriptor = "Z")
    private boolean field1684 = true;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Kb", descriptor = "Z")
    public boolean lowMemory = false;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Ob", descriptor = "Z")
    private boolean field1689 = false;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Tb", descriptor = "I")
    private int field1694 = 932;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Ib", descriptor = "LRHNYLZZL;")
    public static LruCache field1683 = new LruCache(260);

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "qb", descriptor = "I")
    public int locOffsetY;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "rb", descriptor = "I")
    public int locOffsetZ;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "sb", descriptor = "I")
    public int locOffsetX;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "xb", descriptor = "I")
    public int z;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Ab", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Cb", descriptor = "I")
    public int gender;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Gb", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Lb", descriptor = "I")
    public int locStartCycle;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Mb", descriptor = "I")
    public int locStopCycle;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Nb", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Pb", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Qb", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Rb", descriptor = "I")
    public int field1692;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Sb", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Bb", descriptor = "J")
    public long appearanceHashcode;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "tb", descriptor = "LLZYQDKJV;")
    public Model locModel;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "Eb", descriptor = "LSLDUQHOR;")
    public NpcType field1679;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "yb", descriptor = "Ljava/lang/String;")
    public String name;

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "a", descriptor = "(Z)LLZYQDKJV;")
    public final Model method572(boolean arg0) {
        if (!this.playerVisible) {
            return null;
        } else if (this.field1679 != null) {
            return this.field1679.method472(858);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.appearances[var3];
                if (var12 >= 256 && var12 < 512 && !IdkType.field1699[var12 - 256].method579(-10584)) {
                    var2 = true;
                }
                if (var12 >= 512 && !ObjType.get(var12 - 512).method220(this.gender, 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.appearances[var6];
                    if (var9 >= 256 && var9 < 512) {
                        Model var10 = IdkType.field1699[var9 - 256].method580(this.field1669);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        Model var11 = ObjType.get(var9 - 512).method228(true, this.gender);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                Model var7 = new Model(var5, var4, (byte) -89);
                if (!arg0) {
                    throw new NullPointerException();
                } else {
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.colors[var8] != 0) {
                            var7.method373(client.DESIGN_IDK_COLORS[var8][0], client.DESIGN_IDK_COLORS[var8][this.colors[var8]]);
                            if (var8 == 1) {
                                var7.method373(client.field564[0], client.field564[this.colors[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "b", descriptor = "(B)LLZYQDKJV;")
    private final Model getSequencedModel(byte arg0) {
        if (this.field1679 != null) {
            int var2 = -1;
            if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
                var2 = SeqType.instances[super.primarySeqId].seqFrames[super.primarySeqFrame];
            } else if (super.secondarySeqId >= 0) {
                var2 = SeqType.instances[super.secondarySeqId].seqFrames[super.secondarySeqFrame];
            }
            return this.field1679.getSequencedModel(var2, -1, 0, (int[]) null);
        } else {
            long var4 = this.appearanceHashcode;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (arg0 != 122) {
                this.field1689 = !this.field1689;
            }
            if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
                SeqType var10 = SeqType.instances[super.primarySeqId];
                var6 = var10.seqFrames[super.primarySeqFrame];
                if (super.secondarySeqId >= 0 && super.seqStandId != super.secondarySeqId) {
                    var7 = SeqType.instances[super.secondarySeqId].seqFrames[super.secondarySeqFrame];
                }
                if (var10.field784 >= 0) {
                    var8 = var10.field784;
                    var4 += (long) (var8 - this.appearances[5] << 8);
                }
                if (var10.field785 >= 0) {
                    var9 = var10.field785;
                    var4 += (long) (var9 - this.appearances[3] << 16);
                }
            } else if (super.secondarySeqId >= 0) {
                var6 = SeqType.instances[super.secondarySeqId].seqFrames[super.secondarySeqFrame];
            }
            Model var11 = (Model) field1683.get(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.appearances[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !IdkType.field1699[var14 - 256].method577(256)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !ObjType.get(var14 - 512).method225(-861, this.gender)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1671 != -1L) {
                        var11 = (Model) field1683.get(this.field1671);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                Model[] var15 = new Model[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.appearances[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        Model var20 = IdkType.field1699[var19 - 256].method578((byte) 2);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        Model var21 = ObjType.get(var19 - 512).method222((byte) -98, this.gender);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new Model(var16, var15, (byte) -89);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.colors[var18] != 0) {
                        var11.method373(client.DESIGN_IDK_COLORS[var18][0], client.DESIGN_IDK_COLORS[var18][this.colors[var18]]);
                        if (var18 == 1) {
                            var11.method373(client.field564[0], client.field564[this.colors[var18]]);
                        }
                    }
                }
                var11.createLabelReferences(7);
                var11.calculateNormals(64, 850, -30, -50, -30, true);
                field1683.put(var11, var4);
                this.field1671 = var4;
            }
            if (this.lowMemory) {
                return var11;
            } else {
                Model var22 = Model.field1190;
                var22.method361(AnimFrame.method265(this.field1684, var6) & AnimFrame.method265(this.field1684, var7), var11, 1244);
                if (var6 != -1 && var7 != -1) {
                    var22.method368(var7, 0, var6, SeqType.instances[super.primarySeqId].field781);
                } else if (var6 != -1) {
                    var22.applyTransform(var6, (byte) 6);
                }
                var22.method363(this.field1694);
                var22.labelFaces = null;
                var22.labelVertices = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "b", descriptor = "(I)Z")
    public final boolean isVisibleNow(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.playerVisible;
    }

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "a", descriptor = "(B)LLZYQDKJV;")
    public final Model draw(byte loopCycle) {
        if (!this.playerVisible) {
            return null;
        } else {
            Model model = this.getSequencedModel((byte) 122);
            if (model == null) {
                return null;
            } else {
                super.maxY = model.maxY;
                model.pickable = true;
                if (this.lowMemory) {
                    return model;
                } else {
                    if (super.spotanimId != -1 && super.spotanimFrame != -1) {
                        SpotAnimType spotanim = SpotAnimType.instances[super.spotanimId];
                        Model spotAnimModel = spotanim.getModel();
                        if (spotAnimModel != null) {
                            Model model2 = new Model(false, false, true, spotAnimModel, AnimFrame.method265(this.field1684, super.spotanimFrame));
                            model2.translateModel(0, 0, false, -super.spotanimOffset);
                            model2.createLabelReferences(7);
                            model2.applyTransform(spotanim.seq.seqFrames[super.spotanimFrame], (byte) 6);
                            model2.labelFaces = null;
                            model2.labelVertices = null;
                            if (spotanim.resizeh != 128 || spotanim.resizev != 128) {
                                model2.scale(spotanim.resizev, spotanim.resizeh, 9, spotanim.resizeh);
                            }
                            model2.calculateNormals(spotanim.ambient + 64, spotanim.contrast + 850, -30, -50, -30, true);
                            Model[] models = new Model[] { model, model2 };
                            model = new Model(2, true, 0, models);
                        }
                    }
                    if (this.locModel != null) {
                        if (client.loopCycle >= this.locStopCycle) {
                            this.locModel = null;
                        }
                        if (client.loopCycle >= this.locStartCycle && client.loopCycle < this.locStopCycle) {
                            Model loc = this.locModel;
                            loc.translateModel(this.locOffsetY - super.y, this.locOffsetX - super.x, false, this.locOffsetZ - this.z);
                            if (super.dstYaw == 512) {
                                loc.rotateY90(true);
                                loc.rotateY90(true);
                                loc.rotateY90(true);
                            } else if (super.dstYaw == 1024) {
                                loc.rotateY90(true);
                                loc.rotateY90(true);
                            } else if (super.dstYaw == 1536) {
                                loc.rotateY90(true);
                            }
                            Model[] models = new Model[] { model, loc };
                            model = new Model(2, true, 0, models);
                            if (super.dstYaw == 512) {
                                loc.rotateY90(true);
                            } else if (super.dstYaw == 1024) {
                                loc.rotateY90(true);
                                loc.rotateY90(true);
                            } else if (super.dstYaw == 1536) {
                                loc.rotateY90(true);
                                loc.rotateY90(true);
                                loc.rotateY90(true);
                            }
                            loc.translateModel(super.y - this.locOffsetY, super.x - this.locOffsetX, false, this.z - this.locOffsetZ);
                        }
                    }
                    model.pickable = true;
                    return model;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZGNGQRPJ", name = "a", descriptor = "(LMFMVIYHT;I)V")
    public final void read(Packet buf, int arg1) {
        buf.pos = 0;
        this.gender = buf.g1();
        this.field1678 = buf.g1b();
        this.field1670 = buf.g1b();
        this.field1679 = null;
        this.field1688 = 0;
        for (int part = 0; part < 12; ++part) {
            int msb = buf.g1();
            if (msb == 0) {
                this.appearances[part] = 0;
            } else {
                int var5 = buf.g1();
                this.appearances[part] = (msb << 8) + var5;
                if (part == 0 && this.appearances[0] == 65535) {
                    this.field1679 = NpcType.get(buf.g2());
                    break;
                }
                if (this.appearances[part] >= 512 && this.appearances[part] - 512 < ObjType.field817) {
                    int var12 = ObjType.get(this.appearances[part] - 512).field814;
                    if (var12 != 0) {
                        this.field1688 = var12;
                    }
                }
            }
        }
        for (int part = 0; part < 5; ++part) {
            int color = buf.g1();
            if (color < 0 || color >= client.DESIGN_IDK_COLORS[part].length) {
                color = 0;
            }
            this.colors[part] = color;
        }
        super.seqStandId = buf.g2();
        if (super.seqStandId == 65535) {
            super.seqStandId = -1;
        }
        super.seqTurnId = buf.g2();
        if (super.seqTurnId == 65535) {
            super.seqTurnId = -1;
        }
        super.seqWalkId = buf.g2();
        if (super.seqWalkId == 65535) {
            super.seqWalkId = -1;
        }
        super.seqTurnAroundId = buf.g2();
        if (super.seqTurnAroundId == 65535) {
            super.seqTurnAroundId = -1;
        }
        super.seqTurnLeftId = buf.g2();
        if (super.seqTurnLeftId == 65535) {
            super.seqTurnLeftId = -1;
        }
        super.seqTurnRightId = buf.g2();
        if (super.seqTurnRightId == 65535) {
            super.seqTurnRightId = -1;
        }
        super.seqRunId = buf.g2();
        if (super.seqRunId == 65535) {
            super.seqRunId = -1;
        }
        this.name = JString.formatName(JString.fromBase37(buf.g8(-149)));
        this.field1675 = buf.g1();
        this.field1681 = buf.g2();
        this.playerVisible = true;
        this.appearanceHashcode = 0L;
        int var7 = this.appearances[5];
        int var8 = this.appearances[9];
        if (arg1 == 0) {
            this.appearances[5] = var8;
            this.appearances[9] = var7;
            for (int part = 0; part < 12; ++part) {
                this.appearanceHashcode <<= 4;
                if (this.appearances[part] >= 256) {
                    this.appearanceHashcode += (long) (this.appearances[part] - 256);
                }
            }
            if (this.appearances[0] >= 256) {
                this.appearanceHashcode += (long) (this.appearances[0] - 256 >> 4);
            }
            if (this.appearances[1] >= 256) {
                this.appearanceHashcode += (long) (this.appearances[1] - 256 >> 8);
            }
            this.appearances[5] = var7;
            this.appearances[9] = var8;
            for (int part = 0; part < 5; ++part) {
                this.appearanceHashcode <<= 3;
                this.appearanceHashcode += (long) this.colors[part];
            }
            this.appearanceHashcode <<= 1;
            this.appearanceHashcode += (long) this.gender;
        }
    }
}
