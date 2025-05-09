---
title: HeaderFooterType Enum
linktitle: HeaderFooterType
articleTitle: HeaderFooterType
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.HeaderFooterType enum for easy identification of header and footer types in Word documents. Enhance your document processing today!
type: docs
weight: 3550
url: /net/aspose.words/headerfootertype/
---
## HeaderFooterType enumeration

Identifies the type of header or footer found in a Word file.

```csharp
public enum HeaderFooterType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| HeaderEven | `0` | Header for even numbered pages. |
| HeaderPrimary | `1` | Primary header, also used for odd numbered pages. |
| FooterEven | `2` | Footer for even numbered pages. |
| FooterPrimary | `3` | Primary footer, also used for odd numbered pages. |
| HeaderFirst | `4` | Header for the first page of the section. |
| FooterFirst | `5` | Footer for the first page of the section. |

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

* namespace [Aspose.Words](../../aspose.words/)
* assembly [Aspose.Words](../../)
