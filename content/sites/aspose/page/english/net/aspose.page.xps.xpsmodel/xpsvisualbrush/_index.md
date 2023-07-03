---
title: Class XpsVisualBrush
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsModel.XpsVisualBrush class. Class incapsulating VisualBrush property element features. This element is used to fill a region with a drawing
type: docs
weight: 3640
url: /net/aspose.page.xps.xpsmodel/xpsvisualbrush/
---
## XpsVisualBrush class

Class incapsulating VisualBrush property element features. This element is used to fill a region with a drawing.

```csharp
public sealed class XpsVisualBrush : XpsTilingBrush
```

## Properties

| Name | Description |
| --- | --- |
| [Opacity](../../aspose.page.xps.xpsmodel/xpsbrush/opacity/) { get; set; } | Returns/sets value defining the uniform transparency of the brush fill. |
| [TileMode](../../aspose.page.xps.xpsmodel/xpstilingbrush/tilemode/) { get; set; } | Returns/sets value specifying how tiling is performed in the filled geometry. |
| [Transform](../../aspose.page.xps.xpsmodel/xpstransformablebrush/transform/) { get; set; } | Returns/sets the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform. |
| [Viewbox](../../aspose.page.xps.xpsmodel/xpstilingbrush/viewbox/) { get; set; } | Returns/sets the region of the source content of the brush that is to be mapped to the viewport. |
| [Viewport](../../aspose.page.xps.xpsmodel/xpstilingbrush/viewport/) { get; set; } | Returns/sets the position and dimensions of the first brush tile. Subsequent tiles are positioned relative to this tile, as specified by the tile mode. |
| [Visual](../../aspose.page.xps.xpsmodel/xpsvisualbrush/visual/) { get; } | Returns/sets a Path, Glyphs, or Canvas element used to draw the brush’s source content. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsvisualbrush/clone/)() | Clones this visual brush. |
| [SetVisual](../../aspose.page.xps.xpsmodel/xpsvisualbrush/setvisual/)(XpsContentElement) | Sets *visual* as Visual element of visual brush. |

### See Also

* class [XpsTilingBrush](../xpstilingbrush/)
* namespace [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* assembly [Aspose.Page](../../)


