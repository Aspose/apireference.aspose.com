---
title: Class AsposeOcr
second_title: Aspose.OCR per Riferimento API .NET
description: Aspose.OCR.AsposeOcr classe. API principale per la libreria Aspose OCR
type: docs
weight: 20
url: /it/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

API principale per la libreria Aspose OCR

```csharp
public class AsposeOcr
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [AsposeOcr](asposeocr/#constructor)() | Inizializza una nuova istanza di`AsposeOcr` class. Costruttore vuoto. |
| [AsposeOcr](asposeocr/#constructor_1)(string) | Inizializza una nuova istanza di`AsposeOcr` class. Imposta i caratteri consentiti con la proprietà alphabet. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew)(MemoryStream) | Calcola l'angolo di inclinazione di un'immagine. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew_1)(string) | Calcola l'angolo di inclinazione di un'immagine. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri/)(string) | Calcola l'angolo di inclinazione di un'immagine dall'URI. |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts/)(string, string, RecognitionSettings, bool) | Controlla se due immagini contengono lo stesso testo. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling/)(string, SpellCheckLanguage, string) | Corregge il testo (sostituisce le parole errate). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles)(MemoryStream, AreasType, bool) | Rileva aree di testo sull'immagine.  La correzione automatica dell'inclinazione dell'immagine non viene applicata. Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles_1)(string, AreasType, bool) | Rileva aree di testo sull'immagine.  La correzione automatica dell'inclinazione dell'immagine non viene applicata. Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext_1)(string, Regex, RecognitionSettings) | Controlla se il testo dell'immagine corrisponde all'espressione regolare fornita. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext)(string, string, RecognitionSettings, bool) | Controlla se l'immagine contiene il frammento di testo fornito. |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff/)(string, string, RecognitionSettings, bool) | Confronta i testi sulle due immagini e restituisci un numero che rappresenta quanto sono simili (da 0 a 1). |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage)(MemoryStream, PreprocessingFilter) | Utilizza la preelaborazione dell'immagine per migliorare la precisione dell'OCR. Crea un elenco di filtri che verranno applicati all'immagine di input nell'ordine specificato. esempio per creare filtri: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; Non ti servono tutti. Imposta solo ciò di cui hai bisogno. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage_1)(string, PreprocessingFilter) | Utilizza la preelaborazione dell'immagine per migliorare la precisione dell'OCR. Crea un elenco di filtri che verranno applicati all'immagine di input nell'ordine specificato. esempio per creare filtri: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; Non ti servono tutti. Imposta solo ciò di cui hai bisogno. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate)(MemoryStream, CarPlateRecognitionSettings) | Riconosce la targa dell'auto. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate_1)(string, CarPlateRecognitionSettings) | Riconosce la targa dell'auto. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu)(MemoryStream, DocumentRecognitionSettings) | Riconosci il testo dall'immagine DJVU multipagina.  Riconosce il file DJVU con la possibilità di specificare[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Supporta solo DJVU. Non supporta altri tipi di immagine. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu_1)(string, DocumentRecognitionSettings) | Riconosci il testo dall'immagine DJVU multipagina.  Riconosce il file DJVU con la possibilità di specificare[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Supporta solo DJVU. Non supporta altri tipi di immagine. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard)(MemoryStream, IDCardRecognitionSettings) | Riconosce il testo sulla carta d'identità. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard_1)(string, IDCardRecognitionSettings) | Riconosce il testo sulla carta d'identità. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_4)(MemoryStream) | Riconosce il testo sull'immagine. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_5)(string) | Riconosce il testo sull'immagine. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_2)(MemoryStream, RecognitionSettings) | Riconosce il testo sull'immagine.  Riconosce l'immagine con la possibilità di specificare[`RecognitionSettings`](../recognitionsettings/) . Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_3)(string, RecognitionSettings) | Riconosce il testo sull'immagine. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage)(Color[], int, int, RecognitionSettings) | Riconosce il testo sull'immagine. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_1)(byte[], int, int, PixelType, RecognitionSettings) | Riconosce il testo sull'immagine. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast)(MemoryStream) | Riconosci il testo sull'immagine con una buona qualità. Non utilizza la correzione dell'inclinazione e il rilevamento delle aree. Funziona in modalità veloce. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast_1)(string) | Riconosci il testo sull'immagine con una buona qualità. Non utilizza la correzione dell'inclinazione e il rilevamento delle aree. Funziona in modalità veloce. |
| [RecognizeImageFromBase64](../../aspose.ocr/asposeocr/recognizeimagefrombase64/)(string, RecognitionSettings) | Riconosce il testo sull'immagine fornito nel tipo base64. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri/)(string, RecognitionSettings) | Riconosce il testo sull'immagine fornita dal collegamento URI. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice)(MemoryStream, InvoiceRecognitionSettings) | Riconosce il testo sull'immagine della fattura. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice_1)(string, InvoiceRecognitionSettings) | Riconosce il testo sull'immagine della fattura. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline)(MemoryStream) | Riconosce l'immagine che contiene una singola riga di testo.  La correzione automatica dell'inclinazione dell'immagine non viene applicata. Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline_1)(string) | Riconosce l'immagine che contiene una singola riga di testo.  La correzione automatica dell'inclinazione dell'immagine non viene applicata. Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages)(List&lt;string&gt;) | Riconosce più immagini dall'elenco con le impostazioni predefinite.  Gli archivi e le cartelle non sono supportati. La quantità massima di immagini elaborate è 20. Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_2)(string) | Riconosce più immagini compresse nell'archivio ZIP o dalla cartella con le impostazioni predefinite.  Gli archivi e le cartelle nidificati non sono supportati. La quantità massima di immagini elaborate è 20. Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Riconosce più immagini dall'elenco.  Gli archivi e le cartelle non sono supportati. La quantità massima di immagini elaborate è 20. Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_3)(string, RecognitionSettings) | Riconosce più immagini compresse nell'archivio ZIP o dalla cartella.  Gli archivi e le cartelle nidificati non sono supportati. La quantità massima di immagini elaborate è 20. Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport)(MemoryStream, PassportRecognitionSettings) | Riconosce il testo sui passaporti. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport_1)(string, PassportRecognitionSettings) | Riconosce il testo sui passaporti. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Riconosci il testo dal pdf scansionato (estrarre le immagini).  Riconosce il file pdf con la possibilità di specificare[`RecognitionSettings`](../recognitionsettings/) . Supporta solo PDF scansionati. Non supporta PDF ricercabile. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf_1)(string, DocumentRecognitionSettings) | Riconosci il testo dal pdf scansionato (estrarre le immagini).  Riconosce il file pdf con la possibilità di specificare[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Supporta solo PDF scansionati. Non supporta PDF ricercabile. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt)(MemoryStream, ReceiptRecognitionSettings) | Riconosce il testo sull'immagine. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt_1)(string, ReceiptRecognitionSettings) | Riconosce il testo sull'immagine. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff)(MemoryStream, DocumentRecognitionSettings) | Riconosci il testo da un'immagine TIFF multipagina.  Riconosce il file TIFF con la possibilità di specificare[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Supporta solo TIFF (TIF). Non supporta altri tipi di immagine. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff_1)(string, DocumentRecognitionSettings) | Riconosci il testo da un'immagine TIFF multipagina.  Riconosce il file TIFF con la possibilità di specificare[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Supporta solo TIFF (TIF). Non supporta altri tipi di immagine. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Consente di ottenere un documento multipagina dall'elenco di oggetti RecognitionResult |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Consente di ottenere un documento multipagina dall'elenco di oggetti RecognitionResult |

## Eventi

| Nome | Descrizione |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress/) | Un evento per tenere traccia dell'avanzamento del riconoscimento di immagini multipagina. |

### Guarda anche

* spazio dei nomi [Aspose.OCR](../../aspose.ocr/)
* assemblea [Aspose.OCR](../../)


