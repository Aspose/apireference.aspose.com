---
title: AsposeOcr.GetRectangles
second_title: Aspose.OCR για Αναφορά API .NET
description: AsposeOcr μέθοδος. Ανιχνεύει περιοχές κειμένου στην εικόνα.  Δεν εφαρμόζεται αυτόματη διόρθωση λοξής εικόνας. Υποστηρίζει GIF PNG JPEG BMP TIFF JFIF.
type: docs
weight: 70
url: /el/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

Ανιχνεύει περιοχές κειμένου στην εικόνα.  Δεν εφαρμόζεται αυτόματη διόρθωση λοξής εικόνας. Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fullPath | String | Πορεία προς την εικόνα. |
| areasType | AreasType | Καθορίζει ποια ορθογώνια θα επιστρέψουν - γραμμή ή παραγράφους. |
| detectAreas | Boolean | Ενεργοποίηση αυτόματης ανίχνευσης περιοχών κειμένου. |

### Επιστρεφόμενη Αξία

Λίστα περιοχών ή γραμμών κειμένου που εντοπίστηκαν.

### Δείτε επίσης

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

Ανιχνεύει περιοχές κειμένου στην εικόνα.  Δεν εφαρμόζεται αυτόματη διόρθωση λοξής εικόνας. Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| image | MemoryStream | Ροή μνήμης που περιέχει την εικόνα. |
| areasType | AreasType | Καθορίζει ποια ορθογώνια θα επιστρέψουν - γραμμή ή παραγράφους. |
| detectAreas | Boolean | Ενεργοποίηση αυτόματης ανίχνευσης περιοχών κειμένου. |

### Επιστρεφόμενη Αξία

Λίστα περιοχών ή γραμμών κειμένου που εντοπίστηκαν.

### Δείτε επίσης

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)


