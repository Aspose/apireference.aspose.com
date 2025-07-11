---
title: TxtSaveOptionsBase.ParagraphBreak
linktitle: ParagraphBreak
articleTitle: ParagraphBreak
second_title: Aspose.Words for .NET
description: Discover TxtSaveOptionsBase's ParagraphBreak property, allowing custom paragraph breaks for seamless text format exports. Enhance your document's readability!
type: docs
weight: 40
url: /net/aspose.words.saving/txtsaveoptionsbase/paragraphbreak/
---
## TxtSaveOptionsBase.ParagraphBreak property

Specifies the string to use as a paragraph break when exporting in text formats.

```csharp
public string ParagraphBreak { get; set; }
```

## Remarks

The default value is [`CrLf`](../../../aspose.words/controlchar/crlf/).

## Examples

Shows how to save a .txt document with a custom paragraph break.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Paragraph 1.");
builder.Writeln("Paragraph 2.");
builder.Write("Paragraph 3.");

// Create a "TxtSaveOptions" object, which we can pass to the document's "Save" method
// to modify how we save the document to plaintext.
TxtSaveOptions txtSaveOptions = new TxtSaveOptions();

Assert.That(txtSaveOptions.SaveFormat, Is.EqualTo(SaveFormat.Text));

// Set the "ParagraphBreak" to a custom value that we wish to put at the end of every paragraph.
txtSaveOptions.ParagraphBreak = " End of paragraph.\n\n\t";

doc.Save(ArtifactsDir + "TxtSaveOptions.ParagraphBreak.txt", txtSaveOptions);

string docText = File.ReadAllText(ArtifactsDir + "TxtSaveOptions.ParagraphBreak.txt");

Assert.That(docText, Is.EqualTo("Paragraph 1. End of paragraph.\n\n\t" +
                "Paragraph 2. End of paragraph.\n\n\t" +
                "Paragraph 3. End of paragraph.\n\n\t"));
```

### See Also

* class [TxtSaveOptionsBase](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
