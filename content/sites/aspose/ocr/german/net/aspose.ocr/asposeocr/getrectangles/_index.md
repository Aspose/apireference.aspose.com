---
title: AsposeOcr.GetRectangles
second_title: Aspose.OCR für .NET-API-Referenz
description: AsposeOcr methode. Erkennt Textbereiche auf dem Bild.  Die automatische Bildschrägkorrektur wird nicht angewendet. Unterstützt GIF PNG JPEG BMP TIFF JFIF.
type: docs
weight: 70
url: /de/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

Erkennt Textbereiche auf dem Bild.  Die automatische Bildschrägkorrektur wird nicht angewendet. Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fullPath | String | Pfad zum Bild. |
| areasType | AreasType | Legt fest, welche Rechtecke zurückgegeben werden sollen - Zeile oder Absätze. |
| detectAreas | Boolean | Aktivieren Sie die automatische Erkennung von Textbereichen. |

### Rückgabewert

Liste der erkannten Textbereiche oder Zeilen.

### Siehe auch

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

Erkennt Textbereiche auf dem Bild.  Die automatische Bildschrägkorrektur wird nicht angewendet. Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| image | MemoryStream | Speicherstrom, der das Bild enthält. |
| areasType | AreasType | Legt fest, welche Rechtecke zurückgegeben werden sollen - Zeile oder Absätze. |
| detectAreas | Boolean | Aktivieren Sie die automatische Erkennung von Textbereichen. |

### Rückgabewert

Liste der erkannten Textbereiche oder Zeilen.

### Siehe auch

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)


