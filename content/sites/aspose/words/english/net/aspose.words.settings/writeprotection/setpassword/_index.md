---
title: WriteProtection.SetPassword
linktitle: SetPassword
articleTitle: SetPassword
second_title: Aspose.Words for .NET
description: Secure your documents with the WriteProtection SetPassword method. Easily set a password to enhance document security and prevent unauthorized access.
type: docs
weight: 30
url: /net/aspose.words.settings/writeprotection/setpassword/
---
## WriteProtection.SetPassword method

Sets the write protection password for the document.

```csharp
public void SetPassword(string password)
```

| Parameter | Type | Description |
| --- | --- | --- |
| password | String | The password to set. Cannot be `null`, but can be an empty string. |

## Remarks

If a password is set, Microsoft Word will require the user to enter it or open the document as read-only.

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

* class [WriteProtection](../)
* namespace [Aspose.Words.Settings](../../../aspose.words.settings/)
* assembly [Aspose.Words](../../../)
