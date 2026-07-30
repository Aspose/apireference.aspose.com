---
title: "IPathSegment"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar gränssnittet för ett godtyckligt vägsegment."
type: docs
weight: 131
url: /sv/java/com.aspose.font/ipathsegment/
---
**All Implemented Interfaces:**
java.lang.Cloneable
```
public interface IPathSegment extends Cloneable
```

Representerar gränssnittet för ett godtyckligt vägsegment.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [copy()](#copy--) | Skapar en kopia av segmentobjektet. |
| [shift(double dx, double dy)](#shift-double-double-) | Utför förskjutning med x- och y-koordinater. |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | Transformerar koordinater med transformationsmatrisen. |
### copy() {#copy--}
```
public abstract IPathSegment copy()
```


Skapar en kopia av segmentobjektet.

**Returns:**
[IPathSegment](../../com.aspose.font/ipathsegment) - Copy of the segment object.
### shift(double dx, double dy) {#shift-double-double-}
```
public abstract void shift(double dx, double dy)
```


Utför förskjutning med x- och y-koordinater.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| dx | double | Värde dx. |
| dy | double | Värde dy. |

### transform(TransformationMatrix matrix) {#transform-com.aspose.font.TransformationMatrix-}
```
public abstract void transform(TransformationMatrix matrix)
```


Transformerar koordinater med transformationsmatrisen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Transformationsmatris. |

