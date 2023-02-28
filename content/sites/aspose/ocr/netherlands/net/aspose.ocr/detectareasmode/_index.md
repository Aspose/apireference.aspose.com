---
title: Enum DetectAreasMode
second_title: Aspose.OCR voor .NET API-referentie
description: Aspose.OCR.DetectAreasMode opsomming. Bepaalt het type neuraal netwerk dat wordt gebruikt voor gebiedsdetectie.
type: docs
weight: 60
url: /nl/net/aspose.ocr/detectareasmode/
---
## DetectAreasMode enumeration

Bepaalt het type neuraal netwerk dat wordt gebruikt voor gebiedsdetectie.

```csharp
public enum DetectAreasMode
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| NONE | `0` | Detecteert geen alinea's. Beter voor een eenvoudig document met één kolom zonder afbeeldingen. |
| DOCUMENT | `1` | Detecteert alinea's gebruikt NN-model voor documenten. Beter voor documenten met meerdere kolommen, documenten met afbeeldingen of andere niet-tekstobjecten. |
| PHOTO | `2` | Detecteert alinea's gebruikt NN-model voor foto's. Beter voor afbeeldingen met veel afbeeldingen en andere niet-tekstuele objecten. |
| COMBINE | `3` | Detecteert alinea's met tekst en gebruikt vervolgens een ander NN-model om gebieden binnen alinea's te detecteren. Beter voor afbeeldingen met een complexe structuur. |
| TABLE | `4` | Detecteert cellen met tekst. Voorkeursmodus voor afbeeldingen met tabelstructuur. |
| CURVED_TEXT | `5` | Detecteert lijnen en herkent tekst op gebogen afbeeldingen. Voorkeursmodus voor foto's van boek- en tijdschriftpagina's. |

### Opmerkingen

Gebruikt in de[`RecognitionSettings`](../recognitionsettings/) om aan te geven welk type afbeelding u wilt herkennen.

### Zie ook

* naamruimte [Aspose.OCR](../../aspose.ocr/)
* montage [Aspose.OCR](../../)


