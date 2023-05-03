---
title: GraphicsPath.Warp
second_title: Aspose.Drawing voor .NET API-referentie
description: GraphicsPath methode. Past hierop een vervormingstransformatie toe gedefinieerd door een rechthoek en een parallellogramGraphicsPath .
type: docs
weight: 350
url: /nl/net/system.drawing.drawing2d/graphicspath/warp/
---
## Warp(PointF[], RectangleF) {#warp}

Past hierop een vervormingstransformatie toe, gedefinieerd door een rechthoek en een parallellogram[`GraphicsPath`](../) .

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| destPoints | PointF[] | Een reeks vanPointF structuren die een parallellogram definiëren waaraan de rechthoek wordt gedefinieerd door*srcRect* wordt getransformeerd. De array kan drie of vier elementen bevatten. Als de array drie elementen bevat, wordt de rechterbenedenhoek van het parallellogram geïmpliceerd door de eerste drie punten. |
| srcRect | RectangleF | ARectangleF dat vertegenwoordigt de rechthoek die wordt getransformeerd naar het parallellogram gedefinieerd door*destPoints* . |

### Zie ook

* struct [PointF](../../../system.drawing/pointf/)
* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [GraphicsPath](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspath/)
* montage [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix) {#warp_1}

Past hierop een vervormingstransformatie toe, gedefinieerd door een rechthoek en een parallellogram[`GraphicsPath`](../).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| destPoints | PointF[] | Een reeks vanPointF structuren die een parallellogram definiëren waaraan de rechthoek wordt gedefinieerd door*srcRect* wordt getransformeerd. De array kan drie of vier elementen bevatten. Als de array drie elementen bevat, wordt de rechterbenedenhoek van het parallellogram geïmpliceerd door de eerste drie punten. |
| srcRect | RectangleF | ARectangleF dat vertegenwoordigt de rechthoek die wordt getransformeerd naar het parallellogram gedefinieerd door*destPoints* . |
| matrix | Matrix | A[`Matrix`](../../matrix/) die een geometrische transformatie specificeert die op het pad moet worden toegepast. |

### Zie ook

* struct [PointF](../../../system.drawing/pointf/)
* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspath/)
* montage [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix, WarpMode) {#warp_2}

Past hierop een vervormingstransformatie toe, gedefinieerd door een rechthoek en een parallellogram[`GraphicsPath`](../).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, WarpMode warpMode)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| destPoints | PointF[] | Een reeks vanPointF structuren die een parallellogram definiëren waaraan de rechthoek wordt gedefinieerd door*srcRect* wordt getransformeerd. De array kan drie of vier elementen bevatten. Als de array drie elementen bevat, wordt de rechterbenedenhoek van het parallellogram geïmpliceerd door de eerste drie punten. |
| srcRect | RectangleF | ARectangleF dat vertegenwoordigt de rechthoek die wordt getransformeerd naar het parallellogram gedefinieerd door*destPoints* . |
| matrix | Matrix | A[`Matrix`](../../matrix/) die een geometrische transformatie specificeert die op het pad moet worden toegepast. |
| warpMode | WarpMode | A[`WarpMode`](../../warpmode/) opsomming die specificeert of deze warp-bewerking gebruikmaakt van perspectief of bilineaire modus. |

### Zie ook

* struct [PointF](../../../system.drawing/pointf/)
* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* enum [WarpMode](../../warpmode/)
* class [GraphicsPath](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspath/)
* montage [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix, WarpMode, float) {#warp_3}

Past hierop een vervormingstransformatie toe, gedefinieerd door een rechthoek en een parallellogram[`GraphicsPath`](../).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, WarpMode warpMode, 
    float flatness)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| destPoints | PointF[] | Een reeks vanPointF structuren die een parallellogram definiëren waaraan de rechthoek wordt gedefinieerd door*srcRect* wordt getransformeerd. De array kan drie of vier elementen bevatten. Als de array drie elementen bevat, wordt de rechterbenedenhoek van het parallellogram geïmpliceerd door de eerste drie punten. |
| srcRect | RectangleF | ARectangleF dat vertegenwoordigt de rechthoek die wordt getransformeerd naar het parallellogram gedefinieerd door*destPoints* . |
| matrix | Matrix | A[`Matrix`](../../matrix/) die een geometrische transformatie specificeert die op het pad moet worden toegepast. |
| warpMode | WarpMode | A[`WarpMode`](../../warpmode/) opsomming die specificeert of deze warp-bewerking gebruikmaakt van perspectief of bilineaire modus. |
| flatness | Single | Een waarde van 0 tot en met 1 die aangeeft hoe vlak het resulterende pad is. Voor meer informatie, zie de[`Flatten`](../flatten/) methoden. |

### Zie ook

* struct [PointF](../../../system.drawing/pointf/)
* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* enum [WarpMode](../../warpmode/)
* class [GraphicsPath](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspath/)
* montage [Aspose.Drawing](../../../)


