---
title: AsposeOcr.GetRectangles
second_title: Aspose.OCR för .NET API-referens
description: AsposeOcr metod. Upptäcker textområden på bilden.  Automatisk bildskevningskorrigering tillämpas inte. Stöder GIF PNG JPEG BMP TIFF JFIF.
type: docs
weight: 70
url: /sv/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

Upptäcker textområden på bilden.  Automatisk bildskevningskorrigering tillämpas inte. Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fullPath | String | Vägen till bilden. |
| areasType | AreasType | Bestämmer vilka rektanglar som ska returneras - rad eller stycken. |
| detectAreas | Boolean | Aktivera automatisk identifiering av textområden. |

### Returvärde

Lista över upptäckta textområden eller rader.

### Se även

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

Upptäcker textområden på bilden.  Automatisk bildskevningskorrigering tillämpas inte. Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| image | MemoryStream | Minnesström som innehåller bilden. |
| areasType | AreasType | Bestämmer vilka rektanglar som ska returneras - rad eller stycken. |
| detectAreas | Boolean | Aktivera automatisk identifiering av textområden. |

### Returvärde

Lista över upptäckta textområden eller rader.

### Se även

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)


