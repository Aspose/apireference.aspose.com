---
title: XpsTileMode
second_title: Aspose.Page for Java API Reference
description: Valid values of tiling brushes TileMode property.
type: docs
weight: 64
url: /java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

Valid values of tiling brushes' TileMode property.
## Fields

| Field | Description |
| --- | --- |
| [None](#None) | In this mode, only the single base tile is drawn. |
| [Tile](#Tile) | In this mode, the base tile is drawn and the remaining area is filled by repeating the base tile such that the right edge of each tile abuts the left edge of the next, and the bottom edge of each tile abuts the top edge of the next. |
| [FlipX](#FlipX) | The tile arrangement is similar to the Tile tile mode, but alternate columns of tiles are flipped horizontally. |
| [FlipY](#FlipY) | The tile arrangement is similar to the Tile tile mode, but alternate rows of tiles are flipped vertically. |
| [FlipXY](#FlipXY) | The tile arrangement is similar to the Tile tile mode, but alternate columns of tiles are flipped horizontally and alternate rows of tiles are flipped vertically. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### None {#None}
```
public static final XpsTileMode None
```


In this mode, only the single base tile is drawn. The remaining area is left transparent.

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


In this mode, the base tile is drawn and the remaining area is filled by repeating the base tile such that the right edge of each tile abuts the left edge of the next, and the bottom edge of each tile abuts the top edge of the next.

### FlipX {#FlipX}
```
public static final XpsTileMode FlipX
```


The tile arrangement is similar to the Tile tile mode, but alternate columns of tiles are flipped horizontally. The base tile is positioned as specified by the viewport. Tiles in the columns to the left and right of this tile are flipped horizontally.

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


The tile arrangement is similar to the Tile tile mode, but alternate rows of tiles are flipped vertically. The base tile is positioned as specified by the viewport. Rows above and below are flipped vertically.

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


The tile arrangement is similar to the Tile tile mode, but alternate columns of tiles are flipped horizontally and alternate rows of tiles are flipped vertically. The base tile is positioned as specified by the viewport.

### values() {#values--}
```
public static XpsTileMode[] values()
```




**Returns:**
com.aspose.xps.XpsTileMode[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static XpsTileMode valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode)
