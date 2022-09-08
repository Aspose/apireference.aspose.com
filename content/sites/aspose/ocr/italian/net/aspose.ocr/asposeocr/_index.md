---
title: AsposeOcr
second_title: Aspose.OCR per Riferimento API .NET
description: API principale per la libreria Aspose OCR
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
| [AsposeOcr](asposeocr#constructor)() | Inizializza una nuova istanza di[`AsposeOcr`](../asposeocr) class. Costruttore vuoto. |
| [AsposeOcr](asposeocr#constructor_1)(string) | Inizializza una nuova istanza di[`AsposeOcr`](../asposeocr) class. Imposta i caratteri consentiti con la proprietà alfabeto. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew)(MemoryStream) | Calcola l'angolo di inclinazione di un'immagine. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew_1)(string) | Calcola l'angolo di inclinazione di un'immagine. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri)(string) | Calcola l'angolo di inclinazione di un'immagine dall'URI. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling)(string, SpellCheckLanguage, string) | Corregge il testo (sostituisce le parole errate). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles)(MemoryStream, AreasType, bool) | Rileva le aree di testo sull'immagine.  La correzione automatica dell'inclinazione dell'immagine non viene applicata. Supporto GIF, PNG, JPEG, BMP, TIFF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles_1)(string, AreasType, bool) | Rileva le aree di testo sull'immagine.  La correzione automatica dell'inclinazione dell'immagine non viene applicata. Supporto GIF, PNG, JPEG, BMP, TIFF. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage)(MemoryStream, PreprocessingFilter) | Usa la preelaborazione dell'immagine per migliorare la precisione dell'OCR. Crea un elenco di filtri che verranno applicati all'immagine di input nell'ordine specificato. esempio per creare filtri: PreprocessingFilter filtri = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; Non ti servono tutti. Imposta solo ciò di cui hai bisogno. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage_1)(string, PreprocessingFilter) | Usa la preelaborazione dell'immagine per migliorare la precisione dell'OCR. Crea un elenco di filtri che verranno applicati all'immagine di input nell'ordine specificato. esempio per creare filtri: PreprocessingFilter filtri = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; Non ti servono tutti. Imposta solo ciò di cui hai bisogno. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu)(string, DocumentRecognitionSettings) | Riconosce il testo dall'immagine DJVU multipagina.  Riconosce il file DJVU con la possibilità di specificare[`DocumentRecognitionSettings`](../documentrecognitionsettings) . Supporta solo DJVU. Non supporta altri tipi di immagine. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_4)(MemoryStream) | Riconosce il testo sull'immagine. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_6)(string) | Riconosce il testo sull'immagine. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage)(MemoryStream, RecognitionSettings) | Riconosce il testo sull'immagine.  Riconosce l'immagine con la possibilità di specificare[`RecognitionSettings`](../recognitionsettings) . Supporta GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_1)(string, RecognitionSettings) | Riconosce il testo sull'immagine. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast)(MemoryStream) | Riconosce il testo sull'immagine con una buona qualità. Non utilizza la correzione dell'inclinazione e il rilevamento delle aree. Funziona in modalità veloce. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast_1)(string) | Riconosce il testo sull'immagine con una buona qualità. Non utilizza la correzione dell'inclinazione e il rilevamento delle aree. Funziona in modalità veloce. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri_1)(string) | Riconosce il testo sull'immagine fornito dal collegamento URI. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri)(string, RecognitionSettings) | Riconosce il testo sull'immagine fornito dal collegamento URI. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline)(MemoryStream) | Riconosce l'immagine che contiene una singola riga di testo.  La correzione automatica dell'inclinazione dell'immagine non viene applicata. Supporta GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline_1)(string) | Riconosce l'immagine che contiene una singola riga di testo.  La correzione automatica dell'inclinazione dell'immagine non viene applicata. Supporta GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages)(List&lt;string&gt;) | Riconosce più immagini dall'elenco con le impostazioni predefinite.  Archivi e cartelle non sono supportati. La quantità massima di immagini elaborate è 20. Supporta GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_2)(string) | Riconosce più immagini impacchettate nell'archivio ZIP o dalla cartella con le impostazioni predefinite.  Gli archivi e le cartelle nidificati non sono supportati. La quantità massima di immagini elaborate è 20. Supporta GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Riconosce più immagini dall'elenco.  Archivi e cartelle non sono supportati. La quantità massima di immagini elaborate è 20. Supporta GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_3)(string, RecognitionSettings) | Riconosce più immagini impacchettate nell'archivio ZIP o dalla cartella.  Gli archivi e le cartelle nidificati non sono supportati. La quantità massima di immagini elaborate è 20. Supporta GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Riconosce il testo dal pdf scansionato (estrae immagini).  Riconosce il file pdf con la possibilità di specificare[`RecognitionSettings`](../recognitionsettings) . Supporta solo PDF scansionati. Non supporta PDF ricercabile. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf_1)(string, DocumentRecognitionSettings) | Riconosce il testo dal pdf scansionato (estrae immagini).  Riconosce il file pdf con la possibilità di specificare[`RecognitionSettings`](../recognitionsettings) . Supporta solo PDF scansionati. Non supporta PDF ricercabile. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff)(string, DocumentRecognitionSettings) | Riconosce il testo dall'immagine TIFF a più pagine.  Riconosce il file TIFF con la possibilità di specificare[`DocumentRecognitionSettings`](../documentrecognitionsettings) . Supporta solo TIFF (TIF). Non supporta altri tipi di immagine. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Consente di ottenere documenti multipagina dall'elenco di oggetti RecognitionResult |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Consente di ottenere documenti multipagina dall'elenco di oggetti RecognitionResult |

### Guarda anche

* spazio dei nomi [Aspose.OCR](../../aspose.ocr)
* assemblea [Aspose.OCR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
