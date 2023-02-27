---
title: Class InvoiceRecognitionSettings
second_title: Aspose.OCR für .NET-API-Referenz
description: Aspose.OCR.InvoiceRecognitionSettings klas. Einstellungen für die Rechnungserkennung. Enthält Elemente die eine Anpassung des Erkennungsprozesses ermöglichen.
type: docs
weight: 100
url: /de/net/aspose.ocr/invoicerecognitionsettings/
---
## InvoiceRecognitionSettings class

Einstellungen für die Rechnungserkennung. Enthält Elemente, die eine Anpassung des Erkennungsprozesses ermöglichen.

```csharp
public class InvoiceRecognitionSettings : ReceiptRecognitionSettings
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [InvoiceRecognitionSettings](invoicerecognitionsettings/)(Language) | Initialisiert eine neue Instanz von`InvoiceRecognitionSettings`Klasse mit vollständigem Satz von Eigenschaften. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/receiptrecognitionsettings/allowedcharacters/) { get; set; } | Erlaubter Zeichensatz. Legt den für das Erkennungsergebnis zulässigen Zeichentyp fest. |
| [AutoSkew](../../aspose.ocr/receiptrecognitionsettings/autoskew/) { set; } | Ruft ein Flag ab oder setzt es, das angibt, ob die automatische Korrektur der Bildneigung aktiviert werden soll. Standardmäßig aktiviert (true). |
| [IgnoredCharacters](../../aspose.ocr/receiptrecognitionsettings/ignoredcharacters/) { get; set; } | Legt eine schwarze Liste für Erkennungssymbole fest. |
| [Language](../../aspose.ocr/receiptrecognitionsettings/language/) { set; } | Ruft die für OCR verwendete Sprache ab oder legt sie fest.  Legt das während der Erkennung verwendete Alphabet fest. Standardmäßig mehrsprachig. |
| [PreprocessingFilters](../../aspose.ocr/receiptrecognitionsettings/preprocessingfilters/) { get; set; } | Ermöglicht die Vorbereitung des Bildes für OCR durch Anpassung der Vorverarbeitungsmethoden. |
| [ThreadsCount](../../aspose.ocr/receiptrecognitionsettings/threadscount/) { set; } | Ruft die Anzahl der Threads zur Verarbeitung ab oder legt sie fest. Standardmäßig bedeutet 0, dass das Bild mit der Anzahl von Threads verarbeitet wird, die Ihrer Anzahl von Prozessoren entspricht. ThreadsCount = 1 bedeutet, dass das Bild im Hauptthread verarbeitet wird. |

### Siehe auch

* class [ReceiptRecognitionSettings](../receiptrecognitionsettings/)
* namensraum [Aspose.OCR](../../aspose.ocr/)
* Montage [Aspose.OCR](../../)


