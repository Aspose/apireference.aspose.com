---
title: SVGMatrix class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 160
url: /python-net/aspose.svg.datatypes/svgmatrix/
is_root: false
---

## SVGMatrix class

Many of SVG's graphics operations utilize 2x3 matrices of the form:
[a c e]
[b d f]
which, when expanded into a 3x3 matrix for the purposes of matrix arithmetic, become:
[a c e]
[b d f]
[0 0 1]



**Inheritance:** [`SVGMatrix`](/svg/python-net/aspose.svg.datatypes/svgmatrix) → 
[`SVGValueType`](/svg/python-net/aspose.svg.datatypes/svgvaluetype) → 
[`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)



The SVGMatrix type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [a](/svg/python-net/aspose.svg.datatypes/svgmatrix/a) | The A component of the matrix. |
| [b](/svg/python-net/aspose.svg.datatypes/svgmatrix/b) | The B component of the matrix. |
| [c](/svg/python-net/aspose.svg.datatypes/svgmatrix/c) | The C component of the matrix. |
| [d](/svg/python-net/aspose.svg.datatypes/svgmatrix/d) | The D component of the matrix. |
| [e](/svg/python-net/aspose.svg.datatypes/svgmatrix/e) | The E component of the matrix. |
| [f](/svg/python-net/aspose.svg.datatypes/svgmatrix/f) | The F component of the matrix. |


### Methods
| Method | Description |
| :- | :- |
| [get_platform_type](/svg/python-net/aspose.svg.datatypes/svgmatrix/get_platform_type/#) | This method is used to retrieve the ECMAScript object Type. |
| [multiply](/svg/python-net/aspose.svg.datatypes/svgmatrix/multiply/#aspose.svg.datatypes.SVGMatrix) | Performs matrix multiplication. This matrix is post-multiplied by another matrix, returning the resulting new matrix. |
| [translate](/svg/python-net/aspose.svg.datatypes/svgmatrix/translate/#float-float) | Post-multiplies a translation transformation on the current matrix and returns the resulting matrix. |
| [scale](/svg/python-net/aspose.svg.datatypes/svgmatrix/scale/#float) | Post-multiplies a uniform scale transformation on the current matrix and returns the resulting matrix. |
| [scale_non_uniform](/svg/python-net/aspose.svg.datatypes/svgmatrix/scale_non_uniform/#float-float) | Post-multiplies a non-uniform scale transformation on the current matrix and returns the resulting matrix. |
| [rotate](/svg/python-net/aspose.svg.datatypes/svgmatrix/rotate/#float) | Post-multiplies a rotation transformation on the current matrix and returns the resulting matrix. |
| [skew_x](/svg/python-net/aspose.svg.datatypes/svgmatrix/skew_x/#float) | Post-multiplies a skewX transformation on the current matrix and returns the resulting matrix. |
| [skew_y](/svg/python-net/aspose.svg.datatypes/svgmatrix/skew_y/#float) | Post-multiplies a skewY transformation on the current matrix and returns the resulting matrix. |



### See Also
* module [`aspose.svg.datatypes`](..)
* class [`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)
* class [`SVGMatrix`](/svg/python-net/aspose.svg.datatypes/svgmatrix)
* class [`SVGValueType`](/svg/python-net/aspose.svg.datatypes/svgvaluetype)
