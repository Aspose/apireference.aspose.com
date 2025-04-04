---
title: ParagraphFormat.OutlineLevel
linktitle: OutlineLevel
articleTitle: OutlineLevel
second_title: Aspose.Words for .NET
description: Discover the ParagraphFormat OutlineLevel property to easily define paragraph hierarchy in your documents, enhancing organization and readability.
type: docs
weight: 260
url: /net/aspose.words/paragraphformat/outlinelevel/
---
## ParagraphFormat.OutlineLevel property

Specifies the outline level of the paragraph in the document.

```csharp
public OutlineLevel OutlineLevel { get; set; }
```

## Examples

Shows how to configure paragraph outline levels to create collapsible text.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Each paragraph has an OutlineLevel, which could be any number from 1 to 9, or at the default "BodyText" value.
// Setting the property to one of the numbered values will show an arrow to the left
// of the beginning of the paragraph.
builder.ParagraphFormat.OutlineLevel = OutlineLevel.Level1;
builder.Writeln("Paragraph outline level 1.");

// Level 1 is the topmost level. If there is a paragraph with a lower level below a paragraph with a higher level,
// collapsing the higher-level paragraph will collapse the lower level paragraph.
builder.ParagraphFormat.OutlineLevel = OutlineLevel.Level2;
builder.Writeln("Paragraph outline level 2.");

// Two paragraphs of the same level will not collapse each other,
// and the arrows do not collapse the paragraphs they point to.
builder.ParagraphFormat.OutlineLevel = OutlineLevel.Level3;
builder.Writeln("Paragraph outline level 3.");
builder.Writeln("Paragraph outline level 3.");

// The default "BodyText" value is the lowest, which a paragraph of any level can collapse.
builder.ParagraphFormat.OutlineLevel = OutlineLevel.BodyText;
builder.Writeln("Paragraph at main text level.");

doc.Save(ArtifactsDir + "ParagraphFormat.ParagraphOutlineLevel.docx");
```

### See Also

* enum [OutlineLevel](../../outlinelevel/)
* class [ParagraphFormat](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
