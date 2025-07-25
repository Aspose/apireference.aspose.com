---
title: PdfLoadOptions.PageIndex
linktitle: PageIndex
articleTitle: PageIndex
second_title: Aspose.Words for .NET
description: Discover PdfLoadOptions PageIndex. Easily set the starting page index for PDF reading with this flexible property. Optimize your PDF handling today!
type: docs
weight: 30
url: /net/aspose.words.loading/pdfloadoptions/pageindex/
---
## PdfLoadOptions.PageIndex property

Gets or sets the 0-based index of the first page to read. Default is 0.

```csharp
public int PageIndex { get; set; }
```

## Examples

Shows how to skip images during loading PDF files.

```csharp
PdfLoadOptions options = new PdfLoadOptions();
options.SkipPdfImages = isSkipPdfImages;
options.PageIndex = 0;
options.PageCount = 1;

Document doc = new Document(MyDir + "Images.pdf", options);
NodeCollection shapeCollection = doc.GetChildNodes(NodeType.Shape, true);

if (isSkipPdfImages)
    Assert.That(0, Is.EqualTo(shapeCollection.Count));
else
    Assert.That(0, Is.Not.EqualTo(shapeCollection.Count));
```

### See Also

* class [PdfLoadOptions](../)
* namespace [Aspose.Words.Loading](../../../aspose.words.loading/)
* assembly [Aspose.Words](../../../)
