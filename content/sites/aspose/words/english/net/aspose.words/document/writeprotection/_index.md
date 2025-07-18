---
title: Document.WriteProtection
linktitle: WriteProtection
articleTitle: WriteProtection
second_title: Aspose.Words for .NET
description: Explore the Document WriteProtection property to manage your document's write protection settings effortlessly and enhance security.
type: docs
weight: 520
url: /net/aspose.words/document/writeprotection/
---
## Document.WriteProtection property

Provides access to the document write protection options.

```csharp
public WriteProtection WriteProtection { get; }
```

## Examples

Shows how to protect a document with a password.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("Hello world! This document is protected.");
// Enter a password up to 15 characters in length, and then verify the document's protection status.
doc.WriteProtection.SetPassword("MyPassword");
doc.WriteProtection.ReadOnlyRecommended = true;

Assert.That(doc.WriteProtection.IsWriteProtected, Is.True);
Assert.That(doc.WriteProtection.ValidatePassword("MyPassword"), Is.True);

// Protection does not prevent the document from being edited programmatically, nor does it encrypt the contents.
doc.Save(ArtifactsDir + "Document.WriteProtection.docx");
doc = new Document(ArtifactsDir + "Document.WriteProtection.docx");

Assert.That(doc.WriteProtection.IsWriteProtected, Is.True);

builder = new DocumentBuilder(doc);
builder.MoveToDocumentEnd();
builder.Writeln("Writing text in a protected document.");

Assert.That(doc.GetText().Trim(), Is.EqualTo("Hello world! This document is protected." +
                "\rWriting text in a protected document."));
```

### See Also

* class [WriteProtection](../../../aspose.words.settings/writeprotection/)
* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
