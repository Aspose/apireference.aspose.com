---
title: TextColumn.SpaceAfter
linktitle: SpaceAfter
articleTitle: SpaceAfter
second_title: Aspose.Words for .NET
description: Discover the TextColumn SpaceAfter property to easily adjust spacing between columns in your layout. Enhance readability and design with precision!
type: docs
weight: 10
url: /net/aspose.words/textcolumn/spaceafter/
---
## TextColumn.SpaceAfter property

Gets or sets the space between this column and the next column in points. Not required for the last column.

```csharp
public double SpaceAfter { get; set; }
```

## Examples

Shows how to create unevenly spaced columns.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
PageSetup pageSetup = builder.PageSetup;

TextColumnCollection columns = pageSetup.TextColumns;
columns.EvenlySpaced = false;
columns.SetCount(2);

// Determine the amount of room that we have available for arranging columns.
double contentWidth = pageSetup.PageWidth - pageSetup.LeftMargin - pageSetup.RightMargin;

Assert.That(contentWidth, Is.EqualTo(470.30d).Within(0.01d));

// Set the first column to be narrow.
TextColumn column = columns[0];
column.Width = 100;
column.SpaceAfter = 20;

// Set the second column to take the rest of the space available within the margins of the page.
column = columns[1];
column.Width = contentWidth - column.Width - column.SpaceAfter;

builder.Writeln("Narrow column 1.");
builder.InsertBreak(BreakType.ColumnBreak);
builder.Writeln("Wide column 2.");

doc.Save(ArtifactsDir + "PageSetup.CustomColumnWidth.docx");
```

### See Also

* class [TextColumn](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
