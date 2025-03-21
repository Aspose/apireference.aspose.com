---
title: Margini o imbottitura
linktitle: Margini o imbottitura
second_title: Aspose.PDF per riferimento API .NET
description: Scopri come impostare i margini o il riempimento in una tabella utilizzando Aspose.PDF per .NET.
type: docs
weight: 140
url: /it/net/programming-with-tables/margins-or-padding/
---
In questo tutorial, ti guideremo attraverso il processo passo-passo dell'utilizzo di Aspose.PDF per .NET per impostare i margini o il riempimento in una tabella. Forniremo spiegazioni e frammenti di codice per aiutarti a comprendere e implementare questa funzionalità nel tuo codice sorgente C#.

## Passaggio 1: impostazione del documento e della pagina
Per iniziare, devi impostare il documento e la pagina utilizzando il seguente codice:

```csharp
// Il percorso della directory dei documenti.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Crea un'istanza dell'oggetto Document chiamando il suo costruttore vuoto
Document doc = new Document();
Page page = doc.Pages.Add();
```

## Passaggio 2: creazione di una tabella
Successivamente, creeremo un oggetto tabella utilizzando la classe Aspose.Pdf.Table:

```csharp
// Crea un'istanza di un oggetto tabella
Aspose.Pdf.Table tab1 = new Aspose.Pdf.Table();
// Aggiungi la tabella alla raccolta di paragrafi della sezione desiderata
page.Paragraphs.Add(tab1);
```

## Passaggio 3: impostazione della larghezza delle colonne e del bordo cella predefinito
Per impostare la larghezza delle colonne e il bordo della cella predefinito della tabella, utilizzare il seguente codice:

```csharp
// Imposta la larghezza delle colonne della tabella
tab1. ColumnWidths = "50 50 50";
// Imposta il bordo della cella predefinito utilizzando l'oggetto BorderInfo
tab1.DefaultCellBorder = new Aspose.Pdf.BorderInfo(Aspose.Pdf.BorderSide.All, 0.1F);
```

## Passaggio 4: impostazione del bordo della tabella e del riempimento delle celle
Per impostare il bordo della tabella e il riempimento della cella, crea un oggetto MarginInfo e impostane le proprietà:

```csharp
// Crea un oggetto MarginInfo e impostane i margini sinistro, inferiore, destro e superiore
Aspose.Pdf.MarginInfo margin = new Aspose.Pdf.MarginInfo();
margin. Top = 5f;
margin. Left = 5f;
margin. Right = 5f;
margin. Bottom = 5f;

// Imposta la spaziatura predefinita della cella sull'oggetto MarginInfo
tab1. DefaultCellPadding = margin;

// Imposta il bordo della tabella utilizzando un altro oggetto BorderInfo personalizzato
tab1.Border = new Aspose.Pdf.BorderInfo(Aspose.Pdf.BorderSide.All, 1F);
```

## Passaggio 5: aggiunta di righe e celle
Ora aggiungiamo righe e celle alla tabella. Creeremo una nuova riga e vi aggiungeremo delle celle:

```csharp
// Crea righe nella tabella e quindi celle nelle righe
Aspose.Pdf.Row row1 = tab1.Rows.Add();
row1.Cells.Add("col1");
row1.Cells.Add("col2");
row1.Cells.Add();
```

## Passaggio 6: aggiunta di testo alle celle
Per aggiungere testo a una cella, crea un oggetto TextFragment e aggiungilo alla cella desiderata:

```csharp
TextFragment mytext = new TextFragment("col3 with large text string");
row1.Cells[2].Paragraphs.Add(mytext);
row1.Cells[2].IsWordWrapped = false;
```

## Passaggio 7: salvare il PDF
Per salvare il documento PDF, utilizzare il seguente codice:

```csharp
dataDir = dataDir + "MarginsOrPadding_out.pdf";
// Salva il PDF
doc.Save(dataDir);

Console.WriteLine("\nCell and table border width setup successfully.\nFile saved at " + dataDir);
```

### Esempio di codice sorgente per Margins Or Padding utilizzando Aspose.PDF per .NET

