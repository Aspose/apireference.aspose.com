---
title: Class BaseRecognitionSettings
second_title: Aspose.OCR für .NET-API-Referenz
description: Aspose.OCR.BaseRecognitionSettings klas. Einstellungen für die Bilderkennung. Enthält Elemente mit denen der Erkennungsprozess angepasst werden kann.
type: docs
weight: 30
url: /de/net/aspose.ocr/baserecognitionsettings/
---
## BaseRecognitionSettings class

Einstellungen für die Bilderkennung. Enthält Elemente, mit denen der Erkennungsprozess angepasst werden kann.

```csharp
public class BaseRecognitionSettings
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [BaseRecognitionSettings](baserecognitionsettings/)(Language, bool, float, int) | Initialisiert eine neue Instanz von[`RecognitionSettings`](../recognitionsettings/)Klasse mit vollständigem Satz von Eigenschaften. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | Erlaubter Zeichensatz. Legt den für das Erkennungsergebnis zulässigen Zeichentyp fest. |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | Ermöglicht die Verwendung eines zusätzlichen Kontrastkorrekturalgorithmus für das Bild vor der Erkennung. |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | Ermöglicht die Verwendung eines zusätzlichen neuronalen Netzwerks zur Verbesserung des Bildes – Reduzierung von Rauschen. Nützlich für Bilder mit Scanartefakten, Verzerrungen, Flecken, Lichtreflexen, Farbverläufen und Fremdelementen. |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | Ruft ein Flag ab oder setzt es, das angibt, ob die automatische Korrektur der Bildneigung aktiviert werden soll. Standardmäßig aktiviert (true). |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | Ermöglicht die Auswahl des optimalen Modus für Dokumenttypbereiche: Dokument, Foto, einfacher Text, Spalte, Bild. |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | Legt eine schwarze Liste für Erkennungssymbole fest. |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | Ruft die für OCR verwendete Sprache ab oder legt sie fest.  Legt das während der Erkennung verwendete Alphabet fest. Standardmäßig mehrsprachig. |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | Ermöglicht das Erkennen von Text in den Tabellen (Bereiche umgeben von Linien). |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | Ermöglicht die Vorbereitung des Bildes für OCR durch Anpassung der Vorverarbeitungsmethoden. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | Ermittelt oder legt den Winkel in Grad für die Bilddrehung fest.  Das Setzen dieses Werts deaktiviert die[`AutoSkew`](./autoskew/) -Eigenschaft, sodass die automatische Schräglagenkorrektur nicht angewendet wird. Standardmäßig Null. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | Ruft die Anzahl der Threads zur Verarbeitung ab oder legt sie fest. Standardmäßig bedeutet 0, dass das Bild mit der Anzahl von Threads verarbeitet wird, die Ihrer Anzahl von Prozessoren entspricht. ThreadsCount = 1 bedeutet, dass das Bild im Hauptthread verarbeitet wird. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | Ruft einen benutzerdefinierten Schwellenwert für die Bildbinarisierung ab oder legt ihn fest. Bereich von 1 bis 255. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | Ermöglicht die Verwendung zusätzlicher Algorithmen speziell für die Erkennung kleiner Schriften. Nützlich für Bilder mit kleinen Zeichen. |

### Siehe auch

* namensraum [Aspose.OCR](../../aspose.ocr/)
* Montage [Aspose.OCR](../../)


