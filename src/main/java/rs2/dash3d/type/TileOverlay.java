package rs2.dash3d.type;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.datastruct.Linkable;

@OriginalClass("client!JQCVNYYR")
public class TileOverlay {

    @OriginalMember(owner = "client!JQCVNYYR", name = "l", descriptor = "Z")
    public boolean flat = true;

    @OriginalMember(owner = "client!JQCVNYYR", name = "m", descriptor = "I")
    public int shape;

    @OriginalMember(owner = "client!JQCVNYYR", name = "n", descriptor = "I")
    public int shapeAngle;

    @OriginalMember(owner = "client!JQCVNYYR", name = "o", descriptor = "I")
    public int backgroundRgb;

    @OriginalMember(owner = "client!JQCVNYYR", name = "p", descriptor = "I")
    public int foregroundRgb;

    @OriginalMember(owner = "client!JQCVNYYR", name = "a", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "client!JQCVNYYR", name = "b", descriptor = "[I")
    public int[] vertexX;

    @OriginalMember(owner = "client!JQCVNYYR", name = "c", descriptor = "[I")
    public int[] vertexY;

    @OriginalMember(owner = "client!JQCVNYYR", name = "d", descriptor = "[I")
    public int[] vertexZ;

    @OriginalMember(owner = "client!JQCVNYYR", name = "h", descriptor = "[I")
    public int[] triangleVertexA;

    @OriginalMember(owner = "client!JQCVNYYR", name = "i", descriptor = "[I")
    public int[] triangleVertexB;

    @OriginalMember(owner = "client!JQCVNYYR", name = "j", descriptor = "[I")
    public int[] triangleVertexC;

    @OriginalMember(owner = "client!JQCVNYYR", name = "e", descriptor = "[I")
    public int[] triangleColorA;

    @OriginalMember(owner = "client!JQCVNYYR", name = "f", descriptor = "[I")
    public int[] triangleColorB;

    @OriginalMember(owner = "client!JQCVNYYR", name = "g", descriptor = "[I")
    public int[] triangleColorC;

    @OriginalMember(owner = "client!JQCVNYYR", name = "k", descriptor = "[I")
    public int[] triangleTextureIds;

    @OriginalMember(owner = "client!JQCVNYYR", name = "q", descriptor = "[I")
    public static int[] field917 = new int[6];

    @OriginalMember(owner = "client!JQCVNYYR", name = "r", descriptor = "[I")
    public static int[] field918 = new int[6];

    @OriginalMember(owner = "client!JQCVNYYR", name = "s", descriptor = "[I")
    public static int[] field919 = new int[6];

    @OriginalMember(owner = "client!JQCVNYYR", name = "t", descriptor = "[I")
    public static int[] field920 = new int[6];

    @OriginalMember(owner = "client!JQCVNYYR", name = "u", descriptor = "[I")
    public static int[] field921 = new int[6];

    @OriginalMember(owner = "client!JQCVNYYR", name = "v", descriptor = "[I")
    public static int[] field922 = new int[] { 1, 0 };

    @OriginalMember(owner = "client!JQCVNYYR", name = "w", descriptor = "[I")
    public static int[] field923 = new int[] { 2, 1 };

    @OriginalMember(owner = "client!JQCVNYYR", name = "x", descriptor = "[I")
    public static int[] field924 = new int[] { 3, 3 };

