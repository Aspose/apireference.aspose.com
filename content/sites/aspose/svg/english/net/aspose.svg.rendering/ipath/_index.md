---
title: IPath Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Rendering.IPath interface. Represents a path for defining shapes or outlines
type: docs
weight: 1220
url: /net/aspose.svg.rendering/ipath/
---
## IPath interface

Represents a path for defining shapes or outlines.

```csharp
public interface IPath
```

## Properties

| Name | Description |
| --- | --- |
| [FillMode](../../aspose.svg.rendering/ipath/fillmode/) { get; set; } | Gets or sets the fill rule for the path. See [`FillRule`](../../aspose.svg.drawing/fillrule/). |
| [IsEmpty](../../aspose.svg.rendering/ipath/isempty/) { get; } | Gets a value indicating whether the path is empty. |
| [NativeObject](../../aspose.svg.rendering/ipath/nativeobject/) { get; } | Gets the native representation of the path object. |

## Methods

| Name | Description |
| --- | --- |
| [AddPath](../../aspose.svg.rendering/ipath/addpath/)(IPath, IMatrix) | Adds the specified path to the current path, applying the given transformation. |
| [Arc](../../aspose.svg.rendering/ipath/arc/#arc)(float, float, float, float, float) | Adds a circular arc to the path. |
| [Arc](../../aspose.svg.rendering/ipath/arc/#arc_1)(float, float, float, float, float, bool) | Adds a circular arc to the path. |
| [ArcTo](../../aspose.svg.rendering/ipath/arcto/)(float, float, float, float, float) | Adds an arc segment to the path. |
| [BezierCurveTo](../../aspose.svg.rendering/ipath/beziercurveto/)(float, float, float, float, float, float) | Adds a cubic Bézier curve segment to the path. |
| [Clear](../../aspose.svg.rendering/ipath/clear/)() | Clears the contents of the path. |
| [Close](../../aspose.svg.rendering/ipath/close/)() | Closes the current subpath by connecting the current point to the starting point. |
| [Ellipse](../../aspose.svg.rendering/ipath/ellipse/#ellipse)(float, float, float, float, float, float, float) | Adds an elliptical arc to the path. |
| [Ellipse](../../aspose.svg.rendering/ipath/ellipse/#ellipse_1)(float, float, float, float, float, float, float, bool) | Adds an elliptical arc to the path. |
| [LineTo](../../aspose.svg.rendering/ipath/lineto/)(float, float) | Adds a straight line segment from the current point to the specified coordinates. |
| [MoveTo](../../aspose.svg.rendering/ipath/moveto/)(float, float) | Moves the current point to the specified coordinates. |
| [QuadraticCurveTo](../../aspose.svg.rendering/ipath/quadraticcurveto/)(float, float, float, float) | Adds a quadratic Bézier curve segment to the path. |
| [Rect](../../aspose.svg.rendering/ipath/rect/)(float, float, float, float) | Adds a rectangle to the path. |
| [Transform](../../aspose.svg.rendering/ipath/transform/)(IMatrix) | Applies the specified transformation to the path. |

### See Also

* namespace [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* assembly [Aspose.SVG](../../)
