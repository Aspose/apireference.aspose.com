---
title: Enum DetectAreasMode
second_title: Aspose.OCR für .NET-API-Referenz
description: Aspose.OCR.DetectAreasMode opsomming. Bestimmt den Typ des neuronalen Netzwerks das für die Bereichserkennung verwendet wird.
type: docs
weight: 60
url: /de/net/aspose.ocr/detectareasmode/
---
## DetectAreasMode enumeration

Bestimmt den Typ des neuronalen Netzwerks, das für die Bereichserkennung verwendet wird.

```csharp
public enum DetectAreasMode
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| NONE | `0` | Erkennt keine Absätze. Besser für ein einfaches einspaltiges Dokument ohne Bilder. |
| DOCUMENT | `1` | Erkennt Absätze und verwendet das NN-Modell für Dokumente. Besser für mehrspaltige Dokumente, Dokumente mit Bildern oder anderen Nicht-Text-Objekten. |
| PHOTO | `2` | Erkennt Absätze und verwendet NN-Modell für Fotos. Besser für Bilder mit vielen Bildern und anderen Nicht-Text-Objekten. |
| COMBINE | `3` | Erkennt Absätze mit Text und verwendet dann ein anderes NN-Modell, um Bereiche innerhalb von Absätzen zu erkennen. Besser für Bilder mit komplexer Struktur. |
| TABLE | `4` | Erkennt Zellen mit Text. Bevorzugter Modus für Bilder mit Tabellenstruktur. |
| CURVED_TEXT | `5` | Erkennt Linien und Text auf gekrümmten Bildern. Bevorzugter Modus für Fotos von Buch- und Zeitschriftenseiten. |

### Bemerkungen

Verwendet in der[`RecognitionSettings`](../recognitionsettings/) um anzugeben, welche Art von Bild Sie erkennen möchten.

### Siehe auch

* namensraum [Aspose.OCR](../../aspose.ocr/)
* Montage [Aspose.OCR](../../)


