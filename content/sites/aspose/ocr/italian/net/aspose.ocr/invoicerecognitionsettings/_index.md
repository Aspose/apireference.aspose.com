---
title: Class InvoiceRecognitionSettings
second_title: Aspose.OCR per Riferimento API .NET
description: Aspose.OCR.InvoiceRecognitionSettings classe. Impostazioni per il riconoscimento della fattura. Contiene elementi che consentono di personalizzare il processo di riconoscimento.
type: docs
weight: 100
url: /it/net/aspose.ocr/invoicerecognitionsettings/
---
## InvoiceRecognitionSettings class

Impostazioni per il riconoscimento della fattura. Contiene elementi che consentono di personalizzare il processo di riconoscimento.

```csharp
public class InvoiceRecognitionSettings : ReceiptRecognitionSettings
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [InvoiceRecognitionSettings](invoicerecognitionsettings/)(Language) | Inizializza una nuova istanza di`InvoiceRecognitionSettings`classe con set completo di proprietà. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/receiptrecognitionsettings/allowedcharacters/) { get; set; } | Caratteri consentiti impostati. Determina il tipo di caratteri consentiti per il risultato del riconoscimento. |
| [AutoSkew](../../aspose.ocr/receiptrecognitionsettings/autoskew/) { set; } | Ottiene o imposta un flag che indica se deve essere abilitata la correzione automatica dell'inclinazione dell'immagine. Abilitato (true) per impostazione predefinita. |
| [IgnoredCharacters](../../aspose.ocr/receiptrecognitionsettings/ignoredcharacters/) { get; set; } | Imposta la lista nera per i simboli di riconoscimento. |
| [Language](../../aspose.ocr/receiptrecognitionsettings/language/) { set; } | Ottiene o imposta la lingua utilizzata per l'OCR.  Determina l'alfabeto utilizzato durante il riconoscimento. Multilingua per impostazione predefinita. |
| [PreprocessingFilters](../../aspose.ocr/receiptrecognitionsettings/preprocessingfilters/) { get; set; } | Consente di preparare l'immagine per l'OCR regolando i metodi di pre-elaborazione. |
| [ThreadsCount](../../aspose.ocr/receiptrecognitionsettings/threadscount/) { set; } | Ottiene o imposta il numero di thread per l'elaborazione. Per impostazione predefinita, 0 significa che l'immagine verrà elaborata con un numero di thread pari al tuo numero di processori. ThreadsCount = 1 significa che l'immagine verrà elaborata nel thread principale. |

### Guarda anche

* class [ReceiptRecognitionSettings](../receiptrecognitionsettings/)
* spazio dei nomi [Aspose.OCR](../../aspose.ocr/)
* assemblea [Aspose.OCR](../../)


