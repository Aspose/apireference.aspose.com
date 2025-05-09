---
title: ParagraphFormat.NoSpaceBetweenParagraphsOfSameStyle
linktitle: NoSpaceBetweenParagraphsOfSameStyle
articleTitle: NoSpaceBetweenParagraphsOfSameStyle
second_title: Aspose.Words for .NET
description: Discover the ParagraphFormat NoSpaceBetweenParagraphsOfSameStyle property. Optimize your document layout by eliminating space between same-style paragraphs.
type: docs
weight: 250
url: /net/aspose.words/paragraphformat/nospacebetweenparagraphsofsamestyle/
---
## ParagraphFormat.NoSpaceBetweenParagraphsOfSameStyle property

When `true`, [`SpaceBefore`](../spacebefore/) and [`SpaceAfter`](../spaceafter/) will be ignored between the paragraphs of the same style.

```csharp
public bool NoSpaceBetweenParagraphsOfSameStyle { get; set; }
```

## Remarks

This setting only takes affect when applied to a paragraph style. If applied to a paragraph directly, it has no effect.

## Examples

Shows how to apply no spacing between paragraphs with the same style.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Apply a large amount of spacing before and after paragraphs that this builder will create.
builder.ParagraphFormat.SpaceBefore = 24;
builder.ParagraphFormat.SpaceAfter = 24;

// Set the "NoSpaceBetweenParagraphsOfSameStyle" flag to "true" to apply
// no spacing between paragraphs with the same style, which will group similar paragraphs.
// Leave the "NoSpaceBetweenParagraphsOfSameStyle" flag as "false"
// to evenly apply spacing to every paragraph.
builder.ParagraphFormat.NoSpaceBetweenParagraphsOfSameStyle = noSpaceBetweenParagraphsOfSameStyle;

builder.ParagraphFormat.Style = doc.Styles["Normal"];
builder.Writeln($"Paragraph in the \"{builder.ParagraphFormat.Style.Name}\" style.");
builder.Writeln($"Paragraph in the \"{builder.ParagraphFormat.Style.Name}\" style.");
builder.Writeln($"Paragraph in the \"{builder.ParagraphFormat.Style.Name}\" style.");
builder.ParagraphFormat.Style = doc.Styles["Quote"];
builder.Writeln($"Paragraph in the \"{builder.ParagraphFormat.Style.Name}\" style.");
builder.Writeln($"Paragraph in the \"{builder.ParagraphFormat.Style.Name}\" style.");
builder.ParagraphFormat.Style = doc.Styles["Normal"];
builder.Writeln($"Paragraph in the \"{builder.ParagraphFormat.Style.Name}\" style.");
builder.Writeln($"Paragraph in the \"{builder.ParagraphFormat.Style.Name}\" style.");

doc.Save(ArtifactsDir + "ParagraphFormat.ParagraphSpacingSameStyle.docx");
```

### See Also

* class [ParagraphFormat](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
