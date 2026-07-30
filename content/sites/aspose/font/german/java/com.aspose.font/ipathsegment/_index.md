---
title: "IPathSegment"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die Schnittstelle eines beliebigen Pfadsegments dar."
type: docs
weight: 131
url: /de/java/com.aspose.font/ipathsegment/
---
**All Implemented Interfaces:**
java.lang.Cloneable
```
public interface IPathSegment extends Cloneable
```

Stellt die Schnittstelle eines beliebigen Pfadsegments dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [copy()](#copy--) | Erstellt eine Kopie des Segmentobjekts. |
| [shift(double dx, double dy)](#shift-double-double-) | Führt Verschiebung um x- und y-Koordinaten durch. |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | Transformiert Koordinaten mit der Transformationsmatrix. |
### copy() {#copy--}
```
public abstract IPathSegment copy()
```


Erstellt eine Kopie des Segmentobjekts.

**Returns:**
[IPathSegment](../../com.aspose.font/ipathsegment) - Copy of the segment object.
### shift(double dx, double dy) {#shift-double-double-}
```
public abstract void shift(double dx, double dy)
```


Führt Verschiebung um x- und y-Koordinaten durch.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dx | double | Wert dx. |
| dy | double | Wert dy. |

### transform(TransformationMatrix matrix) {#transform-com.aspose.font.TransformationMatrix-}
```
public abstract void transform(TransformationMatrix matrix)
```


Transformiert Koordinaten mit der Transformationsmatrix.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Transformationsmatrix. |

