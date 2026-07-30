---
title: "IGlyphOutlinePainter"
second_title: "Aspose.Font für Java API-Referenz"
description: "Definiert eine Umriss-Methode zum Zeichnen von Glyphen."
type: docs
weight: 128
url: /de/java/com.aspose.font/iglyphoutlinepainter/
---
**All Implemented Interfaces:**
[com.aspose.font.IGlyphPainter](../../com.aspose.font/iglyphpainter)
```
public interface IGlyphOutlinePainter extends IGlyphPainter
```

Definiert eine Umriss-Methode zum Zeichnen von Glyphen.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [closePath()](#closePath--) | Verarbeitet ClosePath-Operation. |
| [curveTo(CurveTo curveTo)](#curveTo-com.aspose.font.CurveTo-) | Verarbeitet CurveTo-Operation. |
| [lineTo(LineTo lineTo)](#lineTo-com.aspose.font.LineTo-) | Verarbeitet LineTo-Operation. |
| [moveTo(MoveTo moveTo)](#moveTo-com.aspose.font.MoveTo-) | Führt MoveTo-Operation aus. |
### closePath() {#closePath--}
```
public abstract void closePath()
```


Verarbeitet ClosePath-Operation.

### curveTo(CurveTo curveTo) {#curveTo-com.aspose.font.CurveTo-}
```
public abstract void curveTo(CurveTo curveTo)
```


Verarbeitet CurveTo-Operation.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| curveTo | [CurveTo](../../com.aspose.font/curveto) | CurveTo-Referenz |

### lineTo(LineTo lineTo) {#lineTo-com.aspose.font.LineTo-}
```
public abstract void lineTo(LineTo lineTo)
```


Verarbeitet LineTo-Operation.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lineTo | [LineTo](../../com.aspose.font/lineto) | LineTo-Referenz |

### moveTo(MoveTo moveTo) {#moveTo-com.aspose.font.MoveTo-}
```
public abstract void moveTo(MoveTo moveTo)
```


Führt MoveTo-Operation aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| moveTo | [MoveTo](../../com.aspose.font/moveto) | MoveTo-Referenz |

