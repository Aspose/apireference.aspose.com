---
title: InsertSummaryZoomFrame
second_title: Aspose.Sildes for .NET API Reference
description: Creates a new Summary Zoom object and inserts it to a collection at the specified index.
type: docs
weight: 330
url: /net/aspose.slides/ishapecollection/insertsummaryzoomframe/
---
## IShapeCollection.InsertSummaryZoomFrame method

Creates a new Summary Zoom object and inserts it to a collection at the specified index.

```csharp
public ISummaryZoomFrame InsertSummaryZoomFrame(int index, float x, float y, float width, 
    float height)
```

| Parameter | Type | Description |
| --- | --- | --- |
| index | Int32 | The zero-based index at which Section Zoom frame should be inserted. |
| x | Single | X coordinate of a new Section Zoom frame Single. |
| y | Single | Y coordinate of a new Section Zoom frame Single. |
| width | Single | Width of a new Section Zoom frame Single. |
| height | Single | Height of a new Section Zoom frame Single. |

### Return Value

Created Summary Zoom object [`ISummaryZoomFrame`](../../isummaryzoomframe).

### Exceptions

| exception | condition |
| --- | --- |
| [PptxEditException](../../pptxeditexception) | There are no sections in the presentation, or the target slide does not belong to any section. |

### Remarks

This method creates a new Summary Zoom and puts a collection of objects into it for all the sections in this presentation.

### Examples

This example demonstrates creation and inserting a Summary Zoom object at the specified index of a collection (assume that there are at least two sections in the "Presentation.pptx" presentation):

```csharp
[C#]
using (Presentation pres = new Presentation("Presentation.pptx"))
{
    ISummaryZoomFrame zoomFrame = pres.Slides[0].Shapes.InsertSummaryZoomFrame(2, 150, 20, 50, 50);
}
```

### See Also

* interface [ISummaryZoomFrame](../../isummaryzoomframe)
* interface [IShapeCollection](../../ishapecollection)
* namespace [Aspose.Slides](../../ishapecollection)
* assembly [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
