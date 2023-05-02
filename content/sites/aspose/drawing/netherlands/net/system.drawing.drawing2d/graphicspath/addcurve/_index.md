---
title: GraphicsPath.AddCurve
second_title: Aspose.Drawing voor .NET API-referentie
description: GraphicsPath methode. Voegt een splinecurve toe aan de huidige figuur. Er wordt een kardinale splinecurve gebruikt omdat de curve door elk van de punten in de array loopt.
type: docs
weight: 110
url: /nl/net/system.drawing.drawing2d/graphicspath/addcurve/
---
## AddCurve(Point[]) {#addcurve_3}

Voegt een spline-curve toe aan de huidige figuur. Er wordt een kardinale spline-curve gebruikt omdat de curve door elk van de punten in de array loopt.

```csharp
public void AddCurve(Point[] points)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| points | Point[] | Een reeks vanPoint structuren die de punten vertegenwoordigen die de curve definiëren. |

### Zie ook

* struct [Point](../../../system.drawing/point/)
* class [GraphicsPath](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspath/)
* montage [Aspose.Drawing](../../../)

---

## AddCurve(PointF[]) {#addcurve}

Voegt een spline-curve toe aan de huidige figuur. Er wordt een kardinale spline-curve gebruikt omdat de curve door elk van de punten in de array loopt.

```csharp
public void AddCurve(PointF[] points)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| points | PointF[] | Een reeks vanPointF structuren die de punten vertegenwoordigen die de curve definiëren. |

### Zie ook

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspath/)
* montage [Aspose.Drawing](../../../)

---

## AddCurve(PointF[], float) {#addcurve_2}

Voegt een spline-curve toe aan de huidige figuur.

```csharp
public void AddCurve(PointF[] points, float tension)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| points | PointF[] | Een reeks PointF-structuren die de punten vertegenwoordigen die de curve definiëren. |
| tension | Single | Een waarde die aangeeft hoeveel de curve buigt tussen controlepunten. Waarden groter dan 1 leveren onvoorspelbare resultaten op. |

### Zie ook

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspath/)
* montage [Aspose.Drawing](../../../)

---

## AddCurve(PointF[], int, int, float) {#addcurve_1}

Voegt een spline-curve toe aan de huidige figuur.

```csharp
public void AddCurve(PointF[] points, int offset, int numberOfSegments, float tension)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| points | PointF[] | Een reeks vanPointF structuren die de punten vertegenwoordigen die de curve definiëren. |
| offset | Int32 | De index van het element in het*points* matrix die wordt gebruikt als het eerste punt in de curve. |
| numberOfSegments | Int32 | Het aantal segmenten dat is gebruikt om de curve te tekenen. Een segment kan worden gezien als een lijn die twee punten met elkaar verbindt. |
| tension | Single | Een waarde die aangeeft hoeveel de curve buigt tussen controlepunten. Waarden groter dan 1 produceren onvoorspelbare resultaten. |

### Zie ook

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspath/)
* montage [Aspose.Drawing](../../../)


