---
title: AsposeOcr.GetRectangles
second_title: Aspose.OCR voor .NET API-referentie
description: AsposeOcr methode. Detecteert tekstgebieden op afbeelding.  Automatische correctie van scheve afbeeldingen wordt niet toegepast. Ondersteunt GIF PNG JPEG BMP TIFF JFIF.
type: docs
weight: 70
url: /nl/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

Detecteert tekstgebieden op afbeelding.  Automatische correctie van scheve afbeeldingen wordt niet toegepast. Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fullPath | String | Pad naar de afbeelding. |
| areasType | AreasType | Bepaalt welke rechthoeken moeten worden geretourneerd - regel of alinea's. |
| detectAreas | Boolean | Schakel automatische detectie van tekstgebieden in. |

### Winstwaarde

Lijst met gedetecteerde tekstgebieden of regels.

### Zie ook

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

Detecteert tekstgebieden op afbeelding.  Automatische correctie van scheve afbeeldingen wordt niet toegepast. Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| image | MemoryStream | Geheugenstroom die de afbeelding bevat. |
| areasType | AreasType | Bepaalt welke rechthoeken moeten worden geretourneerd - regel of alinea's. |
| detectAreas | Boolean | Schakel automatische detectie van tekstgebieden in. |

### Winstwaarde

Lijst met gedetecteerde tekstgebieden of regels.

### Zie ook

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)


