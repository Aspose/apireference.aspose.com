---
title: Class XpsCanvas
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsModel.XpsCanvas class. Class incapsulating Canvas element features. This element groups elements together. For example Glyphs and Path elements can be grouped in a canvas in order to be identified as a unit as a hyperlink destination or to apply a composed property value to each child and ancestor element
type: docs
weight: 3200
url: /net/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class

Class incapsulating Canvas element features. This element groups elements together. For example, Glyphs and Path elements can be grouped in a canvas in order to be identified as a unit (as a hyperlink destination) or to apply a composed property value to each child and ancestor element.

```csharp
public sealed class XpsCanvas : XpsContentElement
```

## Properties

| Name | Description |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Returns/sets the path geometry instance limiting the rendered region of the element. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Returns number of child elements. |
| [EdgeMode](../../aspose.page.xps.xpsmodel/xpscanvas/edgemode/) { get; set; } | Returns/sets the value that controls how edges of paths within the canvas are rendered. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Returns/sets hyperlink target object. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Provides access to element's children by index *i*. |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Returns/sets the value defining the uniform transparency of the element. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Returns/sets the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Returns/sets the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any). |

## Methods

| Name | Description |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/add/)(T) | Adds an element to this canvas's child list. |
| [AddCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/addcanvas/)() | Adds a new canvas to this canvas's child list. |
| [AddGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/addglyphs/)(string, float, FontStyle, float, float, string) | Adds new glyphs to this canvas's child list. |
| [AddPath](../../aspose.page.xps.xpsmodel/xpscanvas/addpath/)(XpsPathGeometry) | Adds a new path to this canvas's child list. |
| [Clone](../../aspose.page.xps.xpsmodel/xpscanvas/clone/)() | Clones this canvas. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Implementation of IEnumerable interface. |
| [Insert&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/insert/)(int, T) | Inserts an element to this canvas's child list at *index* position. |
| [InsertCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/insertcanvas/)(int) | Inserts a new canvas to this canvas's child list at *index* position. |
| [InsertGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/)(int, string, float, FontStyle, float, float, string) | Inserts new glyphs to this canvas's child list at *index* position. |
| [InsertPath](../../aspose.page.xps.xpsmodel/xpscanvas/insertpath/)(int, XpsPathGeometry) | Inserts a new path to this canvas's child list at *index* position. |

### See Also

* class [XpsContentElement](../xpscontentelement/)
* namespace [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* assembly [Aspose.Page](../../)


