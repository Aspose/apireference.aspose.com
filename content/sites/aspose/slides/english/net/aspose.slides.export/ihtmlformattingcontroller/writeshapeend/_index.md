---
title: WriteShapeEnd
second_title: Aspose.Sildes for .NET API Reference
description: Called before shapes rendering. Called once per each of shape. If this function writes anything to generator current slide image generation will be finished added html fragment inserted and new image will be started atop of the previous.
type: docs
weight: 30
url: /net/aspose.slides.export/ihtmlformattingcontroller/writeshapeend/
---
## IHtmlFormattingController.WriteShapeEnd method

Called before shape's rendering. Called once per each of shape. If this function writes anything to generator, current slide image generation will be finished, added html fragment inserted and new image will be started atop of the previous.

```csharp
public void WriteShapeEnd(IHtmlGenerator generator, IShape shape)
```

| Parameter | Type | Description |
| --- | --- | --- |
| generator | IHtmlGenerator | Output object. |
| shape | IShape | Shape which is rendered last. |

### See Also

* interface [IHtmlGenerator](../../ihtmlgenerator)
* interface [IShape](../../../aspose.slides/ishape)
* interface [IHtmlFormattingController](../../ihtmlformattingcontroller)
* namespace [Aspose.Slides.Export](../../ihtmlformattingcontroller)
* assembly [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
