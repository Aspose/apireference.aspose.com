---
title: Class PsSaveOptions
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.EPS.Device.PsSaveOptions classe. Questa classe contiene le opzioni necessarie per gestire il processo di conversione del documento in un file PostScript PS o Encapsulated PostScript EPS.
type: docs
weight: 80
url: /it/net/aspose.page.eps.device/pssaveoptions/
---
## PsSaveOptions class

Questa classe contiene le opzioni necessarie per gestire il processo di conversione del documento in un file PostScript (PS) o Encapsulated PostScript (EPS).

```csharp
public class PsSaveOptions : SaveOptions
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [PsSaveOptions](pssaveoptions/#constructor)() | Inizializza una nuova istanza di`PsSaveOptions` class con valori predefiniti per i flag!:SuppressErrors (vero) e!:Debug (falso). |
| [PsSaveOptions](pssaveoptions/#constructor_1)(bool) | Inizializza una nuova istanza di`PsSaveOptions` class con valori predefiniti per flag!:Debug (falso). |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Specifica le cartelle aggiuntive in cui il convertitore deve trovare i caratteri per il documento di input. La cartella predefinita è la cartella dei caratteri standard in cui il sistema operativo trova i caratteri per le esigenze interne. |
| [BackgroundColor](../../aspose.page.eps.device/pssaveoptions/backgroundcolor/) { get; set; } | Il colore di sfondo. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Specifica se le informazioni di debug devono essere stampate o meno sul flusso di output standard. |
| [EmbedFonts](../../aspose.page.eps.device/pssaveoptions/embedfonts/) { get; set; } | Indica se incorporare i font utilizzati nel documento PS. |
| [EmbedFontsAs](../../aspose.page.eps.device/pssaveoptions/embedfontsas/) { get; set; } | Un tipo di carattere in cui incorporare i caratteri nel documento PS. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Restituisce un elenco di errori di conversione soppressi If!:SuppressErrors è vero. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | La categoria Qualità specifica il livello di compressione di un'immagine. I valori disponibili vanno da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi minore è la qualità dell'immagine. Il valore 0 produce un'immagine di qualità più bassa, mentre 100 risulta nella più alta. |
| [Margins](../../aspose.page.eps.device/pssaveoptions/margins/) { get; set; } | I margini della pagina. |
| [PageSize](../../aspose.page.eps.device/pssaveoptions/pagesize/) { get; set; } | La dimensione della pagina. |
| [SaveFormat](../../aspose.page.eps.device/pssaveoptions/saveformat/) { get; set; } | Il formato di salvataggio del file risultante. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Specifica se gli errori devono essere soppressi o meno. Se vengono aggiunti veri errori soppressi[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Se false il primo errore terminerà il programma. |
| [Transparent](../../aspose.page.eps.device/pssaveoptions/transparent/) { get; set; } | Indica se lo sfondo è trasparente. |

### Guarda anche

* class [SaveOptions](../../aspose.page/saveoptions/)
* spazio dei nomi [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* assemblea [Aspose.Page](../../)


