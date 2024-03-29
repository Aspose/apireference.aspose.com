---
title: EpubLoadOptions
second_title: Aspose.PDF per .NET API Reference
description: Contiene le opzioni per caricare/importare il file EPUB nel documento pdf.
type: docs
weight: 2090
url: /it/net/aspose.pdf/epubloadoptions/
---
## EpubLoadOptions class

Contiene le opzioni per caricare/importare il file EPUB nel documento pdf.

```csharp
public sealed class EpubLoadOptions : LoadOptions
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [EpubLoadOptions](epubloadoptions#constructor)() | Crea opzioni di caricamento predefinite per convertire il file EPUB in un documento pdf. Dimensione pagina pdf predefinita - A4 300 dpi 2480 X 3508. |
| [EpubLoadOptions](epubloadoptions#constructor_1)(SizeF) | Crea opzioni di caricamento con dimensioni pagina specificate. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [LoadFormat](../../aspose.pdf/loadoptions/loadformat) { get; } | Rappresenta il formato di file che[`LoadOptions`](../loadoptions) descrive. |
| [Margin](../../aspose.pdf/epubloadoptions/margin) { get; set; } | Ottiene un riferimento sull'oggetto che rappresenta le informazioni di marginazione. |
| [PageSize](../../aspose.pdf/epubloadoptions/pagesize) { get; } | Ottiene o imposta le dimensioni della pagina di output per l'importazione. |
| [WarningHandler](../../aspose.pdf/loadoptions/warninghandler) { get; set; } | Richiamata per gestire eventuali avvisi generati. WarningHandler restituisce l'elemento enum ReturnAction specificando Continue o Abort. Continua è l'azione predefinita e l'operazione di caricamento continua, tuttavia l'utente può anche restituire Interrompi, nel qual caso l'operazione di caricamento dovrebbe cessare. |

## Campi

| Nome | Descrizione |
| --- | --- |
| [MarginsAreaUsageMode](../../aspose.pdf/epubloadoptions/marginsareausagemode) | Rappresenta la modalità di utilizzo dell'area dei margini - definisce il trattamento delle istruzioni (se presenti) del CSS del documento importato relative all'utilizzo dei margini. |
| [PageSizeAdjustmentMode](../../aspose.pdf/epubloadoptions/pagesizeadjustmentmode) | ATTENZIONE! La funzionalità è stata implementata ma non è stata ancora inserita nell'API pubblica poiché il problema del blocco nel livello OSHARED è stato rivelato per il documento di esempio. Rappresenta la modalità di utilizzo delle dimensioni della pagina durante la conversione. I formati (come HTML, EPUB ecc.), di solito hanno un design float , quindi, consente di adattare la dimensione della pagina richiesta . Ma a volte il contenuto ha specificato posizioni orizzontali o dimensioni che non consentono di inserire il contenuto nella dimensione della pagina richiesta. In tal caso possiamo definire cosa dovrebbe essere fatto in questo caso (cioè quando la dimensione del contenuto non si adatta a dimensione iniziale della pagina richiesta di risultato documento PDF). |

### Guarda anche

* class [LoadOptions](../loadoptions)
* spazio dei nomi [Aspose.Pdf](../../aspose.pdf)
* assemblea [Aspose.PDF](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
