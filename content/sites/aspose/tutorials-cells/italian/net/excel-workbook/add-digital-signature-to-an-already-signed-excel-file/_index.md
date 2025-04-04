---
title: Aggiungi firma digitale a un file Excel già firmato
linktitle: Aggiungi firma digitale a un file Excel già firmato
second_title: Riferimento all'API Aspose.Cells per .NET
description: Aggiungi facilmente firme digitali ai file Excel esistenti con Aspose.Cells per .NET.
type: docs
weight: 30
url: /it/net/excel-workbook/add-digital-signature-to-an-already-signed-excel-file/
---
In questa guida dettagliata, spiegheremo il codice sorgente C# fornito che ti consentirà di aggiungere una firma digitale a un file Excel già firmato utilizzando Aspose.Cells per .NET. Seguire i passaggi seguenti per aggiungere una nuova firma digitale a un file Excel esistente.

## Passaggio 1: imposta le directory di origine e di output

```csharp
// directory di origine
string sourceDir = RunExamples.Get_SourceDirectory();

// Cartella di destinazione
string outputDir = RunExamples.Get_OutputDirectory();
```

In questo primo passaggio, definiamo le directory di origine e di output che verranno utilizzate per caricare il file Excel esistente e salvare il file con la nuova firma digitale.

## Passaggio 2: carica il file Excel esistente

```csharp
// Carica la cartella di lavoro Excel già firmata
Aspose.Cells.Workbook workbook = new Aspose.Cells.Workbook(sourceDir + "sampleDigitallySignedByCells.xlsx");
```

 Qui carichiamo il file Excel già firmato utilizzando l'estensione`Workbook` classe di Aspose.Cells.

## Passaggio 3: crea la raccolta di firme digitali

```csharp
// Creare la raccolta di firme digitali
Aspose.Cells.DigitalSignatures.DigitalSignatureCollection dsCollection = new Aspose.Cells.DigitalSignatures.DigitalSignatureCollection();
```

 Creiamo una nuova raccolta di firme digitali utilizzando il file`DigitalSignatureCollection` classe.

## Passaggio 4: creare un nuovo certificato

```csharp
// Crea un nuovo certificato
System.Security.Cryptography.X509Certificates.X509Certificate2 certificate = new System.Security.Cryptography.X509Certificates.X509Certificate2(certFileName, password);
```

Qui creiamo un nuovo certificato dal file e dalla password forniti.

## Passaggio 5: aggiungi una nuova firma digitale alla raccolta

```csharp
// Crea una nuova firma digitale
Aspose.Cells.DigitalSignatures.DigitalSignature signature = new Aspose.Cells.DigitalSignatures.DigitalSignature(certificate, "Aspose.Cells added a new digital signature to the already signed workbook.", DateTime.Now);

// Aggiungi la firma digitale alla raccolta
dsCollection.Add(signature);
```

 Creiamo una nuova firma digitale utilizzando il file`DigitalSignature` class e aggiungerlo alla raccolta di firme digitali.

## Passaggio 6: aggiungere la raccolta di firme digitali alla cartella di lavoro

```csharp
//Aggiungere la raccolta di firme digitali alla cartella di lavoro
workbook.AddDigitalSignature(dsCollection);
```

 Aggiungiamo la raccolta di firme digitali alla cartella di lavoro di Excel esistente utilizzando il file`AddDigitalSignature()` metodo.

## Passaggio 7: salvare e chiudere la cartella di lavoro

```csharp
// Salva la cartella di lavoro e chiudila
workbook.Save(outputDir + "outputDigitallySignedByCells.xlsx");
workbook.Dispose();
```

Salviamo la cartella di lavoro con la nuova firma digitale nella directory di output specificata, quindi la chiudiamo e rilasciamo le risorse associate.

### Esempio di codice sorgente per Aggiungi firma digitale a un file Excel già firmato utilizzando Aspose.Cells per .NET 
```csharp
//Rubrica di origine
string sourceDir = RunExamples.Get_SourceDirectory();
//Cartella di destinazione
string outputDir = RunExamples.Get_OutputDirectory();
//File di certificato e relativa password
string certFileName = sourceDir + "AsposeDemo.pfx";
string password = "aspose";
//Carica la cartella di lavoro già firmata digitalmente per aggiungere una nuova firma digitale
Aspose.Cells.Workbook workbook = new Aspose.Cells.Workbook(sourceDir + "sampleDigitallySignedByCells.xlsx");
//Creare la raccolta di firme digitali
Aspose.Cells.DigitalSignatures.DigitalSignatureCollection dsCollection = new Aspose.Cells.DigitalSignatures.DigitalSignatureCollection();
//Crea nuovo certificato
System.Security.Cryptography.X509Certificates.X509Certificate2 certificate = new System.Security.Cryptography.X509Certificates.X509Certificate2(certFileName, password);
//Crea una nuova firma digitale e aggiungila nella raccolta delle firme digitali
Aspose.Cells.DigitalSignatures.DigitalSignature signature = new Aspose.Cells.DigitalSignatures.DigitalSignature(certificate, "Aspose.Cells added new digital signature in existing digitally signed workbook.", DateTime.Now);
dsCollection.Add(signature);
//Aggiungi la raccolta di firme digitali all'interno della cartella di lavoro
workbook.AddDigitalSignature(dsCollection);
//Salva la cartella di lavoro ed eliminala.
workbook.Save(outputDir + "outputDigitallySignedByCells.xlsx");
workbook.Dispose();
Console.WriteLine("AddDigitalSignatureToAnAlreadySignedExcelFile executed successfully.\r\n");
```

## Conclusione

Congratulazioni! Ora hai imparato come aggiungere una firma digitale a un file Excel già firmato utilizzando Aspose.Cells per .NET. Le firme digitali aggiungono un ulteriore livello di sicurezza ai tuoi file Excel, garantendone l'autenticità e l'integrità.

### FAQ

#### D: Cos'è Aspose.Cells per .NET?

R: Aspose.Cells per .NET è una potente libreria di classi che consente agli sviluppatori .NET di creare, modificare, convertire e manipolare file Excel con facilità.

#### D: Cos'è una firma digitale in un file Excel?

R: Una firma digitale in un file Excel è un marchio elettronico che garantisce l'autenticità, l'integrità e l'origine del documento. Viene utilizzato per verificare che il file non sia stato modificato da quando è stato firmato e provenga da una fonte affidabile.

#### D: Quali sono i vantaggi dell'aggiunta di una firma digitale a un file Excel?

R: L'aggiunta di una firma digitale a un file Excel offre numerosi vantaggi, tra cui la protezione da modifiche non autorizzate, la garanzia dell'integrità dei dati, l'autenticazione dell'autore del documento e l'affidamento delle informazioni in esso contenute.

#### D: Posso aggiungere più firme digitali a un file Excel?

A: Sì, Aspose.Cells ti consente di aggiungere più firme digitali a un file Excel. È possibile creare una raccolta di firme digitali e aggiungerle al file in un'unica operazione.

#### D: Quali sono i requisiti per aggiungere una firma digitale a un file Excel?

R: Per aggiungere una firma digitale a un file Excel, è necessario un certificato digitale valido che verrà utilizzato per firmare il documento. Assicurati di avere il certificato e la password corretti prima di aggiungere la firma digitale.