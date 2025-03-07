---
title: Aggiungi estensione Web
linktitle: Aggiungi estensione Web
second_title: Riferimento all'API Aspose.Cells per .NET
description: Aggiungi facilmente l'estensione web alle cartelle di lavoro di Excel con Aspose.Cells per .NET.
type: docs
weight: 40
url: /it/net/excel-workbook/add-web-extension/
---
In questo tutorial passo passo, spiegheremo il codice sorgente C# fornito che ti permetterà di aggiungere un'estensione web usando Aspose.Cells per .NET. Seguire i passaggi seguenti per aggiungere un'estensione Web alla cartella di lavoro di Excel.

## Passaggio 1: imposta la directory di output

```csharp
// Cartella di destinazione
string outDir = RunExamples.Get_OutputDirectory();
```

In questo primo passaggio, definiamo la directory di output in cui verrà salvata la cartella di lavoro di Excel modificata.

## Passaggio 2: creare una nuova cartella di lavoro

```csharp
//Crea una nuova cartella di lavoro
Workbook workbook = new Workbook();
```

 Qui stiamo creando una nuova cartella di lavoro di Excel utilizzando il file`Workbook` classe da Aspose.Cells.

## Passaggio 3: accedere alla raccolta di estensioni Web

```csharp
// Accedi alla raccolta di estensioni web
WebExtensionCollection extensions = workbook.Worksheets.WebExtensions;
```

 Accediamo alla raccolta di estensioni Web della cartella di lavoro di Excel utilizzando il file`WebExtensions` proprietà del`Worksheets` oggetto.

## Passaggio 4: aggiungi una nuova estensione web

```csharp
// Aggiungi una nuova estensione web
int extensionIndex = extensions.Add();
WebExtension extension = extensions[extensionIndex];
extension.Reference.Id = "wa104379955";
extension.Reference.StoreName = "en-US";
extension.Reference.StoreType = WebExtensionStoreType.OMEX;
```

Stiamo aggiungendo una nuova estensione web alla raccolta di estensioni. Definiamo l'ID di riferimento, il nome del negozio e il tipo di negozio dell'estensione.

## Passaggio 5: accedere alla raccolta di riquadri attività dell'estensione Web

```csharp
// Accedere alla raccolta del riquadro attività dell'estensione Web
WebExtensionTaskPaneCollection taskPanes = workbook.Worksheets.WebExtensionTaskPanes;
```

 Si accede alla raccolta di riquadri attività di Excel Workbook Web Extension utilizzando il file`WebExtensionTaskPanes` proprietà del`Worksheets` oggetto.

## Passaggio 6: aggiungere un nuovo riquadro attività

```csharp
// Aggiungi un nuovo riquadro attività
int taskPaneIndex = taskPanes.Add();
WebExtensionTaskPane taskPane = taskPanes[taskPaneIndex];
taskPane. IsVisible = true;
taskPane. DockState = "right";
taskPane. WebExtension = extension;
```

Stiamo aggiungendo un nuovo riquadro attività alla raccolta di riquadri attività. Impostiamo la visibilità del riquadro, il suo stato di ancoraggio e l'estensione web associata.

## Passaggio 7: salvare e chiudere la cartella di lavoro

```csharp
// Salva e chiudi la cartella di lavoro
workbook.Save(outDir + "AddWebExtension_Out.xlsx");
Console.WriteLine("AddWebExtension executed successfully.");
```

Salviamo la cartella di lavoro modificata nella directory di output specificata e quindi la chiudiamo.

### Esempio di codice sorgente per Aggiungi estensione Web utilizzando Aspose.Cells per .NET 
```csharp
//Rubrica di origine
string outDir = RunExamples.Get_OutputDirectory();
Workbook workbook = new Workbook();
WebExtensionCollection extensions = workbook.Worksheets.WebExtensions;
WebExtensionTaskPaneCollection taskPanes = workbook.Worksheets.WebExtensionTaskPanes;
int extensionIndex = extensions.Add();
int taskPaneIndex = taskPanes.Add();
WebExtension extension = extensions[extensionIndex];
extension.Reference.Id = "wa104379955";
extension.Reference.StoreName = "en-US";
extension.Reference.StoreType = WebExtensionStoreType.OMEX;
WebExtensionTaskPane taskPane = taskPanes[taskPaneIndex];
taskPane.IsVisible = true;
taskPane.DockState = "right";
taskPane.WebExtension = extension;
workbook.Save(outDir + "AddWebExtension_Out.xlsx");
Console.WriteLine("AddWebExtension executed successfully.");
```

## Conclusione

Congratulazioni! Ora hai imparato come aggiungere un'estensione web usando Aspose.Cells per .NET. Sperimenta con il codice ed esplora le funzionalità aggiuntive di Aspose.Cells per ottenere il massimo dalla manipolazione delle estensioni Web nelle cartelle di lavoro di Excel.

## Domande frequenti

#### D: Cos'è un'estensione Web in una cartella di lavoro di Excel?

R: Un'estensione Web in una cartella di lavoro di Excel è un componente che consente di aggiungere funzionalità aggiuntive a Excel mediante l'integrazione di applicazioni Web. Può offrire funzionalità interattive, dashboard personalizzati, integrazioni esterne e altro ancora.

#### Q: Come aggiungere un'estensione web alla cartella di lavoro di Excel con Aspose.Cells?

 A: Per aggiungere un'estensione web a una cartella di lavoro di Excel con Aspose.Cells, puoi seguire i passaggi forniti nella nostra guida passo passo. Usa il`WebExtensionCollection` E`WebExtensionTaskPaneCollection` classi per aggiungere e configurare l'estensione Web e il riquadro attività associato.

#### D: Quali informazioni sono necessarie per aggiungere un'estensione web?

R: Quando aggiungi un'estensione web, devi fornire l'ID SKU dell'estensione, il nome del negozio e il tipo di negozio. Queste informazioni aiutano a identificare e caricare correttamente l'estensione.

#### D: Posso aggiungere più estensioni Web a una singola cartella di lavoro di Excel?

 R: Sì, puoi aggiungere più estensioni Web a una singola cartella di lavoro di Excel. Usa il`Add` metodo della raccolta delle estensioni Web per aggiungere ciascuna estensione, quindi associarle ai riquadri attività corrispondenti.