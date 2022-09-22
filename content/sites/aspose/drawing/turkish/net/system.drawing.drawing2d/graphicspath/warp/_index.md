---
title: Warp
second_title: Aspose.Drawing for .NET API Referansı
description: Buna bir dikdörtgen ve bir paralelkenar ile tanımlanan bir çarpıtma dönüşümü uygular.GraphicsPathsystem.drawing.drawing2d/graphicspath .
type: docs
weight: 350
url: /tr/net/system.drawing.drawing2d/graphicspath/warp/
---
## Warp(PointF[], RectangleF) {#warp}

Buna bir dikdörtgen ve bir paralelkenar ile tanımlanan bir çarpıtma dönüşümü uygular.[`GraphicsPath`](../../graphicspath) .

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| destPoints | PointF[] | Bir diziPointF tarafından tanımlanan dikdörtgenin bir paralelkenarı tanımlayan yapılar*srcRect* dönüştürülür. Dizi, üç veya dört eleman içerebilir. Dizi üç öğe içeriyorsa, paralelkenarın sağ alt köşesi ilk üç nokta tarafından belirtilir. |
| srcRect | RectangleF | ARectangleF tarafından tanımlanan paralelkenara dönüştürülen dikdörtgeni temsil eden*destPoints* . |

### Ayrıca bakınız

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [GraphicsPath](../../graphicspath)
* ad alanı [System.Drawing.Drawing2D](../../graphicspath)
* toplantı [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix) {#warp_1}

Buna bir dikdörtgen ve bir paralelkenar ile tanımlanan bir çarpıtma dönüşümü uygular.[`GraphicsPath`](../../graphicspath).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| destPoints | PointF[] | Bir diziPointF tarafından tanımlanan dikdörtgenin bir paralelkenarı tanımlayan yapılar*srcRect* dönüştürülür. Dizi, üç veya dört eleman içerebilir. Dizi üç öğe içeriyorsa, paralelkenarın sağ alt köşesi ilk üç nokta tarafından belirtilir. |
| srcRect | RectangleF | ARectangleF tarafından tanımlanan paralelkenara dönüştürülen dikdörtgeni temsil eden*destPoints* . |
| matrix | Matrix | A[`Matrix`](../../matrix) bu, yola uygulanacak bir geometrik dönüşümü belirtir. |

### Ayrıca bakınız

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [Matrix](../../matrix)
* class [GraphicsPath](../../graphicspath)
* ad alanı [System.Drawing.Drawing2D](../../graphicspath)
* toplantı [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix, WarpMode) {#warp_2}

Buna bir dikdörtgen ve bir paralelkenar ile tanımlanan bir çarpıtma dönüşümü uygular.[`GraphicsPath`](../../graphicspath).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, WarpMode warpMode)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| destPoints | PointF[] | Bir diziPointF tarafından tanımlanan dikdörtgenin bir paralelkenarı tanımlayan yapılar*srcRect* dönüştürülür. Dizi, üç veya dört öğe içerebilir. Dizi üç öğe içeriyorsa, paralelkenarın sağ alt köşesi ilk üç nokta tarafından belirtilir. |
| srcRect | RectangleF | ARectangleF tarafından tanımlanan paralelkenara dönüştürülen dikdörtgeni temsil eden*destPoints* . |
| matrix | Matrix | A[`Matrix`](../../matrix) bu, yola uygulanacak bir geometrik dönüşümü belirtir. |
| warpMode | WarpMode | A[`WarpMode`](../../warpmode) Bu çarpıtma işleminin perspektif mi yoksa çift doğrusal mod mu kullandığını belirten numaralandırma. |

### Ayrıca bakınız

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [Matrix](../../matrix)
* enum [WarpMode](../../warpmode)
* class [GraphicsPath](../../graphicspath)
* ad alanı [System.Drawing.Drawing2D](../../graphicspath)
* toplantı [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix, WarpMode, float) {#warp_3}

Buna bir dikdörtgen ve bir paralelkenar ile tanımlanan bir çarpıtma dönüşümü uygular.[`GraphicsPath`](../../graphicspath).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, WarpMode warpMode, 
    float flatness)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| destPoints | PointF[] | Bir diziPointF tarafından tanımlanan dikdörtgenin bir paralelkenarı tanımlayan yapılar*srcRect* dönüştürülür. Dizi, üç veya dört öğe içerebilir. Dizi üç öğe içeriyorsa, paralelkenarın sağ alt köşesi ilk üç nokta tarafından belirtilir. |
| srcRect | RectangleF | ARectangleF tarafından tanımlanan paralelkenara dönüştürülen dikdörtgeni temsil eden*destPoints* . |
| matrix | Matrix | A[`Matrix`](../../matrix) bu, yola uygulanacak bir geometrik dönüşümü belirtir. |
| warpMode | WarpMode | A[`WarpMode`](../../warpmode) Bu çarpıtma işleminin perspektif mi yoksa çift doğrusal mod mu kullandığını belirten numaralandırma. |
| flatness | Single | Ortaya çıkan yolun ne kadar düz olduğunu belirten 0 ile 1 arasında bir değer. Daha fazla bilgi için bkz.[`Flatten`](../flatten) yöntemler. |

### Ayrıca bakınız

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [Matrix](../../matrix)
* enum [WarpMode](../../warpmode)
* class [GraphicsPath](../../graphicspath)
* ad alanı [System.Drawing.Drawing2D](../../graphicspath)
* toplantı [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