    @OriginalMember(owner = "client!JQCVNYYR", name = "y", descriptor = "[[I")
    public static final int[][] field925 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!JQCVNYYR", name = "z", descriptor = "[[I")
    public static final int[][] SHAPE_PATHS = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!JQCVNYYR", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public TileOverlay(int northwestY, int southwestColor2, int northeastY, int southwestY, int arg4, int northeastColor1, int northwestColor1, int arg7, int southeastColor1, int northeastColor2, int arg10, int southwestColor1, int shape, int southeastY, int northwestColor2, int textureId, int arg16, int southeastColor2, int arg18, int angle) {
        if (southwestY != southeastY || northeastY != southwestY || northwestY != southwestY) {
            this.flat = false;
        }
        this.shape = shape;
        this.shapeAngle = angle;
        this.backgroundRgb = arg16;
        this.foregroundRgb = arg7;
        short full_square = 128;
        int half_square = full_square / 2;
        int corner_small = full_square / 4;
        int corner_big = full_square * 3 / 4;
        if (arg10 < this.field901 || arg10 > this.field901) {
            throw new NullPointerException();
        }
        int[] points = field925[shape];
        int vertexCount = points.length;
        this.vertexX = new int[vertexCount];
        this.vertexY = new int[vertexCount];
        this.vertexZ = new int[vertexCount];
        int[] primaryColors = new int[vertexCount];
        int[] secondaryColors = new int[vertexCount];
        int sceneX = arg4 * full_square;
        int sceneZ = arg18 * full_square;
        for (int v = 0; v < vertexCount; v++) {
            int type = points[v];
            if ((type & 0x1) == 0 && type <= 8) {
                type = (type - angle - angle - 1 & 0x7) + 1;
            }
            if (type > 8 && type <= 12) {
                type = (type - angle - 9 & 0x3) + 9;
            }
            if (type > 12 && type <= 16) {
                type = (type - angle - 13 & 0x3) + 13;
            }
            int x;
            int z;
            int y;
            int color1;
            int color2;
            if (type == 1) {
                x = sceneX;
                z = sceneZ;
                y = southwestY;
                color1 = southwestColor1;
                color2 = southwestColor2;
            } else if (type == 2) {
                x = half_square + sceneX;
                z = sceneZ;
                y = southwestY + southeastY >> 1;
                color1 = southeastColor1 + southwestColor1 >> 1;
                color2 = southwestColor2 + southeastColor2 >> 1;
            } else if (type == 3) {
                x = full_square + sceneX;
                z = sceneZ;
                y = southeastY;
                color1 = southeastColor1;
                color2 = southeastColor2;
            } else if (type == 4) {
                x = full_square + sceneX;
                z = half_square + sceneZ;
                y = northeastY + southeastY >> 1;
                color1 = northeastColor1 + southeastColor1 >> 1;
                color2 = northeastColor2 + southeastColor2 >> 1;
            } else if (type == 5) {
                x = full_square + sceneX;
                z = full_square + sceneZ;
                y = northeastY;
                color1 = northeastColor1;
                color2 = northeastColor2;
            } else if (type == 6) {
                x = half_square + sceneX;
                z = full_square + sceneZ;
                y = northwestY + northeastY >> 1;
                color1 = northeastColor1 + northwestColor1 >> 1;
                color2 = northeastColor2 + northwestColor2 >> 1;
            } else if (type == 7) {
                x = sceneX;
                z = full_square + sceneZ;
                y = northwestY;
                color1 = northwestColor1;
                color2 = northwestColor2;
            } else if (type == 8) {
                x = sceneX;
                z = half_square + sceneZ;
                y = northwestY + southwestY >> 1;
                color1 = northwestColor1 + southwestColor1 >> 1;
                color2 = southwestColor2 + northwestColor2 >> 1;
            } else if (type == 9) {
                x = half_square + sceneX;
                z = corner_small + sceneZ;
                y = southwestY + southeastY >> 1;
                color1 = southeastColor1 + southwestColor1 >> 1;
                color2 = southwestColor2 + southeastColor2 >> 1;
            } else if (type == 10) {
                x = corner_big + sceneX;
                z = half_square + sceneZ;
                y = northeastY + southeastY >> 1;
                color1 = northeastColor1 + southeastColor1 >> 1;
                color2 = northeastColor2 + southeastColor2 >> 1;
            } else if (type == 11) {
                x = half_square + sceneX;
                z = corner_big + sceneZ;
                y = northwestY + northeastY >> 1;
                color1 = northeastColor1 + northwestColor1 >> 1;
                color2 = northeastColor2 + northwestColor2 >> 1;
            } else if (type == 12) {
                x = corner_small + sceneX;
                z = half_square + sceneZ;
                y = northwestY + southwestY >> 1;
                color1 = northwestColor1 + southwestColor1 >> 1;
                color2 = southwestColor2 + northwestColor2 >> 1;
            } else if (type == 13) {
                x = corner_small + sceneX;
                z = corner_small + sceneZ;
                y = southwestY;
                color1 = southwestColor1;
                color2 = southwestColor2;
            } else if (type == 14) {
                x = corner_big + sceneX;
                z = corner_small + sceneZ;
                y = southeastY;
                color1 = southeastColor1;
                color2 = southeastColor2;
            } else if (type == 15) {
                x = corner_big + sceneX;
                z = corner_big + sceneZ;
                y = northeastY;
                color1 = northeastColor1;
                color2 = northeastColor2;
            } else {
                x = corner_small + sceneX;
                z = corner_big + sceneZ;
                y = northwestY;
                color1 = northwestColor1;
                color2 = northwestColor2;
            }
            this.vertexX[v] = x;
            this.vertexY[v] = y;
            this.vertexZ[v] = z;
            primaryColors[v] = color1;
            secondaryColors[v] = color2;
        }
        int[] paths = SHAPE_PATHS[shape];
        int triangleCount = paths.length / 4;
        this.triangleVertexA = new int[triangleCount];
        this.triangleVertexB = new int[triangleCount];
        this.triangleVertexC = new int[triangleCount];
        this.triangleColorA = new int[triangleCount];
        this.triangleColorB = new int[triangleCount];
        this.triangleColorC = new int[triangleCount];
        if (textureId != -1) {
            this.triangleTextureIds = new int[triangleCount];
        }
        int index = 0;
        for (int t = 0; t < triangleCount; t++) {
            int color = paths[index];
            int a = paths[index + 1];
            int b = paths[index + 2];
            int c = paths[index + 3];
            index += 4;
            if (a < 4) {
                a = a - angle & 0x3;
            }
            if (b < 4) {
                b = b - angle & 0x3;
            }
            if (c < 4) {
                c = c - angle & 0x3;
            }
            this.triangleVertexA[t] = a;
            this.triangleVertexB[t] = b;
            this.triangleVertexC[t] = c;
            if (color == 0) {
                this.triangleColorA[t] = primaryColors[a];
                this.triangleColorB[t] = primaryColors[b];
                this.triangleColorC[t] = primaryColors[c];
                if (this.triangleTextureIds != null) {
                    this.triangleTextureIds[t] = -1;
                }
            } else {
                this.triangleColorA[t] = secondaryColors[a];
                this.triangleColorB[t] = secondaryColors[b];
                this.triangleColorC[t] = secondaryColors[c];
                if (this.triangleTextureIds != null) {
                    this.triangleTextureIds[t] = textureId;
                }
            }
        }
    }
}
