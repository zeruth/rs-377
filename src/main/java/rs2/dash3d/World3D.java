package rs2.dash3d;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.dash3d.entity.Entity;
import rs2.dash3d.type.*;
import rs2.datastruct.LinkList;
import rs2.graphics.Draw2D;
import rs2.graphics.Draw3D;
import rs2.graphics.Model;

import java.util.Arrays;

@OriginalClass("client!KJCMXHNO")
public class World3D {

    @OriginalMember(owner = "client!KJCMXHNO", name = "b", descriptor = "I")
    private int field1002 = -203;

    @OriginalMember(owner = "client!KJCMXHNO", name = "c", descriptor = "Z")
    private boolean field1003 = true;

    @OriginalMember(owner = "client!KJCMXHNO", name = "d", descriptor = "Z")
    private boolean field1004 = false;

    @OriginalMember(owner = "client!KJCMXHNO", name = "g", descriptor = "I")
    private int field1007 = 2;

    @OriginalMember(owner = "client!KJCMXHNO", name = "h", descriptor = "I")
    private int field1008 = -766;

    @OriginalMember(owner = "client!KJCMXHNO", name = "i", descriptor = "Z")
    private boolean field1009 = true;

    @OriginalMember(owner = "client!KJCMXHNO", name = "j", descriptor = "Z")
    private boolean field1010 = true;

    @OriginalMember(owner = "client!KJCMXHNO", name = "k", descriptor = "Z")
    private boolean field1011 = false;

    @OriginalMember(owner = "client!KJCMXHNO", name = "l", descriptor = "I")
    private int field1012 = -68;

    @OriginalMember(owner = "client!KJCMXHNO", name = "u", descriptor = "[LBHOSVTIT;")
    public Location[] temporaryLocs = new Location[5000];

    @OriginalMember(owner = "client!KJCMXHNO", name = "kb", descriptor = "[I")
    public int[] field1063 = new int[10000];

    @OriginalMember(owner = "client!KJCMXHNO", name = "lb", descriptor = "[I")
    public int[] field1064 = new int[10000];

