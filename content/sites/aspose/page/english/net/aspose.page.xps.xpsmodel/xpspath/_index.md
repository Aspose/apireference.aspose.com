---
title: Class XpsPath
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsModel.XpsPath class. Class incapsulating Path element features. This element is the sole means of adding vector graphics and images to a fixed page. It defines a single vector graphic to be rendered on a page
type: docs
weight: 3480
url: /net/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class

Class incapsulating Path element features. This element is the sole means of adding vector graphics and images to a fixed page. It defines a single vector graphic to be rendered on a page.

```csharp
public sealed class XpsPath : XpsContentElement
```

## Properties

| Name | Description |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Returns/sets the path geometry instance limiting the rendered region of the element. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Returns number of child elements. |
| [Data](../../aspose.page.xps.xpsmodel/xpspath/data/) { get; set; } | Returns/sets the geometry of the path. |
| [Fill](../../aspose.page.xps.xpsmodel/xpspath/fill/) { get; set; } | Returns/sets the brush used to paint the geometry specified by the Data property of the path. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Returns/sets hyperlink target object. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Provides access to element's children by index *i*. |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Returns/sets the value defining the uniform transparency of the element. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Returns/sets the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Returns/sets the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any). |
| [Stroke](../../aspose.page.xps.xpsmodel/xpspath/stroke/) { get; set; } | Returns/sets the brush used to draw the stroke. |
| [StrokeDashArray](../../aspose.page.xps.xpsmodel/xpspath/strokedasharray/) { get; set; } | Returns/sets the array specifying the length of dashes and gaps of the outline stroke. |
| [StrokeDashCap](../../aspose.page.xps.xpsmodel/xpspath/strokedashcap/) { get; set; } | Returns/sets the value specifying how the ends of each dash are drawn. |
| [StrokeDashOffset](../../aspose.page.xps.xpsmodel/xpspath/strokedashoffset/) { get; set; } | Returns/sets the start point for repeating the dash array pattern. If this value is omitted, the dash array aligns with the origin of the stroke. |
| [StrokeEndLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokeendlinecap/) { get; set; } | Returns/sets the value defining the shape of the end of the last dash in a stroke. |
| [StrokeLineJoin](../../aspose.page.xps.xpsmodel/xpspath/strokelinejoin/) { get; set; } | Returns/sets the value defining the shape of the beginning of the first dash in a stroke. |
| [StrokeMiterLimit](../../aspose.page.xps.xpsmodel/xpspath/strokemiterlimit/) { get; set; } | Returns/sets the ratio between the maximum miter length and half of the stroke thickness. This value is significant only if the `StrokeLineJoin` attribute specifies `Miter`. |
| [StrokeStartLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokestartlinecap/) { get; set; } | Returns/sets the value defining the shape of the beginning of the first dash in a stroke. |
| [StrokeThickness](../../aspose.page.xps.xpsmodel/xpspath/strokethickness/) { get; set; } | Returns/sets the thickness of a stroke, in units of the effective coordinate space (includes the path's render transform). The stroke is drawn on top of the boundary of the geometry specified by the Path element’s Data property. Half of the StrokeThickness extends outside of the geometry specified by the Data property and the other half extends inside of the geometry. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpspath/clone/)() | Clones this path. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Implementation of IEnumerable interface. |

### See Also

* class [XpsContentElement](../xpscontentelement/)
* namespace [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* assembly [Aspose.Page](../../)


