---
title: ParagraphFormat.LinesToDrop
linktitle: LinesToDrop
articleTitle: LinesToDrop
second_title: Aspose.Words for .NET
description: Discover how the ParagraphFormat LinesToDrop property enhances drop cap height in your documents. Optimize your text layout for stunning visuals!
type: docs
weight: 210
url: /net/aspose.words/paragraphformat/linestodrop/
---
## ParagraphFormat.LinesToDrop property

Gets or sets the number of lines of the paragraph text used to calculate the drop cap height.

```csharp
public int LinesToDrop { get; set; }
```

## Examples

Shows how to set the size of a drop cap.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Modify the "LinesToDrop" property to designate a paragraph as a drop cap,
// which will turn it into a large capital letter that will decorate the next paragraph.
// Give this property a value of 4 to give the drop cap the height of four text lines.
builder.ParagraphFormat.LinesToDrop = 4;
builder.Writeln("H");

// Reset the "LinesToDrop" property to 0 to turn the next paragraph into an ordinary paragraph.
// The text in this paragraph will wrap around the drop cap.
builder.ParagraphFormat.LinesToDrop = 0;
builder.Writeln("ello world!");

doc.Save(ArtifactsDir + "ParagraphFormat.LinesToDrop.odt");
```

### See Also

* class [ParagraphFormat](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
