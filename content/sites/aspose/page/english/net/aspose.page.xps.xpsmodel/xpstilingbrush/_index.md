---
title: Class XpsTilingBrush
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsModel.XpsTilingBrush class. Class incapsulating common features of tiling brushes elements VisualBrush and ImageBrush
type: docs
weight: 3640
url: /net/aspose.page.xps.xpsmodel/xpstilingbrush/
---
## XpsTilingBrush class

Class incapsulating common features of tiling brushes elements (VisualBrush and ImageBrush).

```csharp
public abstract class XpsTilingBrush : XpsTransformableBrush
```

## Properties

| Name | Description |
| --- | --- |
| [Opacity](../../aspose.page.xps.xpsmodel/xpsbrush/opacity/) { get; set; } | Returns/sets value defining the uniform transparency of the brush fill. |
| [TileMode](../../aspose.page.xps.xpsmodel/xpstilingbrush/tilemode/) { get; set; } | Returns/sets value specifying how tiling is performed in the filled geometry. |
| [Transform](../../aspose.page.xps.xpsmodel/xpstransformablebrush/transform/) { get; set; } | Returns/sets the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform. |
| [Viewbox](../../aspose.page.xps.xpsmodel/xpstilingbrush/viewbox/) { get; set; } | Returns/sets the region of the source content of the brush that is to be mapped to the viewport. |
| [Viewport](../../aspose.page.xps.xpsmodel/xpstilingbrush/viewport/) { get; set; } | Returns/sets the position and dimensions of the first brush tile. Subsequent tiles are positioned relative to this tile, as specified by the tile mode. |

### See Also

* class [XpsTransformableBrush](../xpstransformablebrush/)
* namespace [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* assembly [Aspose.Page](../../)


