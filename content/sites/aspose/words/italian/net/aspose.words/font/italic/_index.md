---
title: Font.Italic
linktitle: Italic
articleTitle: Italic
second_title: Aspose.Words per .NET
description: Font Italic proprietà. Vero se il carattere è formattato come corsivo in C#.
type: docs
weight: 160
url: /it/net/aspose.words/font/italic/
---
## Font.Italic property

Vero se il carattere è formattato come corsivo.

```csharp
public bool Italic { get; set; }
```

## Esempi

Mostra come scrivere testo in corsivo utilizzando un generatore di documenti.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Font.Size = 36;
builder.Font.Italic = true;
builder.Writeln("Hello world!");

doc.Save(ArtifactsDir + "Font.Italic.docx");
```

### Guarda anche

* class [Font](../)
* spazio dei nomi [Aspose.Words](../../../aspose.words/)
* assemblea [Aspose.Words](../../../)
