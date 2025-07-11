---
title: WriteProtection Class
linktitle: WriteProtection
articleTitle: WriteProtection
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Settings.WriteProtection class to easily manage document write protection settings and enhance your document security.
type: docs
weight: 6800
url: /net/aspose.words.settings/writeprotection/
---
## WriteProtection class

Specifies write protection settings for a document.

To learn more, visit the [Protect or Encrypt a Document](https://docs.aspose.com/words/net/protect-or-encrypt-a-document/) documentation article.

```csharp
public class WriteProtection
```

## Properties

| Name | Description |
| --- | --- |
| [IsWriteProtected](../../aspose.words.settings/writeprotection/iswriteprotected/) { get; } | Returns `true` when a write protection password is set. |
| [ReadOnlyRecommended](../../aspose.words.settings/writeprotection/readonlyrecommended/) { get; set; } | Specifies whether the document author has recommended that the document be opened as read-only. |

## Methods

| Name | Description |
| --- | --- |
| [SetPassword](../../aspose.words.settings/writeprotection/setpassword/)(*string*) | Sets the write protection password for the document. |
| [ValidatePassword](../../aspose.words.settings/writeprotection/validatepassword/)(*string*) | Returns `true` if the specified password is the same as the write-protection password the document was protected with. If document is not write-protected with password then returns `false`. |

## Remarks

Write protection specifies whether the author has recommended that the document is to be opened as read-only and/or require a password to modify a document.

Write protection is different from document protection. Write protection is specified in Microsoft Word in the options of the Save As dialog box.

You do not create instances of this class directly. You access document protection settings via the [`WriteProtection`](../../aspose.words/document/writeprotection/) property.

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

* namespace [Aspose.Words.Settings](../../aspose.words.settings/)
* assembly [Aspose.Words](../../)
