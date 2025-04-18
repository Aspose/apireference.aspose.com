---
title: Ottieni risorsa di annotazione
linktitle: Ottieni risorsa di annotazione
second_title: Aspose.PDF per riferimento API .NET
description: Scopri come recuperare la risorsa di un'annotazione utilizzando Aspose.PDF per .NET con questa guida dettagliata.
type: docs
weight: 90
url: /it/net/annotations/getresourceofannotation/
---
L'esempio mostra come ottenere risorse di annotazione con Aspose.PDF per .NET. Per ottenere la risorsa di un'annotazione utilizzando Aspose.PDF per .NET, attenersi alla seguente procedura:

## Passaggio 1: impostare il percorso della directory in cui si trova il documento.

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## Passaggio 2: aprire il documento PDF che contiene l'annotazione di cui si desidera ottenere la risorsa.

```csharp
Document doc = new Document(dataDir + "AddAnnotation.pdf");
```

## Passaggio 3: creare un'annotazione.

```csharp
ScreenAnnotation sa = new ScreenAnnotation(doc.Pages[1], new Rectangle(100, 400, 300, 600), dataDir + "AddSwfFileAsAnnotation.swf");
```

## Passaggio 4: aggiungere l'annotazione a una pagina del documento.

```csharp
doc.Pages[1].Annotations.Add(sa);
```

## Passaggio 5: salvare il documento.

```csharp
doc.Save(dataDir + "GetResourceOfAnnotation_Out.pdf");
```

## Passaggio 6: aprire il documento modificato.

```csharp
Document doc1 = new Document(dataDir + "GetResourceOfAnnotation_Out.pdf");
```

## Passaggio 7: ottenere l'azione dell'annotazione.

```csharp
RenditionAction action = (doc.Pages[1].Annotations[1] as ScreenAnnotation).Action as RenditionAction;
```

## Passaggio 7: ottenere la resa dell'azione.

```csharp
Rendition rendition = ((doc.Pages[1].Annotations[1] as ScreenAnnotation).Action as RenditionAction).Rendition;
```

## Passaggio 8: ottieni il clip multimediale.

```csharp
MediaClip clip = (rendition as MediaRendition).MediaClip;
```

## Passaggio 9: ottenere la specifica del file.

```csharp
FileSpecification data = (clip as MediaClipData).Data;
```

## Passaggio 10: leggere i dati del supporto.

```csharp
MemoryStream ms = new MemoryStream();
byte[] buffer = new byte[1024];
int read = 0;
Stream source = data.Contents;
while ((read = source.Read(buffer, 0, buffer.Length)) > 0)
{
   ms.Write(buffer, 0, read);
}
```

## Passo 11: stampa il nome della resa e l'operazione di resa.

```csharp
Console.WriteLine(rendition.Name);
Console.WriteLine(action.RenditionOperation);
```

Seguendo questi passaggi, puoi facilmente ottenere la risorsa di un'annotazione in un documento PDF utilizzando Aspose.PDF per .NET.

### Esempio di codice sorgente per Ottieni risorsa di annotazione utilizzando Aspose.PDF per .NET:

```csharp
// Il percorso della directory dei documenti.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Apri documento
Document doc = new Document(dataDir + "AddAnnotation.pdf");
//Crea annotazione
ScreenAnnotation sa = new ScreenAnnotation(doc.Pages[1], new Rectangle(100, 400, 300, 600), dataDir + "AddSwfFileAsAnnotation.swf");
doc.Pages[1].Annotations.Add(sa);
// Salva documento
doc.Save(dataDir + "GetResourceOfAnnotation_Out.pdf");
// Apri documento
Document doc1 = new Document(dataDir + "GetResourceOfAnnotation_Out.pdf");
//Ottenere l'azione dell'annotazione
RenditionAction action = (doc.Pages[1].Annotations[1] as ScreenAnnotation).Action as RenditionAction;
//Ottieni la consegna dell'azione di consegna
Rendition rendition = ((doc.Pages[1].Annotations[1] as ScreenAnnotation).Action as RenditionAction).Rendition;
// Clip multimediale
MediaClip clip = (rendition as MediaRendition).MediaClip;
FileSpecification data = (clip as MediaClipData).Data;
MemoryStream ms = new MemoryStream();
byte[] buffer = new byte[1024];
int read = 0;
//I dati dei supporti sono accessibili in FileSpecification.Contents
Stream source = data.Contents;
while ((read = source.Read(buffer, 0, buffer.Length)) > 0)
{
ms.Write(buffer, 0, read);
}
Console.WriteLine(rendition.Name);
Console.WriteLine(action.RenditionOperation);
```

## Conclusione

In questo tutorial, abbiamo esplorato come ottenere la risorsa di una particolare annotazione da un documento PDF utilizzando Aspose.PDF per .NET. Seguendo la guida dettagliata e utilizzando il codice sorgente C# fornito, gli sviluppatori possono accedere e gestire facilmente le annotazioni, incluse le annotazioni di conversione, nei loro documenti PDF.

### FAQ

#### D: Cos'è una resa nel contesto delle annotazioni PDF?

R: Nel contesto delle annotazioni PDF, una resa è una presentazione di contenuto multimediale. Consente di incorporare contenuti multimediali, come audio o video, all'interno del documento PDF. L'annotazione della resa specifica il supporto da presentare e come deve essere riprodotto.

#### D: Posso ottenere il nome del file multimediale associato a un'annotazione di riproduzione?

 R: Sì, puoi ottenere il nome del file multimediale associato a un'annotazione di resa utilizzando Aspose.PDF per .NET. È possibile accedere al nome del file multimediale tramite il file`FileSpecification` del`MediaClip` oggetto.

#### D: Aspose.PDF per .NET può estrarre file multimediali da un'annotazione di resa?

R: Sì, Aspose.PDF per .NET può estrarre i dati multimediali da un'annotazione di resa, che include contenuti audio o video, e salvarli come file separato.

#### D: Come posso accedere ai dati multimediali di un'annotazione di resa?

 R: È possibile accedere ai dati multimediali di un'annotazione di resa tramite il file`FileSpecification.Contents` proprietà del`MediaClipData` oggetto.

#### D: Posso modificare il supporto associato a un'annotazione di resa utilizzando Aspose.PDF per .NET?

R: Aspose.PDF per .NET fornisce metodi per accedere e modificare i dati multimediali associati a un'annotazione di resa. È possibile aggiornare o sostituire il file multimediale utilizzato da un'annotazione di riproduzione.