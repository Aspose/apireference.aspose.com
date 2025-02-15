---
title: Crea piè di pagina dell'intestazione
linktitle: Crea piè di pagina dell'intestazione
second_title: API di elaborazione dei documenti Aspose.Words
description: Scopri come creare intestazioni e piè di pagina nei tuoi documenti Word con Aspose.Words per .NET. Personalizza intestazioni e piè di pagina per ogni pagina.
type: docs
weight: 10
url: /it/net/working-with-headers-and-footers/create-header-footer/
---

Ecco una guida passo passo per spiegare il seguente codice sorgente C# per creare intestazioni e piè di pagina utilizzando la funzionalità Aspose.Words per .NET. Assicurati di aver incluso la libreria Aspose.Words nel tuo progetto prima di utilizzare questo codice.

## Passaggio 1: imposta il percorso della directory del documento

```csharp
// Il percorso della directory dei documenti.
string dataDir = "YOUR_DIRECTORY_OF_DOCUMENTS";
```

Assicurati di specificare il percorso corretto della directory dei documenti in cui verrà salvato il documento modificato.

## Passaggio 2: crea un documento e un generatore di documenti

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

 Qui creiamo un'istanza di`Document` classe e un'istanza di`DocumentBuilder` classe che ci permetterà di manipolare il documento e aggiungere elementi.

## Passaggio 3: imposta i parametri della pagina e la prima intestazione

```csharp
Section currentSection = builder.CurrentSection;
PageSetup pageSetup = currentSection.PageSetup;

// Specificare se vogliamo che le intestazioni/piè di pagina della prima pagina siano diverse dalle altre pagine.
// È inoltre possibile utilizzare la proprietà PageSetup.OddAndEvenPagesHeaderFooter per specificare
// intestazioni/piè di pagina diversi per le pagine pari e dispari.
pageSetup.DifferentFirstPageHeaderFooter = true;
pageSetup.HeaderDistance = 20;

builder.MoveToHeaderFooter(HeaderFooterType.HeaderFirst);
builder.ParagraphFormat.Alignment = ParagraphAlignment.Center;

builder.Font.Name = "Arial";
builder.Font.Bold = true;
builder.Font.Size = 14;

builder.Write("Aspose.Words - Creating Headers/Footers - Title Page.");

pageSetup.HeaderDistance = 20;
builder. MoveToHeaderFooter(HeaderFooterType.HeaderPrimary);
```

Impostiamo i parametri della pagina, inclusa la distanza dell'intestazione, quindi passiamo all'intestazione principale (`HeaderPrimary`). Utilizziamo il generatore di documenti per aggiungere testo e formattare l'intestazione.

## Passaggio 4: inserisci un'immagine e un testo nell'intestazione principale

```csharp
builder.InsertImage(ImagesDir + "Graphics Interchange Format.gif", RelativeHorizontalPosition.Page, 10,
     RelativeVerticalPosition.Page, 10, 50, 50, WrapType.Through);

builder.ParagraphFormat.Alignment = ParagraphAlignment.Right;

builder.Write("Aspose.Words - Building headers/footers.");

builder. MoveToHeaderFooter(HeaderFooterType.FooterPrimary);
```

Usiamo il generatore di documenti per inserire un'immagine nell'angolo in alto a sinistra dell'intestazione principale, quindi aggiungiamo del testo allineato a destra.

## Passaggio 5: inserisci una tabella nel piè di pagina principale

```csharp
builder.StartTable();

builder.CellFormat.ClearFormatting();

builder.InsertCell();

builder.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 / 3);

builder.Write("Page ");
builder.InsertField("PAGE", "");
builder.Write(" of ");
builder.InsertField("NUMPAGES", "");

builder.CurrentParagraph.ParagraphFormat.Alignment = ParagraphAlignment.Left;

builder.InsertCell();

builder.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 * 2 / 3);

builder.Write("(C) 2001 Aspose Pty Ltd. All rights reserved.");

builder.CurrentParagraph.ParagraphFormat.Alignment = ParagraphAlignment.Right;

builder.EndRow();
builder.EndTable();

builder.MoveToDocumentEnd();
```

## Passaggio 6: aggiungi una nuova pagina e imposta intestazioni/piè di pagina

