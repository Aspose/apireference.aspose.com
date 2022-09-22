---
title: Warp
second_title: Aspose.Drawing für .NET-API-Referenz
description: Wendet eine durch ein Rechteck und ein Parallelogramm definierte WarpTransformation darauf anGraphicsPathsystem.drawing.drawing2d/graphicspath .
type: docs
weight: 350
url: /de/net/system.drawing.drawing2d/graphicspath/warp/
---
## Warp(PointF[], RectangleF) {#warp}

Wendet eine durch ein Rechteck und ein Parallelogramm definierte Warp-Transformation darauf an[`GraphicsPath`](../../graphicspath) .

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| destPoints | PointF[] | Ein Array vonPointF Strukturen, die ein Parallelogramm definieren, zu dem das Rechteck definiert ist*srcRect* wird transformiert. Das Array kann entweder drei oder vier Elemente enthalten. Wenn das Array drei Elemente enthält, wird die untere rechte Ecke des Parallelogramms durch die ersten drei Punkte impliziert. |
| srcRect | RectangleF | EINRectangleF das das Rechteck darstellt, das in das durch definierte Parallelogramm transformiert wird*destPoints* . |

### Siehe auch

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [GraphicsPath](../../graphicspath)
* namensraum [System.Drawing.Drawing2D](../../graphicspath)
* Montage [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix) {#warp_1}

Wendet darauf eine durch ein Rechteck und ein Parallelogramm definierte Warp-Transformation an[`GraphicsPath`](../../graphicspath).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| destPoints | PointF[] | Ein Array vonPointF Strukturen, die ein Parallelogramm definieren, zu dem das Rechteck definiert ist*srcRect* wird transformiert. Das Array kann entweder drei oder vier Elemente enthalten. Wenn das Array drei Elemente enthält, wird die untere rechte Ecke des Parallelogramms durch die ersten drei Punkte impliziert. |
| srcRect | RectangleF | EINRectangleF das das Rechteck darstellt, das in das durch definierte Parallelogramm transformiert wird*destPoints* . |
| matrix | Matrix | EIN[`Matrix`](../../matrix) die eine geometrische Transformation angibt, die auf den Pfad angewendet werden soll. |

### Siehe auch

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [Matrix](../../matrix)
* class [GraphicsPath](../../graphicspath)
* namensraum [System.Drawing.Drawing2D](../../graphicspath)
* Montage [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix, WarpMode) {#warp_2}

Wendet darauf eine durch ein Rechteck und ein Parallelogramm definierte Warp-Transformation an[`GraphicsPath`](../../graphicspath).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, WarpMode warpMode)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| destPoints | PointF[] | Ein Array vonPointF Strukturen, die ein Parallelogramm definieren, zu dem das Rechteck definiert ist*srcRect* wird transformiert. Das Array kann entweder drei oder vier Elemente enthalten. Wenn das Array drei Elemente enthält, wird die untere rechte Ecke des Parallelogramms durch die ersten drei Punkte impliziert. |
| srcRect | RectangleF | EINRectangleF das das Rechteck darstellt, das in das durch definierte Parallelogramm transformiert wird*destPoints* . |
| matrix | Matrix | EIN[`Matrix`](../../matrix) die eine geometrische Transformation angibt, die auf den Pfad angewendet werden soll. |
| warpMode | WarpMode | EIN[`WarpMode`](../../warpmode) Enumeration, die angibt, ob dieser Warp-Vorgang den perspektivischen oder den bilinearen Modus verwendet. |

### Siehe auch

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [Matrix](../../matrix)
* enum [WarpMode](../../warpmode)
* class [GraphicsPath](../../graphicspath)
* namensraum [System.Drawing.Drawing2D](../../graphicspath)
* Montage [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix, WarpMode, float) {#warp_3}

Wendet darauf eine durch ein Rechteck und ein Parallelogramm definierte Warp-Transformation an[`GraphicsPath`](../../graphicspath).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, WarpMode warpMode, 
    float flatness)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| destPoints | PointF[] | Ein Array vonPointF Strukturen, die ein Parallelogramm definieren, zu dem das Rechteck definiert ist*srcRect* wird transformiert. Das Array kann entweder drei oder vier Elemente enthalten. Wenn das Array drei Elemente enthält, wird die untere rechte Ecke des Parallelogramms durch die ersten drei Punkte impliziert. |
| srcRect | RectangleF | EINRectangleF das das Rechteck darstellt, das in das durch definierte Parallelogramm transformiert wird*destPoints* . |
| matrix | Matrix | EIN[`Matrix`](../../matrix) die eine geometrische Transformation angibt, die auf den Pfad angewendet werden soll. |
| warpMode | WarpMode | EIN[`WarpMode`](../../warpmode) Enumeration, die angibt, ob dieser Warp-Vorgang den perspektivischen oder den bilinearen Modus verwendet. |
| flatness | Single | Ein Wert zwischen 0 und 1, der angibt, wie flach der resultierende Pfad ist. Weitere Informationen finden Sie unter[`Flatten`](../flatten) Methoden. |

### Siehe auch

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [Matrix](../../matrix)
* enum [WarpMode](../../warpmode)
* class [GraphicsPath](../../graphicspath)
* namensraum [System.Drawing.Drawing2D](../../graphicspath)
* Montage [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
