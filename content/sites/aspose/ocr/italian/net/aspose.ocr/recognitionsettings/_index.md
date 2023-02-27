---
title: Class RecognitionSettings
second_title: Aspose.OCR per Riferimento API .NET
description: Aspose.OCR.RecognitionSettings classe. Impostazioni per il riconoscimento delle immagini. Contiene elementi che consentono di personalizzare il processo di riconoscimento.
type: docs
weight: 240
url: /it/net/aspose.ocr/recognitionsettings/
---
## RecognitionSettings class

Impostazioni per il riconoscimento delle immagini. Contiene elementi che consentono di personalizzare il processo di riconoscimento.

```csharp
public class RecognitionSettings : BaseRecognitionSettings
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [RecognitionSettings](recognitionsettings/)(Language, List&lt;Rectangle&gt;, bool, bool, float, bool, int) | Inizializza una nuova istanza di`RecognitionSettings`classe con set completo di proprietà. |

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
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | Consente di preparare l'immagine per l'OCR regolando i metodi di pre-elaborazione. |
| [RecognitionAreas](../../aspose.ocr/recognitionsettings/recognitionareas/) { set; } | Ottiene o imposta l'elenco delle aree di testo per l'elaborazione.  Consente di specificare manualmente le aree con testo per un riconoscimento più accurato. Se sono impostate aree personalizzateDetectAreas E!:AutoSkew le proprietà verranno ignorate.  Disabilita DetectAreas e AutoSkew. |
| [RecognizeSingleLine](../../aspose.ocr/recognitionsettings/recognizesingleline/) { set; } | Imposta il riconoscimento dell'immagine a riga singola. Disabilitato (falso) per impostazione predefinita. Disabilita tutti i passaggi di elaborazione associati alla suddivisione in linee. Imposta questo parametro su true se l'immagine contiene solo una riga. Disabilita le impostazioni RecognitionAreas, quindi tutte le impostazioni delle aree verranno ignorate. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | Ottiene o imposta l'angolo in gradi per la rotazione dell'immagine.  L'impostazione di questo valore disabiliterà il[`AutoSkew`](../baserecognitionsettings/autoskew/) proprietà, in modo che la correzione automatica dell'inclinazione non venga applicata. Zero per impostazione predefinita. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | Ottiene o imposta il numero di thread per l'elaborazione. Per impostazione predefinita, 0 significa che l'immagine verrà elaborata con un numero di thread pari al tuo numero di processori. ThreadsCount = 1 significa che l'immagine verrà elaborata nel thread principale. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | Ottiene o imposta il valore di soglia personalizzato per la binarizzazione dell'immagine. Intervallo da 1 a 255. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | Consente di utilizzare algoritmi aggiuntivi specifici per il riconoscimento di caratteri piccoli. Utile per immagini con caratteri di piccole dimensioni. |

### Guarda anche

* class [BaseRecognitionSettings](../baserecognitionsettings/)
* spazio dei nomi [Aspose.OCR](../../aspose.ocr/)
* assemblea [Aspose.OCR](../../)


