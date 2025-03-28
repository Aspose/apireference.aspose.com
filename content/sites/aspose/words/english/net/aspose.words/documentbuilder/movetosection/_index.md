---
title: DocumentBuilder.MoveToSection
linktitle: MoveToSection
articleTitle: MoveToSection
second_title: Aspose.Words for .NET
description: Discover the DocumentBuilder MoveToSection method to easily navigate to the start of any section's body, enhancing your document editing efficiency.
type: docs
weight: 610
url: /net/aspose.words/documentbuilder/movetosection/
---
## DocumentBuilder.MoveToSection method

Moves the cursor to the beginning of the body in a specified section.

```csharp
public void MoveToSection(int sectionIndex)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sectionIndex | Int32 | The index of the section to move to. |

## Remarks

When *sectionIndex* is greater than or equal to 0, it specifies an index from the beginning of the document with 0 being the first section. When *sectionIndex* is less than 0, it specified an index from the end of the document with -1 being the last section.

The cursor is moved to the first paragraph in the [`Body`](../../body/) of the specified section.

## Examples

Shows how to create headers and footers in a document using DocumentBuilder.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Specify that we want different headers and footers for first, even and odd pages.
builder.PageSetup.DifferentFirstPageHeaderFooter = true;
builder.PageSetup.OddAndEvenPagesHeaderFooter = true;

// Create the headers, then add three pages to the document to display each header type.
builder.MoveToHeaderFooter(HeaderFooterType.HeaderFirst);
builder.Write("Header for the first page");
builder.MoveToHeaderFooter(HeaderFooterType.HeaderEven);
builder.Write("Header for even pages");
builder.MoveToHeaderFooter(HeaderFooterType.HeaderPrimary);
builder.Write("Header for all other pages");

builder.MoveToSection(0);
builder.Writeln("Page1");
builder.InsertBreak(BreakType.PageBreak);
builder.Writeln("Page2");
builder.InsertBreak(BreakType.PageBreak);
builder.Writeln("Page3");

doc.Save(ArtifactsDir + "DocumentBuilder.HeadersAndFooters.docx");
```

### See Also

* class [DocumentBuilder](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
