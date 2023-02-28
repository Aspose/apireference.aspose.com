---
title: Enum DetectAreasMode
second_title: Aspose.OCR för .NET API-referens
description: Aspose.OCR.DetectAreasMode uppräkning. Bestämmer typen av neurala nätverk som används för områdesdetektering.
type: docs
weight: 60
url: /sv/net/aspose.ocr/detectareasmode/
---
## DetectAreasMode enumeration

Bestämmer typen av neurala nätverk som används för områdesdetektering.

```csharp
public enum DetectAreasMode
```

### Värderingar

| namn | Värde | Beskrivning |
| --- | --- | --- |
| NONE | `0` | Upptäcker inte stycken. Bättre för ett enkelt dokument med en kolumn utan bilder. |
| DOCUMENT | `1` | Upptäcker stycken använder NN-modellen för dokument. Bättre för dokument med flera kolumner, dokument med bilder eller med andra objekt som inte är text. |
| PHOTO | `2` | Upptäcker stycken använder NN-modellen för foton. Bättre för bild med många bilder och andra objekt som inte är text. |
| COMBINE | `3` | Upptäcker stycken med text och använder sedan andra NN-modeller för att upptäcka områden inuti stycken. Bättre för bilder med komplex struktur. |
| TABLE | `4` | Upptäcker celler med text. Föredraget läge för bilder med tabellstruktur. |
| CURVED_TEXT | `5` | Upptäcker linjer och känner igen text på böjda bilder. Föredraget läge för foton av bok- och tidningssidor. |

### Anmärkningar

Används i[`RecognitionSettings`](../recognitionsettings/) för att ange vilken typ av bild du vill känna igen.

### Se även

* namnutrymme [Aspose.OCR](../../aspose.ocr/)
* hopsättning [Aspose.OCR](../../)


