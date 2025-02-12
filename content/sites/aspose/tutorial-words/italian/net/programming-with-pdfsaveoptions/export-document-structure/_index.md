---
title: Esporta la struttura del documento
linktitle: Esporta la struttura del documento
second_title: Riferimento all'API Aspose.Words per .NET
description: Guida passo passo per esportare la struttura del documento con Aspose.Words per .NET.
type: docs
weight: 10
url: /it/net/programming-with-pdfsaveoptions/export-document-structure/
---

Questo articolo fornisce una guida dettagliata su come utilizzare la funzione Export Document Structure con Aspose.Words per .NET. Spiegheremo ogni parte del codice in dettaglio. Alla fine di questo tutorial, sarai in grado di capire come esportare la struttura di un documento e generare un PDF con la struttura del documento visibile.

Prima di iniziare, assicurati di aver installato e configurato la libreria Aspose.Words per .NET nel tuo progetto. Puoi trovare la libreria e le istruzioni di installazione sul sito web di Aspose.

## Passaggio 1: definire la directory dei documenti

 Per iniziare, devi definire il percorso della directory in cui si trovano i tuoi documenti. Sostituire`"YOUR DOCUMENT DIRECTORY"` con il percorso effettivo della directory dei documenti.

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## Passaggio 2: caricare il documento

Successivamente, dobbiamo caricare il documento che vogliamo elaborare. In questo esempio, supponiamo che il documento si chiami "Paragraphs.docx" e si trovi nella directory dei documenti specificata.

```csharp
Document doc = new Document(dataDir + "Paragraphs.docx");
```

## Passaggio 3: configurare le opzioni di salvataggio come PDF

 Per esportare la struttura del documento e renderla visibile nel riquadro di navigazione "Contenuto" di Adobe Acrobat Pro durante la modifica del file PDF, è necessario configurare il`PdfSaveOptions` oggetto con il`ExportDocumentStructure` proprietà impostata su`true`.

```csharp
PdfSaveOptions saveOptions = new PdfSaveOptions { ExportDocumentStructure = true };
```

## Passaggio 4: salvare il documento come PDF con la struttura del documento

Infine, possiamo salvare il documento in formato PDF utilizzando le opzioni di salvataggio configurate in precedenza.

```csharp
doc.Save(dataDir + "WorkingWithPdfSaveOptions.ExportDocumentStructure.pdf", saveOptions);
```

È tutto ! Hai esportato correttamente una struttura del documento e generato un PDF con la struttura del documento visibile utilizzando Aspose.Words per .NET.

### Esempio di codice sorgente per l'esportazione della struttura del documento con Aspose.Words per .NET


```csharp

            // Il percorso della directory dei documenti.
			string dataDir = "YOUR DOCUMENT DIRECTORY";
            Document doc = new Document(dataDir + "Paragraphs.docx");

            // La dimensione del file verrà aumentata e la struttura sarà visibile nel riquadro di navigazione "Contenuto".
            // di Adobe Acrobat Pro, durante la modifica del file .pdf.
            PdfSaveOptions saveOptions = new PdfSaveOptions { ExportDocumentStructure = true };

            doc.Save(dataDir + "WorkingWithPdfSaveOptions.ExportDocumentStructure.pdf", saveOptions);
        
```
