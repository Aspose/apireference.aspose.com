---
title: Aggiungi elemento struttura nell'elemento
linktitle: Aggiungi elemento struttura nell'elemento
second_title: Aspose.PDF per riferimento API .NET
description: Guida passo-passo per aggiungere elemento struttura all'elemento nel documento PDF utilizzando Aspose.PDF per .NET.
type: docs
weight: 20
url: /it/net/programming-with-tagged-pdf/add-structure-element-into-element/
---
In questo tutorial, ti forniremo una guida passo passo su come aggiungere un elemento di struttura a un elemento in un documento PDF utilizzando Aspose.PDF per .NET. Aspose.PDF è una potente libreria che consente di creare, manipolare e convertire documenti PDF in modo programmatico. Utilizzando le caratteristiche della struttura del contenuto contrassegnato di Aspose.PDF, è possibile creare una struttura gerarchica nel documento PDF.

## Prerequisiti

Prima di iniziare, assicurati di disporre dei seguenti prerequisiti:

1. Visual Studio installato con .NET framework.
2. La libreria Aspose.PDF per .NET.

## Passaggio 1: impostazione del progetto

Per iniziare, crea un nuovo progetto in Visual Studio e aggiungi un riferimento alla libreria Aspose.PDF per .NET. Puoi scaricare la libreria dal sito Web ufficiale di Aspose e installarla sul tuo computer.

## Passaggio 2: importare gli spazi dei nomi necessari

Nel tuo file di codice C#, importa gli spazi dei nomi richiesti per accedere alle classi e ai metodi forniti da Aspose.PDF:

```csharp
using System;
using Aspose.Pdf;
using Aspose.Pdf.Tagged;
```

## Passaggio 3: Creazione del documento PDF e definizione degli elementi strutturati

Utilizzare il seguente codice per creare un documento PDF e definire gli elementi strutturati:

```csharp

string dataDir = "YOUR_DIRECTORY_OF_DOCUMENTS";
string outFile = dataDir + "AddStructureElementIntoElement_Output.pdf";
string logFile = dataDir + "46144_log.xml";

Document document = new Document();
ITaggedContent taggedContent = document.TaggedContent;
taggedContent.SetTitle("Example Text Items");
taggedContent.SetLanguage("fr-FR");

StructureElement rootElement = taggedContent.RootElement;

ParagraphElement p1 = taggedContent.CreateParagraphElement();
rootElement.AppendChild(p1);
SpanElement span11 = taggedContent.CreateSpanElement();
span11.SetText("Span_11");
SpanElement span12 = taggedContent.CreateSpanElement();
span12.SetText(" and Span_12.");
p1.SetText("Paragraph with ");
p1.AppendChild(span11);
p1.AppendChild(span12);

ParagraphElement p2 = taggedContent.CreateParagraphElement();
rootElement.AppendChild(p2);
SpanElement span21 = taggedContent.CreateSpanElement();
span21.SetText("Span_21");
SpanElement span22 = taggedContent.CreateSpanElement();
span22.SetText("Span_22.");
p2.AppendChild(span21);
p2.SetText(" and ");
p2.AppendChild(span22);

ParagraphElement p3 = taggedContent.CreateParagraphElement();
rootElement.AppendChild(p3);
SpanElement span31 = taggedContent.CreateSpanElement();
span31.SetText("Span_31");
SpanElement span32 = taggedContent.CreateSpanElement();
span32.SetText(" and Span_32");
p3.AppendChild(span31);
p3.AppendChild(span32);
p3.SetText(".");

ParagraphElement p4 = taggedContent.CreateParagraphElement();
root

Element.AppendChild(p4);
SpanElement span41 = taggedContent.CreateSpanElement();
SpanElement span411 = taggedContent.CreateSpanElement();
span411.SetText("Span_411, ");
span41.SetText("Span_41, ");
span41.AppendChild(span411);
SpanElement span42 = taggedContent.CreateSpanElement();
SpanElement span421 = taggedContent.CreateSpanElement();
span421.SetText("Span 421 and ");
span42.AppendChild(span421);
span42.SetText("Span_42");
p4.AppendChild(span41);
p4.AppendChild(span42);
p4.SetText(".");
```

Questo codice crea un documento PDF vuoto e aggiunge elementi strutturati come paragrafi e span. Ogni elemento della struttura viene creato utilizzando i metodi forniti da Aspose.PDF.

## Passaggio 4: salvare il documento PDF

Utilizzare il seguente codice per salvare il documento PDF:

```csharp
document. Save(outFile);
```

Questo codice salva il documento PDF con gli elementi strutturati in un file specificato.

