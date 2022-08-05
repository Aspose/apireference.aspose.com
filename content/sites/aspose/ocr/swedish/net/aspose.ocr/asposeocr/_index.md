---
title: AsposeOcr
second_title: Aspose.OCR för .NET API-referens
description: Huvud-API för Aspose OCR-bibliotek
type: docs
weight: 20
url: /sv/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

Huvud-API för Aspose OCR-bibliotek

```csharp
public class AsposeOcr
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [AsposeOcr](asposeocr#constructor)() | Initierar en ny instans av[`AsposeOcr`](../asposeocr) class. Tom konstruktor. |
| [AsposeOcr](asposeocr#constructor_1)(string) | Initierar en ny instans av[`AsposeOcr`](../asposeocr) class. Ställ in tillåtna tecken med alfabetets egenskap. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew)(MemoryStream) | Beräknar snedställningsvinkeln för en bild. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew_1)(string) | Beräknar snedställningsvinkeln för en bild. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri)(string) | Beräknar snedställningsvinkeln för en bild från URI. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling)(string, SpellCheckLanguage, string) | Rättar text (ersätter felstavade ord). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles)(MemoryStream, AreasType, bool) | Upptäcker textområden på bilden.  Automatisk snedställningskorrigering tillämpas inte. Stöd GIF, PNG, JPEG, BMP, TIFF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles_1)(string, AreasType, bool) | Upptäcker textområden på bilden.  Automatisk snedställningskorrigering tillämpas inte. Stöd GIF, PNG, JPEG, BMP, TIFF. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage)(MemoryStream, PreprocessingFilter) | Använd bildförbearbetning för att förbättra noggrannheten i OCR. Skapa en lista med filter som kommer att tillämpas på indatabilden i den ordning du anger. exempel för att skapa filter: PreprocessingFilter filters = new PreprocessingFilter 0dIn { 0dIn , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000,000,000,000,000,000,000,000,000,000,0000,000,000,0000,0000,0000,000,0000,0000 ), PreprocessingFilter.Dilate() }; Du behöver inte alla. Ställ bara in det du behöver. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage_1)(string, PreprocessingFilter) | Använd bildförbearbetning för att förbättra noggrannheten i OCR. Skapa en lista med filter som kommer att tillämpas på indatabilden i den ordning du anger. exempel för att skapa filter: PreprocessingFilter filters = new PreprocessingFilter 0dIn { 0dIn , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000,000,000,000,000,000,000,000,000,000,0000,000,000,0000,0000,0000,000,0000,0000 ), PreprocessingFilter.Dilate() }; Du behöver inte alla. Ställ bara in det du behöver. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu)(string, DocumentRecognitionSettings) | Känna igen text från DJVU-bild på flera sidor.  Känner igen DJVU-fil med möjligheten att specificera[`DocumentRecognitionSettings`](../documentrecognitionsettings) . Stöder endast DJVU. Stöder inte andra bildtyper. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_4)(MemoryStream) | Känner igen text på bild. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_6)(string) | Känner igen text på bild. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage)(MemoryStream, RecognitionSettings) | Känner igen text på bild.  Känner igen bilden med möjligheten att specificera[`RecognitionSettings`](../recognitionsettings) . Stöder GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_1)(string, RecognitionSettings) | Känner igen text på bild. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast)(MemoryStream) | Känner igen text på bilden med bra kvalitet. Använder inte skevningskorrigering och områdesdetektering. Fungerar i snabbläge. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast_1)(string) | Känner igen text på bilden med bra kvalitet. Använder inte skevningskorrigering och områdesdetektering. Fungerar i snabbläge. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri_1)(string) | Känner igen text på bild från URI-länken. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri)(string, RecognitionSettings) | Känner igen text på bild som tillhandahålls av URI-länk. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline)(MemoryStream) | Känner igen bild som innehåller en rad text.  Automatisk bildskevningskorrigering tillämpas inte. Stöder GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline_1)(string) | Känner igen bild som innehåller en rad text.  Automatisk bildskevningskorrigering tillämpas inte. Stöder GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages)(List&lt;string&gt;) | Känner igen flera bilder från listan med standardinställningar.  Arkiv och mappar stöds inte. Max antal bearbetade bilder är 20. Stöder GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_2)(string) | Känner igen flera bilder packade i ZIP-arkiv eller från mapp med standardinställningar.  Kapslade arkiv och mappar stöds inte. Max antal bearbetade bilder är 20. Stöder GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Känner igen flera bilder från listan.  Arkiv och mappar stöds inte. Max antal bearbetade bilder är 20. Stöder GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_3)(string, RecognitionSettings) | Känner igen flera bilder packade i ZIP-arkiv eller från mapp.  Kapslade arkiv och mappar stöds inte. Max antal bearbetade bilder är 20. Stöder GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Känna igen text från skannad pdf (extrahera bilder).  Känner igen pdf-fil med möjligheten att specificera[`RecognitionSettings`](../recognitionsettings) . Stöder endast skannad PDF. Stöder inte sökbar PDF. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf_1)(string, DocumentRecognitionSettings) | Känna igen text från skannad pdf (extrahera bilder).  Känner igen pdf-fil med möjligheten att specificera[`RecognitionSettings`](../recognitionsettings) . Stöder endast skannad PDF. Stöder inte sökbar PDF. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff)(string, DocumentRecognitionSettings) | Känna igen text från flersidig TIFF-bild.  Känner igen TIFF-fil med möjligheten att specificera[`DocumentRecognitionSettings`](../documentrecognitionsettings) . Stöder endast TIFF (TIF). Stöder inte andra bildtyper. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Tillåter att hämta flersidigt dokument från listan över RecognitionResult-objekt |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Tillåter att hämta flersidigt dokument från listan över RecognitionResult-objekt |

### Se även

* namnutrymme [Aspose.OCR](../../aspose.ocr)
* hopsättning [Aspose.OCR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
