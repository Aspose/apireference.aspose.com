---
title: TxtSaveOptions.AddBidiMarks
linktitle: AddBidiMarks
articleTitle: AddBidiMarks
second_title: Aspose.Words for .NET
description: Discover how the TxtSaveOptions AddBidiMarks property enhances plain text exports by adding bidirectional marks for improved readability and formatting.
type: docs
weight: 20
url: /net/aspose.words.saving/txtsaveoptions/addbidimarks/
---
## TxtSaveOptions.AddBidiMarks property

Specifies whether to add bi-directional marks before each BiDi run when exporting in plain text format.

The default value is `false`.

```csharp
public bool AddBidiMarks { get; set; }
```

## Examples

Shows how to insert Unicode Character 'RIGHT-TO-LEFT MARK' (U+200F) before each bi-directional Run in text.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Hello world!");
builder.ParagraphFormat.Bidi = true;
builder.Writeln("שלום עולם!");
builder.Writeln("مرحبا بالعالم!");

// Create a "TxtSaveOptions" object, which we can pass to the document's "Save" method
// to modify how we save the document to plaintext.
TxtSaveOptions saveOptions = new TxtSaveOptions { Encoding = System.Text.Encoding.Unicode};

// Set the "AddBidiMarks" property to "true" to add marks before runs
// with right-to-left text to indicate the fact.
// Set the "AddBidiMarks" property to "false" to write all left-to-right
// and right-to-left run equally with nothing to indicate which is which.
saveOptions.AddBidiMarks = addBidiMarks;

doc.Save(ArtifactsDir + "TxtSaveOptions.AddBidiMarks.txt", saveOptions);

string docText = System.Text.Encoding.Unicode.GetString(File.ReadAllBytes(ArtifactsDir + "TxtSaveOptions.AddBidiMarks.txt"));

if (addBidiMarks)
{
    Assert.That(docText, Is.EqualTo("\uFEFFHello world!‎\r\nשלום עולם!‏\r\nمرحبا بالعالم!‏\r\n\r\n"));
    Assert.That(docText.Contains("\u200f"), Is.True);
}
else
{
    Assert.That(docText, Is.EqualTo("\uFEFFHello world!\r\nשלום עולם!\r\nمرحبا بالعالم!\r\n\r\n"));
    Assert.That(docText.Contains("\u200f"), Is.False);
}
```

### See Also

* class [TxtSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
