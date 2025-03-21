---
title: PageSetup.LinesPerPage
linktitle: LinesPerPage
articleTitle: LinesPerPage
second_title: Aspose.Words for .NET
description: Control your document layout with the PageSetup LinesPerPage property. Easily adjust lines per page for optimal readability and organization.
type: docs
weight: 240
url: /net/aspose.words/pagesetup/linesperpage/
---
## PageSetup.LinesPerPage property

Gets or sets the number of lines per page in the document grid.

```csharp
public int LinesPerPage { get; set; }
```

## Remarks

Minimum value of the property is 1. Maximum value depends on page height and font size of the Normal style. Minimum line pitch is 136 percent of the font size. For example, maximum number of lines per page of a Letter page with one-inch margins is 39.

By default, the property has a value, on which line pitch is in 1.5 times greater than font size of the Normal style.

## Examples

Shows how to specify a limit for the number of lines that each page may have.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Enable pitching, and then use it to set the number of lines per page in this section.
// A large enough font size will push some lines down onto the next page to avoid overlapping characters.
builder.PageSetup.LayoutMode = SectionLayoutMode.LineGrid;
builder.PageSetup.LinesPerPage = 15;

builder.ParagraphFormat.SnapToGrid = true;

for (int i = 0; i < 30; i++)
    builder.Write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");

doc.Save(ArtifactsDir + "PageSetup.LinesPerPage.docx");
```

### See Also

* class [PageSetup](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