```csharp
builder. InsertBreak(BreakType.PageBreak);
builder.InsertBreak(BreakType.SectionBreakNewPage);

currentSection = builder. CurrentSection;
pageSetup = currentSection.PageSetup;
pageSetup.Orientation = Orientation.Landscape;
// Questa sezione non ha bisogno di un'intestazione/piè di pagina diversi per la prima pagina, abbiamo solo bisogno di una pagina del titolo nel documento,
// e l'intestazione/piè di pagina per questa pagina è già stata definita nella sezione precedente.
pageSetup.DifferentFirstPageHeaderFooter = false;

// Questa sezione visualizza le intestazioni/piè di pagina della sezione precedente per impostazione predefinita, chiama currentSection.HeadersFooters.LinkToPrevious(false) per interrompere questo collegamento,
// la larghezza della pagina è diversa per la nuova sezione, quindi dobbiamo impostare larghezze di cella diverse per una tabella a piè di pagina.
currentSection.HeadersFooters.LinkToPrevious(false);

//Se vogliamo utilizzare le intestazioni/piè di pagina già esistenti per questa sezione,
// ma con alcune piccole modifiche, potrebbe avere senso copiare le intestazioni/piè di pagina
// dalla sezione precedente e applichiamo le modifiche necessarie dove le vogliamo.
CopyHeadersFootersFromPreviousSection(currentSection);

HeaderFooter primaryFooter = currentSection.HeadersFooters[HeaderFooterType.FooterPrimary];

Row row = primaryFooter.Tables[0].FirstRow;
row.FirstCell.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 / 3);
row.LastCell.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 * 2 / 3);

// Salva il documento
doc.Save(dataDir + "WorkingWithHeadersAndFooters.CreateHeaderFooter.docx");
```

 Aggiungiamo un'interruzione di pagina e un'interruzione di sezione per creare una nuova pagina in cui saranno visibili le intestazioni/piè di pagina principali. Impostiamo i parametri per la nuova sezione, quindi utilizziamo il file`CopyHeadersFootersFromPreviousSection` metodo per copiare le intestazioni/piè di pagina dalla sezione precedente. Infine, impostiamo le larghezze di cella appropriate per la tabella del piè di pagina principale e salviamo il documento.

### Esempio di codice sorgente per creare intestazioni e piè di pagina con Aspose.Words per .NET

```csharp
// Il percorso della directory dei documenti.
string dataDir = "YOUR_DIRECTORY_OF_DOCUMENTS";

Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Section currentSection = builder.CurrentSection;
PageSetup pageSetup = currentSection.PageSetup;
// Specifica se vogliamo che le intestazioni/piè di pagina della prima pagina siano diverse dalle altre pagine.
// È inoltre possibile utilizzare la proprietà PageSetup.OddAndEvenPagesHeaderFooter per specificare
// intestazioni/piè di pagina diversi per le pagine pari e dispari.
pageSetup.DifferentFirstPageHeaderFooter = true;
pageSetup.HeaderDistance = 20;

builder.MoveToHeaderFooter(HeaderFooterType.HeaderFirst);
builder.ParagraphFormat.Alignment = ParagraphAlignment.Center;

builder.Font.Name = "Arial";
builder.Font.Bold = true;
builder.Font.Size = 14;

builder.Write("Aspose.Words Header/Footer Creation Primer - Title Page.");

pageSetup.HeaderDistance = 20;
builder.MoveToHeaderFooter(HeaderFooterType.HeaderPrimary);

// Inserisci un'immagine posizionata nell'angolo superiore/sinistro dell'intestazione.
// La distanza dai bordi superiore/sinistro della pagina è impostata su 10 punti.
builder.InsertImage(ImagesDir + "Graphics Interchange Format.gif", RelativeHorizontalPosition.Page, 10,
	RelativeVerticalPosition.Page, 10, 50, 50, WrapType.Through);

builder.ParagraphFormat.Alignment = ParagraphAlignment.Right;

builder.Write("Aspose.Words Header/Footer Creation Primer.");

builder.MoveToHeaderFooter(HeaderFooterType.FooterPrimary);

//Usiamo una tabella con due celle per creare una parte del testo sulla riga (con la numerazione delle pagine).
// Da allineare a sinistra e l'altra parte del testo (con copyright) da allineare a destra.
builder.StartTable();

builder.CellFormat.ClearFormatting();

builder.InsertCell();

builder.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 / 3);

// Utilizza i campi PAGE e NUMPAGES per calcolare automaticamente il numero di pagina corrente e molte pagine.
builder.Write("Page ");
builder.InsertField("PAGE", "");
builder.Write(" of ");
builder.InsertField("NUMPAGES", "");

builder.CurrentParagraph.ParagraphFormat.Alignment = ParagraphAlignment.Left;

builder.InsertCell();

builder.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 * 2 / 3);

builder.Write("(C) 2001 Aspose Pty Ltd. All rights reserved.");

builder.CurrentParagraph.ParagraphFormat.Alignment = ParagraphAlignment.Right;

builder.EndRow();
builder.EndTable();

builder.MoveToDocumentEnd();

// Effettua un'interruzione di pagina per creare una seconda pagina in cui verranno visualizzate le intestazioni/piè di pagina principali.
builder.InsertBreak(BreakType.PageBreak);
builder.InsertBreak(BreakType.SectionBreakNewPage);

currentSection = builder.CurrentSection;
pageSetup = currentSection.PageSetup;
pageSetup.Orientation = Orientation.Landscape;
// Questa sezione non necessita di un'intestazione/piè di pagina diversi, è necessaria solo una pagina del titolo nel documento,
// e l'intestazione/piè di pagina per questa pagina è già stata definita nella sezione precedente.
pageSetup.DifferentFirstPageHeaderFooter = false;

// Questa sezione visualizza intestazioni/piè di pagina della sezione precedente
// per impostazione predefinita chiama currentSection.HeadersFooters.LinkToPrevious(false) per annullare questa larghezza di pagina
// è diverso per la nuova sezione e quindi dobbiamo impostare larghezze di cella diverse per una tabella a piè di pagina.
currentSection.HeadersFooters.LinkToPrevious(false);

// Se vogliamo utilizzare il set di intestazione/piè di pagina già esistente per questa sezione.
// Ma con alcune piccole modifiche, potrebbe essere opportuno copiare intestazioni/piè di pagina
//dalla sezione precedente e applichiamo le modifiche necessarie dove le vogliamo.
CopyHeadersFootersFromPreviousSection(currentSection);

HeaderFooter primaryFooter = currentSection.HeadersFooters[HeaderFooterType.FooterPrimary];

Row row = primaryFooter.Tables[0].FirstRow;
row.FirstCell.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 / 3);
row.LastCell.CellFormat.PreferredWidth = PreferredWidth.FromPercent(100 * 2 / 3);

doc.Save(dataDir + "WorkingWithHeadersAndFooters.CreateHeaderFooter.docx");
```

