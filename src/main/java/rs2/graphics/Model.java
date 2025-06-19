package rs2.graphics;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.dash3d.VertexNormal;
import rs2.dash3d.entity.Entity;
import rs2.io.OnDemandProvider;
import rs2.io.Packet;

@OriginalClass("client!LZYQDKJV")
public class Model extends Entity {

    @OriginalMember(owner = "client!LZYQDKJV", name = "m", descriptor = "I")
    private int field1183 = 932;

    @OriginalMember(owner = "client!LZYQDKJV", name = "n", descriptor = "I")
    private int field1184 = 426;

    @OriginalMember(owner = "client!LZYQDKJV", name = "o", descriptor = "Z")
    private boolean field1185 = false;

    @OriginalMember(owner = "client!LZYQDKJV", name = "p", descriptor = "Z")
    private boolean field1186 = true;

    @OriginalMember(owner = "client!LZYQDKJV", name = "q", descriptor = "I")
    private int field1187 = -252;

    @OriginalMember(owner = "client!LZYQDKJV", name = "r", descriptor = "Z")
    private boolean field1188 = false;

    @OriginalMember(owner = "client!LZYQDKJV", name = "eb", descriptor = "Z")
    public boolean field1227 = false;

    @OriginalMember(owner = "client!LZYQDKJV", name = "y", descriptor = "I")
    public int vertexCount;

    @OriginalMember(owner = "client!LZYQDKJV", name = "C", descriptor = "I")
    public int faceCount;

