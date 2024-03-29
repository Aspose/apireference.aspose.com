---
title: FindReplaceOptions.MatchCase
linktitle: MatchCase
articleTitle: MatchCase
second_title: Aspose.Words per .NET
description: FindReplaceOptions MatchCase proprietà. Vero indica un confronto con distinzione tra maiuscole e minuscole falso indica un confronto senza distinzione tra maiuscole e minuscole in C#.
type: docs
weight: 140
url: /it/net/aspose.words.replacing/findreplaceoptions/matchcase/
---
## FindReplaceOptions.MatchCase property

Vero indica un confronto con distinzione tra maiuscole e minuscole, falso indica un confronto senza distinzione tra maiuscole e minuscole.

```csharp
public bool MatchCase { get; set; }
```

## Esempi

Mostra come attivare la distinzione tra maiuscole e minuscole durante l'esecuzione di un'operazione di ricerca e sostituzione.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Ruby bought a ruby necklace.");

// Possiamo utilizzare un oggetto "FindReplaceOptions" per modificare il processo di ricerca e sostituzione.
FindReplaceOptions options = new FindReplaceOptions();

// Imposta il flag "MatchCase" su "true" per applicare la distinzione tra maiuscole e minuscole durante la ricerca delle stringhe da sostituire.
// Imposta il flag "MatchCase" su "false" per ignorare le maiuscole e minuscole durante la ricerca del testo da sostituire.
options.MatchCase = matchCase;

doc.Range.Replace("Ruby", "Jade", options);

Assert.AreEqual(matchCase ? "Jade bought a ruby necklace." : "Jade bought a Jade necklace.",
    doc.GetText().Trim());
```

### Guarda anche

* class [FindReplaceOptions](../)
* spazio dei nomi [Aspose.Words.Replacing](../../../aspose.words.replacing/)
* assemblea [Aspose.Words](../../../)
