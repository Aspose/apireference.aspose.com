---
title: PageRange
linktitle: PageRange
articleTitle: PageRange
second_title: Aspose.Words for .NET
description: Create customized page ranges effortlessly with our PageRange constructor. Enhance your document management with precision and flexibility.
type: docs
weight: 10
url: /net/aspose.words.saving/pagerange/pagerange/
---
## PageRange constructor

Creates a new page range object.

```csharp
public PageRange(int from, int to)
```

| Parameter | Type | Description |
| --- | --- | --- |
| from | Int32 | The starting page zero-based index. |
| to | Int32 | The ending page zero-based index. If it exceeds the index of the last page in the document, it is truncated to fit in the document on rendering. |

## Remarks

MaxValue means the last page in the document.

## Examples

Shows how to extract pages based on exact page ranges.

```csharp
Document doc = new Document(MyDir + "Images.docx");

ImageSaveOptions imageOptions = new ImageSaveOptions(SaveFormat.Tiff);
PageSet pageSet = new PageSet(new PageRange(1, 1), new PageRange(2, 3), new PageRange(1, 3),
    new PageRange(2, 4), new PageRange(1, 1));

imageOptions.PageSet = pageSet;
doc.Save(ArtifactsDir + "ImageSaveOptions.ExportVariousPageRanges.tiff", imageOptions);
```

### See Also

* class [PageRange](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
