---
title: Aggiungi colonna ripetuta nel documento PDF
linktitle: Aggiungi colonna ripetuta nel documento PDF
second_title: Aspose.PDF per riferimento API .NET
description: Scopri come aggiungere una colonna ripetuta nel documento PDF utilizzando Aspose.PDF per .NET.
type: docs
weight: 20
url: /it/net/programming-with-tables/add-repeating-column/
---
In questo tutorial impareremo come aggiungere una colonna ripetuta nel documento PDF utilizzando Aspose.PDF per .NET. Spiegheremo il codice sorgente in C# passo dopo passo. Alla fine di questo tutorial, saprai come creare una tabella con una colonna ripetuta in un documento PDF. Iniziamo!

## Passaggio 1: configurazione dell'ambiente
Innanzitutto, assicurati di aver impostato il tuo ambiente di sviluppo C# con Aspose.PDF per .NET. Aggiungere il riferimento alla libreria e importare gli spazi dei nomi necessari.

## Passaggio 2: creazione del documento PDF
In questo passaggio, creiamo un nuovo documento PDF.

```csharp
Document doc = new Document();
Page page = doc.Pages.Add();
```

Abbiamo creato un documento PDF vuoto in cui possiamo aggiungere contenuto.

## Passaggio 3: creazione delle tabelle
In questo passaggio creiamo una tabella principale (`outerTable`) e una tabella nidificata (`mytable`) che verrà ripetuto nella colonna.

```csharp
Table outerTable = new Table();
outerTable.ColumnWidths = "100%";
outerTable.HorizontalAlignment = HorizontalAlignment.Left;

Table mytable = new Table();
mytable.Broken = TableBroken.VerticalInSamePage;
mytable.ColumnAdjustment = ColumnAdjustment.AutoFitToContent;
```

Abbiamo specificato le proprietà della tabella come la larghezza della colonna e la modalità di interruzione della tabella nidificata.

## Passaggio 4: aggiunta delle tabelle al documento
Ora aggiungiamo le tabelle create al documento PDF.

```csharp
page.Paragraphs.Add(outerTable);
var bodyRow = outerTable.Rows.Add();
var bodyCell = bodyRow.Cells.Add();
bodyCell.Paragraphs.Add(mytable);
mytable.RepeatingColumnsCount = 5;
page.Paragraphs.Add(mytable);
```

Per prima cosa aggiungiamo la tabella principale (`outerTable`) al documento PDF. Successivamente, aggiungiamo la tabella nidificata (`mytable` ) come paragrafo in una cella della tabella principale. Specifichiamo anche il numero di colonne ripetute per`mytable` (in questo esempio, 5 colonne).

## Passaggio 5: aggiunta di intestazioni e righe
Ora aggiungiamo le intestazioni e le righe alla tabella.

```csharp
Row headerRow = mytable.Rows.Add();
headerRow.Cells.Add("header 1");
headerRow.Cells.Add("header 2");
headerRow.Cells.Add("header 3");
// ...
// Aggiungi altre intestazioni qui

for (int RowCounter = 0; RowCounter <= 5; RowCounter++)
{
     Row row1 = mytable.Rows.Add();
     row1.Cells.Add("col " + RowCounter.ToString() + ", 1");
     row1.Cells.Add("col " + RowCounter.ToString() + ", 2");
     row1.Cells.Add("col " + RowCounter.ToString() + ", 3");
     // ...
     // Aggiungi qui le altre colonne
}
```

Per prima cosa aggiungiamo le intestazioni alla prima riga della tabella (`headerRow`). Quindi aggiungiamo le righe di dati da un ciclo. In questo esempio, aggiungiamo 6 righe di dati.

## Passaggio 6: salvare il documento PDF
Infine, salviamo il documento PDF nel file specificato.

```csharp
string outFile = dataDir + "AddRepeatingColumn_out.pdf";
doc.Save(outFile);
```

Assicurati di specificare la directory e il nome file corretti per salvare il file PDF di output.

### Esempio di codice sorgente per aggiungere una colonna ripetuta utilizzando Aspose.PDF per .NET

