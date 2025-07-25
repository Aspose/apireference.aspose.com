---
title: SVGPathSeg Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Paths.SVGPathSeg class. The SVGPathSeg interface is a base interface that corresponds to a single command within a path data specification
type: docs
weight: 4560
url: /net/aspose.svg.paths/svgpathseg/
---
## SVGPathSeg class

The SVGPathSeg interface is a base interface that corresponds to a single command within a path data specification.

```csharp
public abstract class SVGPathSeg : SVGValueType
```

## Properties

| Name | Description |
| --- | --- |
| [PathSegType](../../aspose.svg.paths/svgpathseg/pathsegtype/) { get; } | The type of the path segment as specified by one of the constants defined on this interface. |
| [PathSegTypeAsLetter](../../aspose.svg.paths/svgpathseg/pathsegtypeasletter/) { get; } | The type of the path segment, specified by the corresponding one character command name. |

## Methods

| Name | Description |
| --- | --- |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Releases unmanaged and - optionally - managed resources. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | This method is used to retrieve the ECMAScript object Type. |

## Fields

| Name | Description |
| --- | --- |
| const [PATHSEG_ARC_ABS](../../aspose.svg.paths/svgpathseg/pathseg_arc_abs/) | Corresponds to a "absolute arcto" (A) path data command. |
| const [PATHSEG_ARC_REL](../../aspose.svg.paths/svgpathseg/pathseg_arc_rel/) | Corresponds to a "relative arcto" (a) path data command. |
| const [PATHSEG_CLOSEPATH](../../aspose.svg.paths/svgpathseg/pathseg_closepath/) | Corresponds to a "closepath" (z) path data command. |
| const [PATHSEG_CURVETO_CUBIC_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_abs/) | Corresponds to a "absolute cubic Bézier curveto" (C) path data command. |
| const [PATHSEG_CURVETO_CUBIC_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_rel/) | Corresponds to a "relative cubic Bézier curveto" (c) path data command. |
| const [PATHSEG_CURVETO_CUBIC_SMOOTH_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_smooth_abs/) | Corresponds to a "absolute smooth cubic curveto" (S) path data command. |
| const [PATHSEG_CURVETO_CUBIC_SMOOTH_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_smooth_rel/) | Corresponds to a "relative smooth cubic curveto" (s) path data command. |
| const [PATHSEG_CURVETO_QUADRATIC_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_abs/) | Corresponds to a "absolute quadratic Bézier curveto" (Q) path data command. |
| const [PATHSEG_CURVETO_QUADRATIC_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_rel/) | Corresponds to a "relative quadratic Bézier curveto" (q) path data command. |
| const [PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_smooth_abs/) | Corresponds to a "absolute smooth quadratic curveto" (T) path data command. |
| const [PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_smooth_rel/) | Corresponds to a "relative smooth quadratic curveto" (t) path data command. |
| const [PATHSEG_LINETO_ABS](../../aspose.svg.paths/svgpathseg/pathseg_lineto_abs/) | Corresponds to a "absolute lineto" (L) path data command. |
| const [PATHSEG_LINETO_HORIZONTAL_ABS](../../aspose.svg.paths/svgpathseg/pathseg_lineto_horizontal_abs/) | Corresponds to a "absolute horizontal lineto" (H) path data command. |
| const [PATHSEG_LINETO_HORIZONTAL_REL](../../aspose.svg.paths/svgpathseg/pathseg_lineto_horizontal_rel/) | Corresponds to a "relative horizontal lineto" (h) path data command. |
| const [PATHSEG_LINETO_REL](../../aspose.svg.paths/svgpathseg/pathseg_lineto_rel/) | Corresponds to a "relative lineto" (l) path data command. |
| const [PATHSEG_LINETO_VERTICAL_ABS](../../aspose.svg.paths/svgpathseg/pathseg_lineto_vertical_abs/) | Corresponds to a "absolute vertical lineto" (V) path data command. |
| const [PATHSEG_LINETO_VERTICAL_REL](../../aspose.svg.paths/svgpathseg/pathseg_lineto_vertical_rel/) | Corresponds to a "relative vertical lineto" (v) path data command. |
| const [PATHSEG_MOVETO_ABS](../../aspose.svg.paths/svgpathseg/pathseg_moveto_abs/) | Corresponds to a "absolute moveto" (M) path data command. |
| const [PATHSEG_MOVETO_REL](../../aspose.svg.paths/svgpathseg/pathseg_moveto_rel/) | Corresponds to a "relative moveto" (m) path data command. |
| const [PATHSEG_UNKNOWN](../../aspose.svg.paths/svgpathseg/pathseg_unknown/) | The unit type is not one of predefined types. It is invalid to attempt to define a new value of this type or to attempt to switch an existing value to this type. |

### See Also

* class [SVGValueType](../../aspose.svg.datatypes/svgvaluetype/)
* namespace [Aspose.Svg.Paths](../../aspose.svg.paths/)
* assembly [Aspose.SVG](../../)