    @OriginalMember(owner = "client!LZYQDKJV", name = "O", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!LZYQDKJV", name = "z", descriptor = "[I")
    public int[] vertexX;

    @OriginalMember(owner = "client!LZYQDKJV", name = "A", descriptor = "[I")
    public int[] vertexY;

    @OriginalMember(owner = "client!LZYQDKJV", name = "B", descriptor = "[I")
    public int[] vertexZ;

    @OriginalMember(owner = "client!LZYQDKJV", name = "D", descriptor = "[I")
    public int[] faceVertexA;

    @OriginalMember(owner = "client!LZYQDKJV", name = "E", descriptor = "[I")
    public int[] faceVertexB;

    @OriginalMember(owner = "client!LZYQDKJV", name = "F", descriptor = "[I")
    public int[] faceVertexC;

    @OriginalMember(owner = "client!LZYQDKJV", name = "P", descriptor = "[I")
    public int[] field1212;

    @OriginalMember(owner = "client!LZYQDKJV", name = "Q", descriptor = "[I")
    public int[] field1213;

    @OriginalMember(owner = "client!LZYQDKJV", name = "R", descriptor = "[I")
    public int[] field1214;

    @OriginalMember(owner = "client!LZYQDKJV", name = "ab", descriptor = "[I")
    public int[] field1223;

    @OriginalMember(owner = "client!LZYQDKJV", name = "J", descriptor = "[I")
    public int[] faceInfo;

    @OriginalMember(owner = "client!LZYQDKJV", name = "K", descriptor = "[I")
    public int[] field1207;

    @OriginalMember(owner = "client!LZYQDKJV", name = "N", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!LZYQDKJV", name = "L", descriptor = "[I")
    public int[] field1208;

    @OriginalMember(owner = "client!LZYQDKJV", name = "bb", descriptor = "[I")
    public int[] field1224;

    @OriginalMember(owner = "client!LZYQDKJV", name = "M", descriptor = "[I")
    public int[] field1209;

    @OriginalMember(owner = "client!LZYQDKJV", name = "G", descriptor = "[I")
    public int[] field1203;

    @OriginalMember(owner = "client!LZYQDKJV", name = "H", descriptor = "[I")
    public int[] field1204;

    @OriginalMember(owner = "client!LZYQDKJV", name = "I", descriptor = "[I")
    public int[] field1205;

    @OriginalMember(owner = "client!LZYQDKJV", name = "fb", descriptor = "[LVOUTABRU;")
    public VertexNormal[] field1228;

    @OriginalMember(owner = "client!LZYQDKJV", name = "W", descriptor = "I")
    public int minY;

    @OriginalMember(owner = "client!LZYQDKJV", name = "V", descriptor = "I")
    public int field1218;

    @OriginalMember(owner = "client!LZYQDKJV", name = "Y", descriptor = "I")
    public int field1221;

    @OriginalMember(owner = "client!LZYQDKJV", name = "X", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!LZYQDKJV", name = "T", descriptor = "I")
    public int mergeX;

    @OriginalMember(owner = "client!LZYQDKJV", name = "U", descriptor = "I")
    public int mergeY;

    @OriginalMember(owner = "client!LZYQDKJV", name = "S", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!LZYQDKJV", name = "t", descriptor = "LLZYQDKJV;")
    public static Model field1190 = new Model(852);

    @OriginalMember(owner = "client!LZYQDKJV", name = "u", descriptor = "[I")
    private static int[] field1191 = new int[2000];

    @OriginalMember(owner = "client!LZYQDKJV", name = "v", descriptor = "[I")
    private static int[] field1192 = new int[2000];

    @OriginalMember(owner = "client!LZYQDKJV", name = "w", descriptor = "[I")
    private static int[] field1193 = new int[2000];

    @OriginalMember(owner = "client!LZYQDKJV", name = "x", descriptor = "[I")
    private static int[] field1194 = new int[2000];

    @OriginalMember(owner = "client!LZYQDKJV", name = "ib", descriptor = "[Z")
    public static boolean[] field1231 = new boolean[4096];

    @OriginalMember(owner = "client!LZYQDKJV", name = "jb", descriptor = "[Z")
    public static boolean[] field1232 = new boolean[4096];

    @OriginalMember(owner = "client!LZYQDKJV", name = "kb", descriptor = "[I")
    public static int[] field1233 = new int[4096];

    @OriginalMember(owner = "client!LZYQDKJV", name = "lb", descriptor = "[I")
    public static int[] field1234 = new int[4096];

    @OriginalMember(owner = "client!LZYQDKJV", name = "mb", descriptor = "[I")
    public static int[] field1235 = new int[4096];

    @OriginalMember(owner = "client!LZYQDKJV", name = "nb", descriptor = "[I")
    public static int[] field1236 = new int[4096];

    @OriginalMember(owner = "client!LZYQDKJV", name = "ob", descriptor = "[I")
    public static int[] field1237 = new int[4096];

    @OriginalMember(owner = "client!LZYQDKJV", name = "pb", descriptor = "[I")
    public static int[] field1238 = new int[4096];

    @OriginalMember(owner = "client!LZYQDKJV", name = "qb", descriptor = "[I")
    public static int[] field1239 = new int[1500];

    @OriginalMember(owner = "client!LZYQDKJV", name = "rb", descriptor = "[[I")
    public static int[][] field1240 = new int[1500][512];

    @OriginalMember(owner = "client!LZYQDKJV", name = "sb", descriptor = "[I")
    public static int[] field1241 = new int[12];

    @OriginalMember(owner = "client!LZYQDKJV", name = "tb", descriptor = "[[I")
    public static int[][] field1242 = new int[12][2000];

    @OriginalMember(owner = "client!LZYQDKJV", name = "ub", descriptor = "[I")
    public static int[] field1243 = new int[2000];

    @OriginalMember(owner = "client!LZYQDKJV", name = "vb", descriptor = "[I")
    public static int[] field1244 = new int[2000];

    @OriginalMember(owner = "client!LZYQDKJV", name = "wb", descriptor = "[I")
    public static int[] field1245 = new int[12];

    @OriginalMember(owner = "client!LZYQDKJV", name = "xb", descriptor = "[I")
    public static int[] field1246 = new int[10];

    @OriginalMember(owner = "client!LZYQDKJV", name = "yb", descriptor = "[I")
    public static int[] field1247 = new int[10];

    @OriginalMember(owner = "client!LZYQDKJV", name = "zb", descriptor = "[I")
    public static int[] field1248 = new int[10];

    @OriginalMember(owner = "client!LZYQDKJV", name = "Hb", descriptor = "[I")
    public static int[] field1256 = new int[1000];

    @OriginalMember(owner = "client!LZYQDKJV", name = "Ib", descriptor = "[I")
    public static int[] sin = Draw3D.field1598;

    @OriginalMember(owner = "client!LZYQDKJV", name = "Jb", descriptor = "[I")
    public static int[] cos = Draw3D.field1599;

    @OriginalMember(owner = "client!LZYQDKJV", name = "Kb", descriptor = "[I")
    public static int[] field1259 = Draw3D.field1610;

    @OriginalMember(owner = "client!LZYQDKJV", name = "Lb", descriptor = "[I")
    public static int[] field1260 = Draw3D.field1597;

    @OriginalMember(owner = "client!LZYQDKJV", name = "s", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!LZYQDKJV", name = "Z", descriptor = "I")
    public int objRaise;

    @OriginalMember(owner = "client!LZYQDKJV", name = "Ab", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!LZYQDKJV", name = "Bb", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!LZYQDKJV", name = "Cb", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!LZYQDKJV", name = "Eb", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!LZYQDKJV", name = "Fb", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!LZYQDKJV", name = "Gb", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!LZYQDKJV", name = "hb", descriptor = "LQUWTPUDC;")
    public static OnDemandProvider field1230;

    @OriginalMember(owner = "client!LZYQDKJV", name = "Db", descriptor = "Z")
    public static boolean field1252;

    @OriginalMember(owner = "client!LZYQDKJV", name = "gb", descriptor = "[LLKRMBYTC;")
    public static Metadata[] field1229;

    @OriginalMember(owner = "client!LZYQDKJV", name = "cb", descriptor = "[[I")
    public int[][] labelVertices;

    @OriginalMember(owner = "client!LZYQDKJV", name = "db", descriptor = "[[I")
    public int[][] labelFaces;

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(Z)V")
    public static void method355(boolean arg0) {
        field1229 = null;
        field1231 = null;
        field1232 = null;
        field1233 = null;
        field1234 = null;
        field1235 = null;
        field1236 = null;
        field1237 = null;
        field1238 = null;
        field1239 = null;
        field1240 = null;
        field1241 = null;
        field1242 = null;
        field1243 = null;
        field1244 = null;
        field1245 = null;
        sin = null;
        cos = null;
        field1259 = null;
        if (!arg0) {
            field1260 = null;
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(ILQUWTPUDC;)V")
    public static void method356(int arg0, OnDemandProvider arg1) {
        field1229 = new Metadata[arg0];
        field1230 = arg1;
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "([BIB)V")
    public static void method357(byte[] arg0, int arg1, byte arg2) {
        if (arg2 == 7) {
            if (arg0 == null) {
                Metadata var3 = field1229[arg1] = new Metadata();
                var3.field1111 = 0;
                var3.field1112 = 0;
                var3.field1113 = 0;
            } else {
                Packet var4 = new Packet(true, arg0);
                var4.pos = arg0.length - 18;
                Metadata var5 = field1229[arg1] = new Metadata();
                var5.field1110 = arg0;
                var5.field1111 = var4.g2();
                var5.field1112 = var4.g2();
                var5.field1113 = var4.g1();
                int var6 = var4.g1();
                int var7 = var4.g1();
                int var8 = var4.g1();
                int var9 = var4.g1();
                int var10 = var4.g1();
                int var11 = var4.g2();
                int var12 = var4.g2();
                int var13 = var4.g2();
                int var14 = var4.g2();
                byte var15 = 0;
                var5.field1114 = var15;
                int var16 = var5.field1111 + var15;
                var5.field1120 = var16;
                int var17 = var5.field1112 + var16;
                var5.field1123 = var17;
                if (var7 == 255) {
                    var17 += var5.field1112;
                } else {
                    var5.field1123 = -var7 - 1;
                }
                var5.field1125 = var17;
                if (var9 == 1) {
                    var17 += var5.field1112;
                } else {
                    var5.field1125 = -1;
                }
                var5.field1122 = var17;
                if (var6 == 1) {
                    var17 += var5.field1112;
                } else {
                    var5.field1122 = -1;
                }
                var5.field1118 = var17;
                if (var10 == 1) {
                    var17 += var5.field1111;
                } else {
                    var5.field1118 = -1;
                }
                var5.field1124 = var17;
                if (var8 == 1) {
                    var17 += var5.field1112;
                } else {
                    var5.field1124 = -1;
                }
                var5.field1119 = var17;
                int var18 = var14 + var17;
                var5.field1121 = var18;
                int var19 = var5.field1112 * 2 + var18;
                var5.field1126 = var19;
                int var20 = var5.field1113 * 6 + var19;
                var5.field1115 = var20;
                int var21 = var11 + var20;
                var5.field1116 = var21;
                int var22 = var12 + var21;
                var5.field1117 = var22;
                int var10000 = var13 + var22;
            }
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(II)V")
    public static void method358(int arg0, int arg1) {
        if (arg1 == 1) {
            field1229[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(I)LLZYQDKJV;")
    public static Model method359(int arg0) {
        if (field1229 == null) {
            return null;
        } else {
            Metadata var1 = field1229[arg0];
            if (var1 == null) {
                field1230.method456(arg0);
                return null;
            } else {
                return new Model(arg0, -478);
            }
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "b", descriptor = "(I)Z")
    public static boolean method360(int arg0) {
        if (field1229 == null) {
            return false;
        } else {
            Metadata var1 = field1229[arg0];
            if (var1 == null) {
                field1230.method456(arg0);
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "<init>", descriptor = "(I)V")
    private Model(int arg0) {
        if (arg0 <= 0) {
            this.field1187 = -110;
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "<init>", descriptor = "(II)V")
    private Model(int arg0, int arg1) {
        ++field1189;
        Metadata var3 = field1229[arg0];
        this.vertexCount = var3.field1111;
        this.faceCount = var3.field1112;
        this.field1211 = var3.field1113;
        this.vertexX = new int[this.vertexCount];
        this.vertexY = new int[this.vertexCount];
        this.vertexZ = new int[this.vertexCount];
        this.faceVertexA = new int[this.faceCount];
        this.faceVertexB = new int[this.faceCount];
        this.faceVertexC = new int[this.faceCount];
        this.field1212 = new int[this.field1211];
        this.field1213 = new int[this.field1211];
        this.field1214 = new int[this.field1211];
        if (var3.field1118 >= 0) {
            this.field1223 = new int[this.vertexCount];
        }
        if (var3.field1122 >= 0) {
            this.faceInfo = new int[this.faceCount];
        }
        if (var3.field1123 >= 0) {
            this.field1207 = new int[this.faceCount];
        } else {
            this.field1210 = -var3.field1123 - 1;
        }
        if (var3.field1124 >= 0) {
            this.field1208 = new int[this.faceCount];
        }
        if (var3.field1125 >= 0) {
            this.field1224 = new int[this.faceCount];
        }
        this.field1209 = new int[this.faceCount];
        Packet var4 = new Packet(true, var3.field1110);
        var4.pos = var3.field1114;
        Packet var5 = new Packet(true, var3.field1110);
        var5.pos = var3.field1115;
        Packet var6 = new Packet(true, var3.field1110);
        var6.pos = var3.field1116;
        if (arg1 >= 0) {
            this.field1188 = !this.field1188;
        }
        Packet var7 = new Packet(true, var3.field1110);
        var7.pos = var3.field1117;
        Packet var8 = new Packet(true, var3.field1110);
        var8.pos = var3.field1118;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < this.vertexCount; ++var12) {
            int var24 = var4.g1();
            int var25 = 0;
            if ((var24 & 1) != 0) {
                var25 = var5.gsmart();
            }
            int var26 = 0;
            if ((var24 & 2) != 0) {
                var26 = var6.gsmart();
            }
            int var27 = 0;
            if ((var24 & 4) != 0) {
                var27 = var7.gsmart();
            }
            this.vertexX[var12] = var9 + var25;
            this.vertexY[var12] = var10 + var26;
            this.vertexZ[var12] = var11 + var27;
            var9 = this.vertexX[var12];
            var10 = this.vertexY[var12];
            var11 = this.vertexZ[var12];
            if (this.field1223 != null) {
                this.field1223[var12] = var8.g1();
            }
        }
        var4.pos = var3.field1121;
        var5.pos = var3.field1122;
        var6.pos = var3.field1123;
        var7.pos = var3.field1124;
        var8.pos = var3.field1125;
        for (int var13 = 0; var13 < this.faceCount; ++var13) {
            this.field1209[var13] = var4.g2();
            if (this.faceInfo != null) {
                this.faceInfo[var13] = var5.g1();
            }
            if (this.field1207 != null) {
                this.field1207[var13] = var6.g1();
            }
            if (this.field1208 != null) {
                this.field1208[var13] = var7.g1();
            }
            if (this.field1224 != null) {
                this.field1224[var13] = var8.g1();
            }
        }
        var4.pos = var3.field1119;
        var5.pos = var3.field1120;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        for (int var18 = 0; var18 < this.faceCount; ++var18) {
            int var20 = var5.g1();
            if (var20 == 1) {
                var14 = var4.gsmart() + var17;
                var15 = var4.gsmart() + var14;
                var16 = var4.gsmart() + var15;
                var17 = var16;
                this.faceVertexA[var18] = var14;
                this.faceVertexB[var18] = var15;
                this.faceVertexC[var18] = var16;
            }
            if (var20 == 2) {
                var14 = var14;
                var15 = var16;
                var16 = var4.gsmart() + var17;
                var17 = var16;
                this.faceVertexA[var18] = var14;
                this.faceVertexB[var18] = var15;
                this.faceVertexC[var18] = var16;
            }
            if (var20 == 3) {
                var14 = var16;
                var15 = var15;
                var16 = var4.gsmart() + var17;
                var17 = var16;
                this.faceVertexA[var18] = var14;
                this.faceVertexB[var18] = var15;
                this.faceVertexC[var18] = var16;
            }
            if (var20 == 4) {
                int var23 = var14;
                var14 = var15;
                var15 = var23;
                var16 = var4.gsmart() + var17;
                var17 = var16;
                this.faceVertexA[var18] = var14;
                this.faceVertexB[var18] = var23;
                this.faceVertexC[var18] = var16;
            }
        }
        var4.pos = var3.field1126;
        for (int var19 = 0; var19 < this.field1211; ++var19) {
            this.field1212[var19] = var4.g2();
            this.field1213[var19] = var4.g2();
            this.field1214[var19] = var4.g2();
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "<init>", descriptor = "(I[LLZYQDKJV;B)V")
    public Model(int arg0, Model[] arg1, byte arg2) {
        ++field1189;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.vertexCount = 0;
        this.faceCount = 0;
        this.field1211 = 0;
        this.field1210 = -1;
        for (int var8 = 0; var8 < arg0; ++var8) {
            Model var15 = arg1[var8];
            if (var15 != null) {
                this.vertexCount += var15.vertexCount;
                this.faceCount += var15.faceCount;
                this.field1211 += var15.field1211;
                var4 |= var15.faceInfo != null;
                if (var15.field1207 != null) {
                    var5 = true;
                } else {
                    if (this.field1210 == -1) {
                        this.field1210 = var15.field1210;
                    }
                    if (this.field1210 != var15.field1210) {
                        var5 = true;
                    }
                }
                var6 |= var15.field1208 != null;
                var7 |= var15.field1224 != null;
            }
        }
        this.vertexX = new int[this.vertexCount];
        this.vertexY = new int[this.vertexCount];
        this.vertexZ = new int[this.vertexCount];
        if (arg2 != -89) {
            throw new NullPointerException();
        } else {
            this.field1223 = new int[this.vertexCount];
            this.faceVertexA = new int[this.faceCount];
            this.faceVertexB = new int[this.faceCount];
            this.faceVertexC = new int[this.faceCount];
            this.field1212 = new int[this.field1211];
            this.field1213 = new int[this.field1211];
            this.field1214 = new int[this.field1211];
            if (var4) {
                this.faceInfo = new int[this.faceCount];
            }
            if (var5) {
                this.field1207 = new int[this.faceCount];
            }
            if (var6) {
                this.field1208 = new int[this.faceCount];
            }
            if (var7) {
                this.field1224 = new int[this.faceCount];
            }
            this.field1209 = new int[this.faceCount];
            this.vertexCount = 0;
            this.faceCount = 0;
            this.field1211 = 0;
            int var9 = 0;
            for (int var10 = 0; var10 < arg0; ++var10) {
                Model var11 = arg1[var10];
                if (var11 != null) {
                    for (int var12 = 0; var12 < var11.faceCount; ++var12) {
                        if (var4) {
                            if (var11.faceInfo == null) {
                                this.faceInfo[this.faceCount] = 0;
                            } else {
                                int var14 = var11.faceInfo[var12];
                                if ((var14 & 2) == 2) {
                                    var14 += var9 << 2;
                                }
                                this.faceInfo[this.faceCount] = var14;
                            }
                        }
                        if (var5) {
                            if (var11.field1207 == null) {
                                this.field1207[this.faceCount] = var11.field1210;
                            } else {
                                this.field1207[this.faceCount] = var11.field1207[var12];
                            }
                        }
                        if (var6) {
                            if (var11.field1208 == null) {
                                this.field1208[this.faceCount] = 0;
                            } else {
                                this.field1208[this.faceCount] = var11.field1208[var12];
                            }
                        }
                        if (var7 && var11.field1224 != null) {
                            this.field1224[this.faceCount] = var11.field1224[var12];
                        }
                        this.field1209[this.faceCount] = var11.field1209[var12];
                        this.faceVertexA[this.faceCount] = this.method362(var11, var11.faceVertexA[var12]);
                        this.faceVertexB[this.faceCount] = this.method362(var11, var11.faceVertexB[var12]);
                        this.faceVertexC[this.faceCount] = this.method362(var11, var11.faceVertexC[var12]);
                        ++this.faceCount;
                    }
                    for (int var13 = 0; var13 < var11.field1211; ++var13) {
                        this.field1212[this.field1211] = this.method362(var11, var11.field1212[var13]);
                        this.field1213[this.field1211] = this.method362(var11, var11.field1213[var13]);
                        this.field1214[this.field1211] = this.method362(var11, var11.field1214[var13]);
                        ++this.field1211;
                    }
                    var9 += var11.field1211;
                }
            }
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "<init>", descriptor = "(IZI[LLZYQDKJV;)V")
    public Model(int arg0, boolean arg1, int arg2, Model[] arg3) {
        ++field1189;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.vertexCount = 0;
        this.faceCount = 0;
        this.field1211 = 0;
        this.field1210 = -1;
        for (int var9 = 0; var9 < arg0; ++var9) {
            Model var18 = arg3[var9];
            if (var18 != null) {
                this.vertexCount += var18.vertexCount;
                this.faceCount += var18.faceCount;
                this.field1211 += var18.field1211;
                var5 |= var18.faceInfo != null;
                if (var18.field1207 != null) {
                    var6 = true;
                } else {
                    if (this.field1210 == -1) {
                        this.field1210 = var18.field1210;
                    }
                    if (this.field1210 != var18.field1210) {
                        var6 = true;
                    }
                }
                var7 |= var18.field1208 != null;
                var8 |= var18.field1209 != null;
            }
        }
        this.vertexX = new int[this.vertexCount];
        this.vertexY = new int[this.vertexCount];
        this.vertexZ = new int[this.vertexCount];
        this.faceVertexA = new int[this.faceCount];
        this.faceVertexB = new int[this.faceCount];
        this.faceVertexC = new int[this.faceCount];
        this.field1203 = new int[this.faceCount];
        this.field1204 = new int[this.faceCount];
        this.field1205 = new int[this.faceCount];
        this.field1212 = new int[this.field1211];
        this.field1213 = new int[this.field1211];
        this.field1214 = new int[this.field1211];
        if (var5) {
            this.faceInfo = new int[this.faceCount];
        }
        if (var6) {
            this.field1207 = new int[this.faceCount];
        }
        if (var7) {
            this.field1208 = new int[this.faceCount];
        }
        if (var8) {
            this.field1209 = new int[this.faceCount];
        }
        this.vertexCount = 0;
        if (arg2 != 0) {
            throw new NullPointerException();
        } else {
            this.faceCount = 0;
            this.field1211 = 0;
            int var10 = 0;
            for (int var11 = 0; var11 < arg0; ++var11) {
                Model var12 = arg3[var11];
                if (var12 != null) {
                    int var13 = this.vertexCount;
                    for (int var14 = 0; var14 < var12.vertexCount; ++var14) {
                        this.vertexX[this.vertexCount] = var12.vertexX[var14];
                        this.vertexY[this.vertexCount] = var12.vertexY[var14];
                        this.vertexZ[this.vertexCount] = var12.vertexZ[var14];
                        ++this.vertexCount;
                    }
                    for (int var15 = 0; var15 < var12.faceCount; ++var15) {
                        this.faceVertexA[this.faceCount] = var12.faceVertexA[var15] + var13;
                        this.faceVertexB[this.faceCount] = var12.faceVertexB[var15] + var13;
                        this.faceVertexC[this.faceCount] = var12.faceVertexC[var15] + var13;
                        this.field1203[this.faceCount] = var12.field1203[var15];
                        this.field1204[this.faceCount] = var12.field1204[var15];
                        this.field1205[this.faceCount] = var12.field1205[var15];
                        if (var5) {
                            if (var12.faceInfo == null) {
                                this.faceInfo[this.faceCount] = 0;
                            } else {
                                int var17 = var12.faceInfo[var15];
                                if ((var17 & 2) == 2) {
                                    var17 += var10 << 2;
                                }
                                this.faceInfo[this.faceCount] = var17;
                            }
                        }
                        if (var6) {
                            if (var12.field1207 == null) {
                                this.field1207[this.faceCount] = var12.field1210;
                            } else {
                                this.field1207[this.faceCount] = var12.field1207[var15];
                            }
                        }
                        if (var7) {
                            if (var12.field1208 == null) {
                                this.field1208[this.faceCount] = 0;
                            } else {
                                this.field1208[this.faceCount] = var12.field1208[var15];
                            }
                        }
                        if (var8 && var12.field1209 != null) {
                            this.field1209[this.faceCount] = var12.field1209[var15];
                        }
                        ++this.faceCount;
                    }
                    for (int var16 = 0; var16 < var12.field1211; ++var16) {
                        this.field1212[this.field1211] = var12.field1212[var16] + var13;
                        this.field1213[this.field1211] = var12.field1213[var16] + var13;
                        this.field1214[this.field1211] = var12.field1214[var16] + var13;
                        ++this.field1211;
                    }
                    var10 += var12.field1211;
                }
            }
            this.method363(this.field1183);
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "<init>", descriptor = "(ZZZLLZYQDKJV;Z)V")
    public Model(boolean arg0, boolean arg1, boolean arg2, Model arg3, boolean arg4) {
        ++field1189;
        this.vertexCount = arg3.vertexCount;
        this.faceCount = arg3.faceCount;
        this.field1211 = arg3.field1211;
        if (arg1) {
            this.field1187 = 498;
        }
        if (arg0) {
            this.vertexX = arg3.vertexX;
            this.vertexY = arg3.vertexY;
            this.vertexZ = arg3.vertexZ;
        } else {
            this.vertexX = new int[this.vertexCount];
            this.vertexY = new int[this.vertexCount];
            this.vertexZ = new int[this.vertexCount];
            for (int var6 = 0; var6 < this.vertexCount; ++var6) {
                this.vertexX[var6] = arg3.vertexX[var6];
                this.vertexY[var6] = arg3.vertexY[var6];
                this.vertexZ[var6] = arg3.vertexZ[var6];
            }
        }
        if (arg2) {
            this.field1209 = arg3.field1209;
        } else {
            this.field1209 = new int[this.faceCount];
            for (int var7 = 0; var7 < this.faceCount; ++var7) {
                this.field1209[var7] = arg3.field1209[var7];
            }
        }
        if (arg4) {
            this.field1208 = arg3.field1208;
        } else {
            this.field1208 = new int[this.faceCount];
            if (arg3.field1208 == null) {
                for (int var8 = 0; var8 < this.faceCount; ++var8) {
                    this.field1208[var8] = 0;
                }
            } else {
                for (int var9 = 0; var9 < this.faceCount; ++var9) {
                    this.field1208[var9] = arg3.field1208[var9];
                }
            }
        }
        this.field1223 = arg3.field1223;
        this.field1224 = arg3.field1224;
        this.faceInfo = arg3.faceInfo;
        this.faceVertexA = arg3.faceVertexA;
        this.faceVertexB = arg3.faceVertexB;
        this.faceVertexC = arg3.faceVertexC;
        this.field1207 = arg3.field1207;
        this.field1210 = arg3.field1210;
        this.field1212 = arg3.field1212;
        this.field1213 = arg3.field1213;
        this.field1214 = arg3.field1214;
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "<init>", descriptor = "(ZZILLZYQDKJV;)V")
    public Model(boolean arg0, boolean arg1, int arg2, Model arg3) {
        ++field1189;
        this.vertexCount = arg3.vertexCount;
        this.faceCount = arg3.faceCount;
        this.field1211 = arg3.field1211;
        if (arg0) {
            this.vertexY = new int[this.vertexCount];
            for (int var5 = 0; var5 < this.vertexCount; ++var5) {
                this.vertexY[var5] = arg3.vertexY[var5];
            }
        } else {
            this.vertexY = arg3.vertexY;
        }
        if (arg1) {
            this.field1203 = new int[this.faceCount];
            this.field1204 = new int[this.faceCount];
            this.field1205 = new int[this.faceCount];
            for (int var6 = 0; var6 < this.faceCount; ++var6) {
                this.field1203[var6] = arg3.field1203[var6];
                this.field1204[var6] = arg3.field1204[var6];
                this.field1205[var6] = arg3.field1205[var6];
            }
            this.faceInfo = new int[this.faceCount];
            if (arg3.faceInfo == null) {
                for (int var7 = 0; var7 < this.faceCount; ++var7) {
                    this.faceInfo[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.faceCount; ++var8) {
                    this.faceInfo[var8] = arg3.faceInfo[var8];
                }
            }
            super.vertexNormal = new VertexNormal[this.vertexCount];
            for (int var9 = 0; var9 < this.vertexCount; ++var9) {
                VertexNormal var10 = super.vertexNormal[var9] = new VertexNormal();
                VertexNormal var11 = arg3.vertexNormal[var9];
                var10.x = var11.x;
                var10.y = var11.y;
                var10.z = var11.z;
                var10.w = var11.w;
            }
            this.field1228 = arg3.field1228;
        } else {
            this.field1203 = arg3.field1203;
            this.field1204 = arg3.field1204;
            this.field1205 = arg3.field1205;
            this.faceInfo = arg3.faceInfo;
        }
        this.vertexX = arg3.vertexX;
        this.vertexZ = arg3.vertexZ;
        if (arg2 != 0) {
            this.field1185 = !this.field1185;
        }
        this.field1209 = arg3.field1209;
        this.field1208 = arg3.field1208;
        this.field1207 = arg3.field1207;
        this.field1210 = arg3.field1210;
        this.faceVertexA = arg3.faceVertexA;
        this.faceVertexB = arg3.faceVertexB;
        this.faceVertexC = arg3.faceVertexC;
        this.field1212 = arg3.field1212;
        this.field1213 = arg3.field1213;
        this.field1214 = arg3.field1214;
        super.field1709 = arg3.field1709;
        this.minY = arg3.minY;
        this.field1218 = arg3.field1218;
        this.field1221 = arg3.field1221;
        this.field1220 = arg3.field1220;
        this.mergeX = arg3.mergeX;
        this.mergeY = arg3.mergeY;
        this.field1215 = arg3.field1215;
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(ZLLZYQDKJV;I)V")
    public void method361(boolean arg0, Model arg1, int arg2) {
        this.vertexCount = arg1.vertexCount;
        this.faceCount = arg1.faceCount;
        this.field1211 = arg1.field1211;
        if (field1191.length < this.vertexCount) {
            field1191 = new int[this.vertexCount + 100];
            field1192 = new int[this.vertexCount + 100];
            field1193 = new int[this.vertexCount + 100];
        }
        this.vertexX = field1191;
        this.vertexY = field1192;
        if (arg2 == 1244) {
            this.vertexZ = field1193;
            for (int var4 = 0; var4 < this.vertexCount; ++var4) {
                this.vertexX[var4] = arg1.vertexX[var4];
                this.vertexY[var4] = arg1.vertexY[var4];
                this.vertexZ[var4] = arg1.vertexZ[var4];
            }
            if (arg0) {
                this.field1208 = arg1.field1208;
            } else {
                if (field1194.length < this.faceCount) {
                    field1194 = new int[this.faceCount + 100];
                }
                this.field1208 = field1194;
                if (arg1.field1208 == null) {
                    for (int var5 = 0; var5 < this.faceCount; ++var5) {
                        this.field1208[var5] = 0;
                    }
                } else {
                    for (int var6 = 0; var6 < this.faceCount; ++var6) {
                        this.field1208[var6] = arg1.field1208[var6];
                    }
                }
            }
            this.faceInfo = arg1.faceInfo;
            this.field1209 = arg1.field1209;
            this.field1207 = arg1.field1207;
            this.field1210 = arg1.field1210;
            this.labelFaces = arg1.labelFaces;
            this.labelVertices = arg1.labelVertices;
            this.faceVertexA = arg1.faceVertexA;
            this.faceVertexB = arg1.faceVertexB;
            this.faceVertexC = arg1.faceVertexC;
            this.field1203 = arg1.field1203;
            this.field1204 = arg1.field1204;
            this.field1205 = arg1.field1205;
            this.field1212 = arg1.field1212;
            this.field1213 = arg1.field1213;
            this.field1214 = arg1.field1214;
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(LLZYQDKJV;I)I")
    private final int method362(Model arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.vertexX[arg1];
        int var5 = arg0.vertexY[arg1];
        int var6 = arg0.vertexZ[arg1];
        for (int var7 = 0; var7 < this.vertexCount; ++var7) {
            if (this.vertexX[var7] == var4 && this.vertexY[var7] == var5 && this.vertexZ[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.vertexX[this.vertexCount] = var4;
            this.vertexY[this.vertexCount] = var5;
            this.vertexZ[this.vertexCount] = var6;
            if (arg0.field1223 != null) {
                this.field1223[this.vertexCount] = arg0.field1223[arg1];
            }
            var3 = this.vertexCount++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "c", descriptor = "(I)V")
    public void method363(int arg0) {
        super.field1709 = 0;
        this.field1218 = 0;
        this.minY = 0;
        for (int var2 = 0; var2 < this.vertexCount; ++var2) {
            int var4 = this.vertexX[var2];
            int var5 = this.vertexY[var2];
            int var6 = this.vertexZ[var2];
            if (-var5 > super.field1709) {
                super.field1709 = -var5;
            }
            if (var5 > this.minY) {
                this.minY = var5;
            }
            int var7 = var4 * var4 + var6 * var6;
            if (var7 > this.field1218) {
                this.field1218 = var7;
            }
        }
        this.field1218 = (int) (Math.sqrt((double) this.field1218) + 0.99D);
        this.field1221 = (int) (Math.sqrt((double) (this.field1218 * this.field1218 + super.field1709 * super.field1709)) + 0.99D);
        int var3 = 64 / arg0;
        this.field1220 = this.field1221 + (int) (Math.sqrt((double) (this.minY * this.minY + this.field1218 * this.field1218)) + 0.99D);
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "d", descriptor = "(I)V")
    public void method364(int arg0) {
        super.field1709 = 0;
        if (arg0 == 6) {
            this.minY = 0;
            for (int var2 = 0; var2 < this.vertexCount; ++var2) {
                int var3 = this.vertexY[var2];
                if (-var3 > super.field1709) {
                    super.field1709 = -var3;
                }
                if (var3 > this.minY) {
                    this.minY = var3;
                }
            }
            this.field1221 = (int) (Math.sqrt((double) (this.field1218 * this.field1218 + super.field1709 * super.field1709)) + 0.99D);
            this.field1220 = this.field1221 + (int) (Math.sqrt((double) (this.minY * this.minY + this.field1218 * this.field1218)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "e", descriptor = "(I)V")
    public void method365(int arg0) {
        super.field1709 = 0;
        this.field1218 = 0;
        this.minY = 0;
        int var2 = 32767;
        int var3 = -32767;
        int var4 = -32767;
        int var5 = 32767;
        for (int var6 = 0; var6 < this.vertexCount; ++var6) {
            int var7 = this.vertexX[var6];
            int var8 = this.vertexY[var6];
            int var9 = this.vertexZ[var6];
            if (var7 < var2) {
                var2 = var7;
            }
            if (var7 > var3) {
                var3 = var7;
            }
            if (var9 < var5) {
                var5 = var9;
            }
            if (var9 > var4) {
                var4 = var9;
            }
            if (-var8 > super.field1709) {
                super.field1709 = -var8;
            }
            if (var8 > this.minY) {
                this.minY = var8;
            }
            int var10 = var7 * var7 + var9 * var9;
            if (var10 > this.field1218) {
                this.field1218 = var10;
            }
        }
        this.field1218 = (int) Math.sqrt((double) this.field1218);
        this.field1221 = (int) Math.sqrt((double) (this.field1218 * this.field1218 + super.field1709 * super.field1709));
        this.field1220 = this.field1221 + (int) Math.sqrt((double) (this.minY * this.minY + this.field1218 * this.field1218));
        this.mergeX = (var2 << 16) + (var3 & 65535);
        if (arg0 <= 0) {
            this.field1184 = 50;
        }
        this.mergeY = (var4 << 16) + (var5 & 65535);
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "f", descriptor = "(I)V")
    public void createLabelReferences(int arg0) {
        if (arg0 == 7) {
            int var10002;
            if (this.field1223 != null) {
                int[] var2 = new int[256];
                int var3 = 0;
                for (int var4 = 0; var4 < this.vertexCount; ++var4) {
                    int var8 = this.field1223[var4];
                    var10002 = var2[var8]++;
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
                this.labelVertices = new int[var3 + 1][];
                for (int var5 = 0; var5 <= var3; ++var5) {
                    this.labelVertices[var5] = new int[var2[var5]];
                    var2[var5] = 0;
                }
                int var6 = 0;
                while (var6 < this.vertexCount) {
                    int var7 = this.field1223[var6];
                    this.labelVertices[var7][var2[var7]++] = var6++;
                }
                this.field1223 = null;
            }
            if (this.field1224 != null) {
                int[] var9 = new int[256];
                int var10 = 0;
                for (int var11 = 0; var11 < this.faceCount; ++var11) {
                    int var15 = this.field1224[var11];
                    var10002 = var9[var15]++;
                    if (var15 > var10) {
                        var10 = var15;
                    }
                }
                this.labelFaces = new int[var10 + 1][];
                for (int var12 = 0; var12 <= var10; ++var12) {
                    this.labelFaces[var12] = new int[var9[var12]];
                    var9[var12] = 0;
                }
                int var13 = 0;
                while (var13 < this.faceCount) {
                    int var14 = this.field1224[var13];
                    this.labelFaces[var14][var9[var14]++] = var13++;
                }
                this.field1224 = null;
            }
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(IB)V")
    public void applyTransform(int arg0, byte arg1) {
        if (this.labelVertices != null) {
            if (arg0 != -1) {
                AnimFrame var3 = AnimFrame.method264(arg0);
                if (var3 != null) {
                    AnimBase var4 = var3.field931;
                    if (arg1 == 6) {
                        boolean var5 = false;
                        field1249 = 0;
                        field1250 = 0;
                        field1251 = 0;
                        for (int var6 = 0; var6 < var3.field932; ++var6) {
                            int var7 = var3.field933[var6];
                            this.method369(var4.animTypes[var7], var4.animLabels[var7], var3.field934[var6], var3.field935[var6], var3.field936[var6]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(III[I)V")
    public void method368(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg2 != -1) {
            if (arg3 != null && arg0 != -1) {
                AnimFrame var5 = AnimFrame.method264(arg2);
                if (var5 != null) {
                    AnimFrame var6 = AnimFrame.method264(arg0);
                    if (var6 == null) {
                        this.applyTransform(arg2, (byte) 6);
                    } else {
                        AnimBase var7 = var5.field931;
                        field1249 = 0;
                        if (arg1 != 0) {
                            this.field1188 = !this.field1188;
                        }
                        field1250 = 0;
                        field1251 = 0;
                        byte var8 = 0;
                        int var16 = var8 + 1;
                        int var9 = arg3[var8];
                        for (int var10 = 0; var10 < var5.field932; ++var10) {
                            int var15 = var5.field933[var10];
                            while (var15 > var9) {
                                var9 = arg3[var16++];
                            }
                            if (var9 != var15 || var7.animTypes[var15] == 0) {
                                this.method369(var7.animTypes[var15], var7.animLabels[var15], var5.field934[var10], var5.field935[var10], var5.field936[var10]);
                            }
                        }
                        field1249 = 0;
                        field1250 = 0;
                        field1251 = 0;
                        byte var11 = 0;
                        int var17 = var11 + 1;
                        int var12 = arg3[var11];
                        for (int var13 = 0; var13 < var6.field932; ++var13) {
                            int var14 = var6.field933[var13];
                            while (var14 > var12) {
                                var12 = arg3[var17++];
                            }
                            if (var12 == var14 || var7.animTypes[var14] == 0) {
                                this.method369(var7.animTypes[var14], var7.animLabels[var14], var6.field934[var13], var6.field935[var13], var6.field936[var13]);
                            }
                        }
                    }
                }
            } else {
                this.applyTransform(arg2, (byte) 6);
            }
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(I[IIII)V")
    private void method369(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            field1249 = 0;
            field1250 = 0;
            field1251 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = arg1[var8];
                if (var9 < this.labelVertices.length) {
                    int[] var10 = this.labelVertices[var9];
                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        int var12 = var10[var11];
                        field1249 += this.vertexX[var12];
                        field1250 += this.vertexY[var12];
                        field1251 += this.vertexZ[var12];
                        ++var7;
                    }
                }
            }
            if (var7 > 0) {
                field1249 = field1249 / var7 + arg2;
                field1250 = field1250 / var7 + arg3;
                field1251 = field1251 / var7 + arg4;
            } else {
                field1249 = arg2;
                field1250 = arg3;
                field1251 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; ++var13) {
                int var14 = arg1[var13];
                if (var14 < this.labelVertices.length) {
                    int[] var15 = this.labelVertices[var14];
                    for (int var16 = 0; var16 < var15.length; ++var16) {
                        int var17 = var15[var16];
                        this.vertexX[var17] += arg2;
                        this.vertexY[var17] += arg3;
                        this.vertexZ[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; ++var18) {
                int var19 = arg1[var18];
                if (var19 < this.labelVertices.length) {
                    int[] var20 = this.labelVertices[var19];
                    for (int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = var20[var21];
                        this.vertexX[var22] -= field1249;
                        this.vertexY[var22] -= field1250;
                        this.vertexZ[var22] -= field1251;
                        int var23 = (arg2 & 255) * 8;
                        int var24 = (arg3 & 255) * 8;
                        int var25 = (arg4 & 255) * 8;
                        if (var25 != 0) {
                            int var26 = sin[var25];
                            int var27 = cos[var25];
                            int var28 = this.vertexY[var22] * var26 + this.vertexX[var22] * var27 >> 16;
                            this.vertexY[var22] = this.vertexY[var22] * var27 - this.vertexX[var22] * var26 >> 16;
                            this.vertexX[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = sin[var23];
                            int var30 = cos[var23];
                            int var31 = this.vertexY[var22] * var30 - this.vertexZ[var22] * var29 >> 16;
                            this.vertexZ[var22] = this.vertexZ[var22] * var30 + this.vertexY[var22] * var29 >> 16;
                            this.vertexY[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = sin[var24];
                            int var33 = cos[var24];
                            int var34 = this.vertexZ[var22] * var32 + this.vertexX[var22] * var33 >> 16;
                            this.vertexZ[var22] = this.vertexZ[var22] * var33 - this.vertexX[var22] * var32 >> 16;
                            this.vertexX[var22] = var34;
                        }
                        this.vertexX[var22] += field1249;
                        this.vertexY[var22] += field1250;
                        this.vertexZ[var22] += field1251;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; ++var35) {
                int var36 = arg1[var35];
                if (var36 < this.labelVertices.length) {
                    int[] var37 = this.labelVertices[var36];
                    for (int var38 = 0; var38 < var37.length; ++var38) {
                        int var39 = var37[var38];
                        this.vertexX[var39] -= field1249;
                        this.vertexY[var39] -= field1250;
                        this.vertexZ[var39] -= field1251;
                        this.vertexX[var39] = this.vertexX[var39] * arg2 / 128;
                        this.vertexY[var39] = this.vertexY[var39] * arg3 / 128;
                        this.vertexZ[var39] = this.vertexZ[var39] * arg4 / 128;
                        this.vertexX[var39] += field1249;
                        this.vertexY[var39] += field1250;
                        this.vertexZ[var39] += field1251;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.labelFaces != null && this.field1208 != null) {
                for (int var40 = 0; var40 < var6; ++var40) {
                    int var41 = arg1[var40];
                    if (var41 < this.labelFaces.length) {
                        int[] var42 = this.labelFaces[var41];
                        for (int var43 = 0; var43 < var42.length; ++var43) {
                            int var44 = var42[var43];
                            this.field1208[var44] += arg2 * 8;
                            if (this.field1208[var44] < 0) {
                                this.field1208[var44] = 0;
                            }
                            if (this.field1208[var44] > 255) {
                                this.field1208[var44] = 255;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "b", descriptor = "(Z)V")
    public void rotateY90(boolean arg0) {
        if (arg0) {
            for (int var2 = 0; var2 < this.vertexCount; ++var2) {
                int var3 = this.vertexX[var2];
                this.vertexX[var2] = this.vertexZ[var2];
                this.vertexZ[var2] = -var3;
            }
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "b", descriptor = "(II)V")
    public void rotateX(int arg0, int arg1) {
        int var3 = sin[arg0];
        int var4 = cos[arg0];
        for (int var5 = 0; var5 < this.vertexCount; ++var5) {
            int var7 = this.vertexY[var5] * var4 - this.vertexZ[var5] * var3 >> 16;
            this.vertexZ[var5] = this.vertexZ[var5] * var4 + this.vertexY[var5] * var3 >> 16;
            this.vertexY[var5] = var7;
        }
        int var6 = 61 / arg1;
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(IIZI)V")
    public void method372(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field1183 = -310;
        }
        for (int var5 = 0; var5 < this.vertexCount; ++var5) {
            this.vertexX[var5] += arg0;
            this.vertexY[var5] += arg3;
            this.vertexZ[var5] += arg1;
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "c", descriptor = "(II)V")
    public void method373(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.faceCount; ++var3) {
            if (this.field1209[var3] == arg0) {
                this.field1209[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "g", descriptor = "(I)V")
    public void method374(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (int var3 = 0; var3 < this.vertexCount; ++var3) {
            this.vertexZ[var3] = -this.vertexZ[var3];
        }
        for (int var4 = 0; var4 < this.faceCount; ++var4) {
            int var5 = this.faceVertexA[var4];
            this.faceVertexA[var4] = this.faceVertexC[var4];
            this.faceVertexC[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(IIII)V")
    public void scale(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.vertexCount; ++var5) {
            this.vertexX[var5] = this.vertexX[var5] * arg3 / 128;
            this.vertexY[var5] = this.vertexY[var5] * arg0 / 128;
            this.vertexZ[var5] = this.vertexZ[var5] * arg1 / 128;
        }
        if (arg2 != 9) {
            this.field1183 = 322;
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(IIIIIZ)V")
    public final void calculateNormals(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var8 = arg1 * var7 >> 8;
        if (this.field1203 == null) {
            this.field1203 = new int[this.faceCount];
            this.field1204 = new int[this.faceCount];
            this.field1205 = new int[this.faceCount];
        }
        if (super.vertexNormal == null) {
            super.vertexNormal = new VertexNormal[this.vertexCount];
            for (int var9 = 0; var9 < this.vertexCount; ++var9) {
                super.vertexNormal[var9] = new VertexNormal();
            }
        }
        for (int var10 = 0; var10 < this.faceCount; ++var10) {
            int var14 = this.faceVertexA[var10];
            int var15 = this.faceVertexB[var10];
            int var16 = this.faceVertexC[var10];
            int var17 = this.vertexX[var15] - this.vertexX[var14];
            int var18 = this.vertexY[var15] - this.vertexY[var14];
            int var19 = this.vertexZ[var15] - this.vertexZ[var14];
            int var20 = this.vertexX[var16] - this.vertexX[var14];
            int var21 = this.vertexY[var16] - this.vertexY[var14];
            int var22 = this.vertexZ[var16] - this.vertexZ[var14];
            int var23 = var18 * var22 - var19 * var21;
            int var24 = var19 * var20 - var17 * var22;
            int var25;
            for (var25 = var17 * var21 - var18 * var20; var23 > 8192 || var24 > 8192 || var25 > 8192 || var23 < -8192 || var24 < -8192 || var25 < -8192; var25 >>= 1) {
                var23 >>= 1;
                var24 >>= 1;
            }
            int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
            if (var26 <= 0) {
                var26 = 1;
            }
            int var27 = var23 * 256 / var26;
            int var28 = var24 * 256 / var26;
            int var29 = var25 * 256 / var26;
            if (this.faceInfo != null && (this.faceInfo[var10] & 1) != 0) {
                int var30 = (arg4 * var29 + arg2 * var27 + arg3 * var28) / (var8 / 2 + var8) + arg0;
                this.field1203[var10] = method379(this.field1209[var10], var30, this.faceInfo[var10]);
            } else {
                VertexNormal var31 = super.vertexNormal[var14];
                var31.x += var27;
                var31.y += var28;
                var31.z += var29;
                ++var31.w;
                VertexNormal var32 = super.vertexNormal[var15];
                var32.x += var27;
                var32.y += var28;
                var32.z += var29;
                ++var32.w;
                VertexNormal var33 = super.vertexNormal[var16];
                var33.x += var27;
                var33.y += var28;
                var33.z += var29;
                ++var33.w;
            }
        }
        if (arg5) {
            this.method378(arg0, var8, arg2, arg3, arg4);
        } else {
            this.field1228 = new VertexNormal[this.vertexCount];
            for (int var11 = 0; var11 < this.vertexCount; ++var11) {
                VertexNormal var12 = super.vertexNormal[var11];
                VertexNormal var13 = this.field1228[var11] = new VertexNormal();
                var13.x = var12.x;
                var13.y = var12.y;
                var13.z = var12.z;
                var13.w = var12.w;
            }
            this.field1215 = (arg0 << 16) + (var8 & 65535);
        }
        if (arg5) {
            this.method363(this.field1183);
        } else {
            this.method365(426);
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "b", descriptor = "(IIII)V")
    public final void applyLighting(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1215 >> 16;
        int var6 = this.field1215 << 16 >> 16;
        if (arg2 != 0) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        this.method378(var5, var6, arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(IIIII)V")
    private final void method378(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = 0; var6 < this.faceCount; ++var6) {
            int var8 = this.faceVertexA[var6];
            int var9 = this.faceVertexB[var6];
            int var10 = this.faceVertexC[var6];
            if (this.faceInfo == null) {
                int var11 = this.field1209[var6];
                VertexNormal var12 = super.vertexNormal[var8];
                int var13 = (var12.z * arg4 + var12.y * arg3 + var12.x * arg2) / (var12.w * arg1) + arg0;
                this.field1203[var6] = method379(var11, var13, 0);
                VertexNormal var14 = super.vertexNormal[var9];
                int var15 = (var14.z * arg4 + var14.y * arg3 + var14.x * arg2) / (var14.w * arg1) + arg0;
                this.field1204[var6] = method379(var11, var15, 0);
                VertexNormal var16 = super.vertexNormal[var10];
                int var17 = (var16.z * arg4 + var16.y * arg3 + var16.x * arg2) / (var16.w * arg1) + arg0;
                this.field1205[var6] = method379(var11, var17, 0);
            } else if ((this.faceInfo[var6] & 1) == 0) {
                int var18 = this.field1209[var6];
                int var19 = this.faceInfo[var6];
                VertexNormal var20 = super.vertexNormal[var8];
                int var21 = (var20.z * arg4 + var20.y * arg3 + var20.x * arg2) / (var20.w * arg1) + arg0;
                this.field1203[var6] = method379(var18, var21, var19);
                VertexNormal var22 = super.vertexNormal[var9];
                int var23 = (var22.z * arg4 + var22.y * arg3 + var22.x * arg2) / (var22.w * arg1) + arg0;
                this.field1204[var6] = method379(var18, var23, var19);
                VertexNormal var24 = super.vertexNormal[var10];
                int var25 = (var24.z * arg4 + var24.y * arg3 + var24.x * arg2) / (var24.w * arg1) + arg0;
                this.field1205[var6] = method379(var18, var25, var19);
            }
        }
        super.vertexNormal = null;
        this.field1228 = null;
        this.field1223 = null;
        this.field1224 = null;
        if (this.faceInfo != null) {
            for (int var7 = 0; var7 < this.faceCount; ++var7) {
                if ((this.faceInfo[var7] & 2) == 2) {
                    return;
                }
            }
        }
        this.field1209 = null;
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(III)I")
    public static final int method379(int arg0, int arg1, int arg2) {
        if ((arg2 & 2) == 2) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 127) * arg1 >> 7;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 65408) + var4;
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(IIIIIII)V")
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Draw3D.centerX;
        int var9 = Draw3D.centerY;
        int var10 = sin[arg0];
        int var11 = cos[arg0];
        int var12 = sin[arg1];
        int var13 = cos[arg1];
        int var14 = sin[arg2];
        int var15 = cos[arg2];
        int var16 = sin[arg3];
        int var17 = cos[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.vertexCount; ++var19) {
            int var20 = this.vertexX[var19];
            int var21 = this.vertexY[var19];
            int var22 = this.vertexZ[var19];
            if (arg2 != 0) {
                int var23 = var14 * var21 + var15 * var20 >> 16;
                var21 = var15 * var21 - var14 * var20 >> 16;
                var20 = var23;
            }
            if (arg0 != 0) {
                int var24 = var11 * var21 - var10 * var22 >> 16;
                var22 = var10 * var21 + var11 * var22 >> 16;
                var21 = var24;
            }
            if (arg1 != 0) {
                int var25 = var12 * var22 + var13 * var20 >> 16;
                var22 = var13 * var22 - var12 * var20 >> 16;
                var20 = var25;
            }
            int var26 = arg4 + var20;
            int var27 = arg5 + var21;
            int var28 = arg6 + var22;
            int var29 = var17 * var27 - var16 * var28 >> 16;
            int var30 = var16 * var27 + var17 * var28 >> 16;
            field1235[var19] = var30 - var18;
            field1233[var19] = (var26 << 9) / var30 + var8;
            field1234[var19] = (var29 << 9) / var30 + var9;
            if (this.field1211 > 0) {
                field1236[var19] = var26;
                field1237[var19] = var29;
                field1238[var19] = var30;
            }
        }
        try {
            this.method382(false, false, 0);
        } catch (Exception var32) {
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(IIIIIIIII)V")
    public final void draw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1218 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 > 50 && var11 < 3500) {
            int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
            int var15 = var14 - this.field1218 << 9;
            if (var15 / var13 < Draw2D.field1102) {
                int var16 = this.field1218 + var14 << 9;
                if (var16 / var13 > -Draw2D.field1102) {
                    int var17 = arg2 * arg6 - arg1 * var10 >> 16;
                    int var18 = this.field1218 * arg1 >> 16;
                    int var19 = var17 + var18 << 9;
                    if (var19 / var13 > -Draw2D.field1103) {
                        int var20 = (super.field1709 * arg2 >> 16) + var18;
                        int var21 = var17 - var20 << 9;
                        if (var21 / var13 < Draw2D.field1103) {
                            int var22 = (super.field1709 * arg1 >> 16) + var12;
                            boolean var23 = false;
                            if (var11 - var22 <= 50) {
                                var23 = true;
                            }
                            boolean var24 = false;
                            if (arg8 > 0 && field1252) {
                                int var25 = var11 - var12;
                                if (var25 <= 50) {
                                    var25 = 50;
                                }
                                int var26;
                                int var27;
                                if (var14 > 0) {
                                    var26 = var15 / var13;
                                    var27 = var16 / var25;
                                } else {
                                    var27 = var16 / var13;
                                    var26 = var15 / var25;
                                }
                                int var28;
                                int var29;
                                if (var17 > 0) {
                                    var28 = var21 / var13;
                                    var29 = var19 / var25;
                                } else {
                                    var29 = var19 / var13;
                                    var28 = var21 / var25;
                                }
                                int var30 = field1253 - Draw3D.centerX;
                                int var31 = field1254 - Draw3D.centerY;
                                if (var30 > var26 && var30 < var27 && var31 > var28 && var31 < var29) {
                                    if (this.field1227) {
                                        field1256[field1255++] = arg8;
                                    } else {
                                        var24 = true;
                                    }
                                }
                            }
                            int var32 = Draw3D.centerX;
                            int var33 = Draw3D.centerY;
                            int var34 = 0;
                            int var35 = 0;
                            if (arg0 != 0) {
                                var34 = sin[arg0];
                                var35 = cos[arg0];
                            }
                            for (int var36 = 0; var36 < this.vertexCount; ++var36) {
                                int var37 = this.vertexX[var36];
                                int var38 = this.vertexY[var36];
                                int var39 = this.vertexZ[var36];
                                if (arg0 != 0) {
                                    int var40 = var34 * var39 + var35 * var37 >> 16;
                                    var39 = var35 * var39 - var34 * var37 >> 16;
                                    var37 = var40;
                                }
                                int var41 = arg5 + var37;
                                int var42 = arg6 + var38;
                                int var43 = arg7 + var39;
                                int var44 = arg3 * var43 + arg4 * var41 >> 16;
                                int var45 = arg4 * var43 - arg3 * var41 >> 16;
                                int var47 = arg2 * var42 - arg1 * var45 >> 16;
                                int var48 = arg1 * var42 + arg2 * var45 >> 16;
                                field1235[var36] = var48 - var11;
                                if (var48 >= 50) {
                                    field1233[var36] = (var44 << 9) / var48 + var32;
                                    field1234[var36] = (var47 << 9) / var48 + var33;
                                } else {
                                    field1233[var36] = -5000;
                                    var23 = true;
                                }
                                if (var23 || this.field1211 > 0) {
                                    field1236[var36] = var44;
                                    field1237[var36] = var47;
                                    field1238[var36] = var48;
                                }
                            }
                            try {
                                this.method382(var23, var24, arg8);
                            } catch (Exception var50) {
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(ZZI)V")
    private final void method382(boolean arg0, boolean arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1220; ++var4) {
            field1239[var4] = 0;
        }
        for (int var5 = 0; var5 < this.faceCount; ++var5) {
            if (this.faceInfo == null || this.faceInfo[var5] != -1) {
                int var30 = this.faceVertexA[var5];
                int var31 = this.faceVertexB[var5];
                int var32 = this.faceVertexC[var5];
                int var33 = field1233[var30];
                int var34 = field1233[var31];
                int var35 = field1233[var32];
                if (arg0 && (var33 == -5000 || var34 == -5000 || var35 == -5000)) {
                    field1232[var5] = true;
                    int var36 = (field1235[var30] + field1235[var31] + field1235[var32]) / 3 + this.field1221;
                    field1240[var36][field1239[var36]++] = var5;
                } else {
                    if (arg1 && this.method385(field1253, field1254, field1234[var30], field1234[var31], field1234[var32], var33, var34, var35)) {
                        field1256[field1255++] = arg2;
                        arg1 = false;
                    }
                    if ((field1234[var32] - field1234[var31]) * (var33 - var34) - (field1234[var30] - field1234[var31]) * (var35 - var34) > 0) {
                        field1232[var5] = false;
                        if (var33 >= 0 && var34 >= 0 && var35 >= 0 && var33 <= Draw2D.boundX && var34 <= Draw2D.boundX && var35 <= Draw2D.boundX) {
                            field1231[var5] = false;
                        } else {
                            field1231[var5] = true;
                        }
                        int var37 = (field1235[var30] + field1235[var31] + field1235[var32]) / 3 + this.field1221;
                        field1240[var37][field1239[var37]++] = var5;
                    }
                }
            }
        }
        if (this.field1207 == null) {
            for (int var6 = this.field1220 - 1; var6 >= 0; --var6) {
                int var7 = field1239[var6];
                if (var7 > 0) {
                    int[] var8 = field1240[var6];
                    for (int var9 = 0; var9 < var7; ++var9) {
                        this.method383(var8[var9]);
                    }
                }
            }
        } else {
            for (int var10 = 0; var10 < 12; ++var10) {
                field1241[var10] = 0;
                field1245[var10] = 0;
            }
            for (int var11 = this.field1220 - 1; var11 >= 0; --var11) {
                int var24 = field1239[var11];
                if (var24 > 0) {
                    int[] var25 = field1240[var11];
                    for (int var26 = 0; var26 < var24; ++var26) {
                        int var27 = var25[var26];
                        int var28 = this.field1207[var27];
                        int var29 = field1241[var28]++;
                        field1242[var28][var29] = var27;
                        if (var28 < 10) {
                            field1245[var28] += var11;
                        } else if (var28 == 10) {
                            field1243[var29] = var11;
                        } else {
                            field1244[var29] = var11;
                        }
                    }
                }
            }
            int var12 = 0;
            if (field1241[1] > 0 || field1241[2] > 0) {
                var12 = (field1245[1] + field1245[2]) / (field1241[1] + field1241[2]);
            }
            int var13 = 0;
            if (field1241[3] > 0 || field1241[4] > 0) {
                var13 = (field1245[3] + field1245[4]) / (field1241[3] + field1241[4]);
            }
            int var14 = 0;
            if (field1241[6] > 0 || field1241[8] > 0) {
                var14 = (field1245[6] + field1245[8]) / (field1241[6] + field1241[8]);
            }
            int var15 = 0;
            int var16 = field1241[10];
            int[] var17 = field1242[10];
            int[] var18 = field1243;
            if (var15 == var16) {
                var15 = 0;
                var16 = field1241[11];
                var17 = field1242[11];
                var18 = field1244;
            }
            int var19;
            if (var15 < var16) {
                var19 = var18[var15];
            } else {
                var19 = -1000;
            }
            for (int var20 = 0; var20 < 10; ++var20) {
                while (var20 == 0 && var19 > var12) {
                    this.method383(var17[var15++]);
                    if (var15 == var16 && field1242[11] != var17) {
                        var15 = 0;
                        var16 = field1241[11];
                        var17 = field1242[11];
                        var18 = field1244;
                    }
                    if (var15 < var16) {
                        var19 = var18[var15];
                    } else {
                        var19 = -1000;
                    }
                }
                while (var20 == 3 && var19 > var13) {
                    this.method383(var17[var15++]);
                    if (var15 == var16 && field1242[11] != var17) {
                        var15 = 0;
                        var16 = field1241[11];
                        var17 = field1242[11];
                        var18 = field1244;
                    }
                    if (var15 < var16) {
                        var19 = var18[var15];
                    } else {
                        var19 = -1000;
                    }
                }
                while (var20 == 5 && var19 > var14) {
                    this.method383(var17[var15++]);
                    if (var15 == var16 && field1242[11] != var17) {
                        var15 = 0;
                        var16 = field1241[11];
                        var17 = field1242[11];
                        var18 = field1244;
                    }
                    if (var15 < var16) {
                        var19 = var18[var15];
                    } else {
                        var19 = -1000;
                    }
                }
                int var21 = field1241[var20];
                int[] var22 = field1242[var20];
                for (int var23 = 0; var23 < var21; ++var23) {
                    this.method383(var22[var23]);
                }
            }
            while (var19 != -1000) {
                this.method383(var17[var15++]);
                if (var15 == var16 && field1242[11] != var17) {
                    var15 = 0;
                    var17 = field1242[11];
                    var16 = field1241[11];
                    var18 = field1244;
                }
                if (var15 < var16) {
                    var19 = var18[var15];
                } else {
                    var19 = -1000;
                }
            }
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "h", descriptor = "(I)V")
    private final void method383(int arg0) {
        if (field1232[arg0]) {
            this.method384(arg0);
        } else {
            int var2 = this.faceVertexA[arg0];
            int var3 = this.faceVertexB[arg0];
            int var4 = this.faceVertexC[arg0];
            Draw3D.clipX = field1231[arg0];
            if (this.field1208 == null) {
                Draw3D.alpha = 0;
            } else {
                Draw3D.alpha = this.field1208[arg0];
            }
            int var5;
            if (this.faceInfo == null) {
                var5 = 0;
            } else {
                var5 = this.faceInfo[arg0] & 3;
            }
            if (var5 == 0) {
                Draw3D.fillGouraudTriangle(field1234[var2], field1234[var3], field1234[var4], field1233[var2], field1233[var3], field1233[var4], this.field1203[arg0], this.field1204[arg0], this.field1205[arg0]);
            } else if (var5 == 1) {
                Draw3D.method557(field1234[var2], field1234[var3], field1234[var4], field1233[var2], field1233[var3], field1233[var4], field1259[this.field1203[arg0]]);
            } else if (var5 == 2) {
                int var6 = this.faceInfo[arg0] >> 2;
                int var7 = this.field1212[var6];
                int var8 = this.field1213[var6];
                int var9 = this.field1214[var6];
                Draw3D.fillTexturedTriangle(field1234[var2], field1234[var3], field1234[var4], field1233[var2], field1233[var3], field1233[var4], this.field1203[arg0], this.field1204[arg0], this.field1205[arg0], field1236[var7], field1236[var8], field1236[var9], field1237[var7], field1237[var8], field1237[var9], field1238[var7], field1238[var8], field1238[var9], this.field1209[arg0]);
            } else {
                if (var5 == 3) {
                    int var10 = this.faceInfo[arg0] >> 2;
                    int var11 = this.field1212[var10];
                    int var12 = this.field1213[var10];
                    int var13 = this.field1214[var10];
                    Draw3D.fillTexturedTriangle(field1234[var2], field1234[var3], field1234[var4], field1233[var2], field1233[var3], field1233[var4], this.field1203[arg0], this.field1203[arg0], this.field1203[arg0], field1236[var11], field1236[var12], field1236[var13], field1237[var11], field1237[var12], field1237[var13], field1238[var11], field1238[var12], field1238[var13], this.field1209[arg0]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "i", descriptor = "(I)V")
    private final void method384(int arg0) {
        int var2 = Draw3D.centerX;
        int var3 = Draw3D.centerY;
        int var4 = 0;
        int var5 = this.faceVertexA[arg0];
        int var6 = this.faceVertexB[arg0];
        int var7 = this.faceVertexC[arg0];
        int var8 = field1238[var5];
        int var9 = field1238[var6];
        int var10 = field1238[var7];
        if (var8 >= 50) {
            field1246[var4] = field1233[var5];
            field1247[var4] = field1234[var5];
            field1248[var4++] = this.field1203[arg0];
        } else {
            int var11 = field1236[var5];
            int var12 = field1237[var5];
            int var13 = this.field1203[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1260[var10 - var8];
                field1246[var4] = (((field1236[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1247[var4] = (((field1237[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1248[var4++] = ((this.field1205[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1260[var9 - var8];
                field1246[var4] = (((field1236[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1247[var4] = (((field1237[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1248[var4++] = ((this.field1204[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1246[var4] = field1233[var6];
            field1247[var4] = field1234[var6];
            field1248[var4++] = this.field1204[arg0];
        } else {
            int var16 = field1236[var6];
            int var17 = field1237[var6];
            int var18 = this.field1204[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1260[var8 - var9];
                field1246[var4] = (((field1236[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1247[var4] = (((field1237[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1248[var4++] = ((this.field1203[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1260[var10 - var9];
                field1246[var4] = (((field1236[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1247[var4] = (((field1237[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1248[var4++] = ((this.field1205[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1246[var4] = field1233[var7];
            field1247[var4] = field1234[var7];
            field1248[var4++] = this.field1205[arg0];
        } else {
            int var21 = field1236[var7];
            int var22 = field1237[var7];
            int var23 = this.field1205[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1260[var9 - var10];
                field1246[var4] = (((field1236[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1247[var4] = (((field1237[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1248[var4++] = ((this.field1204[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1260[var8 - var10];
                field1246[var4] = (((field1236[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1247[var4] = (((field1237[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1248[var4++] = ((this.field1203[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1246[0];
        int var27 = field1246[1];
        int var28 = field1246[2];
        int var29 = field1247[0];
        int var30 = field1247[1];
        int var31 = field1247[2];
        if ((var26 - var27) * (var31 - var30) - (var28 - var27) * (var29 - var30) > 0) {
            Draw3D.clipX = false;
            if (var4 == 3) {
                if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Draw2D.boundX || var27 > Draw2D.boundX || var28 > Draw2D.boundX) {
                    Draw3D.clipX = true;
                }
                int var32;
                if (this.faceInfo == null) {
                    var32 = 0;
                } else {
                    var32 = this.faceInfo[arg0] & 3;
                }
                if (var32 == 0) {
                    Draw3D.fillGouraudTriangle(var29, var30, var31, var26, var27, var28, field1248[0], field1248[1], field1248[2]);
                } else if (var32 == 1) {
                    Draw3D.method557(var29, var30, var31, var26, var27, var28, field1259[this.field1203[arg0]]);
                } else if (var32 == 2) {
                    int var33 = this.faceInfo[arg0] >> 2;
                    int var34 = this.field1212[var33];
                    int var35 = this.field1213[var33];
                    int var36 = this.field1214[var33];
                    Draw3D.fillTexturedTriangle(var29, var30, var31, var26, var27, var28, field1248[0], field1248[1], field1248[2], field1236[var34], field1236[var35], field1236[var36], field1237[var34], field1237[var35], field1237[var36], field1238[var34], field1238[var35], field1238[var36], this.field1209[arg0]);
                } else if (var32 == 3) {
                    int var37 = this.faceInfo[arg0] >> 2;
                    int var38 = this.field1212[var37];
                    int var39 = this.field1213[var37];
                    int var40 = this.field1214[var37];
                    Draw3D.fillTexturedTriangle(var29, var30, var31, var26, var27, var28, this.field1203[arg0], this.field1203[arg0], this.field1203[arg0], field1236[var38], field1236[var39], field1236[var40], field1237[var38], field1237[var39], field1237[var40], field1238[var38], field1238[var39], field1238[var40], this.field1209[arg0]);
                }
            }
            if (var4 == 4) {
                if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Draw2D.boundX || var27 > Draw2D.boundX || var28 > Draw2D.boundX || field1246[3] < 0 || field1246[3] > Draw2D.boundX) {
                    Draw3D.clipX = true;
                }
                int var41;
                if (this.faceInfo == null) {
                    var41 = 0;
                } else {
                    var41 = this.faceInfo[arg0] & 3;
                }
                if (var41 == 0) {
                    Draw3D.fillGouraudTriangle(var29, var30, var31, var26, var27, var28, field1248[0], field1248[1], field1248[2]);
                    Draw3D.fillGouraudTriangle(var29, var31, field1247[3], var26, var28, field1246[3], field1248[0], field1248[2], field1248[3]);
                    return;
                }
                if (var41 == 1) {
                    int var42 = field1259[this.field1203[arg0]];
                    Draw3D.method557(var29, var30, var31, var26, var27, var28, var42);
                    Draw3D.method557(var29, var31, field1247[3], var26, var28, field1246[3], var42);
                    return;
                }
                if (var41 == 2) {
                    int var43 = this.faceInfo[arg0] >> 2;
                    int var44 = this.field1212[var43];
                    int var45 = this.field1213[var43];
                    int var46 = this.field1214[var43];
                    Draw3D.fillTexturedTriangle(var29, var30, var31, var26, var27, var28, field1248[0], field1248[1], field1248[2], field1236[var44], field1236[var45], field1236[var46], field1237[var44], field1237[var45], field1237[var46], field1238[var44], field1238[var45], field1238[var46], this.field1209[arg0]);
                    Draw3D.fillTexturedTriangle(var29, var31, field1247[3], var26, var28, field1246[3], field1248[0], field1248[2], field1248[3], field1236[var44], field1236[var45], field1236[var46], field1237[var44], field1237[var45], field1237[var46], field1238[var44], field1238[var45], field1238[var46], this.field1209[arg0]);
                    return;
                }
                if (var41 == 3) {
                    int var47 = this.faceInfo[arg0] >> 2;
                    int var48 = this.field1212[var47];
                    int var49 = this.field1213[var47];
                    int var50 = this.field1214[var47];
                    Draw3D.fillTexturedTriangle(var29, var30, var31, var26, var27, var28, this.field1203[arg0], this.field1203[arg0], this.field1203[arg0], field1236[var48], field1236[var49], field1236[var50], field1237[var48], field1237[var49], field1237[var50], field1238[var48], field1238[var49], field1238[var50], this.field1209[arg0]);
                    Draw3D.fillTexturedTriangle(var29, var31, field1247[3], var26, var28, field1246[3], this.field1203[arg0], this.field1203[arg0], this.field1203[arg0], field1236[var48], field1236[var49], field1236[var50], field1237[var48], field1237[var49], field1237[var50], field1238[var48], field1238[var49], field1238[var50], this.field1209[arg0]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "a", descriptor = "(IIIIIIII)Z")
    private final boolean method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }
}
