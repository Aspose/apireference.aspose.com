---
title: Description
second_title: Aspose.Sildes for .NET API Reference
description: Returns the text description of the Summary Zoom Section object.
type: docs
weight: 10
url: /net/aspose.slides/summaryzoomsection/description/
---
## SummaryZoomSection.Description property

Returns the text description of the Summary Zoom Section object.

```csharp
public string Description { get; set; }
```

### Examples

Example:

```csharp
[C#]
using (Presentation pres = new Presentation("pres.pptx"))
{
    ISummaryZoomSection zoomSection = zoomFrame.SummaryZoomCollection[1];
    zoomSection.Description = "Description";
}
```

### See Also

* class [SummaryZoomSection](../../summaryzoomsection)
* namespace [Aspose.Slides](../../summaryzoomsection)
* assembly [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
