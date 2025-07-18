---
title: PageSetup.CharactersPerLine
linktitle: CharactersPerLine
articleTitle: CharactersPerLine
second_title: Aspose.Words for .NET
description: Control your document layout with the PageSetup CharactersPerLine property. Easily adjust characters per line for optimal readability and design.
type: docs
weight: 100
url: /net/aspose.words/pagesetup/charactersperline/
---
## PageSetup.CharactersPerLine property

Gets or sets the number of characters per line in the document grid.

```csharp
public int CharactersPerLine { get; set; }
```

## Remarks

Minimum value of the property is 1. Maximum value depends on page width and font size of the Normal style. Minimum character pitch is 90 percent of the font size. For example, maximum number of characters per line of a Letter page with one-inch margins is 43.

By default, the property has a value, on which character pitch equals to font size of the Normal style.

## Examples

Shows how to specify a for the number of characters that each line may have.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Enable pitching, and then use it to set the number of characters per line in this section.
builder.PageSetup.LayoutMode = SectionLayoutMode.Grid;
builder.PageSetup.CharactersPerLine = 10;

// The number of characters also depends on the size of the font.
doc.Styles["Normal"].Font.Size = 20;

Assert.That(doc.FirstSection.PageSetup.CharactersPerLine, Is.EqualTo(8));

builder.Writeln("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");

doc.Save(ArtifactsDir + "PageSetup.CharactersPerLine.docx");
```

### See Also

* class [PageSetup](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
