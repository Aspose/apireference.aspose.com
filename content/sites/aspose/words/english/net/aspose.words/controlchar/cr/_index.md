---
title: ControlChar.Cr
linktitle: Cr
articleTitle: Cr
second_title: Aspose.Words for .NET
description: Discover ControlChar Cr, the carriage return character (x000d or r) that enhances text formatting. Simplify your coding with our unique solutions!
type: docs
weight: 50
url: /net/aspose.words/controlchar/cr/
---
## ControlChar.Cr field

Carriage return character: "\x000d" or "\r". Same as [`ParagraphBreak`](../paragraphbreak/).

```csharp
public static readonly string Cr;
```

## Examples

Shows how to use control characters.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert paragraphs with text with DocumentBuilder.
builder.Writeln("Hello world!");
builder.Writeln("Hello again!");

// Converting the document to text form reveals that control characters
// represent some of the document's structural elements, such as page breaks.
Assert.That(doc.GetText(), Is.EqualTo($"Hello world!{ControlChar.Cr}" +
                $"Hello again!{ControlChar.Cr}" +
                ControlChar.PageBreak));

// When converting a document to string form,
// we can omit some of the control characters with the Trim method.
Assert.That(doc.GetText().Trim(), Is.EqualTo($"Hello world!{ControlChar.Cr}" +
                "Hello again!"));
```

### See Also

* class [ControlChar](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
