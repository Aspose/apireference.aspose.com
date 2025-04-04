---
title: Remove
second_title: Aspose.Sildes for .NET API Reference
description: Removes a layout from the collection.
type: docs
weight: 80
url: /net/aspose.slides/layoutslidecollection/remove/
---
## LayoutSlideCollection.Remove method

Removes a layout from the collection.

```csharp
public void Remove(ILayoutSlide value)
```

| Parameter | Type | Description |
| --- | --- | --- |
| value | ILayoutSlide | The layout slide to remove from the collection. |

### Exceptions

| exception | condition |
| --- | --- |
| [PptxEditException](../../pptxeditexception) | Thrown if layout is used in presentation (its HasDependingSlides property is true). |

### Remarks

1) To avoid throwing of the PptxEditException check layout's HasDependingSlides property before. 2) You can use also [`Remove`](../../ilayoutslide/remove) method to simplify code.

### See Also

* interface [ILayoutSlide](../../ilayoutslide)
* class [LayoutSlideCollection](../../layoutslidecollection)
* namespace [Aspose.Slides](../../layoutslidecollection)
* assembly [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