### Codice sorgente di esempio per Aggiungi elemento struttura in elemento utilizzando Aspose.PDF per .NET 
```csharp
// Il percorso della directory dei documenti.
string dataDir = "YOUR DOCUMENT DIRECTORY";
string outFile = dataDir + "AddStructureElementIntoElement_Output.pdf";
string logFile = dataDir + "46144_log.xml";
// Documento di creazione e acquisizione di contenuti Pdf con tag
Document document = new Document();
ITaggedContent taggedContent = document.TaggedContent;
// Impostazione del titolo e della lingua della natura per il documento
taggedContent.SetTitle("Text Elements Example");
taggedContent.SetLanguage("en-US");
// Ottenere l'elemento della struttura principale (elemento della struttura del documento)
StructureElement rootElement = taggedContent.RootElement;
ParagraphElement p1 = taggedContent.CreateParagraphElement();
rootElement.AppendChild(p1);
SpanElement span11 = taggedContent.CreateSpanElement();
span11.SetText("Span_11");
SpanElement span12 = taggedContent.CreateSpanElement();
span12.SetText(" and Span_12.");
p1.SetText("Paragraph with ");
p1.AppendChild(span11);
p1.AppendChild(span12);
ParagraphElement p2 = taggedContent.CreateParagraphElement();
rootElement.AppendChild(p2);
SpanElement span21 = taggedContent.CreateSpanElement();
span21.SetText("Span_21");
SpanElement span22 = taggedContent.CreateSpanElement();
span22.SetText("Span_22.");
p2.AppendChild(span21);
p2.SetText(" and ");
p2.AppendChild(span22);
ParagraphElement p3 = taggedContent.CreateParagraphElement();
rootElement.AppendChild(p3);
SpanElement span31 = taggedContent.CreateSpanElement();
span31.SetText("Span_31");
SpanElement span32 = taggedContent.CreateSpanElement();
span32.SetText(" and Span_32");
p3.AppendChild(span31);
p3.AppendChild(span32);
p3.SetText(".");
ParagraphElement p4 = taggedContent.CreateParagraphElement();
rootElement.AppendChild(p4);
SpanElement span41 = taggedContent.CreateSpanElement();
SpanElement span411 = taggedContent.CreateSpanElement();
span411.SetText("Span_411, ");
span41.SetText("Span_41, ");
span41.AppendChild(span411);
SpanElement span42 = taggedContent.CreateSpanElement();
SpanElement span421 = taggedContent.CreateSpanElement();
span421.SetText("Span 421 and ");
span42.AppendChild(span421);
span42.SetText("Span_42");
p4.AppendChild(span41);
p4.AppendChild(span42);
p4.SetText(".");
// Salva documento PDF con tag
document.Save(outFile);
// Controllo della conformità PDF/UA
document = new Document(outFile);
bool isPdfUaCompliance = document.Validate(logFile, PdfFormat.PDF_UA_1);
Console.WriteLine(String.Format("PDF/UA compliance: {0}", isPdfUaCompliance));

```

## Conclusione

In questo tutorial, hai imparato come aggiungere un elemento struttura a un elemento in un documento PDF utilizzando Aspose.PDF per .NET. Utilizzando le caratteristiche della struttura del contenuto contrassegnato di Aspose.PDF, è possibile creare una struttura gerarchica nel documento PDF, che semplifica la gestione e la navigazione tra i contenuti.

### FAQ

#### D: Qual è lo scopo di aggiungere un elemento di struttura a un elemento in un documento PDF utilizzando Aspose.PDF per .NET?

R: L'aggiunta di un elemento di struttura a un elemento in un documento PDF utilizzando Aspose.PDF per .NET consente di creare una struttura gerarchica all'interno del contenuto del documento. Questa struttura gerarchica migliora l'organizzazione e la navigazione dei contenuti, facilitando la gestione e l'accesso a elementi specifici.

#### D: In che modo la libreria Aspose.PDF aiuta ad aggiungere elementi di struttura a un documento PDF?

R: Aspose.PDF per .NET è una potente libreria che offre funzionalità per la creazione, la manipolazione e la conversione di documenti PDF in modo programmatico. In questo tutorial, le caratteristiche della struttura del contenuto contrassegnato della libreria vengono sfruttate per creare e aggiungere elementi di struttura al contenuto del documento PDF.

#### D: Quali sono i prerequisiti per l'aggiunta di elementi di struttura a un documento PDF utilizzando Aspose.PDF per .NET?

R: Prima di iniziare, assicurati di aver installato Visual Studio con .NET Framework e di avere la libreria Aspose.PDF per .NET referenziata nel tuo progetto.

#### D: In che modo il codice C# fornito crea e aggiunge elementi di struttura al contenuto del documento PDF?

R: Il codice mostra come creare un documento PDF, definire un elemento della struttura radice e aggiungere vari elementi strutturati come paragrafi e estensioni. Ogni elemento strutturato viene creato utilizzando i metodi forniti da Aspose.PDF, consentendo di costruire una struttura gerarchica.

#### D: Posso personalizzare i tipi di elementi della struttura che aggiungo al documento PDF?

A: Sì, puoi personalizzare i tipi di elementi della struttura esplorando diversi metodi forniti dalla libreria Aspose.PDF. Il codice mostra paragrafi e span come esempi, ma puoi creare e aggiungere altri tipi di elementi strutturati secondo necessità.

#### D: Come definire la relazione gerarchica tra gli elementi della struttura aggiunti?

 R: La relazione gerarchica tra gli elementi della struttura è definita dall'ordine in cui li accodi ai loro elementi principali. Nel codice, le relazioni padre-figlio vengono stabilite utilizzando l'`AppendChild` metodo.

#### D: Quali sono i vantaggi della creazione di una struttura gerarchica in un documento PDF?

R: La creazione di una struttura gerarchica in un documento PDF ne migliora l'accessibilità, la navigazione e l'organizzazione. Consente alle tecnologie assistive di interpretare e trasmettere meglio il contenuto del documento, rendendolo più user-friendly per le persone con disabilità.

#### D: Come posso convalidare la conformità PDF/UA dopo aver aggiunto gli elementi della struttura?

 R: Il codice fornito nel tutorial dimostra come convalidare la conformità PDF/UA utilizzando il`Validate` metodo. Convalidando il documento rispetto allo standard PDF/UA, puoi garantire che gli elementi della struttura aggiunti siano conformi alle linee guida sull'accessibilità.

#### D: Posso utilizzare questo approccio per aggiungere elementi di struttura a un documento PDF esistente?

R: Sì, è possibile modificare l'approccio fornito per aggiungere elementi di struttura a un documento PDF esistente. Invece di creare un nuovo documento, dovresti caricare il documento esistente utilizzando Aspose.PDF e quindi seguire passaggi simili per aggiungere elementi della struttura.