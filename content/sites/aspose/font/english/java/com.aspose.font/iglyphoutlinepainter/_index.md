---
title: IGlyphOutlinePainter
second_title: Aspose.Font for Java API Reference
description: Defines a outline way to draw glyphs.
type: docs
weight: 106
url: /java/com.aspose.font/iglyphoutlinepainter/
---
**All Implemented Interfaces:**
[com.aspose.font.IGlyphPainter](../../com.aspose.font/iglyphpainter)
```
public interface IGlyphOutlinePainter extends IGlyphPainter
```

Defines a outline way to draw glyphs.
## Methods

| Method | Description |
| --- | --- |
| [moveTo(MoveTo moveTo)](#moveTo-com.aspose.font.MoveTo-) | Processes MoveTo operation. |
| [lineTo(LineTo lineTo)](#lineTo-com.aspose.font.LineTo-) | Processes LineTo operation. |
| [curveTo(CurveTo curveTo)](#curveTo-com.aspose.font.CurveTo-) | Processes CurveTo operation. |
| [closePath()](#closePath--) | Processes ClosePath operation. |
### moveTo(MoveTo moveTo) {#moveTo-com.aspose.font.MoveTo-}
```
public abstract void moveTo(MoveTo moveTo)
```


Processes MoveTo operation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| moveTo | [MoveTo](../../com.aspose.font/moveto) | MoveTo reference |

### lineTo(LineTo lineTo) {#lineTo-com.aspose.font.LineTo-}
```
public abstract void lineTo(LineTo lineTo)
```


Processes LineTo operation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lineTo | [LineTo](../../com.aspose.font/lineto) | LineTo reference |

### curveTo(CurveTo curveTo) {#curveTo-com.aspose.font.CurveTo-}
```
public abstract void curveTo(CurveTo curveTo)
```


Processes CurveTo operation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| curveTo | [CurveTo](../../com.aspose.font/curveto) | CurveTo reference |

### closePath() {#closePath--}
```
public abstract void closePath()
```


Processes ClosePath operation.

