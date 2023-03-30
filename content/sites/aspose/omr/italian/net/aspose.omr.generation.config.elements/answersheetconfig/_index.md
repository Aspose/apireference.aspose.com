---
title: Class AnswerSheetConfig
second_title: Aspose.OMR per Riferimento API .NET
description: Aspose.OMR.Generation.Config.Elements.AnswerSheetConfig classe. Rappresenta lelemento AnswerSheet. Permette di aggiungere caselle di scelta raggruppate in colonne e righe. Usa il foglio delle risposte se vuoi inserire molte domande in una pagina poiché si trovano una vicino allaltra.
type: docs
weight: 90
url: /it/net/aspose.omr.generation.config.elements/answersheetconfig/
---
## AnswerSheetConfig class

Rappresenta l'elemento AnswerSheet. Permette di aggiungere caselle di scelta raggruppate in colonne e righe. Usa il foglio delle risposte se vuoi inserire molte domande in una pagina poiché si trovano una vicino all'altra.

```csharp
public class AnswerSheetConfig : BaseConfig
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [AnswerSheetConfig](answersheetconfig/)() | Default_Costruttore |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AnswersCount](../../aspose.omr.generation.config.elements/answersheetconfig/answerscount/) { get; set; } | Il numero di opzioni di risposta per ogni domanda nel foglio delle risposte. |
| [AnswersValues](../../aspose.omr.generation.config.elements/answersheetconfig/answersvalues/) { get; set; } | Ogni valore rappresenta il simbolo all'interno della bolla. Deve avere lo stesso conteggio di[`AnswersCount`](./answerscount/) Esempio: nuova stringa[] {"A", "B", "C", "D"} Esempio: nuova stringa[] {"1", "2", "3", "4"} |
| [BubbleType](../../aspose.omr.generation.config.elements/answersheetconfig/bubbletype/) { get; set; } | Il tipo di bolla |
| [Column](../../aspose.omr.generation.config.elements/answersheetconfig/column/) { get; set; } | Indica in quale colonna disegnare il foglio |
| [ColumnsCount](../../aspose.omr.generation.config.elements/answersheetconfig/columnscount/) { get; set; } | Imposta il numero di colonne da disegnare. |
| [ElementsCount](../../aspose.omr.generation.config.elements/answersheetconfig/elementscount/) { get; set; } | Determina il numero totale di domande nel foglio delle risposte. |
| override [Name](../../aspose.omr.generation.config.elements/answersheetconfig/name/) { get; set; } | Nome del foglio delle risposte |
| [StartId](../../aspose.omr.generation.config.elements/answersheetconfig/startid/) { get; set; } | L'indice iniziale della numerazione delle domande |
| override [Type](../../aspose.omr.generation.config.elements/answersheetconfig/type/) { get; set; } | Tipo di elemento omr. Campo obbligatorio per la serializzazione JSON. |
| [VerticalMargin](../../aspose.omr.generation.config.elements/answersheetconfig/verticalmargin/) { get; set; } | Margine verticale del foglio delle risposte. Imposta in pixel. |

## Campi

| Nome | Descrizione |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/answersheetconfig/bubblesize/) | La dimensione di una bolla |

### Guarda anche

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* spazio dei nomi [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* assemblea [Aspose.OMR](../../)


