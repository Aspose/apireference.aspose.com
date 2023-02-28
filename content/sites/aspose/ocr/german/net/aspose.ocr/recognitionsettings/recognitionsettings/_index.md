---
title: RecognitionSettings.RecognitionSettings
second_title: Aspose.OCR für .NET-API-Referenz
description: RecognitionSettings constructeur. Initialisiert eine neue Instanz vonRecognitionSettingsKlasse mit vollständigem Satz von Eigenschaften.
type: docs
weight: 10
url: /de/net/aspose.ocr/recognitionsettings/recognitionsettings/
---
## RecognitionSettings constructor

Initialisiert eine neue Instanz von[`RecognitionSettings`](../)Klasse mit vollständigem Satz von Eigenschaften.

```csharp
public RecognitionSettings(Language language = Language.None, 
    List<Rectangle> recognitionAreas = null, bool detectAreas = true, bool autoSkew = true, 
    float skewAngle = 0, bool recognizeSingleLine = false, int threshold = 0)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| language | Language | Für OCR verwendete Sprache. |
| recognitionAreas | List`1 | Bereiche für die Erkennung manuell festlegen. Standardmäßig Null - bedeutet, dass das gesamte Bild verarbeitet wird. |
| detectAreas | Boolean | Aktivieren Sie die automatische Erkennung von Textbereichen. |
| autoSkew | Boolean | Aktivieren Sie die automatische Bildschrägkorrektur. |
| skewAngle | Single | Stellen Sie den Winkel für die Bilddrehung ein. |
| recognizeSingleLine | Boolean | Für einzeilige Bilder |
| threshold | Int32 | Schwellenwert für benutzerdefinierte Bildbinarisierung |

### Siehe auch

* enum [Language](../../language/)
* class [RecognitionSettings](../)
* namensraum [Aspose.OCR](../../recognitionsettings/)
* Montage [Aspose.OCR](../../../)


