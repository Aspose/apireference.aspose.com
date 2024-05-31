---
title: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO
second_title: Aspose.CAD for .NET API Reference
description: The namespace contains entities of FixedPage DTO model
type: docs
weight: 600
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/
---
The namespace contains entities of FixedPage DTO model.

## Classes

| Class | Description |
| --- | --- |
| [ArcSegment](./arcsegment/) | The arc segment. Represents an elliptical arc between two points. |
| [Brush](./brush/) | The brush. Brushes are used to paint the interior of the geometric shapes defined by a Path element and the characters rendered with a Glyphs element. They are also used to define the alpha transparency mask in the Canvas.OpacityMask, Path.OpacityMask, and Glyphs.OpacityMask property elements. |
| [Canvas](./canvas/) | The canvas. The Canvas element groups elements together. Glyphs and Path elements can be grouped in a canvas in order to be identified as a unit(as a hyperlink destination) or to apply a composed property value to each child and ancestor element. |
| [FixedPage](./fixedpage/) | The fixed page. The FixedPage element contains the contents of a page and is the root element of a FixedPage part. The fixed page contains the elements that together form the basis for all markings rendered on the page: Paths, Glyphs, and the optional Canvas grouping element. |
| [FixedPageFileParser](./fixedpagefileparser/) | The fixed page file parser. Deserializes DTO objects from xml FixedPage file. |
| [Geometry](./geometry/) | The geometry. Geometries are used to build visual representations of geometric shapes. The smallest atomic unit in a geometry is a segment. Segments can be lines or curves. One or more segments are combined into a path figure definition. A path figure is a single shape comprised of continuous segments. One or more path figures collectively define an entire path geometry. A path geometry MAY define the fill algorithm to be used on the component path figures. |
| [Glyphs](./glyphs/) | The glyphs. The Glyphs element represents a run of uniformly-formatted text from a single font. It provides information necessary for accurate rendering and supports search and selection features in viewing consumers. |
| [GradientStop](./gradientstop/) | The gradient stop. The GradientStop element is used by both the LinearGradientBrush and RadialGradientBrush elements to define the location and range of color progression for rendering a gradient. For linear gradient brushes, the offset value of 0.0 is mapped to the start point of the gradient, and the offset value of 1.0 is mapped to the end point. Intermediate offset values are interpolated between these two points to determine their location. For radial gradient brushes, the offset value of 0.0 is mapped to the gradient origin location. The offset value of 1.0 is mapped to the circumference of the ellipse as determined by the center, x radius, and y radius.Offsets between 0.0 and 1.0 are positioned at a location interpolated between these points. |
| [ImageBrush](./imagebrush/) | The image brush. The ImageBrush element is used to fill a region with an image. The image is defined in a coordinate space specified by the resolution of the image. The image MUST refer to a JPEG, PNG, TIFF, or JPEG XR image part within the document package. |
| [LinearGradientBrush](./lineargradientbrush/) | The linear gradient brush. The LinearGradientBrush element is used to specify a linear gradient brush along a vector. Fills a region with a linear gradient. |
| [MatrixTransform](./matrixtransform/) | The matrix transform. Creates an arbitrary affine matrix transformation that manipulates objects or coordinate systems in a two dimensional plane. |
| [Path](./path/) | The path. Defines a single graphical effect to be rendered to the page. It paints a geometry with a brush and draws a stroke around it. |
| [PathFigure](./pathfigure/) | The path figure. A PathFigure element is composed of a set of one or more line or curve segments. The segment elements define the shape of the path figure. The initial point of the first segment element is specified as the StartPoint attribute of the path figure. The last point of each segment element is the first point of the following segment element. |
| [PathGeometry](./pathgeometry/) | The path geometry. A PathGeometry element contains a set of path figures specified either with the Figures attribute or with a child PathFigure element. Producers MUST NOT specify the path figures of a geometry with both the Figures attribute and a child PathFigure element. |
| [PolyBezierSegment](./polybeziersegment/) | The poly bezier segment. A series of BÉZIER segments. |
| [PolyLineSegment](./polylinesegment/) | The poly line segment. Specifies a set of points between which lines are drawn. |
| [PolyQuadraticBezierSegment](./polyquadraticbeziersegment/) | The poly quadratic bezier segment. A series of quadratic BÉZIER segments. |
| [RadialGradientBrush](./radialgradientbrush/) | The radial gradient brush. |
| [ResourceDictionary](./resourcedictionary/) | The resource dictionary. The FixedPage.Resources and Canvas.Resources property elements contain exactly one ResourceDictionary element. A resource dictionary contains resource definition element entries. Each resource definition has a key specified in the x:Key attribute that is unique within the scope of the resource dictionary. The x:Key attribute is included in the Resource Dictionary. |
| [Resources](./resources/) | The resources. The Canvas and FixedPage elements can carry a resource dictionary. A resource dictionary is expressed in markup by the FixedPage.Resources or Canvas.Resources property element. Individual resource values MUST be specified within a resource dictionary. |
| [SolidColorBrush](./solidcolorbrush/) | The solid color brush. The SolidColorBrush element is used to fill defined geometric regions with a solid color. If there is an alpha component of the color, it is combined in a multiplicative way with the corresponding Opacity attribute. |
| [Transform](./transform/) | The transform. OpenXPS Document markup supports affine transforms as expressed through the RenderTransform and Transform properties.An affine transform is represented as a list of six real numbers: m11, m12, m21, m22, OffsetX, OffsetY. The RenderTransform and Transform properties both specify an affine matrix transformation to the local coordinate space, using the MatrixTransform element as their value. An abbreviated matrix transformation syntax MAY be used to specify a RenderTransform or Transform attribute value. |
| [Visual](./visual/) | The visual. Specifies a Path element, Glyphs element, or Canvas element used to draw the visual contents. |
| [VisualBrush](./visualbrush/) | The visual brush. The VisualBrush element is used to fill a region with a drawing. The drawing can be specified as either a VisualBrush.Visual property element or as a resource reference. Drawing content can include exactly one Canvas, Path, or Glyphs element and that element’s child and descendant elements. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| [ClrIntMode](./clrintmode/) | The CLR INT mode. Specifies the gamma function for color interpolation. The gamma adjustment should not be applied to the alpha component, if specified. |
| [DashCap](./dashcap/) | The dash cap. The effective render transform of the path being stroked is used to transform the control points of the contour of the dash. |
| [EdgeMode](./edgemode/) | The edge mode. The EdgeMode can instruct to render the contents of the element and all child and descendant elements without performing anti-aliasing, including child brushes and their contents as well as contents included via resource dictionary references. |
| [FillRule](./fillrule/) | The fill rule. The FillRule attribute specifies a fill algorithm. The filling area of a geometry is defined by taking all of the contained path figures and applying the fill algorithm to determine the enclosed area. Fill algorithms determine how the intersecting areas of geometric shapes are combined to form a region. |
| [LineCap](./linecap/) | The line cap. Specifies the appearance of line caps. |
| [LineJoin](./linejoin/) | The line join. Specifies the appearance of line joins. |
| [MappingMode](./mappingmode/) | The mapping mode. Specifies that center, x radius, and y radius are defined in the effective coordinate space (includes the Transform attribute of the brush). |
| [SpreadMethod](./spreadmethod/) | The spread method. Describes how the brush should fill the content area outside of the primary, initial gradient area. |
| [StyleSimulations](./stylesimulations/) | The style simulations. Synthetic style simulations can be applied to the shape of the glyphs by using the StyleSimulations attribute. Style simulations can be applied in addition to the designed style of a font. The default value for the StyleSimulations attribute is None, in which case the shapes of glyphs are not modified from their original design. |
| [SweepDirection](./sweepdirection/) | The sweep direction. Determines which of the two possible arcs(selected by the Large Arc Flag) is used. Beginning at the starting point, one arc proceeds in the positive(clockwise) direction, while the other proceeds in the negative(counter-clockwise) direction. |
| [TileMode](./tilemode/) | The tile mode. Specifies how tiling is performed in the filled geometry. |
| [ViewUnits](./viewunits/) | The view units. Specifies the relationship of the view coordinates to the containing coordinate space. |


