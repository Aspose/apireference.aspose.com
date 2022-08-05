---
title: RecognitionSettings
second_title: Aspose.OCR per Riferimento API .NET
description: Impostazioni per il riconoscimento dellimmagine. Contiene elementi che consentono di personalizzare il processo di riconoscimento.
type: docs
weight: 130
url: /it/net/aspose.ocr/recognitionsettings/
---
## RecognitionSettings class

Impostazioni per il riconoscimento dell'immagine. Contiene elementi che consentono di personalizzare il processo di riconoscimento.

```csharp
public class RecognitionSettings
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [RecognitionSettings](recognitionsettings)(Language, List&lt;Rectangle&gt;, bool, bool, float, bool, int) | Inizializza una nuova istanza di[`RecognitionSettings`](../recognitionsettings) classe con set completo di proprietà. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/recognitionsettings/allowedcharacters) { get; set; } | Set di caratteri consentiti. Determina il tipo di caratteri consentiti per il risultato del riconoscimento. |
| [AutoContrast](../../aspose.ocr/recognitionsettings/autocontrast) { get; set; } | Consente di utilizzare un algoritmo di correzione del contrasto aggiuntivo per l'immagine prima del riconoscimento. |
| [AutoDenoising](../../aspose.ocr/recognitionsettings/autodenoising) { get; set; } | Consente l'uso di una rete neurale aggiuntiva per migliorare l'immagine - ridurre il rumore. Utile per immagini con artefatti di scansione, distorsione, macchie, bagliori, gradienti, elementi estranei. |
| [AutoSkew](../../aspose.ocr/recognitionsettings/autoskew) { set; } | Ottiene o imposta un flag che indica se la correzione automatica dell'inclinazione dell'immagine deve essere abilitata. Abilitato (true) per impostazione predefinita. |
| [DetectAreas](../../aspose.ocr/recognitionsettings/detectareas) { set; } | Ottiene o imposta un flag che indica se il rilevamento automatico delle aree di testo deve essere abilitato.  Abilita il modulo Riconoscimento struttura documento. Ciò richiede più tempo e memoria per elaborare un'immagine, ma fornisce risultati più accurati su casi complessi. Disattiva (impostato su false) per un'elaborazione dell'immagine più rapida o in caso di immagini con struttura semplice. |
| [DetectAreasMode](../../aspose.ocr/recognitionsettings/detectareasmode) { get; set; } | Consente di selezionare la modalità ottimale per le aree del tipo di documento: documento, foto, testo normale, colonna, immagine. |
| [IgnoredCharacters](../../aspose.ocr/recognitionsettings/ignoredcharacters) { get; set; } | Imposta la lista nera per i simboli di riconoscimento. |
| [Language](../../aspose.ocr/recognitionsettings/language) { set; } | Ottiene o imposta la lingua utilizzata per l'OCR.  Determina l'alfabeto utilizzato durante il riconoscimento. Multilingua per impostazione predefinita. |
| [LinesFiltration](../../aspose.ocr/recognitionsettings/linesfiltration) { get; set; } | Consente di riconoscere il testo nelle tabelle (regioni circondate da righe). |
| [PreprocessingFilters](../../aspose.ocr/recognitionsettings/preprocessingfilters) { get; set; } | Consente di preparare l'immagine per l'OCR regolando i metodi di pre-elaborazione. |
| [RecognitionAreas](../../aspose.ocr/recognitionsettings/recognitionareas) { set; } | Ottiene o imposta l'elenco delle aree di testo da elaborare.  Consente di specificare manualmente le aree con testo per un riconoscimento più accurato. Se sono impostate aree personalizzate[`DetectAreas`](./detectareas) e[`AutoSkew`](./autoskew) le proprietà verranno ignorate.  Disabilita DetectAreas e AutoSkew. |
| [RecognizeSingleLine](../../aspose.ocr/recognitionsettings/recognizesingleline) { set; } | Imposta il riconoscimento dell'immagine a riga singola. Disabilitato (falso) per impostazione predefinita. Disabilita tutte le fasi di elaborazione associate alla suddivisione in righe. Imposta questo parametro su true se l'immagine contiene solo una riga. Disabilita le impostazioni di RecognitionAreas, quindi tutte le impostazioni delle aree verranno ignorate. |
| [SkewAngle](../../aspose.ocr/recognitionsettings/skewangle) { set; } | Ottiene o imposta l'angolo in gradi per la rotazione dell'immagine.  L'impostazione di questo valore disabiliterà il[`AutoSkew`](./autoskew) proprietà, in modo che la correzione automatica dell'inclinazione non venga applicata. Zero per impostazione predefinita. |
| [ThreadsCount](../../aspose.ocr/recognitionsettings/threadscount) { set; } | Ottiene o imposta il numero di thread per l'elaborazione. Per impostazione predefinita, 0 significa che l'immagine verrà elaborata con il numero di thread uguale al numero di processori. ThreadsCount = 1 significa che l'immagine verrà elaborata nel thread principale. |
| [ThresholdValue](../../aspose.ocr/recognitionsettings/thresholdvalue) { set; } | Ottiene o imposta un valore di soglia personalizzato per la binarizzazione dell'immagine. Intervallo da 1 a 255. |

### Guarda anche

* spazio dei nomi [Aspose.OCR](../../aspose.ocr)
* assemblea [Aspose.OCR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
