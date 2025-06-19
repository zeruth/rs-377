package rs2.dash3d.entity;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.config.NpcType;
import rs2.config.SeqType;
import rs2.config.SpotAnimType;
import rs2.graphics.AnimFrame;
import rs2.graphics.Model;

@OriginalClass("client!RGHBDSIJ")
public class NpcEntity extends PathingEntity {

    @OriginalMember(owner = "client!RGHBDSIJ", name = "qb", descriptor = "Z")
    private boolean field1369 = true;

    @OriginalMember(owner = "client!RGHBDSIJ", name = "rb", descriptor = "LSLDUQHOR;")
    public NpcType npcType;

    @OriginalMember(owner = "client!RGHBDSIJ", name = "b", descriptor = "(B)LLZYQDKJV;")
    private final Model getSequencedModel() {
        if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
            int primaryTransformId = SeqType.instances[super.primarySeqId].seqFrames[super.primarySeqFrame];
            int secondaryTransformId = -1;
            if (super.secondarySeqId >= 0 && super.seqStandId != super.secondarySeqId) {
                secondaryTransformId = SeqType.instances[super.secondarySeqId].seqFrames[super.secondarySeqFrame];
            }
            return this.npcType.getSequencedModel(primaryTransformId, secondaryTransformId, 0, SeqType.instances[super.primarySeqId].field781);
        } else {
            int secondaryTransformId = -1;
            if (super.secondarySeqId >= 0) {
                secondaryTransformId = SeqType.instances[super.secondarySeqId].seqFrames[super.secondarySeqFrame];
            }
            return this.npcType.getSequencedModel(secondaryTransformId, -1, 0, null);
        }
    }

    @OriginalMember(owner = "client!RGHBDSIJ", name = "a", descriptor = "(B)LLZYQDKJV;")
    public final Model draw(byte loopCycle) {
        if (loopCycle != 3) {
            throw new NullPointerException();
        } else {
            boolean var2 = false;
            if (this.npcType == null) {
                return null;
            } else {
                Model model = this.getSequencedModel();
                if (model == null) {
                    return null;
                } else {
                    super.maxY = model.maxY;
                    if (super.spotanimId != -1 && super.spotanimFrame != -1) {
                        SpotAnimType spotanim = SpotAnimType.instances[super.spotanimId];
                        Model model1 = spotanim.getModel();
                        if (model1 != null) {
                            int delay = spotanim.seq.seqFrames[super.spotanimFrame];
                            Model model2 = new Model(false, false, true, model1, AnimFrame.method265(this.field1369, delay));
                            model2.translateModel(0, 0, false, -super.spotanimOffset);
                            model2.createLabelReferences(7);
                            model2.applyTransform(delay, (byte) 6);
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
                    if (this.npcType.field1445 == 1) {
                        model.pickable = true;
                    }
                    return model;
                }
            }
        }
    }

    @OriginalMember(owner = "client!RGHBDSIJ", name = "b", descriptor = "(I)Z")
    public final boolean isVisibleNow(int arg0) {
        return this.npcType != null;
    }
}