    @OriginalMember(owner = "client!KJCMXHNO", name = "nb", descriptor = "[[I")
    public int[][] field1066 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!KJCMXHNO", name = "ob", descriptor = "[[I")
    public int[][] field1067 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!KJCMXHNO", name = "n", descriptor = "I")
    public int maxLevel;

    @OriginalMember(owner = "client!KJCMXHNO", name = "o", descriptor = "I")
    public int maxTileX;

    @OriginalMember(owner = "client!KJCMXHNO", name = "p", descriptor = "I")
    public int maxTileZ;

    @OriginalMember(owner = "client!KJCMXHNO", name = "r", descriptor = "[[[LRIEEXHOP;")
    public Ground[][][] levelTiles;

    @OriginalMember(owner = "client!KJCMXHNO", name = "v", descriptor = "[[[I")
    public int[][][] levelTileOcclusionCycles;

    @OriginalMember(owner = "client!KJCMXHNO", name = "q", descriptor = "[[[I")
    public int[][][] levelHeightmaps;

    @OriginalMember(owner = "client!KJCMXHNO", name = "m", descriptor = "Z")
    public static boolean field1013 = true;

    @OriginalMember(owner = "client!KJCMXHNO", name = "M", descriptor = "[LBHOSVTIT;")
    public static Location[] locBuffer = new Location[100];

    @OriginalMember(owner = "client!KJCMXHNO", name = "N", descriptor = "[I")
    public static final int[] field1040 = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "O", descriptor = "[I")
    public static final int[] field1041 = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "P", descriptor = "[I")
    public static final int[] field1042 = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "Q", descriptor = "[I")
    public static final int[] field1043 = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "U", descriptor = "I")
    public static int field1047 = -1;

    @OriginalMember(owner = "client!KJCMXHNO", name = "V", descriptor = "I")
    public static int field1048 = -1;

    @OriginalMember(owner = "client!KJCMXHNO", name = "W", descriptor = "I")
    public static int LEVELS = 4;

    @OriginalMember(owner = "client!KJCMXHNO", name = "X", descriptor = "[I")
    public static int[] levelOccluderCount = new int[LEVELS];

    @OriginalMember(owner = "client!KJCMXHNO", name = "Y", descriptor = "[[LVEDUNTJR;")
    public static Occluder[][] levelOccluders = new Occluder[LEVELS][500];

    @OriginalMember(owner = "client!KJCMXHNO", name = "ab", descriptor = "[LVEDUNTJR;")
    public static Occluder[] field1053 = new Occluder[500];

    @OriginalMember(owner = "client!KJCMXHNO", name = "bb", descriptor = "LBOHLFXVX;")
    public static LinkList field1054 = new LinkList(true);

    @OriginalMember(owner = "client!KJCMXHNO", name = "cb", descriptor = "[I")
    public static final int[] field1055 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "db", descriptor = "[I")
    public static final int[] field1056 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "eb", descriptor = "[I")
    public static final int[] field1057 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "fb", descriptor = "[I")
    public static final int[] field1058 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "gb", descriptor = "[I")
    public static final int[] field1059 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "hb", descriptor = "[I")
    public static final int[] field1060 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "ib", descriptor = "[I")
    public static final int[] field1061 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "jb", descriptor = "[I")
    public static final int[] field1062 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "pb", descriptor = "[[[[Z")
    public static boolean[][][][] field1068 = new boolean[8][32][51][51];

    @OriginalMember(owner = "client!KJCMXHNO", name = "e", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!KJCMXHNO", name = "f", descriptor = "I")
    private static int field1006;

    @OriginalMember(owner = "client!KJCMXHNO", name = "s", descriptor = "I")
    public int minLevel;

    @OriginalMember(owner = "client!KJCMXHNO", name = "t", descriptor = "I")
    public int temporaryLocCount;

    @OriginalMember(owner = "client!KJCMXHNO", name = "w", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!KJCMXHNO", name = "x", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!KJCMXHNO", name = "y", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!KJCMXHNO", name = "z", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!KJCMXHNO", name = "A", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!KJCMXHNO", name = "B", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!KJCMXHNO", name = "C", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!KJCMXHNO", name = "D", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!KJCMXHNO", name = "E", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!KJCMXHNO", name = "F", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!KJCMXHNO", name = "G", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!KJCMXHNO", name = "H", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!KJCMXHNO", name = "I", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!KJCMXHNO", name = "J", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!KJCMXHNO", name = "K", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!KJCMXHNO", name = "L", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!KJCMXHNO", name = "S", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!KJCMXHNO", name = "T", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!KJCMXHNO", name = "Z", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!KJCMXHNO", name = "mb", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!KJCMXHNO", name = "rb", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!KJCMXHNO", name = "sb", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!KJCMXHNO", name = "tb", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!KJCMXHNO", name = "ub", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!KJCMXHNO", name = "vb", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!KJCMXHNO", name = "wb", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "Z")
    private static boolean field1001;

    @OriginalMember(owner = "client!KJCMXHNO", name = "R", descriptor = "Z")
    public static boolean field1044;

    @OriginalMember(owner = "client!KJCMXHNO", name = "qb", descriptor = "[[Z")
    public static boolean[][] field1069;

    @OriginalMember(owner = "client!KJCMXHNO", name = "<init>", descriptor = "([[[IIIIB)V")
    public World3D(int[][][] levelHeightmaps, int maxLevel, int maxTileX, int maxTileZ) {
        this.maxLevel = maxLevel;
        this.maxTileX = maxTileX;
        this.maxTileZ = maxTileZ;
        this.levelTiles = new Ground[maxLevel][maxTileX][maxTileZ];
        this.levelTileOcclusionCycles = new int[maxLevel][maxTileX + 1][maxTileZ + 1];
        this.levelHeightmaps = levelHeightmaps;
        this.reset();
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(B)V")
    public void reset() {
        for (int var2 = 0; var2 < this.maxLevel; var2++) {
            for (int var8 = 0; var8 < this.maxTileX; var8++) {
                for (int var9 = 0; var9 < this.maxTileZ; var9++) {
                    this.levelTiles[var2][var8][var9] = null;
                }
            }
        }
        for (int var4 = 0; var4 < LEVELS; var4++) {
            for (int var7 = 0; var7 < levelOccluderCount[var4]; var7++) {
                levelOccluders[var4][var7] = null;
            }
            levelOccluderCount[var4] = 0;
        }
        for (int var5 = 0; var5 < this.temporaryLocCount; var5++) {
            this.temporaryLocs[var5] = null;
        }
        this.temporaryLocCount = 0;
        Arrays.fill(locBuffer, null);
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IZ)V")
    public void setMinLevel(int level) {
        this.minLevel = level;
        for (int stx = 0; stx < this.maxTileX; stx++) {
            for (int stz = 0; stz < this.maxTileZ; stz++) {
                if (this.levelTiles[level][stx][stz] == null) {
                    this.levelTiles[level][stx][stz] = new Ground(level, stx, stz);
                }
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(ZII)V")
    public void setBridge(int stx, int stz) {
        Ground ground = this.levelTiles[0][stx][stz];
        for (int level = 0; level < 3; level++) {
            Ground tile = this.levelTiles[level][stx][stz] = this.levelTiles[level + 1][stx][stz];
            if (tile != null) {
                tile.groundLevel--;
                for (int var8 = 0; var8 < tile.locCount; var8++) {
                    Location loc = tile.locs[var8];
                    if ((loc.typecode >> 29 & 0x3) == 2 && loc.tileX == stx && loc.tileZ == stz) {
                        loc.level--;
                    }
                }
            }
        }
        if (this.levelTiles[0][stx][stz] == null) {
            this.levelTiles[0][stx][stz] = new Ground(0, stx, stz);
        }
        this.levelTiles[0][stx][stz].bridge = ground;
        this.levelTiles[3][stx][stz] = null;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIII)V")
    public void setDrawLevel(int level, int stx, int stz, int drawLevel) {
        Ground tile = this.levelTiles[level][stx][stz];
        if (tile != null) {
            this.levelTiles[level][stx][stz].drawLevel = drawLevel;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void setTile(int level, int x, int z, int shape, int angle, int textureId, int southwestY, int southeastY, int northeastY, int northwestY, int southwestColor, int southeastColor, int northeastColor, int northwestColor, int southwestColor2, int southeastColor2, int northeastColor2, int northwestColor2, int backgroundRgb, int foregroundRgb) {
        if (shape == 0) {
            for (int l = level; l >= 0; l--) {
                if (this.levelTiles[l][x][z] == null) {
                    this.levelTiles[l][x][z] = new Ground(l, x, z);
                }
            }
            this.levelTiles[level][x][z].underlay = new TileUnderlay(southwestColor, southeastColor, northeastColor, northwestColor, -1, backgroundRgb, false);
        } else if (shape == 1) {
            for (int l = level; l >= 0; l--) {
                if (this.levelTiles[l][x][z] == null) {
                    this.levelTiles[l][x][z] = new Ground(l, x, z);
                }
            }
            this.levelTiles[level][x][z].underlay = new TileUnderlay(southwestColor2, southeastColor2, northeastColor2, northwestColor2, textureId, foregroundRgb, southwestY == southeastY && southwestY == northeastY && southwestY == northwestY);
        } else {
            for (int l = level; l >= 0; l--) {
                if (this.levelTiles[l][x][z] == null) {
                    this.levelTiles[l][x][z] = new Ground(l, x, z);
                }
            }
            this.levelTiles[level][x][z].overlay = new TileOverlay(northwestY, southwestColor2, northeastY, southwestY, x, northeastColor, northwestColor, foregroundRgb, southeastColor, northeastColor2, 0, southwestColor, shape, southeastY, northwestColor2, textureId, backgroundRgb, southeastColor2, z, angle);
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIBIIILZOXDNIET;)V")
    public void addGroundDecoration(int tileX, int tileZ, byte info, int arg4, int arg5, int tileLevel, Entity entity) {
        if (entity == null) {
            return;
        }
        if (this.levelTiles[tileLevel][tileX][tileZ] == null) {
            this.levelTiles[tileLevel][tileX][tileZ] = new Ground(tileLevel, tileX, tileZ);
        }
        this.levelTiles[tileLevel][tileX][tileZ].groundDecoration = new GroundDecor(entity, tileX * 128 + 64, tileZ * 128 + 64, arg5, arg4, info);
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IILZOXDNIET;LZOXDNIET;ILZOXDNIET;III)V")
    public void addObjStack(int arg0, int level, Entity arg2, Entity arg3, int arg4, Entity arg5, int arg6, int stz, int stx) {
        int stackOffset = 0;
        Ground tile = this.levelTiles[level][stx][stz];
        if (tile != null) {
            for (int l = 0; l < tile.locCount; l++) {
                if (tile.locs[l].entity instanceof Model) {
                    int height = ((Model) tile.locs[l].entity).objRaise;
                    if (height > stackOffset) {
                        stackOffset = height;
                    }
                }
            }
        }
        if (this.levelTiles[level][stx][stz] == null) {
            this.levelTiles[level][stx][stz] = new Ground(level, stx, stz);
        }
        this.levelTiles[level][stx][stz].objStack = new ObjStack(arg0, stx * 128 + 64, stz * 128 + 64, arg4, stackOffset, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIILZOXDNIET;IIBILZOXDNIET;I)V")
    public void addWall(int arg0, int arg2, int arg3, Entity entityB, int tileX, int arg6, byte arg7, int tileZ, Entity entityA, int level) {
        if (entityA == null && entityB == null) {
            return;
        }
        for (int l = level; l >= 0; l--) {
            if (this.levelTiles[l][tileX][tileZ] == null) {
                this.levelTiles[l][tileX][tileZ] = new Ground(l, tileX, tileZ);
            }
        }
        this.levelTiles[level][tileX][tileZ].wall = new Wall(arg7, arg0, tileX * 128 + 64, tileZ * 128 + 64, arg3, arg2, arg6, entityA, entityB);
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIZ)V")
    public void removeWall(int z, int level, int x, boolean arg3) {
        Ground tile = this.levelTiles[level][x][z];
        if (tile != null) {
            tile.wall = null;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIIBIIIIILZOXDNIET;I)V")
    public void setWallDecoration(int level, int arg1, int arg2, int arg3, byte arg4, int tileX, int arg6, int tileZ, int arg8, int arg9, Entity entity) {
        if (entity == null) {
            return;
        }
        for (int l = level; l >= 0; l--) {
            if (this.levelTiles[l][tileX][tileZ] == null) {
                this.levelTiles[l][tileX][tileZ] = new Ground(l, tileX, tileZ);
            }
        }
        this.levelTiles[level][tileX][tileZ].wallDecoration = new Decor(arg4, arg9, tileX * 128 + arg8 + 64, tileZ * 128 + arg6 + 64, arg1, arg2, arg3, entity);
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(ZIII)V")
    public void removeWallDecoration(int level, int x, int z) {
        Ground tile = this.levelTiles[level][x][z];
        if (tile != null) {
            tile.wallDecoration = null;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIII)V")
    public void setWallDecorationOffset(int z, int offset, int level, int x, int arg4) {
        Ground tile = this.levelTiles[level][x][z];
        if (tile == null) {
            return;
        }
        Decor decor = tile.wallDecoration;
        if (decor == null) {
            return;
        }
        int sx = x * 128 + 64;
        int sz = z * 128 + 64;
        decor.x = (decor.x - sx) * offset / 16 + sx;
        decor.z = (decor.z - sz) * offset / 16 + sz;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIILZOXDNIET;BIIIIII)Z")
    public boolean addLoc(int arg0, int tileX, int tileZ, Entity entity, byte arg4, int arg5, int width, int length, int arg9, int arg10) {
        if (entity == null) {
            return true;
        } else {
            int sceneX = tileX * 64 + width * 128;
            int sceneZ = tileZ * 128 + length * 64;
            return this.addLoc2(arg0, width, tileZ, tileX, length, sceneX, sceneZ, arg9, entity, arg5, false, arg10, arg4);
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(ILZOXDNIET;IIZIIIII)Z")
    public boolean addTemporary(int arg0, Entity entity, int x, int arg3, boolean forwardPadding, int arg5, int arg6, int padding, int z, int yaw) {
        if (entity == null) {
            return true;
        }
        int x0 = x - padding;
        int z0 = z - padding;
        int x1 = x + padding;
        int z1 = padding + z;
        if (forwardPadding) {
            if (yaw > 640 && yaw < 1408) {
                z1 += 128;
            }
            if (yaw > 1152 && yaw < 1920) {
                x1 += 128;
            }
            if (yaw > 1664 || yaw < 384) {
                z0 -= 128;
            }
            if (yaw > 128 && yaw < 896) {
                x0 -= 128;
            }
        }
        x0 = x0 / 128;
        z0 = z0 / 128;
        x1 = x1 / 128;
        z1 = z1 / 128;
        return this.addLoc2(arg6, x0, z0, x1 + 1 - x0, z1 - z0 + 1, x, z, arg3, entity, yaw, true, arg0, (byte) 0);
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIILZOXDNIET;IIIIIIII)Z")
    public boolean addTemporary2(int arg0, int arg1, int arg2, Entity entity, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        return entity == null || this.addLoc2(arg11, arg5, arg1, arg10 + 1 - arg5, arg7 - arg1 + 1, arg8, arg6, arg0, entity, arg9, true, arg12, (byte) 0);
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIIIIIILZOXDNIET;IZIB)Z")
    private boolean addLoc2(int level, int tileX, int tileZ, int tileSizeX, int tileSizeZ, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean temporary, int arg11, byte arg12) {
        for (int tx = tileX; tx < tileX + tileSizeX; tx++) {
            for (int tz = tileZ; tz < tileZ + tileSizeZ; tz++) {
                if (tx < 0 || tz < 0 || tx >= this.maxTileX || tz >= this.maxTileZ) {
                    return false;
                }
                Ground tile = this.levelTiles[level][tx][tz];
                if (tile != null && tile.locCount >= 5) {
                    return false;
                }
            }
        }
        Location loc = new Location(arg12, level, arg7, arg5, arg6, arg9, tileX, tileX + tileSizeX - 1, tileZ, tileZ + tileSizeZ - 1, -1, -1, arg11, arg8);
        for (int tx = tileX; tx < tileX + tileSizeX; tx++) {
            for (int tz = tileZ; tz < tileZ + tileSizeZ; tz++) {
                int spans = 0;
                if (tx > tileX) {
                    spans++;
                }
                if (tx < tileX + tileSizeX - 1) {
                    spans += 4;
                }
                if (tz > tileZ) {
                    spans += 8;
                }
                if (tz < tileZ + tileSizeZ - 1) {
                    spans += 2;
                }
                for (int l = level; l >= 0; l--) {
                    if (this.levelTiles[l][tx][tz] == null) {
                        this.levelTiles[l][tx][tz] = new Ground(l, tx, tz);
                    }
                }
                Ground tile = this.levelTiles[level][tx][tz];
                tile.locs[tile.locCount] = loc;
                tile.locSpan[tile.locCount] = spans;
                tile.locSpans |= spans;
                tile.locCount++;
            }
        }
        if (temporary) {
            this.temporaryLocs[this.temporaryLocCount++] = loc;
        }
        return true;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(I)V")
    public void clearTemporaryLocs(int arg0) {
        int var2 = 16 / arg0;
        for (int i = 0; i < this.temporaryLocCount; i++) {
            Location loc = this.temporaryLocs[i];
            this.removeLoc2(loc);
            this.temporaryLocs[i] = null;
        }
        this.temporaryLocCount = 0;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(LBHOSVTIT;I)V")
    private void removeLoc2(Location arg0) {
        for (int tx = arg0.tileX; tx <= arg0.maxSceneTileX; tx++) {
            for (int tz = arg0.tileZ; tz <= arg0.maxSceneTileZ; tz++) {
                Ground tile = this.levelTiles[arg0.level][tx][tz];
                if (tile != null) {
                    for (int var6 = 0; var6 < tile.locCount; var6++) {
                        if (tile.locs[var6] == arg0) {
                            tile.locCount--;
                            for (int var7 = var6; var7 < tile.locCount; var7++) {
                                tile.locs[var7] = tile.locs[var7 + 1];
                                tile.locSpan[var7] = tile.locSpan[var7 + 1];
                            }
                            tile.locs[tile.locCount] = null;
                            break;
                        }
                    }
                    tile.locSpans = 0;
                    for (int var8 = 0; var8 < tile.locCount; var8++) {
                        tile.locSpans |= tile.locSpan[var8];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "b", descriptor = "(IIII)V")
    public void removeLoc(int z, int level, int x) {
        Ground tile = this.levelTiles[level][x][z];
        if (tile == null) {
            return;
        }
        for (int l = 0; l < tile.locCount; l++) {
            Location loc = tile.locs[l];
            if ((loc.typecode >> 29 & 0x3) == 2 && loc.tileX == x && loc.tileZ == z) {
                this.removeLoc2(loc);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIZI)V")
    public void removeGroundDecoration(int level, int x, int z) {
        Ground tile = this.levelTiles[level][x][z];
        if (tile == null) {
            return;
        }
        tile.groundDecoration = null;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(III)V")
    public void removeObjStack(int level, int x, int z) {
        Ground tile = this.levelTiles[level][x][z];
        if (tile != null) {
            tile.objStack = null;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "c", descriptor = "(IIII)LWQXKHZYN;")
    public Wall getWall(int level, int arg1, int x, int z) {
        Ground tile = this.levelTiles[level][x][z];
        return tile == null ? null : tile.wall;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "b", descriptor = "(IIIZ)LSEMZHDXN;")
    public Decor getWallDecoration(int level, int z, int x) {
        Ground tile = this.levelTiles[level][x][z];
        if (tile == null) {
            return null;
        } else {
            return tile.wallDecoration;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IBII)LBHOSVTIT;")
    public Location getLoc(int x, int z, int level) {
        Ground tile = this.levelTiles[level][x][z];
        if (tile == null) {
            return null;
        }
        for (int var7 = 0; var7 < tile.locCount; var7++) {
            Location loc = tile.locs[var7];
            if ((loc.typecode >> 29 & 0x3) == 2 && loc.tileX == x && loc.tileZ == z) {
                return loc;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "d", descriptor = "(IIII)LMOLUZZPG;")
    public GroundDecor getGroundDecor(int level, int z, int x) {
        Ground tile = this.levelTiles[level][x][z];
        return tile == null || tile.groundDecoration == null ? null : tile.groundDecoration;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "b", descriptor = "(III)I")
    public int getWallTypecode(int arg0, int arg1, int arg2) {
        Ground tile = this.levelTiles[arg0][arg1][arg2];
        return tile == null || tile.wall == null ? 0 : tile.wall.typecode;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "b", descriptor = "(IBII)I")
    public int getDecorTypecode(int arg0, int arg2, int arg3) {
        Ground tile = this.levelTiles[arg2][arg0][arg3];
        return tile == null || tile.wallDecoration == null ? 0 : tile.wallDecoration.field1412;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "c", descriptor = "(III)I")
    public int method302(int arg0, int arg1, int arg2) {
        Ground var4 = this.levelTiles[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.locCount; var5++) {
            Location var6 = var4.locs[var5];
            if ((var6.typecode >> 29 & 0x3) == 2 && var6.tileX == arg1 && var6.tileZ == arg2) {
                return var6.typecode;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "d", descriptor = "(III)I")
    public int method303(int arg0, int arg1, int arg2) {
        Ground var4 = this.levelTiles[arg0][arg1][arg2];
        return var4 == null || var4.groundDecoration == null ? 0 : var4.groundDecoration.field1314;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "e", descriptor = "(IIII)I")
    public int method304(int arg0, int arg1, int arg2, int arg3) {
        Ground var5 = this.levelTiles[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.wall != null && var5.wall.typecode == arg3) {
            return var5.wall.field1540 & 0xFF;
        } else if (var5.wallDecoration != null && var5.wallDecoration.field1412 == arg3) {
            return var5.wallDecoration.field1413 & 0xFF;
        } else if (var5.groundDecoration != null && var5.groundDecoration.field1314 == arg3) {
            return var5.groundDecoration.info & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.locCount; var6++) {
                if (var5.locs[var6].typecode == arg3) {
                    return var5.locs[var6].field89 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(BIII)V")
    public void method305(byte arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.maxLevel; var5++) {
            for (int var7 = 0; var7 < this.maxTileX; var7++) {
                for (int var8 = 0; var8 < this.maxTileZ; var8++) {
                    Ground var9 = this.levelTiles[var5][var7][var8];
                    if (var9 != null) {
                        Wall var10 = var9.wall;
                        if (var10 != null && var10.field1537 != null && var10.field1537.field1708 != null) {
                            this.method307(var8, var5, 0, 1, (Model) var10.field1537, var7, 1);
                            if (var10.field1538 != null && var10.field1538.field1708 != null) {
                                this.method307(var8, var5, 0, 1, (Model) var10.field1538, var7, 1);
                                this.method308((Model) var10.field1537, (Model) var10.field1538, 0, 0, 0, false);
                                ((Model) var10.field1538).method377(arg1, arg2, 0, arg3);
                            }
                            ((Model) var10.field1537).method377(arg1, arg2, 0, arg3);
                        }
                        for (int var11 = 0; var11 < var9.locCount; var11++) {
                            Location var13 = var9.locs[var11];
                            if (var13 != null && var13.entity != null && var13.entity.field1708 != null) {
                                this.method307(var8, var5, 0, var13.maxSceneTileX + 1 - var13.tileX, (Model) var13.entity, var7, var13.maxSceneTileZ + 1 - var13.tileZ);
                                ((Model) var13.entity).method377(arg1, arg2, 0, arg3);
                            }
                        }
                        GroundDecor var12 = var9.groundDecoration;
                        if (var12 != null && var12.entity.field1708 != null) {
                            this.method306(var7, (Model) var12.entity, var8, var5, 0);
                            ((Model) var12.entity).method377(arg1, arg2, 0, arg3);
                        }
                    }
                }
            }
        }
        if (arg0 == 2) {
            boolean var6 = false;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(ILLZYQDKJV;III)V")
    private void method306(int arg0, Model arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            return;
        }
        if (arg0 < this.maxTileX) {
            Ground var6 = this.levelTiles[arg3][arg0 + 1][arg2];
            if (var6 != null && var6.groundDecoration != null && var6.groundDecoration.entity.field1708 != null) {
                this.method308(arg1, (Model) var6.groundDecoration.entity, 128, 0, 0, true);
            }
        }
        if (arg2 < this.maxTileX) {
            Ground var7 = this.levelTiles[arg3][arg0][arg2 + 1];
            if (var7 != null && var7.groundDecoration != null && var7.groundDecoration.entity.field1708 != null) {
                this.method308(arg1, (Model) var7.groundDecoration.entity, 0, 0, 128, true);
            }
        }
        if (arg0 < this.maxTileX && arg2 < this.maxTileZ) {
            Ground var8 = this.levelTiles[arg3][arg0 + 1][arg2 + 1];
            if (var8 != null && var8.groundDecoration != null && var8.groundDecoration.entity.field1708 != null) {
                this.method308(arg1, (Model) var8.groundDecoration.entity, 128, 0, 128, true);
            }
        }
        if (arg0 >= this.maxTileX || arg2 <= 0) {
            return;
        }
        Ground var9 = this.levelTiles[arg3][arg0 + 1][arg2 - 1];
        if (var9 != null && var9.groundDecoration != null && var9.groundDecoration.entity.field1708 != null) {
            this.method308(arg1, (Model) var9.groundDecoration.entity, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIILLZYQDKJV;II)V")
    private void method307(int arg0, int arg1, int arg2, int arg3, Model arg4, int arg5, int arg6) {
        boolean var8 = true;
        int var9 = arg5;
        int var10 = arg3 + arg5;
        int var11 = arg0 - 1;
        int var12 = arg0 + arg6;
        for (int var13 = arg1; var13 <= arg1 + 1; var13++) {
            if (this.maxLevel != var13) {
                for (int var14 = var9; var14 <= var10; var14++) {
                    if (var14 >= 0 && var14 < this.maxTileX) {
                        for (int var15 = var11; var15 <= var12; var15++) {
                            if (var15 >= 0 && var15 < this.maxTileZ && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg0 && arg5 != var14)) {
                                Ground var16 = this.levelTiles[var13][var14][var15];
                                if (var16 != null) {
                                    int var17 = (this.levelHeightmaps[var13][var14 + 1][var15] + this.levelHeightmaps[var13][var14][var15] + this.levelHeightmaps[var13][var14][var15 + 1] + this.levelHeightmaps[var13][var14 + 1][var15 + 1]) / 4 - (this.levelHeightmaps[arg1][arg5 + 1][arg0] + this.levelHeightmaps[arg1][arg5][arg0] + this.levelHeightmaps[arg1][arg5][arg0 + 1] + this.levelHeightmaps[arg1][arg5 + 1][arg0 + 1]) / 4;
                                    Wall var18 = var16.wall;
                                    if (var18 != null && var18.field1537 != null && var18.field1537.field1708 != null) {
                                        this.method308(arg4, (Model) var18.field1537, (1 - arg3) * 64 + (var14 - arg5) * 128, var17, (var15 - arg0) * 128 + (1 - arg6) * 64, var8);
                                    }
                                    if (var18 != null && var18.field1538 != null && var18.field1538.field1708 != null) {
                                        this.method308(arg4, (Model) var18.field1538, (1 - arg3) * 64 + (var14 - arg5) * 128, var17, (var15 - arg0) * 128 + (1 - arg6) * 64, var8);
                                    }
                                    for (int var19 = 0; var19 < var16.locCount; var19++) {
                                        Location var20 = var16.locs[var19];
                                        if (var20 != null && var20.entity != null && var20.entity.field1708 != null) {
                                            int var21 = var20.maxSceneTileX + 1 - var20.tileX;
                                            int var22 = var20.maxSceneTileZ + 1 - var20.tileZ;
                                            this.method308(arg4, (Model) var20.entity, (var20.tileX - arg5) * 128 + (var21 - arg3) * 64, var17, (var20.tileZ - arg0) * 128 + (var22 - arg6) * 64, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var9--;
                var8 = false;
            }
        }
        if (arg2 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(LLZYQDKJV;LLZYQDKJV;IIIZ)V")
    private void method308(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1065++;
        int var7 = 0;
        int[] var8 = arg1.field1196;
        int var9 = arg1.field1195;
        int var10 = arg1.field1216 >> 16;
        int var11 = arg1.field1216 << 16 >> 16;
        int var12 = arg1.field1217 >> 16;
        int var13 = arg1.field1217 << 16 >> 16;
        for (int var14 = 0; var14 < arg0.field1195; var14++) {
            VertexNormal var17 = arg0.field1708[var14];
            VertexNormal var18 = arg0.field1228[var14];
            if (var18.field1499 != 0) {
                int var19 = arg0.field1197[var14] - arg3;
                if (var19 <= arg1.field1219) {
                    int var20 = arg0.field1196[var14] - arg2;
                    if (var20 >= var10 && var20 <= var11) {
                        int var21 = arg0.field1198[var14] - arg4;
                        if (var21 >= var13 && var21 <= var12) {
                            for (int var22 = 0; var22 < var9; var22++) {
                                VertexNormal var23 = arg1.field1708[var22];
                                VertexNormal var24 = arg1.field1228[var22];
                                if (var8[var22] == var20 && arg1.field1198[var22] == var21 && arg1.field1197[var22] == var19 && var24.field1499 != 0) {
                                    var17.field1496 += var24.field1496;
                                    var17.field1497 += var24.field1497;
                                    var17.field1498 += var24.field1498;
                                    var17.field1499 += var24.field1499;
                                    var23.field1496 += var18.field1496;
                                    var23.field1497 += var18.field1497;
                                    var23.field1498 += var18.field1498;
                                    var23.field1499 += var18.field1499;
                                    var7++;
                                    this.field1063[var14] = this.field1065;
                                    this.field1064[var22] = this.field1065;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg5) {
            return;
        }
        for (int var15 = 0; var15 < arg0.field1199; var15++) {
            if (this.field1063[arg0.field1200[var15]] == this.field1065 && this.field1063[arg0.field1201[var15]] == this.field1065 && this.field1063[arg0.field1202[var15]] == this.field1065) {
                arg0.field1206[var15] = -1;
            }
        }
        for (int var16 = 0; var16 < arg1.field1199; var16++) {
            if (this.field1064[arg1.field1200[var16]] == this.field1065 && this.field1064[arg1.field1201[var16]] == this.field1065 && this.field1064[arg1.field1202[var16]] == this.field1065) {
                arg1.field1206[var16] = -1;
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "([IIIIII)V")
    public void method309(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Ground var7 = this.levelTiles[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.underlay;
        if (var8 != null) {
            int var9 = var8.colour;
            if (var9 != 0) {
                for (int var10 = 0; var10 < 4; var10++) {
                    arg0[arg1] = var9;
                    arg0[arg1 + 1] = var9;
                    arg0[arg1 + 2] = var9;
                    arg0[arg1 + 3] = var9;
                    arg1 += arg2;
                }
            }
            return;
        }
        TileOverlay var11 = var7.overlay;
        if (var11 == null) {
            return;
        }
        int var12 = var11.shape;
        int var13 = var11.shapeAngle;
        int var14 = var11.backgroundRgb;
        int var15 = var11.foregroundRgb;
        int[] var16 = this.field1066[var12];
        int[] var17 = this.field1067[var13];
        int var18 = 0;
        if (var14 != 0) {
            for (int var19 = 0; var19 < 4; var19++) {
                arg0[arg1] = var16[var17[var18++]] == 0 ? var14 : var15;
                arg0[arg1 + 1] = var16[var17[var18++]] == 0 ? var14 : var15;
                arg0[arg1 + 2] = var16[var17[var18++]] == 0 ? var14 : var15;
                arg0[arg1 + 3] = var16[var17[var18++]] == 0 ? var14 : var15;
                arg1 += arg2;
            }
            return;
        }
        for (int var20 = 0; var20 < 4; var20++) {
            if (var16[var17[var18++]] != 0) {
                arg0[arg1] = var15;
            }
            if (var16[var17[var18++]] != 0) {
                arg0[arg1 + 1] = var15;
            }
            if (var16[var17[var18++]] != 0) {
                arg0[arg1 + 2] = var15;
            }
            if (var16[var17[var18++]] != 0) {
                arg0[arg1 + 3] = var15;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(II[IIII)V")
    public static void method310(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5) {
        field1072 = 0;
        field1073 = 0;
        field1074 = arg5;
        field1075 = arg0;
        field1070 = arg5 / 2;
        field1071 = arg0 / 2;
        boolean[][][][] var6 = new boolean[9][32][53][53];
        for (int var7 = 128; var7 <= 384; var7 += 32) {
            for (int var15 = 0; var15 < 2048; var15 += 64) {
                field1035 = Model.field1257[var7];
                field1036 = Model.field1258[var7];
                field1037 = Model.field1257[var15];
                field1038 = Model.field1258[var15];
                int var16 = (var7 - 128) / 32;
                int var17 = var15 / 64;
                for (int var18 = -26; var18 <= 26; var18++) {
                    for (int var19 = -26; var19 <= 26; var19++) {
                        int var20 = var18 * 128;
                        int var21 = var19 * 128;
                        boolean var22 = false;
                        for (int var23 = -arg4; var23 <= arg3; var23 += 128) {
                            if (method311(var21, var20, field1006, arg2[var16] + var23)) {
                                var22 = true;
                                break;
                            }
                        }
                        var6[var16][var17][var18 + 25 + 1][var19 + 25 + 1] = var22;
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            for (int var9 = 0; var9 < 32; var9++) {
                for (int var10 = -25; var10 < 25; var10++) {
                    for (int var11 = -25; var11 < 25; var11++) {
                        boolean var12 = false;
                        label82: for (int var13 = -1; var13 <= 1; var13++) {
                            for (int var14 = -1; var14 <= 1; var14++) {
                                if (var6[var8][var9][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var12 = true;
                                    break label82;
                                }
                                if (var6[var8][(var9 + 1) % 31][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var12 = true;
                                    break label82;
                                }
                                if (var6[var8 + 1][var9][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var12 = true;
                                    break label82;
                                }
                                if (var6[var8 + 1][(var9 + 1) % 31][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var12 = true;
                                    break label82;
                                }
                            }
                        }
                        field1068[var8][var9][var10 + 25][var11 + 25] = var12;
                    }
                }
            }
        }
        if (arg1 == 22845) {
            ;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "f", descriptor = "(IIII)Z")
    public static boolean method311(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field1038 * arg1 + field1037 * arg0 >> 16;
        int var5 = field1038 * arg0 - field1037 * arg1 >> 16;
        if (arg2 != 0) {
            field1001 = !field1001;
        }
        int var6 = field1036 * var5 + field1035 * arg3 >> 16;
        int var7 = field1036 * arg3 - field1035 * var5 >> 16;
        if (var6 >= 50 && var6 <= 3500) {
            int var8 = (var4 << 9) / var6 + field1070;
            int var9 = (var7 << 9) / var6 + field1071;
            return var8 >= field1072 && var8 <= field1074 && var9 >= field1073 && var9 <= field1075;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "e", descriptor = "(III)V")
    public void method312(int arg0, int arg1, int arg2) {
        field1044 = true;
        field1045 = arg1;
        field1046 = arg2;
        field1047 = -1;
        if (arg0 == 0) {
            field1048 = -1;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIIIII)V")
    public void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= this.maxTileX * 128) {
            arg0 = this.maxTileX * 128 - 1;
        }
        if (arg4 < 0) {
            arg4 = 0;
        } else if (arg4 >= this.maxTileZ * 128) {
            arg4 = this.maxTileZ * 128 - 1;
        }
        field1025++;
        field1035 = Model.field1257[arg6];
        field1036 = Model.field1258[arg6];
        field1037 = Model.field1257[arg5];
        field1038 = Model.field1258[arg5];
        field1069 = field1068[(arg6 - 128) / 32][arg5 / 64];
        field1032 = arg0;
        field1033 = arg3;
        field1034 = arg4;
        field1030 = arg0 / 128;
        field1031 = arg4 / 128;
        field1024 = arg1;
        field1026 = field1030 - 25;
        if (arg2 != 0) {
            return;
        }
        if (field1026 < 0) {
            field1026 = 0;
        }
        field1028 = field1031 - 25;
        if (field1028 < 0) {
            field1028 = 0;
        }
        field1027 = field1030 + 25;
        if (field1027 > this.maxTileX) {
            field1027 = this.maxTileX;
        }
        field1029 = field1031 + 25;
        if (field1029 > this.maxTileZ) {
            field1029 = this.maxTileZ;
        }
        this.method319(this.field1007);
        field1023 = 0;
        for (int var8 = this.minLevel; var8 < this.maxLevel; var8++) {
            Ground[][] var33 = this.levelTiles[var8];
            for (int var34 = field1026; var34 < field1027; var34++) {
                for (int var35 = field1028; var35 < field1029; var35++) {
                    Ground var36 = var33[var34][var35];
                    if (var36 != null) {
                        if (var36.drawLevel <= arg1 && (field1069[var34 + 25 - field1030][var35 + 25 - field1031] || this.levelHeightmaps[var8][var34][var35] - arg3 >= 2000)) {
                            var36.field1395 = true;
                            var36.field1396 = true;
                            if (var36.locCount > 0) {
                                var36.field1397 = true;
                            } else {
                                var36.field1397 = false;
                            }
                            field1023++;
                        } else {
                            var36.field1395 = false;
                            var36.field1396 = false;
                            var36.field1398 = 0;
                        }
                    }
                }
            }
        }
        for (int var9 = this.minLevel; var9 < this.maxLevel; var9++) {
            Ground[][] var22 = this.levelTiles[var9];
            for (int var23 = -25; var23 <= 0; var23++) {
                int var24 = field1030 + var23;
                int var25 = field1030 - var23;
                if (var24 >= field1026 || var25 < field1027) {
                    for (int var26 = -25; var26 <= 0; var26++) {
                        int var27 = field1031 + var26;
                        int var28 = field1031 - var26;
                        if (var24 >= field1026) {
                            if (var27 >= field1028) {
                                Ground var29 = var22[var24][var27];
                                if (var29 != null && var29.field1395) {
                                    this.method314(var29, true);
                                }
                            }
                            if (var28 < field1029) {
                                Ground var30 = var22[var24][var28];
                                if (var30 != null && var30.field1395) {
                                    this.method314(var30, true);
                                }
                            }
                        }
                        if (var25 < field1027) {
                            if (var27 >= field1028) {
                                Ground var31 = var22[var25][var27];
                                if (var31 != null && var31.field1395) {
                                    this.method314(var31, true);
                                }
                            }
                            if (var28 < field1029) {
                                Ground var32 = var22[var25][var28];
                                if (var32 != null && var32.field1395) {
                                    this.method314(var32, true);
                                }
                            }
                        }
                        if (field1023 == 0) {
                            field1044 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var10 = this.minLevel; var10 < this.maxLevel; var10++) {
            Ground[][] var11 = this.levelTiles[var10];
            for (int var12 = -25; var12 <= 0; var12++) {
                int var13 = field1030 + var12;
                int var14 = field1030 - var12;
                if (var13 >= field1026 || var14 < field1027) {
                    for (int var15 = -25; var15 <= 0; var15++) {
                        int var16 = field1031 + var15;
                        int var17 = field1031 - var15;
                        if (var13 >= field1026) {
                            if (var16 >= field1028) {
                                Ground var18 = var11[var13][var16];
                                if (var18 != null && var18.field1395) {
                                    this.method314(var18, false);
                                }
                            }
                            if (var17 < field1029) {
                                Ground var19 = var11[var13][var17];
                                if (var19 != null && var19.field1395) {
                                    this.method314(var19, false);
                                }
                            }
                        }
                        if (var14 < field1027) {
                            if (var16 >= field1028) {
                                Ground var20 = var11[var14][var16];
                                if (var20 != null && var20.field1395) {
                                    this.method314(var20, false);
                                }
                            }
                            if (var17 < field1029) {
                                Ground var21 = var11[var14][var17];
                                if (var21 != null && var21.field1395) {
                                    this.method314(var21, false);
                                }
                            }
                        }
                        if (field1023 == 0) {
                            field1044 = false;
                            return;
                        }
                    }
                }
            }
        }
        field1044 = false;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(LRIEEXHOP;Z)V")
    public void method314(Ground arg0, boolean arg1) {
        field1054.method3(arg0);
        while (true) {
            Ground var3;
            int var4;
            int var5;
            int var6;
            int var7;
            Ground[][] var8;
            Ground var70;
            do {
                Ground var69;
                do {
                    Ground var68;
                    do {
                        Ground var67;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var3 = (Ground) field1054.method5();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field1396);
                                            var4 = var3.field1381;
                                            var5 = var3.field1382;
                                            var6 = var3.groundLevel;
                                            var7 = var3.field1383;
                                            var8 = this.levelTiles[var6];
                                            if (!var3.field1395) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Ground var9 = this.levelTiles[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field1396) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= field1030 && var4 > field1026) {
                                                    Ground var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.field1396 && (var10.field1395 || (var3.locSpans & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= field1030 && var4 < field1027 - 1) {
                                                    Ground var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.field1396 && (var11.field1395 || (var3.locSpans & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= field1031 && var5 > field1028) {
                                                    Ground var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.field1396 && (var12.field1395 || (var3.locSpans & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= field1031 && var5 < field1029 - 1) {
                                                    Ground var13 = var8[var4][var5 + 1];
                                                    if (var13 != null && var13.field1396 && (var13.field1395 || (var3.locSpans & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.field1395 = false;
                                            if (var3.bridge != null) {
                                                Ground var14 = var3.bridge;
                                                if (var14.underlay == null) {
                                                    if (var14.overlay != null && !this.method320(0, var4, var5)) {
                                                        this.method316(field1036, field1038, var14.overlay, field1035, var5, var4, field1037, (byte) 3);
                                                    }
                                                } else if (!this.method320(0, var4, var5)) {
                                                    this.method315(var14.underlay, 0, field1035, field1036, field1037, field1038, var4, var5);
                                                }
                                                Wall var15 = var14.wall;
                                                if (var15 != null) {
                                                    var15.field1537.method381(0, field1035, field1036, field1037, field1038, var15.field1533 - field1032, var15.field1532 - field1033, var15.field1534 - field1034, var15.typecode);
                                                }
                                                for (int var16 = 0; var16 < var14.locCount; var16++) {
                                                    Location var17 = var14.locs[var16];
                                                    if (var17 != null) {
                                                        var17.entity.method381(var17.field81, field1035, field1036, field1037, field1038, var17.field78 - field1032, var17.field77 - field1033, var17.field79 - field1034, var17.typecode);
                                                    }
                                                }
                                            }
                                            boolean var18 = false;
                                            if (var3.underlay == null) {
                                                if (var3.overlay != null && !this.method320(var7, var4, var5)) {
                                                    var18 = true;
                                                    this.method316(field1036, field1038, var3.overlay, field1035, var5, var4, field1037, (byte) 3);
                                                }
                                            } else if (!this.method320(var7, var4, var5)) {
                                                var18 = true;
                                                this.method315(var3.underlay, var7, field1035, field1036, field1037, field1038, var4, var5);
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            Wall var21 = var3.wall;
                                            Decor var22 = var3.wallDecoration;
                                            if (var21 != null || var22 != null) {
                                                if (field1030 == var4) {
                                                    var19++;
                                                } else if (field1030 < var4) {
                                                    var19 += 2;
                                                }
                                                if (field1031 == var5) {
                                                    var19 += 3;
                                                } else if (field1031 > var5) {
                                                    var19 += 6;
                                                }
                                                var20 = field1055[var19];
                                                var3.field1401 = field1057[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field1535 & field1056[var19]) == 0) {
                                                    var3.field1398 = 0;
                                                } else if (var21.field1535 == 16) {
                                                    var3.field1398 = 3;
                                                    var3.field1399 = field1058[var19];
                                                    var3.field1400 = 3 - var3.field1399;
                                                } else if (var21.field1535 == 32) {
                                                    var3.field1398 = 6;
                                                    var3.field1399 = field1059[var19];
                                                    var3.field1400 = 6 - var3.field1399;
                                                } else if (var21.field1535 == 64) {
                                                    var3.field1398 = 12;
                                                    var3.field1399 = field1060[var19];
                                                    var3.field1400 = 12 - var3.field1399;
                                                } else {
                                                    var3.field1398 = 9;
                                                    var3.field1399 = field1061[var19];
                                                    var3.field1400 = 9 - var3.field1399;
                                                }
                                                if ((var21.field1535 & var20) != 0 && !this.method321(var7, var4, var5, var21.field1535)) {
                                                    var21.field1537.method381(0, field1035, field1036, field1037, field1038, var21.field1533 - field1032, var21.field1532 - field1033, var21.field1534 - field1034, var21.typecode);
                                                }
                                                if ((var21.field1536 & var20) != 0 && !this.method321(var7, var4, var5, var21.field1536)) {
                                                    var21.field1538.method381(0, field1035, field1036, field1037, field1038, var21.field1533 - field1032, var21.field1532 - field1033, var21.field1534 - field1034, var21.typecode);
                                                }
                                            }
                                            if (var22 != null && !this.method322(var7, var4, var5, var22.field1411.field1709)) {
                                                if ((var22.field1409 & var20) != 0) {
                                                    var22.field1411.method381(var22.field1410, field1035, field1036, field1037, field1038, var22.x - field1032, var22.field1406 - field1033, var22.z - field1034, var22.field1412);
                                                } else if ((var22.field1409 & 0x300) != 0) {
                                                    int var23 = var22.x - field1032;
                                                    int var24 = var22.field1406 - field1033;
                                                    int var25 = var22.z - field1034;
                                                    int var26 = var22.field1410;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if ((var22.field1409 & 0x100) != 0 && var28 < var27) {
                                                        int var29 = field1040[var26] + var23;
                                                        int var30 = field1041[var26] + var25;
                                                        var22.field1411.method381(var26 * 512 + 256, field1035, field1036, field1037, field1038, var29, var24, var30, var22.field1412);
                                                    }
                                                    if ((var22.field1409 & 0x200) != 0 && var28 > var27) {
                                                        int var31 = field1042[var26] + var23;
                                                        int var32 = field1043[var26] + var25;
                                                        var22.field1411.method381(var26 * 512 + 1280 & 0x7FF, field1035, field1036, field1037, field1038, var31, var24, var32, var22.field1412);
                                                    }
                                                }
                                            }
                                            if (var18) {
                                                GroundDecor var33 = var3.groundDecoration;
                                                if (var33 != null) {
                                                    var33.entity.method381(0, field1035, field1036, field1037, field1038, var33.x - field1032, var33.field1310 - field1033, var33.z - field1034, var33.field1314);
                                                }
                                                ObjStack var34 = var3.objStack;
                                                if (var34 != null && var34.field643 == 0) {
                                                    if (var34.field640 != null) {
                                                        var34.field640.method381(0, field1035, field1036, field1037, field1038, var34.field637 - field1032, var34.field636 - field1033, var34.field638 - field1034, var34.field642);
                                                    }
                                                    if (var34.field641 != null) {
                                                        var34.field641.method381(0, field1035, field1036, field1037, field1038, var34.field637 - field1032, var34.field636 - field1033, var34.field638 - field1034, var34.field642);
                                                    }
                                                    if (var34.field639 != null) {
                                                        var34.field639.method381(0, field1035, field1036, field1037, field1038, var34.field637 - field1032, var34.field636 - field1033, var34.field638 - field1034, var34.field642);
                                                    }
                                                }
                                            }
                                            int var35 = var3.locSpans;
                                            if (var35 != 0) {
                                                if (var4 < field1030 && (var35 & 0x4) != 0) {
                                                    Ground var36 = var8[var4 + 1][var5];
                                                    if (var36 != null && var36.field1396) {
                                                        field1054.method3(var36);
                                                    }
                                                }
                                                if (var5 < field1031 && (var35 & 0x2) != 0) {
                                                    Ground var37 = var8[var4][var5 + 1];
                                                    if (var37 != null && var37.field1396) {
                                                        field1054.method3(var37);
                                                    }
                                                }
                                                if (var4 > field1030 && (var35 & 0x1) != 0) {
                                                    Ground var38 = var8[var4 - 1][var5];
                                                    if (var38 != null && var38.field1396) {
                                                        field1054.method3(var38);
                                                    }
                                                }
                                                if (var5 > field1031 && (var35 & 0x8) != 0) {
                                                    Ground var39 = var8[var4][var5 - 1];
                                                    if (var39 != null && var39.field1396) {
                                                        field1054.method3(var39);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.field1398 != 0) {
                                            boolean var40 = true;
                                            for (int var41 = 0; var41 < var3.locCount; var41++) {
                                                if (field1025 != var3.locs[var41].field87 && (var3.locSpan[var41] & var3.field1398) == var3.field1399) {
                                                    var40 = false;
                                                    break;
                                                }
                                            }
                                            if (var40) {
                                                Wall var42 = var3.wall;
                                                if (!this.method321(var7, var4, var5, var42.field1535)) {
                                                    var42.field1537.method381(0, field1035, field1036, field1037, field1038, var42.field1533 - field1032, var42.field1532 - field1033, var42.field1534 - field1034, var42.typecode);
                                                }
                                                var3.field1398 = 0;
                                            }
                                        }
                                        if (!var3.field1397) {
                                            break;
                                        }
                                        try {
                                            int var43 = var3.locCount;
                                            var3.field1397 = false;
                                            int var44 = 0;
                                            label559: for (int var45 = 0; var45 < var43; var45++) {
                                                Location var46 = var3.locs[var45];
                                                if (field1025 != var46.field87) {
                                                    for (int var47 = var46.tileX; var47 <= var46.maxSceneTileX; var47++) {
                                                        for (int var48 = var46.tileZ; var48 <= var46.maxSceneTileZ; var48++) {
                                                            Ground var49 = var8[var47][var48];
                                                            if (var49.field1395) {
                                                                var3.field1397 = true;
                                                                continue label559;
                                                            }
                                                            if (var49.field1398 != 0) {
                                                                int var50 = 0;
                                                                if (var47 > var46.tileX) {
                                                                    var50++;
                                                                }
                                                                if (var47 < var46.maxSceneTileX) {
                                                                    var50 += 4;
                                                                }
                                                                if (var48 > var46.tileZ) {
                                                                    var50 += 8;
                                                                }
                                                                if (var48 < var46.maxSceneTileZ) {
                                                                    var50 += 2;
                                                                }
                                                                if ((var50 & var49.field1398) == var3.field1400) {
                                                                    var3.field1397 = true;
                                                                    continue label559;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    locBuffer[var44++] = var46;
                                                    int var51 = field1030 - var46.tileX;
                                                    int var52 = var46.maxSceneTileX - field1030;
                                                    if (var52 > var51) {
                                                        var51 = var52;
                                                    }
                                                    int var53 = field1031 - var46.tileZ;
                                                    int var54 = var46.maxSceneTileZ - field1031;
                                                    if (var54 > var53) {
                                                        var46.field86 = var51 + var54;
                                                    } else {
                                                        var46.field86 = var51 + var53;
                                                    }
                                                }
                                            }
                                            while (var44 > 0) {
                                                int var55 = -50;
                                                int var56 = -1;
                                                for (int var57 = 0; var57 < var44; var57++) {
                                                    Location var58 = locBuffer[var57];
                                                    if (field1025 != var58.field87) {
                                                        if (var58.field86 > var55) {
                                                            var55 = var58.field86;
                                                            var56 = var57;
                                                        } else if (var58.field86 == var55) {
                                                            int var59 = var58.field78 - field1032;
                                                            int var60 = var58.field79 - field1034;
                                                            int var61 = locBuffer[var56].field78 - field1032;
                                                            int var62 = locBuffer[var56].field79 - field1034;
                                                            if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
                                                                var56 = var57;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var56 == -1) {
                                                    break;
                                                }
                                                Location var63 = locBuffer[var56];
                                                var63.field87 = field1025;
                                                if (!this.method323(var7, var63.tileX, var63.maxSceneTileX, var63.tileZ, var63.maxSceneTileZ, var63.entity.field1709)) {
                                                    var63.entity.method381(var63.field81, field1035, field1036, field1037, field1038, var63.field78 - field1032, var63.field77 - field1033, var63.field79 - field1034, var63.typecode);
                                                }
                                                for (int var64 = var63.tileX; var64 <= var63.maxSceneTileX; var64++) {
                                                    for (int var65 = var63.tileZ; var65 <= var63.maxSceneTileZ; var65++) {
                                                        Ground var66 = var8[var64][var65];
                                                        if (var66.field1398 != 0) {
                                                            field1054.method3(var66);
                                                        } else if ((var4 != var64 || var5 != var65) && var66.field1396) {
                                                            field1054.method3(var66);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var3.field1397) {
                                                break;
                                            }
                                        } catch (Exception var89) {
                                            var3.field1397 = false;
                                            break;
                                        }
                                    }
                                } while (!var3.field1396);
                            } while (var3.field1398 != 0);
                            if (var4 > field1030 || var4 <= field1026) {
                                break;
                            }
                            var67 = var8[var4 - 1][var5];
                        } while (var67 != null && var67.field1396);
                        if (var4 < field1030 || var4 >= field1027 - 1) {
                            break;
                        }
                        var68 = var8[var4 + 1][var5];
                    } while (var68 != null && var68.field1396);
                    if (var5 > field1031 || var5 <= field1028) {
                        break;
                    }
                    var69 = var8[var4][var5 - 1];
                } while (var69 != null && var69.field1396);
                if (var5 < field1031 || var5 >= field1029 - 1) {
                    break;
                }
                var70 = var8[var4][var5 + 1];
            } while (var70 != null && var70.field1396);
            var3.field1396 = false;
            field1023--;
            ObjStack var71 = var3.objStack;
            if (var71 != null && var71.field643 != 0) {
                if (var71.field640 != null) {
                    var71.field640.method381(0, field1035, field1036, field1037, field1038, var71.field637 - field1032, var71.field636 - field1033 - var71.field643, var71.field638 - field1034, var71.field642);
                }
                if (var71.field641 != null) {
                    var71.field641.method381(0, field1035, field1036, field1037, field1038, var71.field637 - field1032, var71.field636 - field1033 - var71.field643, var71.field638 - field1034, var71.field642);
                }
                if (var71.field639 != null) {
                    var71.field639.method381(0, field1035, field1036, field1037, field1038, var71.field637 - field1032, var71.field636 - field1033 - var71.field643, var71.field638 - field1034, var71.field642);
                }
            }
            if (var3.field1401 != 0) {
                Decor var72 = var3.wallDecoration;
                if (var72 != null && !this.method322(var7, var4, var5, var72.field1411.field1709)) {
                    if ((var72.field1409 & var3.field1401) != 0) {
                        var72.field1411.method381(var72.field1410, field1035, field1036, field1037, field1038, var72.x - field1032, var72.field1406 - field1033, var72.z - field1034, var72.field1412);
                    } else if ((var72.field1409 & 0x300) != 0) {
                        int var73 = var72.x - field1032;
                        int var74 = var72.field1406 - field1033;
                        int var75 = var72.z - field1034;
                        int var76 = var72.field1410;
                        int var77;
                        if (var76 == 1 || var76 == 2) {
                            var77 = -var73;
                        } else {
                            var77 = var73;
                        }
                        int var78;
                        if (var76 == 2 || var76 == 3) {
                            var78 = -var75;
                        } else {
                            var78 = var75;
                        }
                        if ((var72.field1409 & 0x100) != 0 && var78 >= var77) {
                            int var79 = field1040[var76] + var73;
                            int var80 = field1041[var76] + var75;
                            var72.field1411.method381(var76 * 512 + 256, field1035, field1036, field1037, field1038, var79, var74, var80, var72.field1412);
                        }
                        if ((var72.field1409 & 0x200) != 0 && var78 <= var77) {
                            int var81 = field1042[var76] + var73;
                            int var82 = field1043[var76] + var75;
                            var72.field1411.method381(var76 * 512 + 1280 & 0x7FF, field1035, field1036, field1037, field1038, var81, var74, var82, var72.field1412);
                        }
                    }
                }
                Wall var83 = var3.wall;
                if (var83 != null) {
                    if ((var83.field1536 & var3.field1401) != 0 && !this.method321(var7, var4, var5, var83.field1536)) {
                        var83.field1538.method381(0, field1035, field1036, field1037, field1038, var83.field1533 - field1032, var83.field1532 - field1033, var83.field1534 - field1034, var83.typecode);
                    }
                    if ((var83.field1535 & var3.field1401) != 0 && !this.method321(var7, var4, var5, var83.field1535)) {
                        var83.field1537.method381(0, field1035, field1036, field1037, field1038, var83.field1533 - field1032, var83.field1532 - field1033, var83.field1534 - field1034, var83.typecode);
                    }
                }
            }
            if (var6 < this.maxLevel - 1) {
                Ground var84 = this.levelTiles[var6 + 1][var4][var5];
                if (var84 != null && var84.field1396) {
                    field1054.method3(var84);
                }
            }
            if (var4 < field1030) {
                Ground var85 = var8[var4 + 1][var5];
                if (var85 != null && var85.field1396) {
                    field1054.method3(var85);
                }
            }
            if (var5 < field1031) {
                Ground var86 = var8[var4][var5 + 1];
                if (var86 != null && var86.field1396) {
                    field1054.method3(var86);
                }
            }
            if (var4 > field1030) {
                Ground var87 = var8[var4 - 1][var5];
                if (var87 != null && var87.field1396) {
                    field1054.method3(var87);
                }
            }
            if (var5 > field1031) {
                Ground var88 = var8[var4][var5 - 1];
                if (var88 != null && var88.field1396) {
                    field1054.method3(var88);
                }
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(LAYYYSATX;IIIIIII)V")
    public void method315(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - field1032;
        int var11;
        int var12 = var11 = (arg7 << 7) - field1034;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.levelHeightmaps[arg1][arg6][arg7] - field1033;
        int var18 = this.levelHeightmaps[arg1][arg6 + 1][arg7] - field1033;
        int var19 = this.levelHeightmaps[arg1][arg6 + 1][arg7 + 1] - field1033;
        int var20 = this.levelHeightmaps[arg1][arg6][arg7 + 1] - field1033;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + Draw3D.field1594;
        int var46 = (var24 << 9) / var25 + Draw3D.field1595;
        int var47 = (var27 << 9) / var31 + Draw3D.field1594;
        int var48 = (var30 << 9) / var31 + Draw3D.field1595;
        int var49 = (var33 << 9) / var37 + Draw3D.field1594;
        int var50 = (var36 << 9) / var37 + Draw3D.field1595;
        int var51 = (var39 << 9) / var43 + Draw3D.field1594;
        int var52 = (var42 << 9) / var43 + Draw3D.field1595;
        Draw3D.field1593 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Draw3D.field1590 = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Draw2D.field1101 || var51 > Draw2D.field1101 || var47 > Draw2D.field1101) {
                Draw3D.field1590 = true;
            }
            if (field1044 && this.method318(field1045, field1046, var50, var52, var48, var49, var51, var47)) {
                field1047 = arg6;
                field1048 = arg7;
            }
            if (arg0.textureId == -1) {
                if (arg0.northeastColor != 12345678) {
                    Draw3D.method555(var50, var52, var48, var49, var51, var47, arg0.northeastColor, arg0.northwestColor, arg0.southeastColor);
                }
            } else if (field1013) {
                int var53 = field1062[arg0.textureId];
                Draw3D.method555(var50, var52, var48, var49, var51, var47, this.method317(arg0.northeastColor, var53, 0), this.method317(arg0.northwestColor, var53, 0), this.method317(arg0.southeastColor, var53, 0));
            } else if (arg0.flat) {
                Draw3D.method559(var50, var52, var48, var49, var51, var47, arg0.northeastColor, arg0.northwestColor, arg0.southeastColor, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.textureId);
            } else {
                Draw3D.method559(var50, var52, var48, var49, var51, var47, arg0.northeastColor, arg0.northwestColor, arg0.southeastColor, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.textureId);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Draw3D.field1590 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Draw2D.field1101 || var47 > Draw2D.field1101 || var51 > Draw2D.field1101) {
            Draw3D.field1590 = true;
        }
        if (field1044 && this.method318(field1045, field1046, var46, var48, var52, var45, var47, var51)) {
            field1047 = arg6;
            field1048 = arg7;
        }
        if (arg0.textureId != -1) {
            if (!field1013) {
                Draw3D.method559(var46, var48, var52, var45, var47, var51, arg0.southwestColor, arg0.southeastColor, arg0.northwestColor, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.textureId);
                return;
            }
            int var54 = field1062[arg0.textureId];
            Draw3D.method555(var46, var48, var52, var45, var47, var51, this.method317(arg0.southwestColor, var54, 0), this.method317(arg0.southeastColor, var54, 0), this.method317(arg0.northwestColor, var54, 0));
        } else if (arg0.southwestColor != 12345678) {
            Draw3D.method555(var46, var48, var52, var45, var47, var51, arg0.southwestColor, arg0.southeastColor, arg0.northwestColor);
            return;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IILJQCVNYYR;IIIIB)V")
    public void method316(int arg0, int arg1, TileOverlay arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        int var9 = arg2.vertexX.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var23 = arg2.vertexX[var10] - field1032;
            int var24 = arg2.vertexY[var10] - field1033;
            int var25 = arg2.vertexZ[var10] - field1034;
            int var26 = arg1 * var23 + arg6 * var25 >> 16;
            int var27 = arg1 * var25 - arg6 * var23 >> 16;
            int var29 = arg0 * var24 - arg3 * var27 >> 16;
            int var30 = arg0 * var27 + arg3 * var24 >> 16;
            if (var30 < 50) {
                return;
            }
            if (arg2.triangleTextureIds != null) {
                TileOverlay.field919[var10] = var26;
                TileOverlay.field920[var10] = var29;
                TileOverlay.field921[var10] = var30;
            }
            TileOverlay.field917[var10] = (var26 << 9) / var30 + Draw3D.field1594;
            TileOverlay.field918[var10] = (var29 << 9) / var30 + Draw3D.field1595;
        }
        Draw3D.field1593 = 0;
        int var11 = arg2.triangleVertexA.length;
        if (arg7 != 3) {
            return;
        }
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = arg2.triangleVertexA[var12];
            int var14 = arg2.triangleVertexB[var12];
            int var15 = arg2.triangleVertexC[var12];
            int var16 = TileOverlay.field917[var13];
            int var17 = TileOverlay.field917[var14];
            int var18 = TileOverlay.field917[var15];
            int var19 = TileOverlay.field918[var13];
            int var20 = TileOverlay.field918[var14];
            int var21 = TileOverlay.field918[var15];
            if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
                Draw3D.field1590 = false;
                if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Draw2D.field1101 || var17 > Draw2D.field1101 || var18 > Draw2D.field1101) {
                    Draw3D.field1590 = true;
                }
                if (field1044 && this.method318(field1045, field1046, var19, var20, var21, var16, var17, var18)) {
                    field1047 = arg5;
                    field1048 = arg4;
                }
                if (arg2.triangleTextureIds == null || arg2.triangleTextureIds[var12] == -1) {
                    if (arg2.triangleColorA[var12] != 12345678) {
                        Draw3D.method555(var19, var20, var21, var16, var17, var18, arg2.triangleColorA[var12], arg2.triangleColorB[var12], arg2.triangleColorC[var12]);
                    }
                } else if (field1013) {
                    int var22 = field1062[arg2.triangleTextureIds[var12]];
                    Draw3D.method555(var19, var20, var21, var16, var17, var18, this.method317(arg2.triangleColorA[var12], var22, 0), this.method317(arg2.triangleColorB[var12], var22, 0), this.method317(arg2.triangleColorC[var12], var22, 0));
                } else if (arg2.flat) {
                    Draw3D.method559(var19, var20, var21, var16, var17, var18, arg2.triangleColorA[var12], arg2.triangleColorB[var12], arg2.triangleColorC[var12], TileOverlay.field919[0], TileOverlay.field919[1], TileOverlay.field919[3], TileOverlay.field920[0], TileOverlay.field920[1], TileOverlay.field920[3], TileOverlay.field921[0], TileOverlay.field921[1], TileOverlay.field921[3], arg2.triangleTextureIds[var12]);
                } else {
                    Draw3D.method559(var19, var20, var21, var16, var17, var18, arg2.triangleColorA[var12], arg2.triangleColorB[var12], arg2.triangleColorC[var12], TileOverlay.field919[var13], TileOverlay.field919[var14], TileOverlay.field919[var15], TileOverlay.field920[var13], TileOverlay.field920[var14], TileOverlay.field920[var15], TileOverlay.field921[var13], TileOverlay.field921[var14], TileOverlay.field921[var15], arg2.triangleTextureIds[var12]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "f", descriptor = "(III)I")
    public int method317(int arg0, int arg1, int arg2) {
        int var4 = 127 - arg0;
        if (arg2 != 0) {
            return this.field1005;
        }
        int var5 = (arg1 & 0x7F) * var4 / 160;
        if (var5 < 2) {
            var5 = 2;
        } else if (var5 > 126) {
            var5 = 126;
        }
        return (arg1 & 0xFF80) + var5;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean method318(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var9 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var10 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var11 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var9 * var11 > 0 && var10 * var11 > 0;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "b", descriptor = "(I)V")
    private void method319(int arg0) {
        int var2 = levelOccluderCount[field1024];
        Occluder[] var3 = levelOccluders[field1024];
        if (arg0 < 2 || arg0 > 2) {
            this.field1003 = !this.field1003;
        }
        field1052 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            Occluder var5 = var3[var4];
            if (var5.field1482 == 1) {
                int var6 = var5.field1478 + 25 - field1030;
                if (var6 >= 0 && var6 <= 50) {
                    int var7 = var5.field1480 + 25 - field1031;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = var5.field1481 + 25 - field1031;
                    if (var8 > 50) {
                        var8 = 50;
                    }
                    boolean var9 = false;
                    while (var7 <= var8) {
                        if (field1069[var6][var7++]) {
                            var9 = true;
                            break;
                        }
                    }
                    if (var9) {
                        int var10 = field1032 - var5.field1483;
                        if (var10 > 32) {
                            var5.field1489 = 1;
                        } else {
                            if (var10 >= -32) {
                                continue;
                            }
                            var5.field1489 = 2;
                            var10 = -var10;
                        }
                        var5.field1492 = (var5.field1485 - field1034 << 8) / var10;
                        var5.field1493 = (var5.field1486 - field1034 << 8) / var10;
                        var5.field1494 = (var5.field1487 - field1033 << 8) / var10;
                        var5.field1495 = (var5.field1488 - field1033 << 8) / var10;
                        field1053[field1052++] = var5;
                    }
                }
            } else if (var5.field1482 == 2) {
                int var11 = var5.field1480 + 25 - field1031;
                if (var11 >= 0 && var11 <= 50) {
                    int var12 = var5.field1478 + 25 - field1030;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = var5.field1479 + 25 - field1030;
                    if (var13 > 50) {
                        var13 = 50;
                    }
                    boolean var14 = false;
                    while (var12 <= var13) {
                        if (field1069[var12++][var11]) {
                            var14 = true;
                            break;
                        }
                    }
                    if (var14) {
                        int var15 = field1034 - var5.field1485;
                        if (var15 > 32) {
                            var5.field1489 = 3;
                        } else {
                            if (var15 >= -32) {
                                continue;
                            }
                            var5.field1489 = 4;
                            var15 = -var15;
                        }
                        var5.field1490 = (var5.field1483 - field1032 << 8) / var15;
                        var5.field1491 = (var5.field1484 - field1032 << 8) / var15;
                        var5.field1494 = (var5.field1487 - field1033 << 8) / var15;
                        var5.field1495 = (var5.field1488 - field1033 << 8) / var15;
                        field1053[field1052++] = var5;
                    }
                }
            } else if (var5.field1482 == 4) {
                int var16 = var5.field1487 - field1033;
                if (var16 > 128) {
                    int var17 = var5.field1480 + 25 - field1031;
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    int var18 = var5.field1481 + 25 - field1031;
                    if (var18 > 50) {
                        var18 = 50;
                    }
                    if (var17 <= var18) {
                        int var19 = var5.field1478 + 25 - field1030;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var20 = var5.field1479 + 25 - field1030;
                        if (var20 > 50) {
                            var20 = 50;
                        }
                        boolean var21 = false;
                        label153: for (int var22 = var19; var22 <= var20; var22++) {
                            for (int var23 = var17; var23 <= var18; var23++) {
                                if (field1069[var22][var23]) {
                                    var21 = true;
                                    break label153;
                                }
                            }
                        }
                        if (var21) {
                            var5.field1489 = 5;
                            var5.field1490 = (var5.field1483 - field1032 << 8) / var16;
                            var5.field1491 = (var5.field1484 - field1032 << 8) / var16;
                            var5.field1492 = (var5.field1485 - field1034 << 8) / var16;
                            var5.field1493 = (var5.field1486 - field1034 << 8) / var16;
                            field1053[field1052++] = var5;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "g", descriptor = "(III)Z")
    private boolean method320(int arg0, int arg1, int arg2) {
        int var4 = this.levelTileOcclusionCycles[arg0][arg1][arg2];
        if (-field1025 == var4) {
            return false;
        } else if (field1025 == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.method324(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2], var6 + 1) && this.method324(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2], var6 + 1) && this.method324(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method324(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.levelTileOcclusionCycles[arg0][arg1][arg2] = field1025;
                return true;
            } else {
                this.levelTileOcclusionCycles[arg0][arg1][arg2] = -field1025;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "g", descriptor = "(IIII)Z")
    private boolean method321(int arg0, int arg1, int arg2, int arg3) {
        if (!this.method320(arg0, arg1, arg2)) {
            return false;
        }
        int var5 = arg1 << 7;
        int var6 = arg2 << 7;
        int var7 = this.levelHeightmaps[arg0][arg1][arg2] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var5 > field1032) {
                    if (!this.method324(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method324(var5, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method324(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method324(var5, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method324(var5, var9, var6)) {
                    return false;
                }
                if (!this.method324(var5, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var6 < field1034) {
                    if (!this.method324(var5, var7, var6 + 128)) {
                        return false;
                    }
                    if (!this.method324(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method324(var5, var8, var6 + 128)) {
                        return false;
                    }
                    if (!this.method324(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method324(var5, var9, var6 + 128)) {
                    return false;
                }
                if (!this.method324(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var5 < field1032) {
                    if (!this.method324(var5 + 128, var7, var6)) {
                        return false;
                    }
                    if (!this.method324(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method324(var5 + 128, var8, var6)) {
                        return false;
                    }
                    if (!this.method324(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.method324(var5 + 128, var9, var6)) {
                    return false;
                }
                if (!this.method324(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var6 > field1034) {
                    if (!this.method324(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.method324(var5 + 128, var7, var6)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method324(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.method324(var5 + 128, var8, var6)) {
                        return false;
                    }
                }
                if (!this.method324(var5, var9, var6)) {
                    return false;
                }
                if (!this.method324(var5 + 128, var9, var6)) {
                    return false;
                }
                return true;
            }
        }
        if (!this.method324(var5 + 64, var10, var6 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return this.method324(var5, var9, var6 + 128);
        } else if (arg3 == 32) {
            return this.method324(var5 + 128, var9, var6 + 128);
        } else if (arg3 == 64) {
            return this.method324(var5 + 128, var9, var6);
        } else if (arg3 == 128) {
            return this.method324(var5, var9, var6);
        } else {
            System.out.println("Warning unsupported wall type");
            return true;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "h", descriptor = "(IIII)Z")
    private boolean method322(int arg0, int arg1, int arg2, int arg3) {
        if (this.method320(arg0, arg1, arg2)) {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            return this.method324(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2] - arg3, var6 + 1) && this.method324(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method324(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method324(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIIII)Z")
    private boolean method323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var15 = arg3; var15 <= arg4; var15++) {
                    if (this.levelTileOcclusionCycles[arg0][var9][var15] == -field1025) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = this.levelHeightmaps[arg0][arg1][arg3] - arg5;
            if (!this.method324(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!this.method324(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!this.method324(var10, var12, var14)) {
                return false;
            } else if (this.method324(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (this.method320(arg0, arg1, arg3)) {
            int var7 = arg1 << 7;
            int var8 = arg3 << 7;
            return this.method324(var7 + 1, this.levelHeightmaps[arg0][arg1][arg3] - arg5, var8 + 1) && this.method324(var7 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method324(var7 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method324(var7 + 1, this.levelHeightmaps[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "h", descriptor = "(III)Z")
    private boolean method324(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < field1052; var4++) {
            Occluder var5 = field1053[var4];
            if (var5.field1489 == 1) {
                int var6 = var5.field1483 - arg0;
                if (var6 > 0) {
                    int var7 = (var5.field1492 * var6 >> 8) + var5.field1485;
                    int var8 = (var5.field1493 * var6 >> 8) + var5.field1486;
                    int var9 = (var5.field1494 * var6 >> 8) + var5.field1487;
                    int var10 = (var5.field1495 * var6 >> 8) + var5.field1488;
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field1489 == 2) {
                int var11 = arg0 - var5.field1483;
                if (var11 > 0) {
                    int var12 = (var5.field1492 * var11 >> 8) + var5.field1485;
                    int var13 = (var5.field1493 * var11 >> 8) + var5.field1486;
                    int var14 = (var5.field1494 * var11 >> 8) + var5.field1487;
                    int var15 = (var5.field1495 * var11 >> 8) + var5.field1488;
                    if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
                        return true;
                    }
                }
            } else if (var5.field1489 == 3) {
                int var16 = var5.field1485 - arg2;
                if (var16 > 0) {
                    int var17 = (var5.field1490 * var16 >> 8) + var5.field1483;
                    int var18 = (var5.field1491 * var16 >> 8) + var5.field1484;
                    int var19 = (var5.field1494 * var16 >> 8) + var5.field1487;
                    int var20 = (var5.field1495 * var16 >> 8) + var5.field1488;
                    if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
                        return true;
                    }
                }
            } else if (var5.field1489 == 4) {
                int var21 = arg2 - var5.field1485;
                if (var21 > 0) {
                    int var22 = (var5.field1490 * var21 >> 8) + var5.field1483;
                    int var23 = (var5.field1491 * var21 >> 8) + var5.field1484;
                    int var24 = (var5.field1494 * var21 >> 8) + var5.field1487;
                    int var25 = (var5.field1495 * var21 >> 8) + var5.field1488;
                    if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
                        return true;
                    }
                }
            } else if (var5.field1489 == 5) {
                int var26 = arg1 - var5.field1487;
                if (var26 > 0) {
                    int var27 = (var5.field1490 * var26 >> 8) + var5.field1483;
                    int var28 = (var5.field1491 * var26 >> 8) + var5.field1484;
                    int var29 = (var5.field1492 * var26 >> 8) + var5.field1485;
                    int var30 = (var5.field1493 * var26 >> 8) + var5.field1486;
                    if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIIIIIII)V")
    public static void method277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Occluder var9 = new Occluder();
        if (arg0 != -8967) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        var9.field1478 = arg1 / 128;
        var9.field1479 = arg3 / 128;
        var9.field1480 = arg6 / 128;
        var9.field1481 = arg4 / 128;
        var9.field1482 = arg8;
        var9.field1483 = arg1;
        var9.field1484 = arg3;
        var9.field1485 = arg6;
        var9.field1486 = arg4;
        var9.field1487 = arg7;
        var9.field1488 = arg2;
        levelOccluders[arg5][levelOccluderCount[arg5]++] = var9;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(Z)V")
    public static void method273(boolean arg0) {
        locBuffer = null;
        levelOccluderCount = null;
        levelOccluders = null;
        field1054 = null;
        field1068 = null;
        if (!arg0) {
            field1069 = null;
        }
    }

}
