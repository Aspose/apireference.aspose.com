---
title: AsposeOcr
second_title: Aspose.OCR für .NET-API-Referenz
description: Haupt-API für Aspose OCR-Bibliothek
type: docs
weight: 20
url: /de/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

Haupt-API für Aspose OCR-Bibliothek

```csharp
public class AsposeOcr
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [AsposeOcr](asposeocr#constructor)() | Initialisiert eine neue Instanz von[`AsposeOcr`](../asposeocr) class. Leerer Konstruktor. |
| [AsposeOcr](asposeocr#constructor_1)(string) | Initialisiert eine neue Instanz von[`AsposeOcr`](../asposeocr) class. Legen Sie die zulässigen Zeichen mit der Alphabet-Eigenschaft fest. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew)(MemoryStream) | Berechnet den Neigungswinkel eines Bildes. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew_1)(string) | Berechnet den Neigungswinkel eines Bildes. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri)(string) | Berechnet den Neigungswinkel eines Bildes aus URI. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling)(string, SpellCheckLanguage, string) | Korrigiert Text (ersetzt falsch geschriebene Wörter). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles)(MemoryStream, AreasType, bool) | Erkennt Textbereiche auf dem Bild.  Die automatische Bildschrägkorrektur wird nicht angewendet. Unterstützt GIF, PNG, JPEG, BMP, TIFF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles_1)(string, AreasType, bool) | Erkennt Textbereiche auf dem Bild.  Die automatische Bildschrägkorrektur wird nicht angewendet. Unterstützt GIF, PNG, JPEG, BMP, TIFF. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage)(MemoryStream, PreprocessingFilter) | Verwenden Sie die Bildvorverarbeitung, um die Genauigkeit von OCR zu verbessern. Erstellen Sie eine Liste von Filtern, die in der von Ihnen angegebenen Reihenfolge auf das Eingabebild angewendet werden. Beispiel zum Erstellen von Filtern: PreprocessingFilter-Filter = neuer PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; Sie brauchen nicht alle. Stellen Sie nur das ein, was Sie brauchen. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage_1)(string, PreprocessingFilter) | Verwenden Sie die Bildvorverarbeitung, um die Genauigkeit von OCR zu verbessern. Erstellen Sie eine Liste von Filtern, die in der von Ihnen angegebenen Reihenfolge auf das Eingabebild angewendet werden. Beispiel zum Erstellen von Filtern: PreprocessingFilter-Filter = neuer PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; Sie brauchen nicht alle. Stellen Sie nur das ein, was Sie brauchen. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu)(string, DocumentRecognitionSettings) | Text aus mehrseitigem DJVU-Bild erkennen.  Erkennt DJVU-Datei mit der Fähigkeit zur Angabe[`DocumentRecognitionSettings`](../documentrecognitionsettings) . Unterstützt nur DJVU. Unterstützt keine anderen Bildtypen. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_4)(MemoryStream) | Erkennt Text auf dem Bild. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_6)(string) | Erkennt Text auf dem Bild. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage)(MemoryStream, RecognitionSettings) | Erkennt Text auf dem Bild.  Erkennt Bild mit der Fähigkeit zur Angabe[`RecognitionSettings`](../recognitionsettings) . Unterstützt GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_1)(string, RecognitionSettings) | Erkennt Text auf dem Bild. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast)(MemoryStream) | Text auf dem Bild in guter Qualität erkennen. Verwendet keine Schräglagenkorrektur und Bereichserkennung. Funktioniert im schnellen Modus. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast_1)(string) | Text auf dem Bild in guter Qualität erkennen. Verwendet keine Schräglagenkorrektur und Bereichserkennung. Funktioniert im schnellen Modus. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri_1)(string) | Erkennt Text auf einem Bild, das von einem URI-Link bereitgestellt wird. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri)(string, RecognitionSettings) | Erkennt Text auf einem Bild, das von einem URI-Link bereitgestellt wird. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline)(MemoryStream) | Erkennt Bilder, die eine einzelne Textzeile enthalten.  Die automatische Bildschrägkorrektur wird nicht angewendet. Unterstützt GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline_1)(string) | Erkennt Bilder, die eine einzelne Textzeile enthalten.  Die automatische Bildschrägkorrektur wird nicht angewendet. Unterstützt GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages)(List&lt;string&gt;) | Erkennt mehrere Bilder aus der Liste mit Standardeinstellungen.  Archive und Ordner werden nicht unterstützt. Maximal 20 verarbeitete Bilder. Unterstützt GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_2)(string) | Erkennt mehrere Bilder, die in einem ZIP-Archiv oder aus einem Ordner mit Standardeinstellungen gepackt sind.  Verschachtelte Archive und Ordner werden nicht unterstützt. Maximal 20 verarbeitete Bilder. Unterstützt GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Erkennt mehrere Bilder aus der Liste.  Archive und Ordner werden nicht unterstützt. Maximal 20 verarbeitete Bilder. Unterstützt GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_3)(string, RecognitionSettings) | Erkennt mehrere Bilder, die in einem ZIP-Archiv oder aus einem Ordner gepackt sind.  Verschachtelte Archive und Ordner werden nicht unterstützt. Maximal 20 verarbeitete Bilder. Unterstützt GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Text aus gescanntem PDF erkennen (Bilder extrahieren).  Erkennt eine PDF-Datei mit der Möglichkeit zur Angabe[`RecognitionSettings`](../recognitionsettings) . Unterstützt nur gescannte PDFs. Unterstützt kein durchsuchbares PDF. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf_1)(string, DocumentRecognitionSettings) | Text aus gescanntem PDF erkennen (Bilder extrahieren).  Erkennt eine PDF-Datei mit der Möglichkeit zur Angabe[`RecognitionSettings`](../recognitionsettings) . Unterstützt nur gescannte PDFs. Unterstützt kein durchsuchbares PDF. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff)(string, DocumentRecognitionSettings) | Text aus mehrseitigem TIFF-Bild erkennen.  Erkennt TIFF-Datei mit der Fähigkeit zur Angabe[`DocumentRecognitionSettings`](../documentrecognitionsettings) . Unterstützt nur TIFF (TIF). Unterstützt keine anderen Bildtypen. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Ermöglicht das Abrufen eines mehrseitigen Dokuments aus der Liste der RecognitionResult-Objekte |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Ermöglicht das Abrufen eines mehrseitigen Dokuments aus der Liste der RecognitionResult-Objekte |

### Siehe auch

* namensraum [Aspose.OCR](../../aspose.ocr)
* Montage [Aspose.OCR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
