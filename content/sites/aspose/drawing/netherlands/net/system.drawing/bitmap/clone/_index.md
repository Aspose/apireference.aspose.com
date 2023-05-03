---
title: Bitmap.Clone
second_title: Aspose.Drawing voor .NET API-referentie
description: Bitmap methode. Maakt een kopie van de sectie hiervanBitmap gedefinieerd doorRectangle structure en met een opgegevenPixelFormat opsomming.
type: docs
weight: 100
url: /nl/net/system.drawing/bitmap/clone/
---
## Clone(Rectangle, PixelFormat) {#clone}

Maakt een kopie van de sectie hiervanBitmap gedefinieerd doorRectangle structure en met een opgegevenPixelFormat opsomming.

```csharp
public Bitmap Clone(Rectangle rect, PixelFormat format)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rect | Rectangle | Definieert het gedeelte hiervanBitmap kopiëren. Coördinaten zijn relatief ten opzichte hiervanBitmap. |
| format | PixelFormat | Specificeert dePixelFormat opsomming voor de bestemming Bitmap. |

### Winstwaarde

De nieuweBitmap die deze methode creëert.

### Zie ook

* struct [Rectangle](../../rectangle/)
* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* naamruimte [System.Drawing](../../bitmap/)
* montage [Aspose.Drawing](../../../)

---

## Clone(RectangleF, PixelFormat) {#clone_1}

Maakt een kopie van de sectie hiervanBitmap gedefinieerd met een opgegevenPixelFormat opsomming.

```csharp
public Bitmap Clone(RectangleF rect, PixelFormat format)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rect | RectangleF | Definieert het gedeelte hiervanBitmap kopiëren. |
| format | PixelFormat | Specificeert dePixelFormat opsomming voor de bestemmingBitmap. |

### Winstwaarde

DeBitmap die deze methode creëert.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| OutOfMemoryException | *rect* buiten de grenzen van de bronbitmap valt. |
| ArgumentException | De hoogte of breedte van*rect* is 0. |

### Zie ook

* struct [RectangleF](../../rectanglef/)
* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* naamruimte [System.Drawing](../../bitmap/)
* montage [Aspose.Drawing](../../../)


