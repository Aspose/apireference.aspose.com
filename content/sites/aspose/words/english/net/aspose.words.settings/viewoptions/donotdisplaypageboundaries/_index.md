---
title: ViewOptions.DoNotDisplayPageBoundaries
linktitle: DoNotDisplayPageBoundaries
articleTitle: DoNotDisplayPageBoundaries
second_title: Aspose.Words for .NET
description: Discover how the ViewOptions DoNotDisplayPageBoundaries property enhances your layout by eliminating top margin space for a cleaner, more professional look.
type: docs
weight: 20
url: /net/aspose.words.settings/viewoptions/donotdisplaypageboundaries/
---
## ViewOptions.DoNotDisplayPageBoundaries property

Turns off display of the space between the top of the text and the top edge of the page.

```csharp
public bool DoNotDisplayPageBoundaries { get; set; }
```

## Examples

Shows how to hide vertical whitespace and headers/footers in view options.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert content that spans across 3 pages.
builder.Writeln("Paragraph 1, Page 1.");
builder.InsertBreak(BreakType.PageBreak);
builder.Writeln("Paragraph 2, Page 2.");
builder.InsertBreak(BreakType.PageBreak);
builder.Writeln("Paragraph 3, Page 3.");

// Insert a header and a footer.
builder.MoveToHeaderFooter(HeaderFooterType.HeaderPrimary);
builder.Writeln("This is the header.");
builder.MoveToHeaderFooter(HeaderFooterType.FooterPrimary);
builder.Writeln("This is the footer.");

// This document contains a small amount of content that takes up a few full pages worth of space.
// Set the "DoNotDisplayPageBoundaries" flag to "true" to get older versions of Microsoft Word to omit headers,
// footers, and much of the vertical whitespace when displaying our document.
// Set the "DoNotDisplayPageBoundaries" flag to "false" to get older versions of Microsoft Word
// to normally display our document.
doc.ViewOptions.DoNotDisplayPageBoundaries = doNotDisplayPageBoundaries;

doc.Save(ArtifactsDir + "ViewOptions.DisplayPageBoundaries.doc");
```

### See Also

* class [ViewOptions](../)
* namespace [Aspose.Words.Settings](../../../aspose.words.settings/)
* assembly [Aspose.Words](../../../)
