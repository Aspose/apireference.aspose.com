---
title: Aggiungi sommario al file PDF
linktitle: Aggiungi sommario al file PDF
second_title: Aspose.PDF per riferimento API .NET
description: Scopri come aggiungere un sommario al file PDF utilizzando Aspose.PDF per .NET. Guida dettagliata con codice sorgente di esempio. Potenzia la navigazione dei documenti!
type: docs
weight: 40
url: /it/net/programming-with-document/addtoc/
---
In questo tutorial, esploreremo come utilizzare la funzione Aggiungi sommario (sommario) al file PDF di Aspose.PDF per .NET per aggiungere un sommario ai documenti PDF. Forniremo una guida dettagliata e spiegheremo il codice sorgente C# necessario per raggiungere questo obiettivo. Alla fine di questo tutorial, sarai in grado di generare un documento PDF con un sommario utilizzando Aspose.PDF per .NET.


## Passaggio 1: carica il file PDF esistente

 Per iniziare, dobbiamo caricare un file PDF esistente. Sostituire`"YOUR DOCUMENT DIRECTORY"` nel codice seguente con il percorso effettivo del file PDF:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document(dataDir + "AddTOC.pdf");
```

## Passaggio 2: creare una nuova pagina per il sommario

Creeremo una nuova pagina per contenere il sommario. Il codice seguente inserisce una nuova pagina all'indice 1:

```csharp
Page tocPage = doc.Pages.Insert(1);
```

## Passaggio 3: definire le informazioni del sommario

Successivamente, dobbiamo definire le informazioni del sommario. Imposteremo il titolo e altre proprietà del sommario. Aggiungi il seguente codice:

```csharp
TocInfo tocInfo = new TocInfo();
TextFragment title = new TextFragment("Table Of Contents");
title.TextState.FontSize = 20;
title.TextState.FontStyle = FontStyles.Bold;

tocInfo.Title = title;
tocPage.TocInfo = tocInfo;
```

## Passaggio 4: creare elementi TOC

Ora creeremo gli elementi del sommario. In questo tutorial, creeremo quattro elementi TOC corrispondenti a pagine diverse. Modifica il seguente codice in base alle tue esigenze:

```csharp
string[] titles = new string[4];
titles[0] = "First page";
titles[1] = "Second page";
titles[2] = "Third page";
titles[3] = "Fourth page";

for (int i = 0; i < 2; i++)
{
    Aspose.Pdf.Heading heading2 = new Aspose.Pdf.Heading(1);
    TextSegment segment2 = new TextSegment();
    heading2.TocPage = tocPage;
    heading2.Segments.Add(segment2);

    heading2.DestinationPage = doc.Pages[i + 2];
    heading2.Top = doc.Pages[i + 2].Rect.Height;

    segment2.Text = titles[i];
    tocPage.Paragraphs.Add(heading2);
}
```

## Passaggio 5: salvare il documento aggiornato

 Infine, dobbiamo salvare il documento modificato con l'indice. Sostituire`"YOUR DOCUMENT DIRECTORY"` nel codice seguente con il percorso del file di output desiderato:

```csharp
dataDir = dataDir + "TOC_out.pdf";
doc.Save(dataDir);
Console.WriteLine("\nTOC added successfully to an existing PDF.\nFile saved at " + dataDir);
```

### Esempio di codice sorgente per l'aggiunta di TOC ai documenti PDF utilizzando Aspose.PDF per .NET

```csharp

// Il percorso della directory dei documenti.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Carica un file PDF esistente
Document doc = new Document(dataDir + "AddTOC.pdf");

// Ottieni l'accesso alla prima pagina del file PDF
Page tocPage = doc.Pages.Insert(1);

// Crea un oggetto per rappresentare le informazioni TOC
TocInfo tocInfo = new TocInfo();
TextFragment title = new TextFragment("Table Of Contents");
title.TextState.FontSize = 20;
title.TextState.FontStyle = FontStyles.Bold;

// Imposta il titolo per TOC
tocInfo.Title = title;
tocPage.TocInfo = tocInfo;

//Crea oggetti stringa che verranno utilizzati come elementi TOC
string[] titles = new string[4];
titles[0] = "First page";
titles[1] = "Second page";
titles[2] = "Third page";
titles[3] = "Fourth page";
for (int i = 0; i < 2; i++)
{
	// Crea oggetto Intestazione
	Aspose.Pdf.Heading heading2 = new Aspose.Pdf.Heading(1);
	TextSegment segment2 = new TextSegment();
	heading2.TocPage = tocPage;
	heading2.Segments.Add(segment2);

	// Specificare la pagina di destinazione per l'oggetto intestazione
	heading2.DestinationPage = doc.Pages[i + 2];

	// Pagina di destinazione
	heading2.Top = doc.Pages[i + 2].Rect.Height;

	// Coordinate di destinazione
	segment2.Text = titles[i];

	// Aggiungi un'intestazione alla pagina contenente il TOC
	tocPage.Paragraphs.Add(heading2);
}
dataDir = dataDir + "TOC_out.pdf";
// Salva il documento aggiornato
doc.Save(dataDir);

Console.WriteLine("\nTOC added successfully to an existing PDF.\nFile saved at " + dataDir);
```

## Conclusione

In questo tutorial, abbiamo esplorato come aggiungere un sommario (TOC) ai documenti PDF utilizzando Aspose.PDF per .NET. Seguendo la guida dettagliata e utilizzando il codice sorgente C# fornito, puoi facilmente generare un documento PDF con un sommario. Il sommario migliora l'usabilità del documento, consentendo agli utenti di navigare in sezioni o pagine specifiche in modo più efficiente. Aspose.PDF per .NET fornisce una soluzione solida e intuitiva per lavorare con i file PDF nelle applicazioni .NET, consentendo di creare facilmente documenti PDF dinamici e interattivi.

### Domande frequenti per aggiungere TOC al file PDF

#### D: Cos'è Aspose.PDF per .NET?

R: Aspose.PDF per .NET è una potente libreria che consente agli sviluppatori di lavorare efficacemente con i file PDF nelle applicazioni .NET. Fornisce un'ampia gamma di funzionalità per la creazione, la manipolazione e la gestione di documenti PDF in modo programmatico.

#### D: Qual è lo scopo dell'aggiunta di un sommario (TOC) a un documento PDF?

R: Il sommario (TOC) fornisce un aiuto alla navigazione per gli utenti, consentendo loro di passare rapidamente a sezioni o pagine specifiche all'interno del documento PDF. Migliora l'usabilità del documento e l'esperienza dell'utente.

#### D: Come posso aggiungere un sommario a un documento PDF utilizzando Aspose.PDF per .NET?

A: Per aggiungere un sommario a un documento PDF utilizzando Aspose.PDF per .NET, è necessario creare una nuova pagina per contenere il sommario, definire le informazioni del sommario e quindi creare elementi TOC che corrispondono a pagine specifiche o sezioni del documento.

#### D: Posso personalizzare l'aspetto del sommario?

R: Sì, puoi personalizzare l'aspetto del sommario impostando varie proprietà degli elementi TOC, come la dimensione del carattere, lo stile del carattere e l'allineamento. Aspose.PDF per .NET offre flessibilità nella progettazione del sommario in modo che corrisponda all'aspetto desiderato.

#### D: Aspose.PDF per .NET è adatto per aggiungere funzionalità avanzate ai documenti PDF?

R: Assolutamente, Aspose.PDF per .NET è una libreria ricca di funzionalità che consente di aggiungere funzionalità avanzate ai documenti PDF, inclusi elementi interattivi, campi modulo, firme digitali e altro ancora.