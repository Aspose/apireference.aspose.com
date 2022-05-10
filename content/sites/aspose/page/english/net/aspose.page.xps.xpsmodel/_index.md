---
title: Aspose.Page.XPS.XpsModel
second_title: Aspose.Page for .NET API Reference
description: The **Aspose.Page.Xps.XpsModel** namespace provides classes that describe elements of XPS document.
type: docs
weight: 100
url: /net/aspose.page.xps.xpsmodel/
---
The **Aspose.Page.Xps.XpsModel** namespace provides classes that describe elements of XPS document.

## Classes

| Class | Description |
| --- | --- |
| class [XpsArcSegment](./xpsarcsegment) | Class incapsulating ArcSegment element features. This element describes an elliptical arc. |
| abstract class [XpsArray&lt;T&gt;](./xpsarray-1) | Class incapsulating common XPS model array object features. |
| abstract class [XpsBrush](./xpsbrush) | Class incapsulating common features of all brush elements. |
| class [XpsCanvas](./xpscanvas) | Class incapsulating Canvas element features. This element groups elements together. For example, Glyphs and Path elements can be grouped in a canvas in order to be identified as a unit (as a hyperlink destination) or to apply a composed property value to each child and ancestor element. |
| abstract class [XpsColor](./xpscolor) | The base class incapsulating common color features. |
| abstract class [XpsContentElement](./xpscontentelement) | Incapsulates features of XPS content elements: Canvas, Path and Glyphs. |
| abstract class [XpsElement](./xpselement) | Class incapsulating common XPS element features. |
| class [XpsElementLinkTarget](./xpselementlinktarget) | Class incapsulating the relative named-address hyperlink target. |
| class [XpsExternalLinkTarget](./xpsexternallinktarget) | Class incapsulating the external hyperlink target. |
| class [XpsFileResource](./xpsfileresource) | Class incapsulating common features of all file resources. |
| class [XpsFont](./xpsfont) | Class incapsulating a TrueType font resource. |
| class [XpsGlyphs](./xpsglyphs) | Class incapsulating Glyphs element features. This element represents a run of uniformly-formatted text from a single font. It provides information necessary for accurate rendering and supports search and selection features in viewing consumers. |
| abstract class [XpsGradientBrush](./xpsgradientbrush) | Class incapsulating common features of LinerGradientBrush and RadialGradientBrush elements. |
| class [XpsGradientStop](./xpsgradientstop) | Class incapsulating GradientStop element features. This element is used by both the LinearGradientBrush and RadialGradientBrush elements to define the location and range of color progression for rendering a gradient. |
| abstract class [XpsHyperlinkElement](./xpshyperlinkelement) | Incapsulates common features of XPS elements that can be a hyperlink. |
| abstract class [XpsHyperlinkTarget](./xpshyperlinktarget) | Base class for a hyperlink target. |
| class [XpsIccBasedColor](./xpsiccbasedcolor) | Incapsulates ICC based color. |
| class [XpsIccProfile](./xpsiccprofile) | Class incapsulating an ICC profile resource. |
| class [XpsImage](./xpsimage) | Class incapsulating an image resource. |
| class [XpsImageBrush](./xpsimagebrush) | Class incapsulating ImageBrush property element features. This element is used to fill a region with an image. |
| class [XpsLinearGradientBrush](./xpslineargradientbrush) | Class incapsulating LinearGradientBrush property element features. This element is used to specify a linear gradient brush along a vector. |
| class [XpsMatrix](./xpsmatrix) | Class incapsulating MatrixTransform property element features. This element defines an arbitrary affine matrix transformation used to manipulate the coordinate systems of elements. |
| abstract class [XpsObject](./xpsobject) | Class incapsulating common XPS model object features. |
| class [XpsPage](./xpspage) | Class incapsulating FixedPage element features. This element contains the contents of a page and is the root element of a FixedPage part. |
| class [XpsPageLinkTarget](./xpspagelinktarget) | Class incapsulating the page hyperlink target. |
| class [XpsPath](./xpspath) | Class incapsulating Path element features. This element is the sole means of adding vector graphics and images to a fixed page. It defines a single vector graphic to be rendered on a page. |
| class [XpsPathFigure](./xpspathfigure) | Class incapsulating PathFigure element features. This element is composed of a set of one or more line or curve segments. |
| class [XpsPathGeometry](./xpspathgeometry) | Class incapsulating PathGeometry property element features. This element contains a set of path figures specified either with the Figures attribute or with a child PathFigure element. |
| abstract class [XpsPathPolySegment](./xpspathpolysegment) | Class incapsulating common features of PolyLineSegment, PolyBézierSegment and PolyQuadraticBézierSegment elements. |
| abstract class [XpsPathSegment](./xpspathsegment) | Class incapsulating common features of all path segment elements. |
| class [XpsPolyBezierSegment](./xpspolybeziersegment) | Class incapsulating PolyBezierSegment element features. This element describes a set of cubic Bézier curves. |
| class [XpsPolyLineSegment](./xpspolylinesegment) | Class incapsulating PolyLineSegment element features. This element describes a polygonal drawing containing an arbitrary number of individual vertices. |
| class [XpsPolyQuadraticBezierSegment](./xpspolyquadraticbeziersegment) | Class incapsulating PolyQuadraticBezierSegment element features. This element describes a set of quadratic Bézier curves from the previous point in the path figure through a set of vertices, using specified control points. |
| class [XpsRadialGradientBrush](./xpsradialgradientbrush) | Class incapsulating RadialGradientBrush property element features. This element is used to specify a radial gradient brush. |
| class [XpsRgbColor](./xpsrgbcolor) | Incapsulates RGB color of any color space (sRGB or scRGB). |
| class [XpsSolidColorBrush](./xpssolidcolorbrush) | Class incapsulating SolidColorBrush property element features. This element is used to fill defined geometric regions with a solid color. |
| abstract class [XpsTilingBrush](./xpstilingbrush) | Class incapsulating common features of tiling brushes elements (VisualBrush and ImageBrush). |
| abstract class [XpsTransformableBrush](./xpstransformablebrush) | Class incapsulating common features of transformable brushes elements (all except SolidColorBrush). |
| class [XpsVisualBrush](./xpsvisualbrush) | Class incapsulating VisualBrush property element features. This element is used to fill a region with a drawing. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| enum [XpsColorInterpolationMode](./xpscolorinterpolationmode) | Valid values of gradient brushes' ColorInterpolationMode property. |
| enum [XpsDashCap](./xpsdashcap) | Valid values of Path element's StrokeDashCap property. |
| enum [XpsEdgeMode](./xpsedgemode) | Valid values of Canvas element's RenderOptions.EdgeMode property. |
| enum [XpsFillRule](./xpsfillrule) | Valid values of PathGeometry element's FillRule property. |
| enum [XpsLineCap](./xpslinecap) | Valid values of Path element's StrokeStartLineCap and StrokeEndLineCap properties. |
| enum [XpsLineJoin](./xpslinejoin) | Valid values of Path element's StrokeLineJoin property. |
| enum [XpsSpreadMethod](./xpsspreadmethod) | Valid values of gradient brushes' SpreadMethod property. |
| enum [XpsStyleSimulations](./xpsstylesimulations) | Valid values of Glyphs element's StyleSimulations property. |
| enum [XpsSweepDirection](./xpssweepdirection) | Valid values of ArcSegment element's SweepDirection property. |
| enum [XpsTileMode](./xpstilemode) | Valid values of tiling brushes' TileMode property. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
