---
title: Class AsposeOcr
second_title: Aspose.OCR för .NET API-referens
description: Aspose.OCR.AsposeOcr klass. HuvudAPI för Aspose OCRbibliotek
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
| [AsposeOcr](asposeocr/#constructor)() | Initierar en ny instans av`AsposeOcr` class. Tom konstruktor. |
| [AsposeOcr](asposeocr/#constructor_1)(string) | Initierar en ny instans av`AsposeOcr` class. Ställ in tillåtna tecken med alfabetets egenskap. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew)(MemoryStream) | Beräknar snedställningsvinkeln för en bild. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew_1)(string) | Beräknar snedställningsvinkeln för en bild. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri/)(string) | Beräknar snedställningsvinkeln för en bild från URI. |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts/)(string, string, RecognitionSettings, bool) | Kontrollera om två bilder innehåller samma text. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling/)(string, SpellCheckLanguage, string) | Rättar text (ersätter felstavade ord). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles)(MemoryStream, AreasType, bool) | Upptäcker textområden på bilden.  Automatisk bildskevningskorrigering tillämpas inte. Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles_1)(string, AreasType, bool) | Upptäcker textområden på bilden.  Automatisk bildskevningskorrigering tillämpas inte. Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext_1)(string, Regex, RecognitionSettings) | Kontrollera om bildtexten matchar det angivna reguljära uttrycket. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext)(string, string, RecognitionSettings, bool) | Kontrollera om bilden innehåller det medföljande textfragmentet. |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff/)(string, string, RecognitionSettings, bool) | Jämför texterna på de två bilderna och returnera ett tal som visar hur lika de är (0 till 1). |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage)(MemoryStream, PreprocessingFilter) | Använd bildförbearbetning för att förbättra noggrannheten i OCR. Skapa en lista med filter som kommer att tillämpas på indatabilden i den ordning du anger. exempel för att skapa filter: PreprocessingFilter filters = new PreprocessingFilter 0dIn{_ 0dIn) , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,300,000,000,000,000,000,000; ), PreprocessingFilter.Dilate() }; Du behöver inte alla. Ställ bara in det du behöver. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage_1)(string, PreprocessingFilter) | Använd bildförbearbetning för att förbättra noggrannheten i OCR. Skapa en lista med filter som kommer att tillämpas på indatabilden i den ordning du anger. exempel för att skapa filter: PreprocessingFilter filters = new PreprocessingFilter 0dIn{_ 0dIn) , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,300,000,000,000,000,000,000; ), PreprocessingFilter.Dilate() }; Du behöver inte alla. Ställ bara in det du behöver. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate)(MemoryStream, CarPlateRecognitionSettings) | Känner igen bilskylt. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate_1)(string, CarPlateRecognitionSettings) | Känner igen bilskylt. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu)(MemoryStream, DocumentRecognitionSettings) | Känna igen text från DJVU-bild på flera sidor.  Känner igen DJVU-fil med möjligheten att specificera[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Stöder endast DJVU. Stöder inte andra bildtyper. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu_1)(string, DocumentRecognitionSettings) | Känna igen text från DJVU-bild på flera sidor.  Känner igen DJVU-fil med möjligheten att specificera[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Stöder endast DJVU. Stöder inte andra bildtyper. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard)(MemoryStream, IDCardRecognitionSettings) | Känner igen text på ID-kort. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard_1)(string, IDCardRecognitionSettings) | Känner igen text på ID-kort. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_4)(MemoryStream) | Känner igen text på bild. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_5)(string) | Känner igen text på bild. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_2)(MemoryStream, RecognitionSettings) | Känner igen text på bild.  Känner igen bilden med möjligheten att specificera[`RecognitionSettings`](../recognitionsettings/) . Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_3)(string, RecognitionSettings) | Känner igen text på bild. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage)(Color[], int, int, RecognitionSettings) | Känner igen text på bild. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_1)(byte[], int, int, PixelType, RecognitionSettings) | Känner igen text på bild. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast)(MemoryStream) | Känner igen text på bilden med bra kvalitet. Använder inte skevningskorrigering och områdesdetektering. Fungerar i snabbläge. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast_1)(string) | Känner igen text på bilden med bra kvalitet. Använder inte skevningskorrigering och områdesdetektering. Fungerar i snabbläge. |
| [RecognizeImageFromBase64](../../aspose.ocr/asposeocr/recognizeimagefrombase64/)(string, RecognitionSettings) | Känner igen text på bilden som tillhandahålls i base64-typen. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri/)(string, RecognitionSettings) | Känner igen text på bild som tillhandahålls av URI-länk. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice)(MemoryStream, InvoiceRecognitionSettings) | Känner igen text på fakturabild. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice_1)(string, InvoiceRecognitionSettings) | Känner igen text på fakturabild. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline)(MemoryStream) | Känner igen bild som innehåller en rad text.  Automatisk bildskevningskorrigering tillämpas inte. Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline_1)(string) | Känner igen bild som innehåller en rad text.  Automatisk bildskevningskorrigering tillämpas inte. Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages)(List&lt;string&gt;) | Känner igen flera bilder från listan med standardinställningar.  Arkiv och mappar stöds inte. Max antal bearbetade bilder är 20. Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_2)(string) | Känner igen flera bilder packade i ZIP-arkiv eller från mapp med standardinställningar.  Kapslade arkiv och mappar stöds inte. Max antal bearbetade bilder är 20. Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Känner igen flera bilder från listan.  Arkiv och mappar stöds inte. Max antal bearbetade bilder är 20. Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_3)(string, RecognitionSettings) | Känner igen flera bilder packade i ZIP-arkiv eller från mapp.  Kapslade arkiv och mappar stöds inte. Max antal bearbetade bilder är 20. Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport)(MemoryStream, PassportRecognitionSettings) | Känner igen text på pass. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport_1)(string, PassportRecognitionSettings) | Känner igen text på pass. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Känna igen text från skannad pdf (extrahera bilder).  Känner igen pdf-fil med möjligheten att specificera[`RecognitionSettings`](../recognitionsettings/) . Stöder endast skannad PDF. Stöder inte sökbar PDF. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf_1)(string, DocumentRecognitionSettings) | Känna igen text från skannad pdf (extrahera bilder).  Känner igen pdf-fil med möjligheten att specificera[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Stöder endast skannad PDF. Stöder inte sökbar PDF. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt)(MemoryStream, ReceiptRecognitionSettings) | Känner igen text på bild. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt_1)(string, ReceiptRecognitionSettings) | Känner igen text på bild. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff)(MemoryStream, DocumentRecognitionSettings) | Känna igen text från flersidig TIFF-bild.  Känner igen TIFF-fil med möjligheten att specificera[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Stöder endast TIFF (TIF). Stöder inte andra bildtyper. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff_1)(string, DocumentRecognitionSettings) | Känna igen text från flersidig TIFF-bild.  Känner igen TIFF-fil med möjligheten att specificera[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Stöder endast TIFF (TIF). Stöder inte andra bildtyper. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Tillåter att hämta flersidigt dokument från listan över RecognitionResult-objekt |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Tillåter att hämta flersidigt dokument från listan över RecognitionResult-objekt |

## evenemang

| namn | Beskrivning |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress/) | En händelse för att spåra utvecklingen av flersidig bildigenkänning. |

### Se även

* namnutrymme [Aspose.OCR](../../aspose.ocr/)
* hopsättning [Aspose.OCR](../../)


