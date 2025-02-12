---
title: Abilita Disabilita sostituzione carattere
linktitle: Abilita Disabilita sostituzione carattere
second_title: Riferimento all'API Aspose.Words per .NET
description: In questo tutorial, scopri come abilitare o disabilitare la sostituzione dei caratteri in un documento Word con Aspose.Words per .NET.
type: docs
weight: 10
url: /it/net/working-with-fonts/enable-disable-font-substitution/
---
In questo tutorial, ti illustreremo come abilitare o disabilitare la sostituzione dei caratteri in un documento Word durante il rendering utilizzando la libreria Aspose.Words per .NET. L'abilitazione o la disabilitazione della sostituzione dei caratteri consente di controllare se i caratteri mancanti vengono sostituiti automaticamente con un carattere predefinito. Ti guideremo passo dopo passo per aiutarti a comprendere e implementare il codice nel tuo progetto .NET.

## Prerequisiti
Prima di iniziare, assicurati di avere i seguenti elementi:
- Conoscenza operativa del linguaggio di programmazione C#
- La libreria Aspose.Words per .NET installata nel tuo progetto
- Un documento di Word di cui vuoi eseguire il rendering con o senza la sostituzione dei caratteri

## Passaggio 1: definire la directory dei documenti
 Innanzitutto, devi impostare il percorso della directory nella posizione del documento di Word. Sostituire`"YOUR DOCUMENT DIRECTORY"` nel codice con il percorso appropriato.

```csharp
// Percorso della directory dei documenti
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Passaggio 2: caricare il documento e configurare le impostazioni del carattere
 Successivamente, caricheremo il documento Word di cui desideri eseguire il rendering e creeremo un'istanza del file`FontSettings` class per gestire le impostazioni dei caratteri. Imposteremo l'override del carattere predefinito specificando il nome del carattere in`DefaultFontName` e disabilitare l'override delle informazioni sui caratteri con`Enabled` impostato`false`.

```csharp
//Carica il documento
Document doc = new Document(dataDir + "Rendering.docx");

// Configura le impostazioni dei caratteri
FontSettings fontSettings = new FontSettings();
fontSettings.SubstitutionSettings.DefaultFontSubstitution.DefaultFontName = "Arial";
fontSettings.SubstitutionSettings.FontInfoSubstitution.Enabled = false;

// Applicare le impostazioni del carattere al documento
doc.FontSettings = fontSettings;
```

## Passaggio 3: salvare il documento renderizzato
Infine, salveremo il documento renderizzato, che rispetterà le impostazioni di sovrascrittura dei font definite.

```csharp
doc.Save(dataDir + "WorkingWithFonts.EnableDisableFontSubstitution.pdf");
```


### Esempio di codice sorgente per Enable Disable Font Substitution using Aspose.Words per .NET 

```csharp

// Percorso della directory dei documenti
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document(dataDir + "Rendering.docx");
FontSettings fontSettings = new FontSettings();
fontSettings.SubstitutionSettings.DefaultFontSubstitution.DefaultFontName = "Arial";
fontSettings.SubstitutionSettings.FontInfoSubstitution.Enabled = false;
doc.FontSettings = fontSettings;
doc.Save(dataDir + "WorkingWithFonts.EnableDisableFontSubstitution.pdf");

```

## Conclusione
In questo tutorial, abbiamo visto come abilitare o disabilitare la sostituzione dei caratteri in un documento Word durante il rendering con Aspose.Words per .NET. Controllando la sostituzione dei caratteri, puoi influenzare il modo in cui i caratteri mancanti vengono gestiti nei tuoi documenti renderizzati. Non esitare a utilizzare questa funzione per personalizzare la gestione dei caratteri nei tuoi documenti Word.