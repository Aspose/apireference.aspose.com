---
title: Document.ExtractPages
linktitle: ExtractPages
articleTitle: ExtractPages
second_title: Aspose.Words for .NET
description: Discover the Document ExtractPages method to effortlessly retrieve specific page ranges, enhancing your document management and efficiency.
type: docs
weight: 640
url: /net/aspose.words/document/extractpages/
---
## Document.ExtractPages method

Returns the [`Document`](../) object representing specified range of pages.

```csharp
public Document ExtractPages(int index, int count)
```

| Parameter | Type | Description |
| --- | --- | --- |
| index | Int32 | The zero-based index of the first page to extract. |
| count | Int32 | Number of pages to be extracted. |

## Remarks

The resulting document should look like the one in MS Word, as if we had performed 'Print specific pages' – the numbering, headers/footers and cross tables layout will be preserved. But due to a large number of nuances, appearing while reducing the number of pages, full match of the layout is a quiet complicated task requiring a lot of effort. Depending on the document complexity there might be slight differences in the resulting document contents layout comparing to the source document. Any feedback would be greatly appreciated.

## Examples

Shows how to get specified range of pages from the document.

```csharp
Document doc = new Document(MyDir + "Layout entities.docx");

doc = doc.ExtractPages(0, 2);

doc.Save(ArtifactsDir + "Document.ExtractPages.docx");
```

### See Also

* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
