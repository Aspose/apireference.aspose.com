---
title: Anteprima di stampa della cartella di lavoro
linktitle: Anteprima di stampa della cartella di lavoro
second_title: Riferimento all'API Aspose.Cells per .NET
description: Scopri come generare un'anteprima di stampa di una cartella di lavoro utilizzando Aspose.Cells per .NET.
type: docs
weight: 170
url: /it/net/excel-workbook/workbook-print-preview/
---
L'anteprima di stampa di una cartella di lavoro è una caratteristica essenziale quando si lavora con file Excel con Aspose.Cells per .NET. Puoi generare facilmente un'anteprima di stampa seguendo questi passaggi:

## Passaggio 1: specificare la directory di origine

Innanzitutto, è necessario specificare la directory di origine in cui si trova il file Excel che si desidera visualizzare in anteprima. Ecco come farlo:

```csharp
// directory di origine
string sourceDir = RunExamples.Get_SourceDirectory();
```

## Passaggio 2: caricare la cartella di lavoro

Quindi è necessario caricare la cartella di lavoro della cartella di lavoro dal file Excel specificato. Ecco come farlo:

```csharp
// Carica la cartella di lavoro della cartella di lavoro
Workbook workbook = new Workbook(sourceDir + "Book1.xlsx");
```

## Passaggio 3: configurare le opzioni di immagine e stampa

Prima di generare l'anteprima di stampa, è possibile configurare l'immagine e le opzioni di stampa secondo necessità. In questo esempio, stiamo usando le opzioni predefinite. Ecco come farlo:

```csharp
// Opzioni immagine e stampa
ImageOrPrintOptions imgOptions = new ImageOrPrintOptions();
```

## Passaggio 4: generare l'anteprima di stampa della cartella di lavoro

Ora puoi generare l'anteprima di stampa della cartella di lavoro della cartella di lavoro utilizzando la classe WorkbookPrintingPreview. Ecco come farlo:

```csharp
// Anteprima di stampa della cartella di lavoro
WorkbookPrintingPreview preview = new WorkbookPrintingPreview(workbook, imgOptions);
Console.WriteLine("Workbook page count: " + preview.EvaluatedPageCount);
```

## Passaggio 5: generare l'anteprima di stampa del foglio di lavoro

Se si desidera generare l'anteprima di stampa di un foglio di lavoro specifico, è possibile utilizzare la classe SheetPrintingPreview. Ecco un esempio:

```csharp
// Anteprima di stampa del foglio di lavoro
SheetPrintingPreview preview2 = new SheetPrintingPreview(workbook.Worksheets[0], imgOptions);
Console.WriteLine("Number of worksheet pages: " + preview2.EvaluatedPageCount);
```

### Codice sorgente di esempio per l'anteprima di stampa della cartella di lavoro utilizzando Aspose.Cells per .NET 
```csharp
//Rubrica di origine
string sourceDir = RunExamples.Get_SourceDirectory();
Workbook workbook = new Workbook(sourceDir + "Book1.xlsx");
ImageOrPrintOptions imgOptions = new ImageOrPrintOptions();
WorkbookPrintingPreview preview = new WorkbookPrintingPreview(workbook, imgOptions);
Console.WriteLine("Workbook page count: " + preview.EvaluatedPageCount);
SheetPrintingPreview preview2 = new SheetPrintingPreview(workbook.Worksheets[0], imgOptions);
Console.WriteLine("Worksheet page count: " + preview2.EvaluatedPageCount);
Console.WriteLine("PrintPreview executed successfully.");
```

## Conclusione

La generazione dell'anteprima di stampa di una cartella di lavoro è una potente funzionalità offerta da Aspose.Cells per .NET. Seguendo i passaggi sopra indicati, puoi facilmente visualizzare in anteprima la cartella di lavoro di Excel e ottenere informazioni sul numero di pagine da stampare.

### Domande frequenti

#### D: Come posso specificare una directory di origine diversa per caricare la mia cartella di lavoro?
    
 R: Puoi usare il`Set_SourceDirectory` metodo per specificare una directory di origine diversa. Per esempio:`RunExamples.Set_SourceDirectory("Path_to_the_source_directory")`.

#### D: Posso personalizzare l'immagine e le opzioni di stampa durante la generazione dell'anteprima di stampa?
    
 R: Sì, puoi personalizzare l'immagine e le opzioni di stampa modificando le proprietà del file`ImageOrPrintOptions` oggetto. Ad esempio, puoi impostare la risoluzione dell'immagine, il formato del file di output, ecc.

#### D: È possibile generare un'anteprima di stampa per più fogli di lavoro in una cartella di lavoro?
    
A: Sì, puoi scorrere i diversi fogli di lavoro nella cartella di lavoro e generare un'anteprima di stampa per ogni foglio utilizzando il`SheetPrintingPreview` classe.

#### D: Come faccio a salvare l'anteprima di stampa come immagine o file PDF?
    
 R: Puoi usare`ToImage` O`ToPdf` metodo di`WorkbookPrintingPreview` O`SheetPrintingPreview` oggetto per salvare l'anteprima di stampa come immagine o file PDF.

#### D: Cosa posso fare con l'anteprima di stampa una volta generata?
    
R: Dopo aver generato l'anteprima di stampa, puoi visualizzarla sullo schermo, salvarla come immagine o file PDF o utilizzarla per altre operazioni come l'invio tramite e-mail o la stampa.
	