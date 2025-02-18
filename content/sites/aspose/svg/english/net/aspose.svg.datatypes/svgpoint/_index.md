---
title: SVGPoint Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.DataTypes.SVGPoint class. Many of the SVG DOM interfaces refer to objects of class SVGPoint. An SVGPoint is an x y coordinate pair. When used in matrix operations an SVGPoint is treated as a vector of the form x y 1 If an SVGRect object is designated as read only then attempting to assign to one of its attributes will result in an exception being thrown
type: docs
weight: 6070
url: /net/aspose.svg.datatypes/svgpoint/
---
## SVGPoint class

Many of the SVG DOM interfaces refer to objects of class SVGPoint. An SVGPoint is an (x, y) coordinate pair. When used in matrix operations, an SVGPoint is treated as a vector of the form: [x] [y] [1] If an SVGRect object is designated as read only, then attempting to assign to one of its attributes will result in an exception being thrown.

```csharp
public class SVGPoint : SVGValueType
```

## Properties

| Name | Description |
| --- | --- |
| [X](../../aspose.svg.datatypes/svgpoint/x/) { get; set; } | The X coordinate. |
| [Y](../../aspose.svg.datatypes/svgpoint/y/) { get; set; } | The Y coordinate. |

## Methods

| Name | Description |
| --- | --- |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Releases unmanaged and - optionally - managed resources. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | This method is used to retrieve ECMAScript object Type. |
| [MatrixTransform](../../aspose.svg.datatypes/svgpoint/matrixtransform/)(SVGMatrix) | Applies a 2x3 matrix transformation on this SVGPoint object and returns a new, transformed SVGPoint object: newpoint = matrix* thispoint |
| override [ToString](../../aspose.svg.datatypes/svgpoint/tostring/)() | Returns a String that represents this instance. |

### See Also

* class [SVGValueType](../svgvaluetype/)
* namespace [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* assembly [Aspose.SVG](../../)