```csharp
// Il percorso della directory dei documenti.
string dataDir = "YOUR DOCUMENT DIRECTORY";

string outFile = dataDir + "AddRepeatingColumn_out.pdf";
// Crea un nuovo documento
Document doc = new Document();
Aspose.Pdf.Page page = doc.Pages.Add();

// Crea un'istanza di una tabella esterna che occupi l'intera pagina
Aspose.Pdf.Table outerTable = new Aspose.Pdf.Table();
outerTable.ColumnWidths = "100%";
outerTable.HorizontalAlignment = HorizontalAlignment.Left;

//Crea un'istanza di un oggetto table che verrà annidato all'interno di outerTable che si interromperà all'interno della stessa pagina
Aspose.Pdf.Table mytable = new Aspose.Pdf.Table();
mytable.Broken = TableBroken.VerticalInSamePage;
mytable.ColumnAdjustment = ColumnAdjustment.AutoFitToContent;

// Aggiungi la outerTable ai paragrafi della pagina
// Aggiungi mytable a outerTable
page.Paragraphs.Add(outerTable);
var bodyRow = outerTable.Rows.Add();
var bodyCell = bodyRow.Cells.Add();
bodyCell.Paragraphs.Add(mytable);
mytable.RepeatingColumnsCount = 5;
page.Paragraphs.Add(mytable);

// Aggiungi riga di intestazione
Aspose.Pdf.Row row = mytable.Rows.Add();
row.Cells.Add("header 1");
row.Cells.Add("header 2");
row.Cells.Add("header 3");
row.Cells.Add("header 4");
row.Cells.Add("header 5");
row.Cells.Add("header 6");
row.Cells.Add("header 7");
row.Cells.Add("header 11");
row.Cells.Add("header 12");
row.Cells.Add("header 13");
row.Cells.Add("header 14");
row.Cells.Add("header 15");
row.Cells.Add("header 16");
row.Cells.Add("header 17");

for (int RowCounter = 0; RowCounter <= 5; RowCounter++)

{
	// Crea righe nella tabella e quindi celle nelle righe
	Aspose.Pdf.Row row1 = mytable.Rows.Add();
	row1.Cells.Add("col " + RowCounter.ToString() + ", 1");
	row1.Cells.Add("col " + RowCounter.ToString() + ", 2");
	row1.Cells.Add("col " + RowCounter.ToString() + ", 3");
	row1.Cells.Add("col " + RowCounter.ToString() + ", 4");
	row1.Cells.Add("col " + RowCounter.ToString() + ", 5");
	row1.Cells.Add("col " + RowCounter.ToString() + ", 6");
	row1.Cells.Add("col " + RowCounter.ToString() + ", 7");
	row1.Cells.Add("col " + RowCounter.ToString() + ", 11");
	row1.Cells.Add("col " + RowCounter.ToString() + ", 12");
	row1.Cells.Add("col " + RowCounter.ToString() + ", 13");
	row1.Cells.Add("col " + RowCounter.ToString() + ", 14");
	row1.Cells.Add("col " + RowCounter.ToString() + ", 15");
	row1.Cells.Add("col " + RowCounter.ToString() + ", 16");
	row1.Cells.Add("col " + RowCounter.ToString() + ", 17");
}
doc.Save(outFile);
```

## Conclusione
In questo tutorial, abbiamo imparato come aggiungere una colonna ripetuta in un documento PDF utilizzando Aspose.PDF per .NET. Puoi usare questa guida dettagliata per creare tabelle con colonne ripetute nei tuoi progetti C#.

### Domande frequenti per aggiungere colonne ripetute nel documento PDF

#### D: Posso personalizzare il numero di colonne ripetute nella tabella nidificata?

 R: Sì, puoi personalizzare il numero di colonne ripetute nella tabella nidificata. Nell'esempio fornito, impostiamo`mytable.RepeatingColumnsCount = 5;`, il che significa che ci saranno 5 colonne ripetute. È possibile modificare questo valore in qualsiasi numero desiderato.

#### D: È possibile aggiungere dinamicamente più righe alla tabella nidificata?

R: Sì, puoi aggiungere dinamicamente più righe alla tabella nidificata nello stesso modo mostrato nel tutorial. Puoi utilizzare loop o qualsiasi altra logica per aggiungere righe in base ai tuoi dati.

#### D: Posso applicare stili e formattazione alla tabella e alle sue celle?

A: Sì, puoi applicare stili e formattazione alla tabella e alle sue celle utilizzando Aspose.PDF per .NET. La libreria fornisce varie proprietà e metodi per personalizzare l'aspetto della tabella e il suo contenuto.

#### D: Aspose.PDF per .NET è compatibile con .NET Core?

R: Sì, Aspose.PDF per .NET è compatibile con .NET Core. Puoi usarlo in entrambe le applicazioni .NET Framework e .NET Core.

#### D: Posso utilizzare questo approccio per aggiungere colonne ripetute in un documento PDF esistente?

R: Sì, puoi utilizzare questo approccio per aggiungere colonne ripetute in un documento PDF esistente. Basta caricare il documento esistente utilizzando Aspose.PDF per .NET e seguire gli stessi passaggi per creare e aggiungere la colonna ripetuta.