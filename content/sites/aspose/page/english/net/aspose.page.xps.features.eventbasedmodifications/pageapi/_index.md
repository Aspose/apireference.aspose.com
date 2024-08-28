---
title: Class PageAPI
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.Features.EventBasedModifications.PageAPI class. The Page element modification API
type: docs
weight: 600
url: /net/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class

The **Page** element modification API.

```csharp
public class PageAPI : IModificationAPI
```

## Properties

| Name | Description |
| --- | --- |
| [Height](../../aspose.page.xps.features.eventbasedmodifications/pageapi/height/) { get; set; } | Returns/sets the height of the page, expressed as a real number in units of the effective coordinate space. |
| [PageCount](../../aspose.page.xps.features.eventbasedmodifications/pageapi/pagecount/) { get; } | Returns the number of pages in the active document. |
| [TotalPageCount](../../aspose.page.xps.features.eventbasedmodifications/pageapi/totalpagecount/) { get; } | Returns the total number of pages in all documents inside XPS document. |
| [Utils](../../aspose.page.xps.features.eventbasedmodifications/pageapi/utils/) { get; } | Gets the object that provides utilities beyond the formal XPS manipulation API. |
| [Width](../../aspose.page.xps.features.eventbasedmodifications/pageapi/width/) { get; set; } | Returns/sets the width of the page, expressed as a real number in units of the effective coordinate space. |

## Methods

