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
    public int[] mergeIndexA = new int[10000];

    @OriginalMember(owner = "client!KJCMXHNO", name = "lb", descriptor = "[I")
    public int[] mergeIndexB = new int[10000];

    @OriginalMember(owner = "client!KJCMXHNO", name = "nb", descriptor = "[[I")
    public int[][] MINIMAP_TILE_MASK = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!KJCMXHNO", name = "ob", descriptor = "[[I")
    public int[][] MINIMAP_TILE_ROTATION_MAP = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

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
    public static boolean lowMemory = true;

    @OriginalMember(owner = "client!KJCMXHNO", name = "M", descriptor = "[LBHOSVTIT;")
    public static Location[] locBuffer = new Location[100];

    @OriginalMember(owner = "client!KJCMXHNO", name = "N", descriptor = "[I")
    public static final int[] WALL_DECORATION_INSET_X = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "O", descriptor = "[I")
    public static final int[] WALL_DECORATION_INSET_Z = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "P", descriptor = "[I")
    public static final int[] WALL_DECORATION_OUTSET_X = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "Q", descriptor = "[I")
    public static final int[] WALL_DECORATION_OUTSET_Z = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "U", descriptor = "I")
    public static int clickTileX = -1;

    @OriginalMember(owner = "client!KJCMXHNO", name = "V", descriptor = "I")
    public static int clickTileZ = -1;

    @OriginalMember(owner = "client!KJCMXHNO", name = "W", descriptor = "I")
    public static int LEVELS = 4;

    @OriginalMember(owner = "client!KJCMXHNO", name = "X", descriptor = "[I")
    public static int[] levelOccluderCount = new int[LEVELS];

    @OriginalMember(owner = "client!KJCMXHNO", name = "Y", descriptor = "[[LVEDUNTJR;")
    public static Occlude[][] levelOccluders = new Occlude[LEVELS][500];

    @OriginalMember(owner = "client!KJCMXHNO", name = "ab", descriptor = "[LVEDUNTJR;")
    public static Occlude[] activeOccluders = new Occlude[500];

    @OriginalMember(owner = "client!KJCMXHNO", name = "bb", descriptor = "LBOHLFXVX;")
    public static LinkList drawTileQueue = new LinkList();

    @OriginalMember(owner = "client!KJCMXHNO", name = "cb", descriptor = "[I")
    public static final int[] FRONT_WALL_TYPES = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "db", descriptor = "[I")
    public static final int[] DIRECTION_ALLOW_WALL_CORNER_TYPE = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "eb", descriptor = "[I")
    public static final int[] BACK_WALL_TYPES = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "fb", descriptor = "[I")
    public static final int[] WALL_CORNER_TYPE_16_BLOCK_LOC_SPANS = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "gb", descriptor = "[I")
    public static final int[] WALL_CORNER_TYPE_32_BLOCK_LOC_SPANS = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "hb", descriptor = "[I")
    public static final int[] WALL_CORNER_TYPE_64_BLOCK_LOC_SPANS = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "ib", descriptor = "[I")
    public static final int[] WALL_CORNER_TYPE_128_BLOCK_LOC_SPANS = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "jb", descriptor = "[I")
    public static final int[] TEXTURE_HSL = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "client!KJCMXHNO", name = "pb", descriptor = "[[[[Z")
    public static boolean[][][][] visibilityMatrix = new boolean[8][32][51][51];

    @OriginalMember(owner = "client!KJCMXHNO", name = "e", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!KJCMXHNO", name = "f", descriptor = "I")
    private static int field1006;

    @OriginalMember(owner = "client!KJCMXHNO", name = "s", descriptor = "I")
    public int minLevel;

    @OriginalMember(owner = "client!KJCMXHNO", name = "t", descriptor = "I")
    public int temporaryLocCount;

    @OriginalMember(owner = "client!KJCMXHNO", name = "w", descriptor = "I")
    public static int tilesRemaining;

    @OriginalMember(owner = "client!KJCMXHNO", name = "x", descriptor = "I")
    public static int topLevel;

    @OriginalMember(owner = "client!KJCMXHNO", name = "y", descriptor = "I")
    public static int cycle;

    @OriginalMember(owner = "client!KJCMXHNO", name = "z", descriptor = "I")
    public static int minDrawTileX;

    @OriginalMember(owner = "client!KJCMXHNO", name = "A", descriptor = "I")
    public static int maxDrawTileX;

    @OriginalMember(owner = "client!KJCMXHNO", name = "B", descriptor = "I")
    public static int minDrawTileZ;

    @OriginalMember(owner = "client!KJCMXHNO", name = "C", descriptor = "I")
    public static int maxDrawTileZ;

    @OriginalMember(owner = "client!KJCMXHNO", name = "D", descriptor = "I")
    public static int eyeTileX;

    @OriginalMember(owner = "client!KJCMXHNO", name = "E", descriptor = "I")
    public static int eyeTileZ;

    @OriginalMember(owner = "client!KJCMXHNO", name = "F", descriptor = "I")
    public static int eyeX;

    @OriginalMember(owner = "client!KJCMXHNO", name = "G", descriptor = "I")
    public static int eyeY;

    @OriginalMember(owner = "client!KJCMXHNO", name = "H", descriptor = "I")
    public static int eyeZ;

    @OriginalMember(owner = "client!KJCMXHNO", name = "I", descriptor = "I")
    public static int sinEyePitch;

    @OriginalMember(owner = "client!KJCMXHNO", name = "J", descriptor = "I")
    public static int cosEyePitch;

    @OriginalMember(owner = "client!KJCMXHNO", name = "K", descriptor = "I")
    public static int sinEyeYaw;

    @OriginalMember(owner = "client!KJCMXHNO", name = "L", descriptor = "I")
    public static int cosEyeYaw;

    @OriginalMember(owner = "client!KJCMXHNO", name = "S", descriptor = "I")
    public static int mouseX;

    @OriginalMember(owner = "client!KJCMXHNO", name = "T", descriptor = "I")
    public static int mouseY;

    @OriginalMember(owner = "client!KJCMXHNO", name = "Z", descriptor = "I")
    public static int activeOccluderCount;

    @OriginalMember(owner = "client!KJCMXHNO", name = "mb", descriptor = "I")
    public int tmpMergeIndex;

    @OriginalMember(owner = "client!KJCMXHNO", name = "rb", descriptor = "I")
    public static int viewportCenterX;

    @OriginalMember(owner = "client!KJCMXHNO", name = "sb", descriptor = "I")
    public static int viewportCenterY;

    @OriginalMember(owner = "client!KJCMXHNO", name = "tb", descriptor = "I")
    public static int viewportLeft;

    @OriginalMember(owner = "client!KJCMXHNO", name = "ub", descriptor = "I")
    public static int viewportTop;

    @OriginalMember(owner = "client!KJCMXHNO", name = "vb", descriptor = "I")
    public static int viewportRight;

    @OriginalMember(owner = "client!KJCMXHNO", name = "wb", descriptor = "I")
    public static int viewportBottom;

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "Z")
    private static boolean field1001;

    @OriginalMember(owner = "client!KJCMXHNO", name = "R", descriptor = "Z")
    public static boolean takingInput;

    @OriginalMember(owner = "client!KJCMXHNO", name = "qb", descriptor = "[[Z")
    public static boolean[][] visibilityMap;

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
        for (int level = 0; level < this.maxLevel; level++) {
            for (int x = 0; x < this.maxTileX; x++) {
                for (int z = 0; z < this.maxTileZ; z++) {
                    this.levelTiles[level][x][z] = null;
                }
            }
        }
        for (int l = 0; l < LEVELS; l++) {
            for (int o = 0; o < levelOccluderCount[l]; o++) {
                levelOccluders[l][o] = null;
            }
            levelOccluderCount[l] = 0;
        }
        for (int i = 0; i < this.temporaryLocCount; i++) {
            this.temporaryLocs[i] = null;
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
    public void clearTemporaryLocs() {
        for (int i = 0; i < this.temporaryLocCount; i++) {
            Location loc = this.temporaryLocs[i];
            this.removeLoc2(loc);
            this.temporaryLocs[i] = null;
        }
        this.temporaryLocCount = 0;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(LBHOSVTIT;I)V")
    private void removeLoc2(Location loc) {
        for (int tx = loc.tileX; tx <= loc.maxSceneTileX; tx++) {
            for (int tz = loc.tileZ; tz <= loc.maxSceneTileZ; tz++) {
                Ground tile = this.levelTiles[loc.level][tx][tz];
                if (tile != null) {
                    for (int i = 0; i < tile.locCount; i++) {
                        if (tile.locs[i] == loc) {
                            tile.locCount--;
                            for (int j = i; j < tile.locCount; j++) {
                                tile.locs[j] = tile.locs[j + 1];
                                tile.locSpan[j] = tile.locSpan[j + 1];
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
    public Wall getWall(int level, int x, int z) {
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
    public int getWallTypecode(int level, int x, int z) {
        Ground tile = this.levelTiles[level][x][z];
        return tile == null || tile.wall == null ? 0 : tile.wall.typecode;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "b", descriptor = "(IBII)I")
    public int getDecorTypecode(int x, int level, int z) {
        Ground tile = this.levelTiles[level][x][z];
        return tile == null || tile.wallDecoration == null ? 0 : tile.wallDecoration.typecode;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "c", descriptor = "(III)I")
    public int getLocTypecode(int level, int x, int z) {
        Ground tile = this.levelTiles[level][x][z];
        if (tile == null) {
            return 0;
        }
        for (int l = 0; l < tile.locCount; l++) {
            Location loc = tile.locs[l];
            if ((loc.typecode >> 29 & 0x3) == 2 && loc.tileX == x && loc.tileZ == z) {
                return loc.typecode;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "d", descriptor = "(III)I")
    public int getGroundDecorTypecode(int level, int x, int z) {
        Ground tile = this.levelTiles[level][x][z];
        return tile == null || tile.groundDecoration == null ? 0 : tile.groundDecoration.typecode;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "e", descriptor = "(IIII)I")
    public int getInfo(int level, int x, int z, int typecode) {
        Ground tile = this.levelTiles[level][x][z];
        if (tile == null) {
            return -1;
        } else if (tile.wall != null && tile.wall.typecode == typecode) {
            return tile.wall.info & 0xFF;
        } else if (tile.wallDecoration != null && tile.wallDecoration.typecode == typecode) {
            return tile.wallDecoration.info & 0xFF;
        } else if (tile.groundDecoration != null && tile.groundDecoration.typecode == typecode) {
            return tile.groundDecoration.info & 0xFF;
        } else {
            for (int var6 = 0; var6 < tile.locCount; var6++) {
                if (tile.locs[var6].typecode == typecode) {
                    return tile.locs[var6].info & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(BIII)V")
    public void buildModels(int lightSrcX, int lightSrcY, int lightSrcZ) {
        for (int level = 0; level < this.maxLevel; level++) {
            for (int tileX = 0; tileX < this.maxTileX; tileX++) {
                for (int tileZ = 0; tileZ < this.maxTileZ; tileZ++) {
                    Ground tile = this.levelTiles[level][tileX][tileZ];
                    if (tile != null) {
                        Wall wall = tile.wall;
                        if (wall != null && wall.entityA != null && wall.entityA.vertexNormal != null) {
                            this.mergeLocNormals(tileZ, level, 1, (Model) wall.entityA, tileX, 1);
                            if (wall.entityB != null && wall.entityB.vertexNormal != null) {
                                this.mergeLocNormals(tileZ, level, 1, (Model) wall.entityB, tileX, 1);
                                this.mergeNormals((Model) wall.entityA, (Model) wall.entityB, 0, 0, 0, false);
                                ((Model) wall.entityB).applyLighting(lightSrcY, lightSrcX, 0, lightSrcZ);
                            }
                            ((Model) wall.entityA).applyLighting(lightSrcY, lightSrcX, 0, lightSrcZ);
                        }
                        for (int i = 0; i < tile.locCount; i++) {
                            Location loc = tile.locs[i];
                            if (loc != null && loc.entity != null && loc.entity.vertexNormal != null) {
                                this.mergeLocNormals(tileZ, level, loc.maxSceneTileX + 1 - loc.tileX, (Model) loc.entity, tileX, loc.maxSceneTileZ + 1 - loc.tileZ);
                                ((Model) loc.entity).applyLighting(lightSrcY, lightSrcX, 0, lightSrcZ);
                            }
                        }
                        GroundDecor decor = tile.groundDecoration;
                        if (decor != null && decor.entity.vertexNormal != null) {
                            this.mergeGroundDecorationNormals(tileX, (Model) decor.entity, tileZ, level);
                            ((Model) decor.entity).applyLighting(lightSrcY, lightSrcX, 0, lightSrcZ);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(ILLZYQDKJV;III)V")
    private void mergeGroundDecorationNormals(int tileX, Model model, int tileZ, int level) {
        if (tileX < this.maxTileX) {
            Ground tile = this.levelTiles[level][tileX + 1][tileZ];
            if (tile != null && tile.groundDecoration != null && tile.groundDecoration.entity.vertexNormal != null) {
                this.mergeNormals(model, (Model) tile.groundDecoration.entity, 128, 0, 0, true);
            }
        }
        if (tileZ < this.maxTileX) {
            Ground tile = this.levelTiles[level][tileX][tileZ + 1];
            if (tile != null && tile.groundDecoration != null && tile.groundDecoration.entity.vertexNormal != null) {
                this.mergeNormals(model, (Model) tile.groundDecoration.entity, 0, 0, 128, true);
            }
        }
        if (tileX < this.maxTileX && tileZ < this.maxTileZ) {
            Ground tile = this.levelTiles[level][tileX + 1][tileZ + 1];
            if (tile != null && tile.groundDecoration != null && tile.groundDecoration.entity.vertexNormal != null) {
                this.mergeNormals(model, (Model) tile.groundDecoration.entity, 128, 0, 128, true);
            }
        }
        if (tileX >= this.maxTileX || tileZ <= 0) {
            return;
        }
        Ground tile = this.levelTiles[level][tileX + 1][tileZ - 1];
        if (tile != null && tile.groundDecoration != null && tile.groundDecoration.entity.vertexNormal != null) {
            this.mergeNormals(model, (Model) tile.groundDecoration.entity, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIILLZYQDKJV;II)V")
    private void mergeLocNormals(int tileZ, int level, int tileSizeX, Model model, int tileX, int tileSizeZ) {
        boolean allowFaceRemoval = true;
        int minTileX = tileX;
        int maxTileX = tileSizeX + tileX;
        int minTileZ = tileZ - 1;
        int maxTileZ = tileZ + tileSizeZ;
        for (int l = level; l <= level + 1; l++) {
            if (this.maxLevel != l) {
                for (int x = minTileX; x <= maxTileX; x++) {
                    if (x >= 0 && x < this.maxTileX) {
                        for (int z = minTileZ; z <= maxTileZ; z++) {
                            if (z >= 0 && z < this.maxTileZ && (!allowFaceRemoval || x >= maxTileX || z >= maxTileZ || z < tileZ && tileX != x)) {
                                Ground tile = this.levelTiles[l][x][z];
                                if (tile != null) {
                                    int offsetY = (this.levelHeightmaps[l][x + 1][z] + this.levelHeightmaps[l][x][z] + this.levelHeightmaps[l][x][z + 1] + this.levelHeightmaps[l][x + 1][z + 1]) / 4 - (this.levelHeightmaps[level][tileX + 1][tileZ] + this.levelHeightmaps[level][tileX][tileZ] + this.levelHeightmaps[level][tileX][tileZ + 1] + this.levelHeightmaps[level][tileX + 1][tileZ + 1]) / 4;
                                    Wall wall = tile.wall;
                                    if (wall != null && wall.entityA != null && wall.entityA.vertexNormal != null) {
                                        this.mergeNormals(model, (Model) wall.entityA, (1 - tileSizeX) * 64 + (x - tileX) * 128, offsetY, (z - tileZ) * 128 + (1 - tileSizeZ) * 64, allowFaceRemoval);
                                    }
                                    if (wall != null && wall.entityB != null && wall.entityB.vertexNormal != null) {
                                        this.mergeNormals(model, (Model) wall.entityB, (1 - tileSizeX) * 64 + (x - tileX) * 128, offsetY, (z - tileZ) * 128 + (1 - tileSizeZ) * 64, allowFaceRemoval);
                                    }
                                    for (int i = 0; i < tile.locCount; i++) {
                                        Location loc = tile.locs[i];
                                        if (loc != null && loc.entity != null && loc.entity.vertexNormal != null) {
                                            int locTileSizeX = loc.maxSceneTileX + 1 - loc.tileX;
                                            int locTileSizeZ = loc.maxSceneTileZ + 1 - loc.tileZ;
                                            this.mergeNormals(model, (Model) loc.entity, (loc.tileX - tileX) * 128 + (locTileSizeX - tileSizeX) * 64, offsetY, (loc.tileZ - tileZ) * 128 + (locTileSizeZ - tileSizeZ) * 64, allowFaceRemoval);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                minTileX--;
                allowFaceRemoval = false;
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(LLZYQDKJV;LLZYQDKJV;IIIZ)V")
    private void mergeNormals(Model modelA, Model modelB, int offsetX, int offsetY, int offsetZ, boolean allowFaceRemoval) {
        this.tmpMergeIndex++;
        int merged = 0;
        int[] vertexX = modelB.vertexX;
        int vertexCountB = modelB.vertexCount;
        int mergeMinX = modelB.mergeX >> 16;
        int mergeMaxX = modelB.mergeX << 16 >> 16;
        int mergeMinY = modelB.mergeY >> 16;
        int mergeMaxY = modelB.mergeY << 16 >> 16;
        for (int vertexA = 0; vertexA < modelA.vertexCount; vertexA++) {
            VertexNormal normalA = modelA.vertexNormal[vertexA];
            VertexNormal originalNormalA = modelA.field1228[vertexA];
            if (originalNormalA.w != 0) {
                int y = modelA.vertexY[vertexA] - offsetY;
                if (y <= modelB.minY) {
                    int x = modelA.vertexX[vertexA] - offsetX;
                    if (x >= mergeMinX && x <= mergeMaxX) {
                        int z = modelA.vertexZ[vertexA] - offsetZ;
                        if (z >= mergeMaxY && z <= mergeMinY) {
                            for (int vertexB = 0; vertexB < vertexCountB; vertexB++) {
                                VertexNormal normalB = modelB.vertexNormal[vertexB];
                                VertexNormal originalNormalB = modelB.field1228[vertexB];
                                if (vertexX[vertexB] == x && modelB.vertexZ[vertexB] == z && modelB.vertexY[vertexB] == y && originalNormalB.w != 0) {
                                    normalA.x += originalNormalB.x;
                                    normalA.y += originalNormalB.y;
                                    normalA.z += originalNormalB.z;
                                    normalA.w += originalNormalB.w;
                                    normalB.x += originalNormalA.x;
                                    normalB.y += originalNormalA.y;
                                    normalB.z += originalNormalA.z;
                                    normalB.w += originalNormalA.w;
                                    merged++;
                                    this.mergeIndexA[vertexA] = this.tmpMergeIndex;
                                    this.mergeIndexB[vertexB] = this.tmpMergeIndex;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (merged < 3 || !allowFaceRemoval) {
            return;
        }
        for (int i = 0; i < modelA.faceCount; i++) {
            if (this.mergeIndexA[modelA.faceVertexA[i]] == this.tmpMergeIndex && this.mergeIndexA[modelA.faceVertexB[i]] == this.tmpMergeIndex && this.mergeIndexA[modelA.faceVertexC[i]] == this.tmpMergeIndex) {
                modelA.faceInfo[i] = -1;
            }
        }
        for (int i = 0; i < modelB.faceCount; i++) {
            if (this.mergeIndexB[modelB.faceVertexA[i]] == this.tmpMergeIndex && this.mergeIndexB[modelB.faceVertexB[i]] == this.tmpMergeIndex && this.mergeIndexB[modelB.faceVertexC[i]] == this.tmpMergeIndex) {
                modelB.faceInfo[i] = -1;
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "([IIIIII)V")
    public void drawMinimapTile(int[] dst, int offset, int step, int level, int x, int z) {
        Ground tile = this.levelTiles[level][x][z];
        if (tile == null) {
            return;
        }
        TileUnderlay underlay = tile.underlay;
        if (underlay != null) {
            int rgb = underlay.colour;
            if (rgb != 0) {
                for (int i = 0; i < 4; i++) {
                    dst[offset] = rgb;
                    dst[offset + 1] = rgb;
                    dst[offset + 2] = rgb;
                    dst[offset + 3] = rgb;
                    offset += step;
                }
            }
            return;
        }
        TileOverlay overlay = tile.overlay;
        if (overlay == null) {
            return;
        }
        int shape = overlay.shape;
        int angle = overlay.shapeAngle;
        int background = overlay.backgroundRgb;
        int foreground = overlay.foregroundRgb;
        int[] mask = this.MINIMAP_TILE_MASK[shape];
        int[] rotation = this.MINIMAP_TILE_ROTATION_MAP[angle];
        int off = 0;
        if (background != 0) {
            for (int i = 0; i < 4; i++) {
                dst[offset] = mask[rotation[off++]] == 0 ? background : foreground;
                dst[offset + 1] = mask[rotation[off++]] == 0 ? background : foreground;
                dst[offset + 2] = mask[rotation[off++]] == 0 ? background : foreground;
                dst[offset + 3] = mask[rotation[off++]] == 0 ? background : foreground;
                offset += step;
            }
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (mask[rotation[off++]] != 0) {
                dst[offset] = foreground;
            }
            if (mask[rotation[off++]] != 0) {
                dst[offset + 1] = foreground;
            }
            if (mask[rotation[off++]] != 0) {
                dst[offset + 2] = foreground;
            }
            if (mask[rotation[off++]] != 0) {
                dst[offset + 3] = foreground;
            }
            offset += step;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "e", descriptor = "(III)V")
    public void click(int mouseX, int mouseY) {
        takingInput = true;
        World3D.mouseX = mouseX;
        World3D.mouseY = mouseY;
        clickTileX = -1;
        clickTileZ = -1;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIIIII)V")
    public void draw(int eyeX, int topLevel, int arg2, int eyeY, int eyeZ, int eyeYaw, int eyePitch) {
        if (eyeX < 0) {
            eyeX = 0;
        } else if (eyeX >= this.maxTileX * 128) {
            eyeX = this.maxTileX * 128 - 1;
        }
        if (eyeZ < 0) {
            eyeZ = 0;
        } else if (eyeZ >= this.maxTileZ * 128) {
            eyeZ = this.maxTileZ * 128 - 1;
        }
        cycle++;
        sinEyePitch = Model.sin[eyePitch];
        cosEyePitch = Model.cos[eyePitch];
        sinEyeYaw = Model.sin[eyeYaw];
        cosEyeYaw = Model.cos[eyeYaw];
        visibilityMap = visibilityMatrix[(eyePitch - 128) / 32][eyeYaw / 64];
        World3D.eyeX = eyeX;
        World3D.eyeY = eyeY;
        World3D.eyeZ = eyeZ;
        eyeTileX = eyeX / 128;
        eyeTileZ = eyeZ / 128;
        World3D.topLevel = topLevel;
        minDrawTileX = eyeTileX - 25;
        if (minDrawTileX < 0) {
            minDrawTileX = 0;
        }
        minDrawTileZ = eyeTileZ - 25;
        if (minDrawTileZ < 0) {
            minDrawTileZ = 0;
        }
        maxDrawTileX = eyeTileX + 25;
        if (maxDrawTileX > this.maxTileX) {
            maxDrawTileX = this.maxTileX;
        }
        maxDrawTileZ = eyeTileZ + 25;
        if (maxDrawTileZ > this.maxTileZ) {
            maxDrawTileZ = this.maxTileZ;
        }
        this.updateActiveOccluders();
        tilesRemaining = 0;
        for (int level = this.minLevel; level < this.maxLevel; level++) {
            Ground[][] tiles = this.levelTiles[level];
            for (int x = minDrawTileX; x < maxDrawTileX; x++) {
                for (int z = minDrawTileZ; z < maxDrawTileZ; z++) {
                    Ground tile = tiles[x][z];
                    if (tile != null) {
                        if (tile.drawLevel <= topLevel && (visibilityMap[x + 25 - eyeTileX][z + 25 - eyeTileZ] || this.levelHeightmaps[level][x][z] - eyeY >= 2000)) {
                            tile.groundVisible = true;
                            tile.update = true;
                            tile.containsLocs = tile.locCount > 0;
                            tilesRemaining++;
                        } else {
                            tile.groundVisible = false;
                            tile.update = false;
                            tile.checkLocSpans = 0;
                        }
                    }
                }
            }
        }
        for (int level = this.minLevel; level < this.maxLevel; level++) {
            Ground[][] tiles = this.levelTiles[level];
            for (int dx = -25; dx <= 0; dx++) {
                int rightTileX = eyeTileX + dx;
                int leftTileX = eyeTileX - dx;
                if (rightTileX >= minDrawTileX || leftTileX < maxDrawTileX) {
                    for (int dz = -25; dz <= 0; dz++) {
                        int forwardTileZ = eyeTileZ + dz;
                        int backwardTileZ = eyeTileZ - dz;
                        if (rightTileX >= minDrawTileX) {
                            if (forwardTileZ >= minDrawTileZ) {
                                Ground tile = tiles[rightTileX][forwardTileZ];
                                if (tile != null && tile.groundVisible) {
                                    this.drawTile(tile, true);
                                }
                            }
                            if (backwardTileZ < maxDrawTileZ) {
                                Ground tile = tiles[rightTileX][backwardTileZ];
                                if (tile != null && tile.groundVisible) {
                                    this.drawTile(tile, true);
                                }
                            }
                        }
                        if (leftTileX < maxDrawTileX) {
                            if (forwardTileZ >= minDrawTileZ) {
                                Ground tile = tiles[leftTileX][forwardTileZ];
                                if (tile != null && tile.groundVisible) {
                                    this.drawTile(tile, true);
                                }
                            }
                            if (backwardTileZ < maxDrawTileZ) {
                                Ground tile = tiles[leftTileX][backwardTileZ];
                                if (tile != null && tile.groundVisible) {
                                    this.drawTile(tile, true);
                                }
                            }
                        }
                        if (tilesRemaining == 0) {
                            takingInput = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int level = this.minLevel; level < this.maxLevel; level++) {
            Ground[][] tiles = this.levelTiles[level];
            for (int dx = -25; dx <= 0; dx++) {
                int rightTileX = eyeTileX + dx;
                int leftTileX = eyeTileX - dx;
                if (rightTileX >= minDrawTileX || leftTileX < maxDrawTileX) {
                    for (int dz = -25; dz <= 0; dz++) {
                        int forwardTileZ = eyeTileZ + dz;
                        int backgroundTileZ = eyeTileZ - dz;
                        if (rightTileX >= minDrawTileX) {
                            if (forwardTileZ >= minDrawTileZ) {
                                Ground tile = tiles[rightTileX][forwardTileZ];
                                if (tile != null && tile.groundVisible) {
                                    this.drawTile(tile, false);
                                }
                            }
                            if (backgroundTileZ < maxDrawTileZ) {
                                Ground tile = tiles[rightTileX][backgroundTileZ];
                                if (tile != null && tile.groundVisible) {
                                    this.drawTile(tile, false);
                                }
                            }
                        }
                        if (leftTileX < maxDrawTileX) {
                            if (forwardTileZ >= minDrawTileZ) {
                                Ground tile = tiles[leftTileX][forwardTileZ];
                                if (tile != null && tile.groundVisible) {
                                    this.drawTile(tile, false);
                                }
                            }
                            if (backgroundTileZ < maxDrawTileZ) {
                                Ground tile = tiles[leftTileX][backgroundTileZ];
                                if (tile != null && tile.groundVisible) {
                                    this.drawTile(tile, false);
                                }
                            }
                        }
                        if (tilesRemaining == 0) {
                            takingInput = false;
                            return;
                        }
                    }
                }
            }
        }
        takingInput = false;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(LRIEEXHOP;Z)V")
    public void drawTile(Ground next, boolean checkAdjacent) {
        drawTileQueue.addTail(next);
        while (true) {
            Ground tile;
            int tileX;
            int tileZ;
            int level;
            int occludeLevel;
            Ground[][] tiles;
            Ground tmpTileA;
            do {
                Ground tmpTileB;
                do {
                    Ground tmpTileC;
                    do {
                        Ground tmpTileD;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                tile = (Ground) drawTileQueue.removeHead();
                                                if (tile == null) {
                                                    return;
                                                }
                                            } while (!tile.update);
                                            tileX = tile.x;
                                            tileZ = tile.z;
                                            level = tile.groundLevel;
                                            occludeLevel = tile.occludeLevel;
                                            tiles = this.levelTiles[level];
                                            if (!tile.groundVisible) {
                                                break;
                                            }
                                            if (checkAdjacent) {
                                                if (level > 0) {
                                                    Ground above = this.levelTiles[level - 1][tileX][tileZ];
                                                    if (above != null && above.update) {
                                                        continue;
                                                    }
                                                }
                                                if (tileX <= eyeTileX && tileX > minDrawTileX) {
                                                    Ground adjacent = tiles[tileX - 1][tileZ];
                                                    if (adjacent != null && adjacent.update && (adjacent.groundVisible || (tile.locSpans & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (tileX >= eyeTileX && tileX < maxDrawTileX - 1) {
                                                    Ground adjacent = tiles[tileX + 1][tileZ];
                                                    if (adjacent != null && adjacent.update && (adjacent.groundVisible || (tile.locSpans & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (tileZ <= eyeTileZ && tileZ > minDrawTileZ) {
                                                    Ground adjacent = tiles[tileX][tileZ - 1];
                                                    if (adjacent != null && adjacent.update && (adjacent.groundVisible || (tile.locSpans & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (tileZ >= eyeTileZ && tileZ < maxDrawTileZ - 1) {
                                                    Ground adjacent = tiles[tileX][tileZ + 1];
                                                    if (adjacent != null && adjacent.update && (adjacent.groundVisible || (tile.locSpans & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                checkAdjacent = true;
                                            }
                                            tile.groundVisible = false;
                                            if (tile.bridge != null) {
                                                Ground bridge = tile.bridge;
                                                if (bridge.underlay == null) {
                                                    if (bridge.overlay != null && !this.tileVisible(0, tileX, tileZ)) {
                                                        this.drawTileOverlay(cosEyePitch, cosEyeYaw, bridge.overlay, sinEyePitch, tileZ, tileX, sinEyeYaw, (byte) 3);
                                                    }
                                                } else if (!this.tileVisible(0, tileX, tileZ)) {
                                                    this.drawTileUnderlay(bridge.underlay, 0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, tileX, tileZ);
                                                }
                                                Wall wall = bridge.wall;
                                                if (wall != null) {
                                                    wall.entityA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, wall.field1533 - eyeX, wall.field1532 - eyeY, wall.field1534 - eyeZ, wall.typecode);
                                                }
                                                for (int i = 0; i < bridge.locCount; i++) {
                                                    Location loc = bridge.locs[i];
                                                    if (loc != null) {
                                                        loc.entity.draw(loc.field81, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, loc.field78 - eyeX, loc.field77 - eyeY, loc.field79 - eyeZ, loc.typecode);
                                                    }
                                                }
                                            }
                                            boolean tileDrawn = false;
                                            if (tile.underlay == null) {
                                                if (tile.overlay != null && !this.tileVisible(occludeLevel, tileX, tileZ)) {
                                                    tileDrawn = true;
                                                    this.drawTileOverlay(cosEyePitch, cosEyeYaw, tile.overlay, sinEyePitch, tileZ, tileX, sinEyeYaw, (byte) 3);
                                                }
                                            } else if (!this.tileVisible(occludeLevel, tileX, tileZ)) {
                                                tileDrawn = true;
                                                this.drawTileUnderlay(tile.underlay, occludeLevel, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, tileX, tileZ);
                                            }
                                            int direction = 0;
                                            int frontWallTypes = 0;
                                            Wall wall = tile.wall;
                                            Decor decor = tile.wallDecoration;
                                            if (wall != null || decor != null) {
                                                if (eyeTileX == tileX) {
                                                    direction++;
                                                } else if (eyeTileX < tileX) {
                                                    direction += 2;
                                                }
                                                if (eyeTileZ == tileZ) {
                                                    direction += 3;
                                                } else if (eyeTileZ > tileZ) {
                                                    direction += 6;
                                                }
                                                frontWallTypes = FRONT_WALL_TYPES[direction];
                                                tile.backWallTypes = BACK_WALL_TYPES[direction];
                                            }
                                            if (wall != null) {
                                                if ((wall.typeA & DIRECTION_ALLOW_WALL_CORNER_TYPE[direction]) == 0) {
                                                    tile.checkLocSpans = 0;
                                                } else if (wall.typeA == 16) {
                                                    tile.checkLocSpans = 3;
                                                    tile.blockLocSpans = WALL_CORNER_TYPE_16_BLOCK_LOC_SPANS[direction];
                                                    tile.inverseBlockLocSpans = 3 - tile.blockLocSpans;
                                                } else if (wall.typeA == 32) {
                                                    tile.checkLocSpans = 6;
                                                    tile.blockLocSpans = WALL_CORNER_TYPE_32_BLOCK_LOC_SPANS[direction];
                                                    tile.inverseBlockLocSpans = 6 - tile.blockLocSpans;
                                                } else if (wall.typeA == 64) {
                                                    tile.checkLocSpans = 12;
                                                    tile.blockLocSpans = WALL_CORNER_TYPE_64_BLOCK_LOC_SPANS[direction];
                                                    tile.inverseBlockLocSpans = 12 - tile.blockLocSpans;
                                                } else {
                                                    tile.checkLocSpans = 9;
                                                    tile.blockLocSpans = WALL_CORNER_TYPE_128_BLOCK_LOC_SPANS[direction];
                                                    tile.inverseBlockLocSpans = 9 - tile.blockLocSpans;
                                                }
                                                if ((wall.typeA & frontWallTypes) != 0 && !this.wallVisible(occludeLevel, tileX, tileZ, wall.typeA)) {
                                                    wall.entityA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, wall.field1533 - eyeX, wall.field1532 - eyeY, wall.field1534 - eyeZ, wall.typecode);
                                                }
                                                if ((wall.typeB & frontWallTypes) != 0 && !this.wallVisible(occludeLevel, tileX, tileZ, wall.typeB)) {
                                                    wall.entityB.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, wall.field1533 - eyeX, wall.field1532 - eyeY, wall.field1534 - eyeZ, wall.typecode);
                                                }
                                            }
                                            if (decor != null && !this.visible(occludeLevel, tileX, tileZ, decor.entity.maxY)) {
                                                if ((decor.decorType & frontWallTypes) != 0) {
                                                    decor.entity.draw(decor.decorAngle, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, decor.x - eyeX, decor.field1406 - eyeY, decor.z - eyeZ, decor.typecode);
                                                } else if ((decor.decorType & 0x300) != 0) {
                                                    int x = decor.x - eyeX;
                                                    int y = decor.field1406 - eyeY;
                                                    int z = decor.z - eyeZ;
                                                    int angle = decor.decorAngle;
                                                    int nearestX;
                                                    if (angle == 1 || angle == 2) {
                                                        nearestX = -x;
                                                    } else {
                                                        nearestX = x;
                                                    }
                                                    int nearestZ;
                                                    if (angle == 2 || angle == 3) {
                                                        nearestZ = -z;
                                                    } else {
                                                        nearestZ = z;
                                                    }
                                                    if ((decor.decorType & 0x100) != 0 && nearestZ < nearestX) {
                                                        int drawX = WALL_DECORATION_INSET_X[angle] + x;
                                                        int drawZ = WALL_DECORATION_INSET_Z[angle] + z;
                                                        decor.entity.draw(angle * 512 + 256, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, drawX, y, drawZ, decor.typecode);
                                                    }
                                                    if ((decor.decorType & 0x200) != 0 && nearestZ > nearestX) {
                                                        int drawX = WALL_DECORATION_OUTSET_X[angle] + x;
                                                        int drawZ = WALL_DECORATION_OUTSET_Z[angle] + z;
                                                        decor.entity.draw(angle * 512 + 1280 & 0x7FF, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, drawX, y, drawZ, decor.typecode);
                                                    }
                                                }
                                            }
                                            if (tileDrawn) {
                                                GroundDecor groundDecor = tile.groundDecoration;
                                                if (groundDecor != null) {
                                                    groundDecor.entity.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, groundDecor.x - eyeX, groundDecor.field1310 - eyeY, groundDecor.z - eyeZ, groundDecor.typecode);
                                                }
                                                ObjStack objs = tile.objStack;
                                                if (objs != null && objs.offset == 0) {
                                                    if (objs.bottomObj != null) {
                                                        objs.bottomObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, objs.field637 - eyeX, objs.field636 - eyeY, objs.field638 - eyeZ, objs.field642);
                                                    }
                                                    if (objs.middleObj != null) {
                                                        objs.middleObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, objs.field637 - eyeX, objs.field636 - eyeY, objs.field638 - eyeZ, objs.field642);
                                                    }
                                                    if (objs.topObj != null) {
                                                        objs.topObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, objs.field637 - eyeX, objs.field636 - eyeY, objs.field638 - eyeZ, objs.field642);
                                                    }
                                                }
                                            }
                                            int spans = tile.locSpans;
                                            if (spans != 0) {
                                                if (tileX < eyeTileX && (spans & 0x4) != 0) {
                                                    Ground adjacent = tiles[tileX + 1][tileZ];
                                                    if (adjacent != null && adjacent.update) {
                                                        drawTileQueue.addTail(adjacent);
                                                    }
                                                }
                                                if (tileZ < eyeTileZ && (spans & 0x2) != 0) {
                                                    Ground adjacent = tiles[tileX][tileZ + 1];
                                                    if (adjacent != null && adjacent.update) {
                                                        drawTileQueue.addTail(adjacent);
                                                    }
                                                }
                                                if (tileX > eyeTileX && (spans & 0x1) != 0) {
                                                    Ground adjacent = tiles[tileX - 1][tileZ];
                                                    if (adjacent != null && adjacent.update) {
                                                        drawTileQueue.addTail(adjacent);
                                                    }
                                                }
                                                if (tileZ > eyeTileZ && (spans & 0x8) != 0) {
                                                    Ground adjacent = tiles[tileX][tileZ - 1];
                                                    if (adjacent != null && adjacent.update) {
                                                        drawTileQueue.addTail(adjacent);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (tile.checkLocSpans != 0) {
                                            boolean draw = true;
                                            for (int i = 0; i < tile.locCount; i++) {
                                                if (cycle != tile.locs[i].cycle && (tile.locSpan[i] & tile.checkLocSpans) == tile.blockLocSpans) {
                                                    draw = false;
                                                    break;
                                                }
                                            }
                                            if (draw) {
                                                Wall wall = tile.wall;
                                                if (!this.wallVisible(occludeLevel, tileX, tileZ, wall.typeA)) {
                                                    wall.entityA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, wall.field1533 - eyeX, wall.field1532 - eyeY, wall.field1534 - eyeZ, wall.typecode);
                                                }
                                                tile.checkLocSpans = 0;
                                            }
                                        }
                                        if (!tile.containsLocs) {
                                            break;
                                        }
                                        try {
                                            int locCount = tile.locCount;
                                            tile.containsLocs = false;
                                            int locBufferSize = 0;
                                            iterate_locs: for (int i = 0; i < locCount; i++) {
                                                Location loc = tile.locs[i];
                                                if (cycle != loc.cycle) {
                                                    for (int x = loc.tileX; x <= loc.maxSceneTileX; x++) {
                                                        for (int z = loc.tileZ; z <= loc.maxSceneTileZ; z++) {
                                                            Ground other = tiles[x][z];
                                                            if (other.groundVisible) {
                                                                tile.containsLocs = true;
                                                                continue iterate_locs;
                                                            }
                                                            if (other.checkLocSpans != 0) {
                                                                int spans = 0;
                                                                if (x > loc.tileX) {
                                                                    spans++;
                                                                }
                                                                if (x < loc.maxSceneTileX) {
                                                                    spans += 4;
                                                                }
                                                                if (z > loc.tileZ) {
                                                                    spans += 8;
                                                                }
                                                                if (z < loc.maxSceneTileZ) {
                                                                    spans += 2;
                                                                }
                                                                if ((spans & other.checkLocSpans) == tile.inverseBlockLocSpans) {
                                                                    tile.containsLocs = true;
                                                                    continue iterate_locs;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    locBuffer[locBufferSize++] = loc;
                                                    int minTileDistanceX = eyeTileX - loc.tileX;
                                                    int maxTileDistanceX = loc.maxSceneTileX - eyeTileX;
                                                    if (maxTileDistanceX > minTileDistanceX) {
                                                        minTileDistanceX = maxTileDistanceX;
                                                    }
                                                    int minTileDistanceZ = eyeTileZ - loc.tileZ;
                                                    int maxTileDistanceZ = loc.maxSceneTileZ - eyeTileZ;
                                                    if (maxTileDistanceZ > minTileDistanceZ) {
                                                        loc.distance = minTileDistanceX + maxTileDistanceZ;
                                                    } else {
                                                        loc.distance = minTileDistanceX + minTileDistanceZ;
                                                    }
                                                }
                                            }
                                            while (locBufferSize > 0) {
                                                int farthestDistance = -50;
                                                int farthestIndex = -1;
                                                for (int index = 0; index < locBufferSize; index++) {
                                                    Location loc = locBuffer[index];
                                                    if (cycle != loc.cycle) {
                                                        if (loc.distance > farthestDistance) {
                                                            farthestDistance = loc.distance;
                                                            farthestIndex = index;
                                                        } else if (loc.distance == farthestDistance) {
                                                            int var59 = loc.field78 - eyeX;
                                                            int var60 = loc.field79 - eyeZ;
                                                            int var61 = locBuffer[farthestIndex].field78 - eyeX;
                                                            int var62 = locBuffer[farthestIndex].field79 - eyeZ;
                                                            if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
                                                                farthestIndex = index;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (farthestIndex == -1) {
                                                    break;
                                                }
                                                Location farthest = locBuffer[farthestIndex];
                                                farthest.cycle = cycle;
                                                if (!this.locVisible(occludeLevel, farthest.tileX, farthest.maxSceneTileX, farthest.tileZ, farthest.maxSceneTileZ, farthest.entity.maxY)) {
                                                    farthest.entity.draw(farthest.field81, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, farthest.field78 - eyeX, farthest.field77 - eyeY, farthest.field79 - eyeZ, farthest.typecode);
                                                }
                                                for (int x = farthest.tileX; x <= farthest.maxSceneTileX; x++) {
                                                    for (int z = farthest.tileZ; z <= farthest.maxSceneTileZ; z++) {
                                                        Ground occupied = tiles[x][z];
                                                        if (occupied.checkLocSpans != 0) {
                                                            drawTileQueue.addTail(occupied);
                                                        } else if ((tileX != x || tileZ != z) && occupied.update) {
                                                            drawTileQueue.addTail(occupied);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!tile.containsLocs) {
                                                break;
                                            }
                                        } catch (Exception var89) {
                                            tile.containsLocs = false;
                                            break;
                                        }
                                    }
                                } while (!tile.update);
                            } while (tile.checkLocSpans != 0);
                            if (tileX > eyeTileX || tileX <= minDrawTileX) {
                                break;
                            }
                            tmpTileD = tiles[tileX - 1][tileZ];
                        } while (tmpTileD != null && tmpTileD.update);
                        if (tileX < eyeTileX || tileX >= maxDrawTileX - 1) {
                            break;
                        }
                        tmpTileC = tiles[tileX + 1][tileZ];
                    } while (tmpTileC != null && tmpTileC.update);
                    if (tileZ > eyeTileZ || tileZ <= minDrawTileZ) {
                        break;
                    }
                    tmpTileB = tiles[tileX][tileZ - 1];
                } while (tmpTileB != null && tmpTileB.update);
                if (tileZ < eyeTileZ || tileZ >= maxDrawTileZ - 1) {
                    break;
                }
                tmpTileA = tiles[tileX][tileZ + 1];
            } while (tmpTileA != null && tmpTileA.update);
            tile.update = false;
            tilesRemaining--;
            ObjStack objs = tile.objStack;
            if (objs != null && objs.offset != 0) {
                if (objs.bottomObj != null) {
                    objs.bottomObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, objs.field637 - eyeX, objs.field636 - eyeY - objs.offset, objs.field638 - eyeZ, objs.field642);
                }
                if (objs.middleObj != null) {
                    objs.middleObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, objs.field637 - eyeX, objs.field636 - eyeY - objs.offset, objs.field638 - eyeZ, objs.field642);
                }
                if (objs.topObj != null) {
                    objs.topObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, objs.field637 - eyeX, objs.field636 - eyeY - objs.offset, objs.field638 - eyeZ, objs.field642);
                }
            }
            if (tile.backWallTypes != 0) {
                Decor decor = tile.wallDecoration;
                if (decor != null && !this.visible(occludeLevel, tileX, tileZ, decor.entity.maxY)) {
                    if ((decor.decorType & tile.backWallTypes) != 0) {
                        decor.entity.draw(decor.decorAngle, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, decor.x - eyeX, decor.field1406 - eyeY, decor.z - eyeZ, decor.typecode);
                    } else if ((decor.decorType & 0x300) != 0) {
                        int x = decor.x - eyeX;
                        int y = decor.field1406 - eyeY;
                        int z = decor.z - eyeZ;
                        int angle = decor.decorAngle;
                        int nearestX;
                        if (angle == 1 || angle == 2) {
                            nearestX = -x;
                        } else {
                            nearestX = x;
                        }
                        int nearestZ;
                        if (angle == 2 || angle == 3) {
                            nearestZ = -z;
                        } else {
                            nearestZ = z;
                        }
                        if ((decor.decorType & 0x100) != 0 && nearestZ >= nearestX) {
                            int drawX = WALL_DECORATION_INSET_X[angle] + x;
                            int drawZ = WALL_DECORATION_INSET_Z[angle] + z;
                            decor.entity.draw(angle * 512 + 256, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, drawX, y, drawZ, decor.typecode);
                        }
                        if ((decor.decorType & 0x200) != 0 && nearestZ <= nearestX) {
                            int drawX = WALL_DECORATION_OUTSET_X[angle] + x;
                            int drawZ = WALL_DECORATION_OUTSET_Z[angle] + z;
                            decor.entity.draw(angle * 512 + 1280 & 0x7FF, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, drawX, y, drawZ, decor.typecode);
                        }
                    }
                }
                Wall wall = tile.wall;
                if (wall != null) {
                    if ((wall.typeB & tile.backWallTypes) != 0 && !this.wallVisible(occludeLevel, tileX, tileZ, wall.typeB)) {
                        wall.entityB.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, wall.field1533 - eyeX, wall.field1532 - eyeY, wall.field1534 - eyeZ, wall.typecode);
                    }
                    if ((wall.typeA & tile.backWallTypes) != 0 && !this.wallVisible(occludeLevel, tileX, tileZ, wall.typeA)) {
                        wall.entityA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, wall.field1533 - eyeX, wall.field1532 - eyeY, wall.field1534 - eyeZ, wall.typecode);
                    }
                }
            }
            if (level < this.maxLevel - 1) {
                Ground above = this.levelTiles[level + 1][tileX][tileZ];
                if (above != null && above.update) {
                    drawTileQueue.addTail(above);
                }
            }
            if (tileX < eyeTileX) {
                Ground adjacent = tiles[tileX + 1][tileZ];
                if (adjacent != null && adjacent.update) {
                    drawTileQueue.addTail(adjacent);
                }
            }
            if (tileZ < eyeTileZ) {
                Ground adjacent = tiles[tileX][tileZ + 1];
                if (adjacent != null && adjacent.update) {
                    drawTileQueue.addTail(adjacent);
                }
            }
            if (tileX > eyeTileX) {
                Ground adjacent = tiles[tileX - 1][tileZ];
                if (adjacent != null && adjacent.update) {
                    drawTileQueue.addTail(adjacent);
                }
            }
            if (tileZ > eyeTileZ) {
                Ground adjacent = tiles[tileX][tileZ - 1];
                if (adjacent != null && adjacent.update) {
                    drawTileQueue.addTail(adjacent);
                }
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(LAYYYSATX;IIIIIII)V")
    public void drawTileUnderlay(TileUnderlay underlay, int arg1, int arg2, int arg3, int arg4, int arg5, int tileX, int tileZ) {
        int x3;
        int x0 = x3 = (tileX << 7) - eyeX;
        int z1;
        int z0 = z1 = (tileZ << 7) - eyeZ;
        int x2;
        int x1 = x2 = x0 + 128;
        int z3;
        int z2 = z3 = z0 + 128;
        int y0 = this.levelHeightmaps[arg1][tileX][tileZ] - eyeY;
        int y1 = this.levelHeightmaps[arg1][tileX + 1][tileZ] - eyeY;
        int y2 = this.levelHeightmaps[arg1][tileX + 1][tileZ + 1] - eyeY;
        int y3 = this.levelHeightmaps[arg1][tileX][tileZ + 1] - eyeY;
        int var21 = arg4 * z0 + arg5 * x0 >> 16;
        int var22 = arg5 * z0 - arg4 * x0 >> 16;
        int var24 = arg3 * y0 - arg2 * var22 >> 16;
        int var25 = arg2 * y0 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * z1 + arg5 * x1 >> 16;
        int var28 = arg5 * z1 - arg4 * x1 >> 16;
        int var30 = arg3 * y1 - arg2 * var28 >> 16;
        int var31 = arg2 * y1 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * z2 + arg5 * x2 >> 16;
        int var34 = arg5 * z2 - arg4 * x2 >> 16;
        int var36 = arg3 * y2 - arg2 * var34 >> 16;
        int var37 = arg2 * y2 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * z3 + arg5 * x3 >> 16;
        int var40 = arg5 * z3 - arg4 * x3 >> 16;
        int var42 = arg3 * y3 - arg2 * var40 >> 16;
        int var43 = arg2 * y3 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int px0 = (var21 << 9) / var25 + Draw3D.centerX;
        int py0 = (var24 << 9) / var25 + Draw3D.centerY;
        int pz0 = (var27 << 9) / var31 + Draw3D.centerX;
        int px1 = (var30 << 9) / var31 + Draw3D.centerY;
        int py1 = (var33 << 9) / var37 + Draw3D.centerX;
        int pz1 = (var36 << 9) / var37 + Draw3D.centerY;
        int px3 = (var39 << 9) / var43 + Draw3D.centerX;
        int py3 = (var42 << 9) / var43 + Draw3D.centerY;
        Draw3D.alpha = 0;
        if ((px1 - py3) * (py1 - px3) - (pz0 - px3) * (pz1 - py3) > 0) {
            Draw3D.clipX = py1 < 0 || px3 < 0 || pz0 < 0 || py1 > Draw2D.boundX || px3 > Draw2D.boundX || pz0 > Draw2D.boundX;
            if (takingInput && this.pointInsideTriangle(mouseX, mouseY, pz1, py3, px1, py1, px3, pz0)) {
                clickTileX = tileX;
                clickTileZ = tileZ;
            }
            if (underlay.textureId == -1) {
                if (underlay.northeastColor != 12345678) {
                    Draw3D.fillGouraudTriangle(pz1, py3, px1, py1, px3, pz0, underlay.northeastColor, underlay.northwestColor, underlay.southeastColor);
                }
            } else if (lowMemory) {
                int var53 = TEXTURE_HSL[underlay.textureId];
                Draw3D.fillGouraudTriangle(pz1, py3, px1, py1, px3, pz0, this.mulLightness(underlay.northeastColor, var53), this.mulLightness(underlay.northwestColor, var53), this.mulLightness(underlay.southeastColor, var53));
            } else if (underlay.flat) {
                Draw3D.fillTexturedTriangle(pz1, py3, px1, py1, px3, pz0, underlay.northeastColor, underlay.northwestColor, underlay.southeastColor, var21, var27, var39, var24, var30, var42, var25, var31, var43, underlay.textureId);
            } else {
                Draw3D.fillTexturedTriangle(pz1, py3, px1, py1, px3, pz0, underlay.northeastColor, underlay.northwestColor, underlay.southeastColor, var33, var39, var27, var36, var42, var30, var37, var43, var31, underlay.textureId);
            }
        }
        if ((px0 - pz0) * (py3 - px1) - (py0 - px1) * (px3 - pz0) <= 0) {
            return;
        }
        Draw3D.clipX = px0 < 0 || pz0 < 0 || px3 < 0 || px0 > Draw2D.boundX || pz0 > Draw2D.boundX || px3 > Draw2D.boundX;
        if (takingInput && this.pointInsideTriangle(mouseX, mouseY, py0, px1, py3, px0, pz0, px3)) {
            clickTileX = tileX;
            clickTileZ = tileZ;
        }
        if (underlay.textureId != -1) {
            if (!lowMemory) {
                Draw3D.fillTexturedTriangle(py0, px1, py3, px0, pz0, px3, underlay.southwestColor, underlay.southeastColor, underlay.northwestColor, var21, var27, var39, var24, var30, var42, var25, var31, var43, underlay.textureId);
                return;
            }
            int averageColor = TEXTURE_HSL[underlay.textureId];
            Draw3D.fillGouraudTriangle(py0, px1, py3, px0, pz0, px3, this.mulLightness(underlay.southwestColor, averageColor), this.mulLightness(underlay.southeastColor, averageColor), this.mulLightness(underlay.northwestColor, averageColor));
        } else if (underlay.southwestColor != 12345678) {
            Draw3D.fillGouraudTriangle(py0, px1, py3, px0, pz0, px3, underlay.southwestColor, underlay.southeastColor, underlay.northwestColor);
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IILJQCVNYYR;IIIIB)V")
    public void drawTileOverlay(int arg0, int arg1, TileOverlay overlay, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        int vertexCount = overlay.vertexX.length;
        for (int i = 0; i < vertexCount; i++) {
            int x = overlay.vertexX[i] - eyeX;
            int y = overlay.vertexY[i] - eyeY;
            int z = overlay.vertexZ[i] - eyeZ;
            int var26 = arg1 * x + arg6 * z >> 16;
            int var27 = arg1 * z - arg6 * x >> 16;
            int var29 = arg0 * y - arg3 * var27 >> 16;
            int var30 = arg0 * var27 + arg3 * y >> 16;
            if (var30 < 50) {
                return;
            }
            if (overlay.triangleTextureIds != null) {
                TileOverlay.tmpViewspaceX[i] = var26;
                TileOverlay.tmpViewspaceY[i] = var29;
                TileOverlay.tmpViewspaceZ[i] = var30;
            }
            TileOverlay.tmpScreenX[i] = (var26 << 9) / var30 + Draw3D.centerX;
            TileOverlay.tmpScreenY[i] = (var29 << 9) / var30 + Draw3D.centerY;
        }
        Draw3D.alpha = 0;
        vertexCount = overlay.triangleVertexA.length;
        for (int i = 0; i < vertexCount; i++) {
            int a = overlay.triangleVertexA[i];
            int b = overlay.triangleVertexB[i];
            int c = overlay.triangleVertexC[i];
            int x0 = TileOverlay.tmpScreenX[a];
            int x1 = TileOverlay.tmpScreenX[b];
            int x2 = TileOverlay.tmpScreenX[c];
            int y0 = TileOverlay.tmpScreenY[a];
            int y1 = TileOverlay.tmpScreenY[b];
            int y2 = TileOverlay.tmpScreenY[c];
            if ((x0 - x1) * (y2 - y1) - (x2 - x1) * (y0 - y1) > 0) {
                Draw3D.clipX = x0 < 0 || x1 < 0 || x2 < 0 || x0 > Draw2D.boundX || x1 > Draw2D.boundX || x2 > Draw2D.boundX;
                if (takingInput && this.pointInsideTriangle(mouseX, mouseY, y0, y1, y2, x0, x1, x2)) {
                    clickTileX = arg5;
                    clickTileZ = arg4;
                }
                if (overlay.triangleTextureIds == null || overlay.triangleTextureIds[i] == -1) {
                    if (overlay.triangleColorA[i] != 12345678) {
                        Draw3D.fillGouraudTriangle(y0, y1, y2, x0, x1, x2, overlay.triangleColorA[i], overlay.triangleColorB[i], overlay.triangleColorC[i]);
                    }
                } else if (lowMemory) {
                    int var22 = TEXTURE_HSL[overlay.triangleTextureIds[i]];
                    Draw3D.fillGouraudTriangle(y0, y1, y2, x0, x1, x2, this.mulLightness(overlay.triangleColorA[i], var22), this.mulLightness(overlay.triangleColorB[i], var22), this.mulLightness(overlay.triangleColorC[i], var22));
                } else if (overlay.flat) {
                    Draw3D.fillTexturedTriangle(y0, y1, y2, x0, x1, x2, overlay.triangleColorA[i], overlay.triangleColorB[i], overlay.triangleColorC[i], TileOverlay.tmpViewspaceX[0], TileOverlay.tmpViewspaceX[1], TileOverlay.tmpViewspaceX[3], TileOverlay.tmpViewspaceY[0], TileOverlay.tmpViewspaceY[1], TileOverlay.tmpViewspaceY[3], TileOverlay.tmpViewspaceZ[0], TileOverlay.tmpViewspaceZ[1], TileOverlay.tmpViewspaceZ[3], overlay.triangleTextureIds[i]);
                } else {
                    Draw3D.fillTexturedTriangle(y0, y1, y2, x0, x1, x2, overlay.triangleColorA[i], overlay.triangleColorB[i], overlay.triangleColorC[i], TileOverlay.tmpViewspaceX[a], TileOverlay.tmpViewspaceX[b], TileOverlay.tmpViewspaceX[c], TileOverlay.tmpViewspaceY[a], TileOverlay.tmpViewspaceY[b], TileOverlay.tmpViewspaceY[c], TileOverlay.tmpViewspaceZ[a], TileOverlay.tmpViewspaceZ[b], TileOverlay.tmpViewspaceZ[c], overlay.triangleTextureIds[i]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "f", descriptor = "(III)I")
    public int mulLightness(int lightness, int hsl) {
        int invLightness = 127 - lightness;
        lightness = (hsl & 0x7F) * invLightness / 160;
        if (lightness < 2) {
            lightness = 2;
        } else if (lightness > 126) {
            lightness = 126;
        }
        return (hsl & 0xFF80) + lightness;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean pointInsideTriangle(int x, int y, int y0, int y1, int y2, int x0, int x1, int x2) {
        if (y < y0 && y < y1 && y < y2) {
            return false;
        } else if (y > y0 && y > y1 && y > y2) {
            return false;
        } else if (x < x0 && x < x1 && x < x2) {
            return false;
        } else if (x > x0 && x > x1 && x > x2) {
            return false;
        } else {
            int crossProduct_01 = (y - y0) * (x1 - x0) - (x - x0) * (y1 - y0);
            int crossProduct_20 = (y - y2) * (x0 - x2) - (x - x2) * (y0 - y2);
            int crossProduct_12 = (y - y1) * (x2 - x1) - (x - x1) * (y2 - y1);
            return crossProduct_01 * crossProduct_12 > 0 && crossProduct_20 * crossProduct_12 > 0;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "b", descriptor = "(I)V")
    private void updateActiveOccluders() {
        int count = levelOccluderCount[topLevel];
        Occlude[] occluders = levelOccluders[topLevel];
        activeOccluderCount = 0;
        for (int i = 0; i < count; i++) {
            Occlude occluder = occluders[i];
            if (occluder.type == 1) {
                int deltaMaxY = occluder.minTileX + 25 - eyeTileX;
                if (deltaMaxY >= 0 && deltaMaxY <= 50) {
                    int deltaMinTileZ = occluder.minTileZ + 25 - eyeTileZ;
                    if (deltaMinTileZ < 0) {
                        deltaMinTileZ = 0;
                    }
                    int deltaMaxTileZ = occluder.maxTileZ + 25 - eyeTileZ;
                    if (deltaMaxTileZ > 50) {
                        deltaMaxTileZ = 50;
                    }
                    boolean ok = false;
                    while (deltaMinTileZ <= deltaMaxTileZ) {
                        if (visibilityMap[deltaMaxY][deltaMinTileZ++]) {
                            ok = true;
                            break;
                        }
                    }
                    if (ok) {
                        int deltaMaxTileX = eyeX - occluder.minX;
                        if (deltaMaxTileX > 32) {
                            occluder.mode = 1;
                        } else {
                            if (deltaMaxTileX >= -32) {
                                continue;
                            }
                            occluder.mode = 2;
                            deltaMaxTileX = -deltaMaxTileX;
                        }
                        occluder.minDeltaZ = (occluder.minZ - eyeZ << 8) / deltaMaxTileX;
                        occluder.maxDeltaZ = (occluder.maxZ - eyeZ << 8) / deltaMaxTileX;
                        occluder.minDeltaY = (occluder.minY - eyeY << 8) / deltaMaxTileX;
                        occluder.maxDeltaY = (occluder.maxY - eyeY << 8) / deltaMaxTileX;
                        activeOccluders[activeOccluderCount++] = occluder;
                    }
                }
            } else if (occluder.type == 2) {
                int deltaMaxY = occluder.minTileZ + 25 - eyeTileZ;
                if (deltaMaxY >= 0 && deltaMaxY <= 50) {
                    int deltaMinTileZ = occluder.minTileX + 25 - eyeTileX;
                    if (deltaMinTileZ < 0) {
                        deltaMinTileZ = 0;
                    }
                    int deltaMaxTileZ = occluder.maxTileX + 25 - eyeTileX;
                    if (deltaMaxTileZ > 50) {
                        deltaMaxTileZ = 50;
                    }
                    boolean ok = false;
                    while (deltaMinTileZ <= deltaMaxTileZ) {
                        if (visibilityMap[deltaMinTileZ++][deltaMaxY]) {
                            ok = true;
                            break;
                        }
                    }
                    if (ok) {
                        int deltaMaxTileX = eyeZ - occluder.minZ;
                        if (deltaMaxTileX > 32) {
                            occluder.mode = 3;
                        } else {
                            if (deltaMaxTileX >= -32) {
                                continue;
                            }
                            occluder.mode = 4;
                            deltaMaxTileX = -deltaMaxTileX;
                        }
                        occluder.minDeltaX = (occluder.minX - eyeX << 8) / deltaMaxTileX;
                        occluder.maxDeltaX = (occluder.maxX - eyeX << 8) / deltaMaxTileX;
                        occluder.minDeltaY = (occluder.minY - eyeY << 8) / deltaMaxTileX;
                        occluder.maxDeltaY = (occluder.maxY - eyeY << 8) / deltaMaxTileX;
                        activeOccluders[activeOccluderCount++] = occluder;
                    }
                }
            } else if (occluder.type == 4) {
                int deltaMaxY = occluder.minY - eyeY;
                if (deltaMaxY > 128) {
                    int deltaMinTileZ = occluder.minTileZ + 25 - eyeTileZ;
                    if (deltaMinTileZ < 0) {
                        deltaMinTileZ = 0;
                    }
                    int deltaMaxTileZ = occluder.maxTileZ + 25 - eyeTileZ;
                    if (deltaMaxTileZ > 50) {
                        deltaMaxTileZ = 50;
                    }
                    if (deltaMinTileZ <= deltaMaxTileZ) {
                        int deltaMinTileX = occluder.minTileX + 25 - eyeTileX;
                        if (deltaMinTileX < 0) {
                            deltaMinTileX = 0;
                        }
                        int deltaMaxTileX = occluder.maxTileX + 25 - eyeTileX;
                        if (deltaMaxTileX > 50) {
                            deltaMaxTileX = 50;
                        }
                        boolean ok = false;
                        find_visible_tile: for (int x = deltaMinTileX; x <= deltaMaxTileX; x++) {
                            for (int z = deltaMinTileZ; z <= deltaMaxTileZ; z++) {
                                if (visibilityMap[x][z]) {
                                    ok = true;
                                    break find_visible_tile;
                                }
                            }
                        }
                        if (ok) {
                            occluder.mode = 5;
                            occluder.minDeltaX = (occluder.minX - eyeX << 8) / deltaMaxY;
                            occluder.maxDeltaX = (occluder.maxX - eyeX << 8) / deltaMaxY;
                            occluder.minDeltaZ = (occluder.minZ - eyeZ << 8) / deltaMaxY;
                            occluder.maxDeltaZ = (occluder.maxZ - eyeZ << 8) / deltaMaxY;
                            activeOccluders[activeOccluderCount++] = occluder;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "g", descriptor = "(III)Z")
    private boolean tileVisible(int level, int x, int z) {
        int cycle = this.levelTileOcclusionCycles[level][x][z];
        if (-World3D.cycle == cycle) {
            return false;
        } else if (World3D.cycle == cycle) {
            return true;
        } else {
            int sx = x << 7;
            int sz = z << 7;
            if (this.occluded(sx + 1, this.levelHeightmaps[level][x][z], sz + 1) && this.occluded(sx + 128 - 1, this.levelHeightmaps[level][x + 1][z], sz + 1) && this.occluded(sx + 128 - 1, this.levelHeightmaps[level][x + 1][z + 1], sz + 128 - 1) && this.occluded(sx + 1, this.levelHeightmaps[level][x][z + 1], sz + 128 - 1)) {
                this.levelTileOcclusionCycles[level][x][z] = World3D.cycle;
                return true;
            } else {
                this.levelTileOcclusionCycles[level][x][z] = -World3D.cycle;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "g", descriptor = "(IIII)Z")
    private boolean wallVisible(int level, int x, int z, int type) {
        if (!this.tileVisible(level, x, z)) {
            return false;
        }
        int sceneX = x << 7;
        int sceneZ = z << 7;
        int sceneY = this.levelHeightmaps[level][x][z] - 1;
        int y0 = sceneY - 120;
        int y1 = sceneY - 230;
        int y2 = sceneY - 238;
        if (type < 16) {
            if (type == 1) {
                if (sceneX > eyeX) {
                    if (!this.occluded(sceneX, sceneY, sceneZ)) {
                        return false;
                    }
                    if (!this.occluded(sceneX, sceneY, sceneZ + 128)) {
                        return false;
                    }
                }
                if (level > 0) {
                    if (!this.occluded(sceneX, y0, sceneZ)) {
                        return false;
                    }
                    if (!this.occluded(sceneX, y0, sceneZ + 128)) {
                        return false;
                    }
                }
                if (!this.occluded(sceneX, y1, sceneZ)) {
                    return false;
                }
                if (!this.occluded(sceneX, y1, sceneZ + 128)) {
                    return false;
                }
                return true;
            }
            if (type == 2) {
                if (sceneZ < eyeZ) {
                    if (!this.occluded(sceneX, sceneY, sceneZ + 128)) {
                        return false;
                    }
                    if (!this.occluded(sceneX + 128, sceneY, sceneZ + 128)) {
                        return false;
                    }
                }
                if (level > 0) {
                    if (!this.occluded(sceneX, y0, sceneZ + 128)) {
                        return false;
                    }
                    if (!this.occluded(sceneX + 128, y0, sceneZ + 128)) {
                        return false;
                    }
                }
                if (!this.occluded(sceneX, y1, sceneZ + 128)) {
                    return false;
                }
                if (!this.occluded(sceneX + 128, y1, sceneZ + 128)) {
                    return false;
                }
                return true;
            }
            if (type == 4) {
                if (sceneX < eyeX) {
                    if (!this.occluded(sceneX + 128, sceneY, sceneZ)) {
                        return false;
                    }
                    if (!this.occluded(sceneX + 128, sceneY, sceneZ + 128)) {
                        return false;
                    }
                }
                if (level > 0) {
                    if (!this.occluded(sceneX + 128, y0, sceneZ)) {
                        return false;
                    }
                    if (!this.occluded(sceneX + 128, y0, sceneZ + 128)) {
                        return false;
                    }
                }
                if (!this.occluded(sceneX + 128, y1, sceneZ)) {
                    return false;
                }
                if (!this.occluded(sceneX + 128, y1, sceneZ + 128)) {
                    return false;
                }
                return true;
            }
            if (type == 8) {
                if (sceneZ > eyeZ) {
                    if (!this.occluded(sceneX, sceneY, sceneZ)) {
                        return false;
                    }
                    if (!this.occluded(sceneX + 128, sceneY, sceneZ)) {
                        return false;
                    }
                }
                if (level > 0) {
                    if (!this.occluded(sceneX, y0, sceneZ)) {
                        return false;
                    }
                    if (!this.occluded(sceneX + 128, y0, sceneZ)) {
                        return false;
                    }
                }
                if (!this.occluded(sceneX, y1, sceneZ)) {
                    return false;
                }
                if (!this.occluded(sceneX + 128, y1, sceneZ)) {
                    return false;
                }
                return true;
            }
        }
        if (!this.occluded(sceneX + 64, y2, sceneZ + 64)) {
            return false;
        } else if (type == 16) {
            return this.occluded(sceneX, y1, sceneZ + 128);
        } else if (type == 32) {
            return this.occluded(sceneX + 128, y1, sceneZ + 128);
        } else if (type == 64) {
            return this.occluded(sceneX + 128, y1, sceneZ);
        } else if (type == 128) {
            return this.occluded(sceneX, y1, sceneZ);
        } else {
            System.out.println("Warning unsupported wall type");
            return true;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "h", descriptor = "(IIII)Z")
    private boolean visible(int level, int tileX, int tileZ, int y) {
        if (this.tileVisible(level, tileX, tileZ)) {
            int x = tileX << 7;
            int z = tileZ << 7;
            return this.occluded(x + 1, this.levelHeightmaps[level][tileX][tileZ] - y, z + 1) && this.occluded(x + 128 - 1, this.levelHeightmaps[level][tileX + 1][tileZ] - y, z + 1) && this.occluded(x + 128 - 1, this.levelHeightmaps[level][tileX + 1][tileZ + 1] - y, z + 128 - 1) && this.occluded(x + 1, this.levelHeightmaps[level][tileX][tileZ + 1] - y, z + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIIII)Z")
    private boolean locVisible(int level, int minX, int maxX, int minZ, int maxZ, int y) {
        if (minX != maxX || minZ != maxZ) {
            for (int x = minX; x <= maxX; x++) {
                for (int z = minZ; z <= maxZ; z++) {
                    if (this.levelTileOcclusionCycles[level][x][z] == -cycle) {
                        return false;
                    }
                }
            }
            int x = (minX << 7) + 1;
            int z = (minZ << 7) + 2;
            int y0 = this.levelHeightmaps[level][minX][minZ] - y;
            if (!this.occluded(x, y0, z)) {
                return false;
            }
            int x1 = (maxX << 7) - 1;
            if (!this.occluded(x1, y0, z)) {
                return false;
            }
            int z1 = (maxZ << 7) - 1;
            if (!this.occluded(x, y0, z1)) {
                return false;
            } else return this.occluded(x1, y0, z1);
        } else if (this.tileVisible(level, minX, minZ)) {
            int x = minX << 7;
            int z = minZ << 7;
            return this.occluded(x + 1, this.levelHeightmaps[level][minX][minZ] - y, z + 1) && this.occluded(x + 128 - 1, this.levelHeightmaps[level][minX + 1][minZ] - y, z + 1) && this.occluded(x + 128 - 1, this.levelHeightmaps[level][minX + 1][minZ + 1] - y, z + 128 - 1) && this.occluded(x + 1, this.levelHeightmaps[level][minX][minZ + 1] - y, z + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "h", descriptor = "(III)Z")
    private boolean occluded(int x, int y, int z) {
        for (int i = 0; i < activeOccluderCount; i++) {
            Occlude occluder = activeOccluders[i];
            if (occluder.mode == 1) {
                int dx = occluder.minX - x;
                if (dx > 0) {
                    int minZ = (occluder.minDeltaZ * dx >> 8) + occluder.minZ;
                    int maxZ = (occluder.maxDeltaZ * dx >> 8) + occluder.maxZ;
                    int minY = (occluder.minDeltaY * dx >> 8) + occluder.minY;
                    int maxY = (occluder.maxDeltaY * dx >> 8) + occluder.maxY;
                    if (z >= minZ && z <= maxZ && y >= minY && y <= maxY) {
                        return true;
                    }
                }
            } else if (occluder.mode == 2) {
                int dx = x - occluder.minX;
                if (dx > 0) {
                    int minZ = (occluder.minDeltaZ * dx >> 8) + occluder.minZ;
                    int maxZ = (occluder.maxDeltaZ * dx >> 8) + occluder.maxZ;
                    int minY = (occluder.minDeltaY * dx >> 8) + occluder.minY;
                    int maxY = (occluder.maxDeltaY * dx >> 8) + occluder.maxY;
                    if (z >= minZ && z <= maxZ && y >= minY && y <= maxY) {
                        return true;
                    }
                }
            } else if (occluder.mode == 3) {
                int dz = occluder.minZ - z;
                if (dz > 0) {
                    int minX = (occluder.minDeltaX * dz >> 8) + occluder.minX;
                    int maxX = (occluder.maxDeltaX * dz >> 8) + occluder.maxX;
                    int minY = (occluder.minDeltaY * dz >> 8) + occluder.minY;
                    int maxY = (occluder.maxDeltaY * dz >> 8) + occluder.maxY;
                    if (x >= minX && x <= maxX && y >= minY && y <= maxY) {
                        return true;
                    }
                }
            } else if (occluder.mode == 4) {
                int dz = z - occluder.minZ;
                if (dz > 0) {
                    int minX = (occluder.minDeltaX * dz >> 8) + occluder.minX;
                    int maxX = (occluder.maxDeltaX * dz >> 8) + occluder.maxX;
                    int minY = (occluder.minDeltaY * dz >> 8) + occluder.minY;
                    int maxY = (occluder.maxDeltaY * dz >> 8) + occluder.maxY;
                    if (x >= minX && x <= maxX && y >= minY && y <= maxY) {
                        return true;
                    }
                }
            } else if (occluder.mode == 5) {
                int dy = y - occluder.minY;
                if (dy > 0) {
                    int minX = (occluder.minDeltaX * dy >> 8) + occluder.minX;
                    int maxX = (occluder.maxDeltaX * dy >> 8) + occluder.maxX;
                    int minZ = (occluder.minDeltaZ * dy >> 8) + occluder.minZ;
                    int maxZ = (occluder.maxDeltaZ * dy >> 8) + occluder.maxZ;
                    if (x >= minX && x <= maxX && z >= minZ && z <= maxZ) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(IIIIIIIII)V")
    public static void addOccluder(int minX, int maxY, int maxX, int maxZ, int level, int minZ, int minY, int type) {
        Occlude occluder = new Occlude();
        occluder.minTileX = minX / 128;
        occluder.maxTileX = maxX / 128;
        occluder.minTileZ = minZ / 128;
        occluder.maxTileZ = maxZ / 128;
        occluder.type = type;
        occluder.minX = minX;
        occluder.maxX = maxX;
        occluder.minZ = minZ;
        occluder.maxZ = maxZ;
        occluder.minY = minY;
        occluder.maxY = maxY;
        levelOccluders[level][levelOccluderCount[level]++] = occluder;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(Z)V")
    public static void reset2() {
        locBuffer = null;
        levelOccluderCount = null;
        levelOccluders = null;
        drawTileQueue = null;
        visibilityMatrix = null;
        visibilityMap = null;
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "a", descriptor = "(II[IIII)V")
    public static void init(int viewportHeight, int[] pitchDistance, int frustumEnd, int frustumStart, int viewportWidth) {
        viewportLeft = 0;
        viewportTop = 0;
        viewportRight = viewportWidth;
        viewportBottom = viewportHeight;
        viewportCenterX = viewportWidth / 2;
        viewportCenterY = viewportHeight / 2;
        boolean[][][][] matrix = new boolean[9][32][53][53];
        for (int pitch = 128; pitch <= 384; pitch += 32) {
            for (int yaw = 0; yaw < 2048; yaw += 64) {
                sinEyePitch = Model.sin[pitch];
                cosEyePitch = Model.cos[pitch];
                sinEyeYaw = Model.sin[yaw];
                cosEyeYaw = Model.cos[yaw];
                int pitchLevel = (pitch - 128) / 32;
                int yawLevel = yaw / 64;
                for (int dx = -26; dx <= 26; dx++) {
                    for (int dz = -26; dz <= 26; dz++) {
                        int x = dx * 128;
                        int z = dz * 128;
                        boolean visible = false;
                        for (int y = -frustumStart; y <= frustumEnd; y += 128) {
                            if (testPoint(z, x, field1006, pitchDistance[pitchLevel] + y)) {
                                visible = true;
                                break;
                            }
                        }
                        matrix[pitchLevel][yawLevel][dx + 25 + 1][dz + 25 + 1] = visible;
                    }
                }
            }
        }
        for (int pitchLevel = 0; pitchLevel < 8; pitchLevel++) {
            for (int yawLevel = 0; yawLevel < 32; yawLevel++) {
                for (int x = -25; x < 25; x++) {
                    for (int z = -25; z < 25; z++) {
                        boolean visible = false;
                        check_areas: for (int dx = -1; dx <= 1; dx++) {
                            for (int dz = -1; dz <= 1; dz++) {
                                if (matrix[pitchLevel][yawLevel][x + dx + 25 + 1][z + dz + 25 + 1]) {
                                    visible = true;
                                    break check_areas;
                                }
                                if (matrix[pitchLevel][(yawLevel + 1) % 31][x + dx + 25 + 1][z + dz + 25 + 1]) {
                                    visible = true;
                                    break check_areas;
                                }
                                if (matrix[pitchLevel + 1][yawLevel][x + dx + 25 + 1][z + dz + 25 + 1]) {
                                    visible = true;
                                    break check_areas;
                                }
                                if (matrix[pitchLevel + 1][(yawLevel + 1) % 31][x + dx + 25 + 1][z + dz + 25 + 1]) {
                                    visible = true;
                                    break check_areas;
                                }
                            }
                        }
                        visibilityMatrix[pitchLevel][yawLevel][x + 25][z + 25] = visible;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!KJCMXHNO", name = "f", descriptor = "(IIII)Z")
    public static boolean testPoint(int arg0, int arg1, int arg2, int arg3) {
        int var4 = cosEyeYaw * arg1 + sinEyeYaw * arg0 >> 16;
        int var5 = cosEyeYaw * arg0 - sinEyeYaw * arg1 >> 16;
        if (arg2 != 0) {
            field1001 = !field1001;
        }
        int var6 = cosEyePitch * var5 + sinEyePitch * arg3 >> 16;
        int var7 = cosEyePitch * arg3 - sinEyePitch * var5 >> 16;
        if (var6 >= 50 && var6 <= 3500) {
            int var8 = (var4 << 9) / var6 + viewportCenterX;
            int var9 = (var7 << 9) / var6 + viewportCenterY;
            return var8 >= viewportLeft && var8 <= viewportRight && var9 >= viewportTop && var9 <= viewportBottom;
        } else {
            return false;
        }
    }
}
