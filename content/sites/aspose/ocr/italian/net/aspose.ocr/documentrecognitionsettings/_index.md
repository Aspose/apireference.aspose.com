---
title: Class DocumentRecognitionSettings
second_title: Aspose.OCR per Riferimento API .NET
description: Aspose.OCR.DocumentRecognitionSettings classe. Impostazioni per il riconoscimento dei pdf. Contiene elementi che consentono di personalizzare il processo di riconoscimento.
type: docs
weight: 70
url: /it/net/aspose.ocr/documentrecognitionsettings/
---
## DocumentRecognitionSettings class

Impostazioni per il riconoscimento dei pdf. Contiene elementi che consentono di personalizzare il processo di riconoscimento.

```csharp
public class DocumentRecognitionSettings : BaseRecognitionSettings
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [DocumentRecognitionSettings](documentrecognitionsettings/#constructor)(int, int) | Inizializza una nuova istanza di`DocumentRecognitionSettings` classe con un breve set di proprietà. |
| [DocumentRecognitionSettings](documentrecognitionsettings/#constructor_1)(int, int, Language, bool, bool, int) | Inizializza una nuova istanza di`DocumentRecognitionSettings`classe con set completo di proprietà. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | Caratteri consentiti impostati. Determina il tipo di caratteri consentiti per il risultato del riconoscimento. |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | Consente di utilizzare un ulteriore algoritmo di correzione del contrasto per l'immagine prima del riconoscimento. |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | Consente l'uso di una rete neurale aggiuntiva per migliorare l'immagine - ridurre il rumore. Utile per immagini con artefatti di scansione, distorsioni, macchie, bagliori, gradienti, elementi estranei. |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | Ottiene o imposta un flag che indica se deve essere abilitata la correzione automatica dell'inclinazione dell'immagine. Abilitato (true) per impostazione predefinita. |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | Consente di selezionare la modalità ottimale per le aree del tipo di documento: documento, foto, testo semplice, colonna, immagine. |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | Imposta la lista nera per i simboli di riconoscimento. |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | Ottiene o imposta la lingua utilizzata per l'OCR.  Determina l'alfabeto utilizzato durante il riconoscimento. Multilingua per impostazione predefinita. |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | Permette di riconoscere il testo nelle tabelle (regioni circondate da linee). |
| [PagesNumber](../../aspose.ocr/documentrecognitionsettings/pagesnumber/) { get; set; } | Imposta il numero di pagine per il riconoscimento del file pdf multipagina. |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | Consente di preparare l'immagine per l'OCR regolando i metodi di pre-elaborazione. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | Ottiene o imposta l'angolo in gradi per la rotazione dell'immagine.  L'impostazione di questo valore disabiliterà il[`AutoSkew`](../baserecognitionsettings/autoskew/) proprietà, in modo che la correzione automatica dell'inclinazione non venga applicata. Zero per impostazione predefinita. |
| [StartPage](../../aspose.ocr/documentrecognitionsettings/startpage/) { get; set; } | Imposta la prima pagina per il riconoscimento. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | Ottiene o imposta il numero di thread per l'elaborazione. Per impostazione predefinita, 0 significa che l'immagine verrà elaborata con un numero di thread pari al tuo numero di processori. ThreadsCount = 1 significa che l'immagine verrà elaborata nel thread principale. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | Ottiene o imposta il valore di soglia personalizzato per la binarizzazione dell'immagine. Intervallo da 1 a 255. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | Consente di utilizzare algoritmi aggiuntivi specifici per il riconoscimento di caratteri piccoli. Utile per immagini con caratteri di piccole dimensioni. |

### Guarda anche

* class [BaseRecognitionSettings](../baserecognitionsettings/)
* spazio dei nomi [Aspose.OCR](../../aspose.ocr/)
* assemblea [Aspose.OCR](../../)


