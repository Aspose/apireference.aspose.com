---
title: Class SaveOptions
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.SaveOptions classe. Questa classe contiene le opzioni necessarie per gestire il processo di conversione.
type: docs
weight: 300
url: /it/net/aspose.page/saveoptions/
---
## SaveOptions class

Questa classe contiene le opzioni necessarie per gestire il processo di conversione.

```csharp
public abstract class SaveOptions
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [SaveOptions](saveoptions/#constructor)() | Inizializza una nuova istanza di`SaveOptions` class con valori predefiniti per i flag!:SuppressErrors (vero) e[`Debug`](./debug/) (falso). |
| [SaveOptions](saveoptions/#constructor_1)(bool) | Inizializza una nuova istanza di`SaveOptions` class con valore predefinito per flag[`Debug`](./debug/) (falso). |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Specifica le cartelle aggiuntive in cui il convertitore deve trovare i caratteri per il documento di input. La cartella predefinita è la cartella dei caratteri standard in cui il sistema operativo trova i caratteri per le esigenze interne. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Specifica se le informazioni di debug devono essere stampate o meno sul flusso di output standard. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Restituisce un elenco di errori di conversione soppressi If!:SuppressErrors è vero. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | La categoria Qualità specifica il livello di compressione di un'immagine. I valori disponibili vanno da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi minore è la qualità dell'immagine. Il valore 0 produce un'immagine di qualità più bassa, mentre 100 risulta nella più alta. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Specifica se gli errori devono essere soppressi o meno. Se vengono aggiunti veri errori soppressi[`Exceptions`](./exceptions/) list. Se false il primo errore terminerà il programma. |

### Guarda anche

* spazio dei nomi [Aspose.Page](../../aspose.page/)
* assemblea [Aspose.Page](../../)


