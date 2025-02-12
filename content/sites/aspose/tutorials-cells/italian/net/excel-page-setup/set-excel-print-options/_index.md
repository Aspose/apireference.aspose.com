---
title: Imposta le opzioni di stampa di Excel
linktitle: Imposta le opzioni di stampa di Excel
second_title: Riferimento all'API Aspose.Cells per .NET
description: Impara a manipolare i file Excel e personalizzare le opzioni di stampa con facilità utilizzando Aspose.Cells per .NET.
type: docs
weight: 150
url: /it/net/excel-page-setup/set-excel-print-options/
---
In questa guida, ti illustreremo come impostare le opzioni di stampa per una cartella di lavoro di Excel utilizzando Aspose.Cells per .NET. Ti guideremo passo dopo passo attraverso il codice sorgente C# fornito per eseguire questa operazione.

## Passaggio 1: configurazione dell'ambiente

Prima di iniziare, assicurati di aver impostato il tuo ambiente di sviluppo e installato Aspose.Cells per .NET. È possibile scaricare l'ultima versione della libreria dal sito Web ufficiale di Aspose.

## Passaggio 2: importa gli spazi dei nomi richiesti

Nel tuo progetto C#, importa gli spazi dei nomi necessari per lavorare con Aspose.Cells:

```csharp
using Aspose.Cells;
```

## Passaggio 3: impostazione del percorso della directory dei documenti

 Dichiara un`dataDir` variabile per specificare il percorso della directory in cui si desidera salvare il file Excel generato:

```csharp
string dataDir = "YOUR_DIRECTORY_OF_DOCUMENTS";
```

 Assicurati di sostituire`"YOUR_DOCUMENT_DIRECTORY"` con il percorso corretto sul tuo sistema.

## Passaggio 4: creazione di un oggetto cartella di lavoro

Crea un'istanza di un oggetto Workbook che rappresenta la cartella di lavoro di Excel che desideri creare:

```csharp
Workbook workbook = new Workbook();
```

## Passaggio 5: ottenere il riferimento PageSetup del foglio di lavoro

Per impostare le opzioni di stampa, dobbiamo prima ottenere il riferimento PageSetup dal foglio di lavoro. Utilizzare il seguente codice per ottenere il riferimento:

```csharp
PageSetup pageSetup = workbook.Worksheets[0].PageSetup;
```

## Passaggio 6: abilitare la stampa delle linee della griglia

Per abilitare la stampa delle linee della griglia, utilizzare il seguente codice:

```csharp
pageSetup. PrintGridlines = true;
```

## Passaggio 7: abilitare la stampa dell'intestazione di riga/colonna

Per abilitare la stampa delle intestazioni di righe e colonne, utilizzare il seguente codice:

```csharp
pageSetup.PrintHeadings = true;
```

## Passaggio 8: abilitazione della modalità di stampa in bianco e nero

Per abilitare la stampa del foglio di lavoro in modalità bianco e nero, utilizzare il seguente codice:

```csharp
pageSetup.BlackAndWhite = true;
```

## Passaggio 9: abilitazione della stampa di feedback

Per consentire la stampa dei commenti così come appaiono sul foglio di calcolo, utilizzare il seguente codice:

```csharp
pageSetup.PrintComments = PrintCommentsType.PrintInPlace;
```

## Passaggio 10: abilitare la stampa in modalità bozza

Per abilitare la stampa del foglio di calcolo in modalità bozza, utilizzare il seguente codice:

```csharp
pageSetup.PrintDraft = true;
```

## Passaggio 11: abilitare la stampa degli errori della cella come N/D

Per consentire la stampa degli errori di cella come

  di N/A, utilizzare il seguente codice:

```csharp
pageSetup.PrintErrors = PrintErrorsType.PrintErrorsNA;
```

## Passaggio 12: salvare la cartella di lavoro di Excel

 Per salvare la cartella di lavoro di Excel con le opzioni di stampa impostate, utilizzare il file`Save` metodo dell'oggetto Workbook:

```csharp
workbook.Save(dataDir + "OtherPrintOptions_out.xls");
```

Ciò salverà la cartella di lavoro di Excel con il nome file "OtherPrintOptions_out.xls" nella directory specificata.

### Esempio di codice sorgente per Imposta opzioni di stampa di Excel utilizzando Aspose.Cells per .NET 
```csharp
// Il percorso della directory dei documenti.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Istanziare un oggetto Workbook
Workbook workbook = new Workbook();
// Ottenere il riferimento del PageSetup del foglio di lavoro
PageSetup pageSetup = workbook.Worksheets[0].PageSetup;
// Consente di stampare le linee della griglia
pageSetup.PrintGridlines = true;
// Consente di stampare intestazioni di riga/colonna
pageSetup.PrintHeadings = true;
// Consentire di stampare il foglio di lavoro in modalità bianco e nero
pageSetup.BlackAndWhite = true;
// Consentire di stampare i commenti come visualizzati sul foglio di lavoro
pageSetup.PrintComments = PrintCommentsType.PrintInPlace;
// Consentire di stampare fogli di lavoro con qualità bozza
pageSetup.PrintDraft = true;
// Consentire di stampare gli errori di cella come N/A
pageSetup.PrintErrors = PrintErrorsType.PrintErrorsNA;
// Salva la cartella di lavoro.
workbook.Save(dataDir + "OtherPrintOptions_out.xls");
```
## Conclusione

Ora hai imparato come impostare le opzioni di stampa per una cartella di lavoro di Excel utilizzando Aspose.Cells per .NET. Questa libreria potente e intuitiva ti consente di personalizzare le impostazioni di stampa delle cartelle di lavoro di Excel in modo semplice ed efficiente.

### Domande frequenti


#### 1. Posso personalizzare ulteriormente le opzioni di stampa, come i margini o l'orientamento della pagina?

Sì, Aspose.Cells per .NET offre una vasta gamma di opzioni di stampa personalizzabili, come margini, orientamento della pagina, scala, ecc.

#### 2. Aspose.Cells per .NET supporta altri formati di file Excel?

Sì, Aspose.Cells per .NET supporta una varietà di formati di file Excel, come XLSX, XLS, CSV, HTML, PDF, ecc.

#### 3. Aspose.Cells per .NET è compatibile con tutte le versioni di .NET Framework?

Aspose.Cells per .NET è compatibile con .NET Framework 2.0 o successivo, comprese le versioni 3.5, 4.0, 4.5, 4.6, ecc.