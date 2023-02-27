---
title: Class AsposeOcr
second_title: Aspose.OCR voor .NET API-referentie
description: Aspose.OCR.AsposeOcr klas. HoofdAPI voor Aspose OCRbibliotheek
type: docs
weight: 20
url: /nl/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

Hoofd-API voor Aspose OCR-bibliotheek

```csharp
public class AsposeOcr
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [AsposeOcr](asposeocr/#constructor)() | Initialiseert een nieuw exemplaar van het`AsposeOcr` class. Lege constructor. |
| [AsposeOcr](asposeocr/#constructor_1)(string) | Initialiseert een nieuw exemplaar van het`AsposeOcr` class. Stel de toegestane tekens in met de eigenschap alfabet. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew)(MemoryStream) | Berekent de schuine hoek van een afbeelding. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew_1)(string) | Berekent de schuine hoek van een afbeelding. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri/)(string) | Berekent de schuine hoek van een afbeelding van URI. |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts/)(string, string, RecognitionSettings, bool) | Controleer of twee afbeeldingen dezelfde tekst bevatten. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling/)(string, SpellCheckLanguage, string) | Corrigeert tekst (vervangt verkeerd gespelde woorden). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles)(MemoryStream, AreasType, bool) | Detecteert tekstgebieden op afbeelding.  Automatische correctie van scheve afbeeldingen wordt niet toegepast. Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles_1)(string, AreasType, bool) | Detecteert tekstgebieden op afbeelding.  Automatische correctie van scheve afbeeldingen wordt niet toegepast. Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext_1)(string, Regex, RecognitionSettings) | Controleer of de afbeeldingstekst overeenkomt met de opgegeven reguliere expressie. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext)(string, string, RecognitionSettings, bool) | Controleer of de afbeelding het aangeleverde tekstfragment bevat. |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff/)(string, string, RecognitionSettings, bool) | Vergelijk de teksten op de twee afbeeldingen en retourneer een getal dat aangeeft hoe vergelijkbaar ze zijn (0 tot 1). |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage)(MemoryStream, PreprocessingFilter) | Gebruik voorbewerking van afbeeldingen om de nauwkeurigheid van OCR te verbeteren. Maak een lijst met filters die worden toegepast op de invoerafbeelding in de volgorde die u opgeeft. voorbeeld om filters te maken: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; Je hebt ze niet allemaal nodig. Stel alleen in wat u nodig heeft. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage_1)(string, PreprocessingFilter) | Gebruik voorbewerking van afbeeldingen om de nauwkeurigheid van OCR te verbeteren. Maak een lijst met filters die worden toegepast op de invoerafbeelding in de volgorde die u opgeeft. voorbeeld om filters te maken: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; Je hebt ze niet allemaal nodig. Stel alleen in wat u nodig heeft. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate)(MemoryStream, CarPlateRecognitionSettings) | Herkent kentekenplaat. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate_1)(string, CarPlateRecognitionSettings) | Herkent kentekenplaat. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu)(MemoryStream, DocumentRecognitionSettings) | Herken tekst van DJVU-afbeelding met meerdere pagina's.  Herkent DJVU-bestand met de mogelijkheid om te specificeren[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Ondersteunt alleen DJVU. Ondersteunt geen andere afbeeldingstypen. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu_1)(string, DocumentRecognitionSettings) | Herken tekst van DJVU-afbeelding met meerdere pagina's.  Herkent DJVU-bestand met de mogelijkheid om te specificeren[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Ondersteunt alleen DJVU. Ondersteunt geen andere afbeeldingstypen. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard)(MemoryStream, IDCardRecognitionSettings) | Herkent tekst op identiteitskaart. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard_1)(string, IDCardRecognitionSettings) | Herkent tekst op identiteitskaart. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_4)(MemoryStream) | Herkent tekst op afbeelding. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_5)(string) | Herkent tekst op afbeelding. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_2)(MemoryStream, RecognitionSettings) | Herkent tekst op afbeelding.  Herkent afbeelding met de mogelijkheid om te specificeren[`RecognitionSettings`](../recognitionsettings/) . Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_3)(string, RecognitionSettings) | Herkent tekst op afbeelding. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage)(Color[], int, int, RecognitionSettings) | Herkent tekst op afbeelding. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_1)(byte[], int, int, PixelType, RecognitionSettings) | Herkent tekst op afbeelding. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast)(MemoryStream) | Herken tekst op de afbeelding met goede kwaliteit. Maakt geen gebruik van scheefstandcorrectie en gebiedsdetectie. Werkt in snelle modus. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast_1)(string) | Herken tekst op de afbeelding met goede kwaliteit. Maakt geen gebruik van scheefstandcorrectie en gebiedsdetectie. Werkt in snelle modus. |
| [RecognizeImageFromBase64](../../aspose.ocr/asposeocr/recognizeimagefrombase64/)(string, RecognitionSettings) | Herkent tekst op afbeelding geleverd in base64 type. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri/)(string, RecognitionSettings) | Herkent tekst op afbeelding geleverd door URI-link. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice)(MemoryStream, InvoiceRecognitionSettings) | Herkent tekst op factuurafbeelding. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice_1)(string, InvoiceRecognitionSettings) | Herkent tekst op factuurafbeelding. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline)(MemoryStream) | Herkent afbeelding die een enkele regel tekst bevat.  Automatische correctie van scheve afbeeldingen wordt niet toegepast. Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline_1)(string) | Herkent afbeelding die een enkele regel tekst bevat.  Automatische correctie van scheve afbeeldingen wordt niet toegepast. Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages)(List&lt;string&gt;) | Herkent meerdere afbeeldingen uit de lijst met standaardinstellingen.  Archieven en mappen worden niet ondersteund. Max aantal verwerkte afbeeldingen is 20. Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_2)(string) | Herkent meerdere afbeeldingen verpakt in ZIP-archief of uit map met standaardinstellingen.  Geneste archieven en mappen worden niet ondersteund. Max. aantal verwerkte afbeeldingen is 20. Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Herkent meerdere afbeeldingen uit de lijst.  Archieven en mappen worden niet ondersteund. Max aantal verwerkte afbeeldingen is 20. Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_3)(string, RecognitionSettings) | Herkent meerdere afbeeldingen verpakt in ZIP-archief of uit map.  Geneste archieven en mappen worden niet ondersteund. Max. aantal verwerkte afbeeldingen is 20. Ondersteunt GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport)(MemoryStream, PassportRecognitionSettings) | Herkent tekst op paspoorten. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport_1)(string, PassportRecognitionSettings) | Herkent tekst op paspoorten. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Tekst herkennen uit gescande pdf (afbeeldingen extraheren).  Herkent pdf-bestand met de mogelijkheid om te specificeren[`RecognitionSettings`](../recognitionsettings/) . Ondersteunt alleen gescande PDF. Ondersteunt geen doorzoekbare PDF. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf_1)(string, DocumentRecognitionSettings) | Tekst herkennen uit gescande pdf (afbeeldingen extraheren).  Herkent pdf-bestand met de mogelijkheid om te specificeren[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Ondersteunt alleen gescande PDF. Ondersteunt geen doorzoekbare PDF. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt)(MemoryStream, ReceiptRecognitionSettings) | Herkent tekst op afbeelding. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt_1)(string, ReceiptRecognitionSettings) | Herkent tekst op afbeelding. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff)(MemoryStream, DocumentRecognitionSettings) | Herken tekst van TIFF-afbeelding met meerdere pagina's.  Herkent TIFF-bestand met de mogelijkheid om te specificeren[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Ondersteunt alleen TIFF (TIF). Ondersteunt geen andere afbeeldingstypen. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff_1)(string, DocumentRecognitionSettings) | Herken tekst van TIFF-afbeelding met meerdere pagina's.  Herkent TIFF-bestand met de mogelijkheid om te specificeren[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Ondersteunt alleen TIFF (TIF). Ondersteunt geen andere afbeeldingstypen. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Maakt het mogelijk om een document met meerdere pagina's op te halen uit de lijst met RecognitionResult-objecten |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Maakt het mogelijk om een document met meerdere pagina's op te halen uit de lijst met RecognitionResult-objecten |

## Evenementen

| Naam | Beschrijving |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress/) | Een gebeurtenis om de voortgang van beeldherkenning van meerdere pagina's bij te houden. |

### Zie ook

* naamruimte [Aspose.OCR](../../aspose.ocr/)
* montage [Aspose.OCR](../../)


