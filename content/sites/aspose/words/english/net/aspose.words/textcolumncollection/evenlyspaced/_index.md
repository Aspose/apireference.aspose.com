---
title: TextColumnCollection.EvenlySpaced
linktitle: EvenlySpaced
articleTitle: EvenlySpaced
second_title: Aspose.Words for .NET
description: Discover the EvenlySpaced property of TextColumnCollection, ensures equal-width text columns for a clean, organized layout. Enhance your design effortlessly!
type: docs
weight: 20
url: /net/aspose.words/textcolumncollection/evenlyspaced/
---
## TextColumnCollection.EvenlySpaced property

True if text columns are of equal width and evenly spaced.

```csharp
public bool EvenlySpaced { get; set; }
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

* class [TextColumnCollection](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
