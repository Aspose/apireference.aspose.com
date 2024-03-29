---
title: PlainTextDocument.Text
linktitle: Text
articleTitle: Text
second_title: Aspose.Words für .NET
description: PlainTextDocument Text eigendom. Ruft den als String verketteten Textinhalt des Dokuments ab in C#.
type: docs
weight: 40
url: /de/net/aspose.words/plaintextdocument/text/
---
## PlainTextDocument.Text property

Ruft den als String verketteten Textinhalt des Dokuments ab.

```csharp
public string Text { get; }
```

## Beispiele

Zeigt, wie der Inhalt eines Microsoft Word-Dokuments im Klartext geladen wird.

```csharp
Document doc = new Document(); 
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("Hello world!");

doc.Save(ArtifactsDir + "PlainTextDocument.Load.docx");

PlainTextDocument plaintext = new PlainTextDocument(ArtifactsDir + "PlainTextDocument.Load.docx");

Assert.AreEqual("Hello world!", plaintext.Text.Trim());
```

### Siehe auch

* class [PlainTextDocument](../)
* namensraum [Aspose.Words](../../../aspose.words/)
* Montage [Aspose.Words](../../../)
