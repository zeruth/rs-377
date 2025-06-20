package rs2.dash3d.entity;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.dash3d.VertexNormal;
import rs2.datastruct.DoublyLinkable;
import rs2.graphics.Model;

@OriginalClass("client!ZOXDNIET")
public class Entity extends DoublyLinkable {

    @OriginalMember(owner = "client!ZOXDNIET", name = "i", descriptor = "Z")
    private boolean field1707 = true;

    @OriginalMember(owner = "client!ZOXDNIET", name = "k", descriptor = "I")
    public int maxY = 1000;

    @OriginalMember(owner = "client!ZOXDNIET", name = "h", descriptor = "B")
    private static byte field1706 = 3;

    @OriginalMember(owner = "client!ZOXDNIET", name = "l", descriptor = "Z")
    public static boolean field1710;

    @OriginalMember(owner = "client!ZOXDNIET", name = "j", descriptor = "[LVOUTABRU;")
    public VertexNormal[] vertexNormal;

    @OriginalMember(owner = "client!ZOXDNIET", name = "a", descriptor = "(IIIIIIIII)V")
    public void draw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Model var10 = this.draw(field1706);
        if (var10 != null) {
            this.maxY = var10.maxY;
            var10.draw(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!ZOXDNIET", name = "a", descriptor = "(B)LLZYQDKJV;")
    public Model draw(byte loopCycle) {
        return null;
    }
}