### Domande frequenti

#### D: Come posso aggiungere un'intestazione al mio documento in Aspose.Words?

 R: Per aggiungere un'intestazione al tuo documento in Aspose.Words, puoi utilizzare il file`Document.FirstSection.HeadersFooters.Add(HeaderFooterType.HeaderPrimary)` metodo. Questo metodo aggiunge un'intestazione principale alla prima sezione del documento.

#### D: Come posso aggiungere un piè di pagina al mio documento in Aspose.Words?

 R: Per aggiungere un piè di pagina al tuo documento in Aspose.Words, puoi utilizzare il file`Document.FirstSection.HeadersFooters.Add(HeaderFooterType.FooterPrimary)` metodo. Questo metodo aggiunge un piè di pagina principale alla prima sezione del documento.

#### D: Come posso aggiungere testo alla mia intestazione o piè di pagina in Aspose.Words?

 R: Per aggiungere testo all'intestazione o al piè di pagina in Aspose.Words, puoi utilizzare il file`HeaderFooter.Paragraphs` per ottenere la raccolta di paragrafi dell'intestazione o del piè di pagina, quindi aggiungi un paragrafo contenente il testo a questa raccolta utilizzando la proprietà`ParagraphCollection.Add` metodo.

#### D: Posso personalizzare il contenuto dell'intestazione o del piè di pagina con immagini e numeri di pagina in Aspose.Words?

R: Sì, puoi personalizzare il contenuto dell'intestazione o del piè di pagina con immagini e numeri di pagina in Aspose.Words. Puoi usare oggetti come`Shape` per aggiungere immagini e oggetti come`Field` per aggiungere numeri di pagina all'intestazione o al piè di pagina.

#### D: Posso modificare il carattere, la dimensione e il colore del testo nell'intestazione o nel piè di pagina in Aspose.Words?

 R: Sì, puoi modificare il carattere, la dimensione e il colore del testo nell'intestazione o nel piè di pagina in Aspose.Words. È possibile accedere alle proprietà di formattazione del testo come`Font` per cambiare il carattere,`Size` per regolare le dimensioni e`Color` per impostare il colore del testo.