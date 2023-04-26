---
title: Class PdfSaveOptions
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.Presentation.Pdf.PdfSaveOptions classe. Classe per le opzioni di salvataggio di XPS come PDF.
type: docs
weight: 450
url: /it/net/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class

Classe per le opzioni di salvataggio di XPS come PDF.

```csharp
public class PdfSaveOptions : SaveOptions
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/)() | Crea una nuova istanza di opzioni. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Specifica le cartelle aggiuntive in cui il convertitore deve trovare i caratteri per il documento di input. La cartella predefinita è la cartella dei caratteri standard in cui il sistema operativo trova i caratteri per le esigenze interne. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Specifica se le informazioni di debug devono essere stampate o meno sul flusso di output standard. |
| [EncryptionDetails](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/encryptiondetails/) { get; set; } | Ottiene o imposta i dettagli di crittografia. Se non impostato, non verrà eseguita alcuna crittografia. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Restituisce un elenco di errori di conversione soppressi If!:SuppressErrors è vero. |
| [ImageCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/imagecompression/) { get; set; } | Specifica il tipo di compressione da utilizzare per tutte le immagini nel documento. L'impostazione predefinita èAuto . |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | La categoria Qualità specifica il livello di compressione di un'immagine. I valori disponibili vanno da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi minore è la qualità dell'immagine. Il valore 0 produce un'immagine di qualità più bassa, mentre 100 risulta nella più alta. |
| [OutlineTreeExpansionLevel](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeexpansionlevel/) { get; set; } | Specifica fino a quale livello deve essere espanso il contorno del documento quando il file PDF viene aperto in un visualizzatore. 1 - vengono mostrati solo gli elementi del contorno di primo livello, 2 - vengono mostrati solo gli elementi del contorno di primo e secondo livello, e così via. Il valore predefinito è 1. |
| [OutlineTreeHeight](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeheight/) { get; set; } | Specifica l'altezza dell'albero del contorno del documento da salvare. 0 - l'albero del contorno non verrà convertito, 1 - verranno convertiti solo gli elementi del contorno del primo livello, e così via. Il valore predefinito è 10. |
| [PageNumbers](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/pagenumbers/) { get; set; } | Recupera/imposta l'array di numeri di pagine da convertire. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Specifica se gli errori devono essere soppressi o meno. Se vengono aggiunti veri errori soppressi[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Se false il primo errore terminerà il programma. |
| [TextCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/textcompression/) { get; set; } | Specifica il tipo di compressione da utilizzare per tutti i flussi di contenuto tranne le immagini. L'impostazione predefinita èFlate . |

### Guarda anche

* class [SaveOptions](../../aspose.page/saveoptions/)
* spazio dei nomi [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* assemblea [Aspose.Page](../../)


