---
title: SVGMatrix Class
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Dom.Svg.DataTypes.SVGMatrix class. Many of SVGs graphics operations utilize 2x3 matrices of the form a c e b d f which when expanded into a 3x3 matrix for the purposes of matrix arithmetic become a c e b d f 0 0 1
type: docs
weight: 1390
url: /net/aspose.html.dom.svg.datatypes/svgmatrix/
---
## SVGMatrix class

Many of SVG's graphics operations utilize 2x3 matrices of the form: [a c e] [b d f] which, when expanded into a 3x3 matrix for the purposes of matrix arithmetic, become: [a c e] [b d f] [0 0 1]

```csharp
public class SVGMatrix : SVGValueType
```

## Properties

| Name | Description |
| --- | --- |
| [A](../../aspose.html.dom.svg.datatypes/svgmatrix/a/) { get; set; } | The A component of the matrix. |
| [B](../../aspose.html.dom.svg.datatypes/svgmatrix/b/) { get; set; } | The B component of the matrix. |
| [C](../../aspose.html.dom.svg.datatypes/svgmatrix/c/) { get; set; } | The C component of the matrix. |
| [D](../../aspose.html.dom.svg.datatypes/svgmatrix/d/) { get; set; } | The D component of the matrix. |
| [E](../../aspose.html.dom.svg.datatypes/svgmatrix/e/) { get; set; } | The E component of the matrix. |
| [F](../../aspose.html.dom.svg.datatypes/svgmatrix/f/) { get; set; } | The F component of the matrix. |

## Methods

| Name | Description |
| --- | --- |
| [Dispose](../../aspose.html.dom.svg.datatypes/svgvaluetype/dispose/)() | Releases unmanaged and - optionally - managed resources. |
| virtual [GetPlatformType](../../aspose.html.dom/domobject/getplatformtype/)() | This method is used to retrieve the ECMAScript object Type. |
| [Multiply](../../aspose.html.dom.svg.datatypes/svgmatrix/multiply/)(*SVGMatrix*) | Performs matrix multiplication. This matrix is post-multiplied by another matrix, returning the resulting new matrix. |
| [Rotate](../../aspose.html.dom.svg.datatypes/svgmatrix/rotate/)(*float*) | Post-multiplies a rotation transformation on the current matrix and returns the resulting matrix. |
| [Scale](../../aspose.html.dom.svg.datatypes/svgmatrix/scale/)(*float*) | Post-multiplies a uniform scale transformation on the current matrix and returns the resulting matrix. |
| [ScaleNonUniform](../../aspose.html.dom.svg.datatypes/svgmatrix/scalenonuniform/)(*float, float*) | Post-multiplies a non-uniform scale transformation on the current matrix and returns the resulting matrix. |
| [SkewX](../../aspose.html.dom.svg.datatypes/svgmatrix/skewx/)(*float*) | Post-multiplies a skewX transformation on the current matrix and returns the resulting matrix. |
| [SkewY](../../aspose.html.dom.svg.datatypes/svgmatrix/skewy/)(*float*) | Post-multiplies a skewY transformation on the current matrix and returns the resulting matrix. |
| override [ToString](../../aspose.html.dom.svg.datatypes/svgmatrix/tostring/)() | Returns a String that represents this instance. |
| [Translate](../../aspose.html.dom.svg.datatypes/svgmatrix/translate/)(*float, float*) | Post-multiplies a translation transformation on the current matrix and returns the resulting matrix. |

### See Also

* class [SVGValueType](../svgvaluetype/)
* namespace [Aspose.Html.Dom.Svg.DataTypes](../../aspose.html.dom.svg.datatypes/)
* assembly [Aspose.HTML](../../)
