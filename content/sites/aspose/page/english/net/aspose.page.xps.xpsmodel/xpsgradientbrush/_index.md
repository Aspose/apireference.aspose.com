---
title: Class XpsGradientBrush
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsModel.XpsGradientBrush class. Class incapsulating common features of LinerGradientBrush and RadialGradientBrush elements
type: docs
weight: 3340
url: /net/aspose.page.xps.xpsmodel/xpsgradientbrush/
---
## XpsGradientBrush class

Class incapsulating common features of LinerGradientBrush and RadialGradientBrush elements.

```csharp
public abstract class XpsGradientBrush : XpsTransformableBrush
```

## Properties

| Name | Description |
| --- | --- |
| [ColorInterpolationMode](../../aspose.page.xps.xpsmodel/xpsgradientbrush/colorinterpolationmode/) { get; set; } | Returns/sets value specifying the gamma function for color interpolation. The gamma adjustment should not be applied to the alpha component, if specified. |
| [GradientStops](../../aspose.page.xps.xpsmodel/xpsgradientbrush/gradientstops/) { get; set; } | Returns/sets list of gradient stops that comprise the gradient. |
| [Opacity](../../aspose.page.xps.xpsmodel/xpsbrush/opacity/) { get; set; } | Returns/sets value defining the uniform transparency of the brush fill. |
| [SpreadMethod](../../aspose.page.xps.xpsmodel/xpsgradientbrush/spreadmethod/) { get; set; } | Returns/sets value describing how the brush should fill the content area outside of the primary, initial gradient area. |
| [Transform](../../aspose.page.xps.xpsmodel/xpstransformablebrush/transform/) { get; set; } | Returns/sets the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform. |

### See Also

* class [XpsTransformableBrush](../xpstransformablebrush/)
* namespace [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* assembly [Aspose.Page](../../)