```csharp
// Il percorso della directory dei documenti.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Instntiate l'oggetto Document chiamando il suo costruttore vuoto
Document doc = new Document();
Page page = doc.Pages.Add();
// Crea un'istanza di un oggetto tabella
Aspose.Pdf.Table tab1 = new Aspose.Pdf.Table();
// Aggiungi la tabella nella raccolta di paragrafi della sezione desiderata
page.Paragraphs.Add(tab1);
// Impostare con le larghezze delle colonne della tabella
tab1.ColumnWidths = "50 50 50";
// Imposta il bordo della cella predefinito utilizzando l'oggetto BorderInfo
tab1.DefaultCellBorder = new Aspose.Pdf.BorderInfo(Aspose.Pdf.BorderSide.All, 0.1F);
// Imposta il bordo della tabella utilizzando un altro oggetto BorderInfo personalizzato
tab1.Border = new Aspose.Pdf.BorderInfo(Aspose.Pdf.BorderSide.All, 1F);
// Crea un oggetto MarginInfo e imposta i suoi margini sinistro, inferiore, destro e superiore
Aspose.Pdf.MarginInfo margin = new Aspose.Pdf.MarginInfo();
margin.Top = 5f;
margin.Left = 5f;
margin.Right = 5f;
margin.Bottom = 5f;
// Imposta la spaziatura predefinita della cella sull'oggetto MarginInfo
tab1.DefaultCellPadding = margin;
// Crea righe nella tabella e quindi celle nelle righe
Aspose.Pdf.Row row1 = tab1.Rows.Add();
row1.Cells.Add("col1");
row1.Cells.Add("col2");
row1.Cells.Add();
TextFragment mytext = new TextFragment("col3 with large text string");
// Row1.Cells.Add("col3 con stringa di testo grande da inserire all'interno della cella");
row1.Cells[2].Paragraphs.Add(mytext);
row1.Cells[2].IsWordWrapped = false;
// Row1.Cells[2].Paragraphs[0].FixedWidth= 80;
Aspose.Pdf.Row row2 = tab1.Rows.Add();
row2.Cells.Add("item1");
row2.Cells.Add("item2");
row2.Cells.Add("item3");
dataDir = dataDir + "MarginsOrPadding_out.pdf";
// Salva il Pdf
doc.Save(dataDir);

Console.WriteLine("\nCell and table border width setup successfully.\nFile saved at " + dataDir); 
```

## Conclusione
Congratulazioni! Hai imparato con successo come impostare i margini o il riempimento in una tabella utilizzando Aspose.PDF per .NET. Questa conoscenza ti aiuterà a migliorare le tue capacità di formattazione dei documenti e a rendere le tue tabelle visivamente accattivanti.

### FAQ

#### D: Posso impostare margini o padding diversi per le singole celle di una tabella?

R: Sì, puoi impostare margini o spaziatura diversi per le singole celle in una tabella utilizzando Aspose.PDF per .NET. Nell'esempio fornito, impostiamo il riempimento della cella predefinito per l'intera tabella utilizzando il`DefaultCellPadding` proprietà. Per impostare un riempimento diverso per celle specifiche, puoi accedere al file`MarginInfo` di ciascuna cella singolarmente e modificarne i margini.

#### D: Come posso cambiare il colore o lo stile del bordo del tavolo?

 R: Per cambiare il colore o lo stile del bordo della tabella, puoi modificare il file`Color` E`Width` proprietà del`BorderInfo` oggetto. Nell'esempio fornito, impostiamo il colore del bordo su nero e una larghezza di 1F (un punto) utilizzando`tab1.Border = new Aspose.Pdf.BorderInfo(Aspose.Pdf.BorderSide.All, 1F);`. È possibile regolare il colore e la larghezza in base alle proprie esigenze.

#### D: È possibile aggiungere intestazioni o piè di pagina alla tabella?

A: Sì, puoi aggiungere intestazioni o piè di pagina alla tabella utilizzando Aspose.PDF per .NET. Intestazioni e piè di pagina sono in genere righe separate che contengono informazioni aggiuntive come etichette di colonne, titoli di tabelle o dati di riepilogo. Puoi creare righe aggiuntive, modellarle in modo diverso e aggiungerle sopra o sotto il contenuto della tabella.

#### D: Come si regola l'allineamento del testo all'interno di una cella di tabella?

 R: Per regolare l'allineamento del testo all'interno di una cella di tabella, puoi utilizzare il`HorizontalAlignment` E`VerticalAlignment` proprietà del`TextFragment` oggetto. Ad esempio, per allineare al centro il testo orizzontalmente, puoi impostare`mytext.HorizontalAlignment = HorizontalAlignment.Center;` . Allo stesso modo, puoi impostare`mytext.VerticalAlignment` per controllare l'allineamento verticale.

#### D: Posso aggiungere immagini alle celle della tabella invece del testo?

 R: Sì, puoi aggiungere immagini alle celle della tabella utilizzando Aspose.PDF per .NET. Invece di creare un`TextFragment` oggetto, puoi creare un file`Image` oggetto, caricare il file immagine e aggiungerlo alla cella desiderata utilizzando l'estensione`cell.Paragraphs.Add(image);` metodo. Ciò consente di inserire immagini nella tabella accanto al contenuto del testo.