---
title: Impostare la formattazione dell'annotazione del testo libero
linktitle: Impostare la formattazione dell'annotazione del testo libero
second_title: Aspose.PDF per riferimento API .NET
description: Questo articolo fornisce una guida dettagliata su come creare un'annotazione di testo libero e specificarne il contenuto utilizzando Aspose.PDF per .NET
type: docs
weight: 140
url: /it/net/annotations/setfreetextannotationformatting/
---
Aspose.PDF per .NET è un'API di manipolazione di documenti PDF potente e facile da usare che ti consente di lavorare con file PDF in modo programmatico nelle tue applicazioni .NET. Una delle funzionalità fornite da Aspose.PDF per .NET è la possibilità di impostare la formattazione di annotazioni di testo libere nei documenti PDF. In questo articolo, ti guideremo attraverso il processo passo-passo di impostazione della formattazione delle annotazioni di testo libero utilizzando Aspose.PDF per .NET.

## Prerequisiti

Prima di iniziare, assicurati di avere i seguenti prerequisiti:

- Microsoft Visual Studio 2010 o versioni successive
- Aspose.PDF per .NET
- Conoscenza base di C#



## Passaggio 1: creare una nuova applicazione console C#

Innanzitutto, crea una nuova applicazione console C# in Microsoft Visual Studio. Per creare una nuova applicazione console, seleziona "File" > "Nuovo" > "Progetto" > "Visual C#" > "Applicazione console" dal menu principale.

## Passaggio 2: aggiungere un riferimento a Aspose.PDF per .NET

Successivamente, aggiungi un riferimento a Aspose.PDF per .NET nel tuo progetto. Per fare ciò, fare clic con il pulsante destro del mouse sul progetto nel riquadro "Esplora soluzioni", selezionare "Aggiungi" > "Riferimento", quindi individuare la posizione in cui è stato salvato il file DLL Aspose.PDF per .NET. Seleziona il file DLL e fai clic su "OK" per aggiungere il riferimento al tuo progetto.

## Passaggio 3: configurare l'ambiente

Dopo aver aggiunto il riferimento a Aspose.PDF per .NET, è necessario configurare l'ambiente. Per fare ciò, crea una nuova variabile stringa chiamata "dataDir" e impostala sul percorso della directory in cui si trova il tuo documento PDF. Sostituisci "YOUR DOCUMENT DIRECTORY" nel codice qui sotto con il percorso effettivo della tua directory di documenti:

```csharp
// Il percorso della directory dei documenti.
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## Passaggio 4: apri il documento PDF

Dopo aver configurato l'ambiente, è possibile aprire il documento PDF utilizzando il seguente codice:

```csharp
// Apri documento
Document pdfDocument = new Document(dataDir + "SetFreeTextAnnotationFormatting.pdf");
```

Sostituisci "SetFreeTextAnnotationFormatting.pdf" con il nome effettivo del tuo documento PDF.

## Passaggio 5: imposta l'aspetto predefinito

Per impostare l'aspetto predefinito dell'annotazione di testo libero, è necessario creare un'istanza dell'oggetto DefaultAppearance con il carattere, la dimensione del carattere e il colore desiderati. In questo tutorial, impostiamo il carattere su "Arial", la dimensione del carattere su 28 e il colore su rosso.

```csharp
// Crea un'istanza dell'oggetto DefaultAppearance
DefaultAppearance default_appearance = new DefaultAppearance("Arial", 28, System.Drawing.Color.Red);
```

## Passaggio 6: creare un'annotazione di testo libero

Ora che hai impostato l'aspetto predefinito, puoi creare un'annotazione di testo libero utilizzando il seguente codice:

```csharp
// Crea annotazione
FreeTextAnnotation freetext = new FreeTextAnnotation(pdfDocument.Pages[1], new Aspose.Pdf.Rectangle(200, 400, 400, 600), default_appearance);
```

Il codice precedente crea una nuova annotazione di testo libero sulla seconda pagina del documento PDF. L'annotazione sarà posizionata a (200, 400) e avrà una larghezza di 400 e un'altezza di 600.

## Passaggio 7: specificare il contenuto dell'annotazione

Dopo aver creato l'annotazione di testo libero, è possibile specificare il contenuto dell'annotazione utilizzando il seguente codice:

```csharp
// Specificare il contenuto dell'annotazione
freetext.Contents = "Free Text
```

### Codice sorgente di esempio per impostare la formattazione di annotazioni di testo libere utilizzando Aspose.PDF per .NET
```csharp
// Il percorso della directory dei documenti.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Apri documento
Document pdfDocument = new Document(dataDir + "SetFreeTextAnnotationFormatting.pdf");

// Crea un'istanza dell'oggetto DefaultAppearance
DefaultAppearance default_appearance = new DefaultAppearance("Arial", 28, System.Drawing.Color.Red);
// Crea annotazione
FreeTextAnnotation freetext = new FreeTextAnnotation(pdfDocument.Pages[1], new Aspose.Pdf.Rectangle(200, 400, 400, 600), default_appearance);
// Specificare il contenuto dell'annotazione
freetext.Contents = "Free Text";
// Aggiungi annotazione alla raccolta di annotazioni della pagina
pdfDocument.Pages[1].Annotations.Add(freetext);
dataDir = dataDir + "SetFreeTextAnnotationFormatting_out.pdf";
// Salva il documento aggiornato
pdfDocument.Save(dataDir);            
```

## Conclusione

In questo tutorial, abbiamo imparato come impostare la formattazione delle annotazioni di testo libero in un documento PDF utilizzando Aspose.PDF per .NET. La libreria fornisce un modo semplice ed efficiente per lavorare con i documenti PDF in modo programmatico, consentendo agli sviluppatori di creare e personalizzare vari tipi di annotazioni, comprese le annotazioni di testo libero. Seguendo la guida dettagliata e utilizzando il codice sorgente C# fornito, puoi configurare facilmente l'ambiente, aprire un documento PDF e creare un'annotazione di testo libero con formattazione personalizzata. Aspose.PDF per .NET è un'API robusta e affidabile che semplifica le attività di manipolazione dei documenti PDF, rendendolo uno strumento prezioso per gli sviluppatori .NET che lavorano con i file PDF.

### FAQ

#### D: Cos'è un'annotazione di testo libero in un documento PDF?

R: Un'annotazione di testo libero in un documento PDF è un tipo di annotazione che consente di aggiungere testo al documento senza essere legato a una posizione o struttura specifica. Viene comunemente utilizzato per fornire commenti, note o altre informazioni aggiuntive nel documento.

#### D: Posso personalizzare l'aspetto dell'annotazione di testo libero utilizzando Aspose.PDF per .NET?

R: Sì, puoi personalizzare varie proprietà dell'annotazione di testo libero, come il carattere, la dimensione del carattere, il colore, la posizione e altro.

#### D: Come si specifica il contenuto dell'annotazione a testo libero?

 R: Per specificare il contenuto dell'annotazione di testo libero, è possibile impostare il file`Contents` proprietà del`FreeTextAnnotation` opporsi al testo desiderato.

#### D: Posso aggiungere più annotazioni di testo libero a un documento PDF utilizzando Aspose.PDF per .NET?

 R: Sì, puoi creare più annotazioni di testo libero in un documento PDF creando più istanze del file`FreeTextAnnotation`oggetto e aggiungendoli a diverse pagine o posizioni nel documento.