| Name | Description |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps.features.eventbasedmodifications/pageapi/add/)(T) | Adds a content element (Canvas, Path, or Glyphs). |
| [AddCanvas](../../aspose.page.xps.features.eventbasedmodifications/pageapi/addcanvas/)() | Adds a new canvas to the page. |
| [AddGlyphs](../../aspose.page.xps.features.eventbasedmodifications/pageapi/addglyphs/#addglyphs)(XpsFont, float, float, float, string) | Adds new glyphs to the page. |
| [AddGlyphs](../../aspose.page.xps.features.eventbasedmodifications/pageapi/addglyphs/#addglyphs_1)(string, float, FontStyle, float, float, string) | Adds new glyphs to the page. |
| [AddOutlineEntry](../../aspose.page.xps.features.eventbasedmodifications/pageapi/addoutlineentry/)(string, int, int) | Adds an outline entry to the document. |
| [AddPath](../../aspose.page.xps.features.eventbasedmodifications/pageapi/addpath/)(XpsPathGeometry) | Adds a new path to the page. |
| [CreateArcSegment](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createarcsegment/)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | Creates a new elliptical arc segment. |
| [CreateCanvas](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createcanvas/)() | Creates a new canvas. |
| [CreateColor](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createcolor/#createcolor_5)(Color) | Creates a new color. |
| [CreateColor](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createcolor/#createcolor_6)(string, params float[]) | Creates a new color in ICC based color space. |
| [CreateColor](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createcolor/#createcolor)(XpsIccProfile, params float[]) | Creates a new color in ICC based color space. |
| [CreateColor](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createcolor/#createcolor_3)(float, float, float) | Creates a new color in scRGB color space. |
| [CreateColor](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createcolor/#createcolor_1)(int, int, int) | Creates a new color in sRGB color space. |
| [CreateColor](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createcolor/#createcolor_4)(float, float, float, float) | Creates a new color in scRGB color space. |
| [CreateColor](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createcolor/#createcolor_2)(int, int, int, int) | Creates a new color in sRGB color space. |
| [CreateGlyphs](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createglyphs/#createglyphs)(XpsFont, float, float, float, string) | Creates new glyphs. |
| [CreateGlyphs](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createglyphs/#createglyphs_1)(string, float, FontStyle, float, float, string) | Creates new glyphs. |
| [CreateGradientStop](../../aspose.page.xps.features.eventbasedmodifications/pageapi/creategradientstop/#creategradientstop_1)(Color, float) | Creates a new gradient stop. |
| [CreateGradientStop](../../aspose.page.xps.features.eventbasedmodifications/pageapi/creategradientstop/#creategradientstop)(XpsColor, float) | Creates a new gradient stop. |
| [CreateImageBrush](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/#createimagebrush_1)(string, RectangleF, RectangleF) | Creates a new image brush. |
| [CreateImageBrush](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/#createimagebrush)(XpsImage, RectangleF, RectangleF) | Creates a new image brush. |
| [CreateLinearGradientBrush](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createlineargradientbrush/#createlineargradientbrush_1)(PointF, PointF) | Creates a new linear gradient brush. |
| [CreateLinearGradientBrush](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createlineargradientbrush/#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | Creates a new linear gradient brush. |
| [CreateMatrix](../../aspose.page.xps.features.eventbasedmodifications/pageapi/creatematrix/)(float, float, float, float, float, float) | Creates a new affine transformation matrix. |
| [CreatePath](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createpath/)(XpsPathGeometry) | Creates a new path. |
| [CreatePathFigure](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createpathfigure/#createpathfigure)(PointF, bool) | Creates a new path figure. |
| [CreatePathFigure](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createpathfigure/#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | Creates a new path figure. |
| [CreatePathGeometry](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createpathgeometry/#createpathgeometry)() | Creates a new path geometry. |
| [CreatePathGeometry](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createpathgeometry/#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | Creates a new path geometry with specified list of path figures. |
| [CreatePathGeometry](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createpathgeometry/#createpathgeometry_2)(string) | Creates a new path geometry specified with abbreviated form. |
| [CreatePolyBezierSegment](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createpolybeziersegment/)(PointF[], bool) | Creates a new set of cubic Bézier curves. |
| [CreatePolyLineSegment](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createpolylinesegment/)(PointF[], bool) | Creates a new polygonal drawing containing an arbitrary number of individual vertices. |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createpolyquadraticbeziersegment/)(PointF[], bool) | Creates a new set of quadratic Bézier curves from the previous point in the path figure through a set of vertices, using specified control points. |
| [CreateRadialGradientBrush](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createradialgradientbrush/#createradialgradientbrush_1)(PointF, PointF, float, float) | Creates a new radial gradient brush. |
| [CreateRadialGradientBrush](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createradialgradientbrush/#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | Creates a new radial gradient brush. |
| [CreateSolidColorBrush](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createsolidcolorbrush/#createsolidcolorbrush_1)(Color) | Creates a new solid color brush. |
| [CreateSolidColorBrush](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createsolidcolorbrush/#createsolidcolorbrush)(XpsColor) | Creates a new solid color brush. |
| [CreateVisualBrush](../../aspose.page.xps.features.eventbasedmodifications/pageapi/createvisualbrush/)(XpsContentElement, RectangleF, RectangleF) | Creates a new visual brush. |
| [Insert&lt;T&gt;](../../aspose.page.xps.features.eventbasedmodifications/pageapi/insert/)(int, T) | Inserts an element (Canvas, Path, or Glyphs) to the page at *index* position. |
| [InsertCanvas](../../aspose.page.xps.features.eventbasedmodifications/pageapi/insertcanvas/)(int) | Inserts a new canvas to the page at *index* position. |
| [InsertGlyphs](../../aspose.page.xps.features.eventbasedmodifications/pageapi/insertglyphs/#insertglyphs)(int, XpsFont, float, float, float, string) | Inserts new glyphs to the page at *index* position. |
| [InsertGlyphs](../../aspose.page.xps.features.eventbasedmodifications/pageapi/insertglyphs/#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | Inserts new glyphs to the page at *index* position. |
| [InsertPath](../../aspose.page.xps.features.eventbasedmodifications/pageapi/insertpath/)(int, XpsPathGeometry) | Inserts a new path to the page at *index* position. |
| [Remove&lt;T&gt;](../../aspose.page.xps.features.eventbasedmodifications/pageapi/remove/)(T) | Removes an element from the page. |
| [RemoveAt](../../aspose.page.xps.features.eventbasedmodifications/pageapi/removeat/)(int) | Removes an element at *index* position from the page. |

### See Also

* interface [IModificationAPI](../imodificationapi/)
* namespace [Aspose.Page.XPS.Features.EventBasedModifications](../../aspose.page.xps.features.eventbasedmodifications/)
* assembly [Aspose.Page](../../)


