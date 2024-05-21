---
title: SVGTransform class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 240
url: /python-net/aspose.svg.datatypes/svgtransform/
is_root: false
---

## SVGTransform class

SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an SVGTransform object corresponds to a single component (e.g., 'scale(…)' or 'matrix(…)') within a ‘transform’ attribute specification.



**Inheritance:** [`SVGTransform`](/svg/python-net/aspose.svg.datatypes/svgtransform) → 
[`SVGValueType`](/svg/python-net/aspose.svg.datatypes/svgvaluetype) → 
[`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)



The SVGTransform type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [type](/svg/python-net/aspose.svg.datatypes/svgtransform/type) | The type of the value as specified by one of the SVG_TRANSFORM_* constants defined on this interface. |
| [matrix](/svg/python-net/aspose.svg.datatypes/svgtransform/matrix) | The matrix that represents this transformation. The matrix object is live, meaning that any changes made to the SVGTransform object are immediately reflected in the matrix object and vice versa. In case the matrix object is changed directly (i.e., without using the methods on the SVGTransform interface itself) then the type of the SVGTransform changes to SVG_TRANSFORM_MATRIX.<br/>For SVG_TRANSFORM_MATRIX, the matrix contains the a, b, c, d, e, f values supplied by the user.<br/>For SVG_TRANSFORM_TRANSLATE, e and f represent the translation amounts(a= 1, b= 0, c= 0 and d = 1).<br/>For SVG_TRANSFORM_SCALE, a and d represent the scale amounts(b= 0, c= 0, e= 0 and f = 0).<br/>For SVG_TRANSFORM_SKEWX and SVG_TRANSFORM_SKEWY, a, b, c and d represent the matrix which will result in the given skew(e= 0 and f = 0).<br/>For SVG_TRANSFORM_ROTATE, a, b, c, d, e and f together represent the matrix which will result in the given rotation.When the rotation is around the center point(0, 0), e and f will be zero. |
| [angle](/svg/python-net/aspose.svg.datatypes/svgtransform/angle) | A convenience attribute for SVG_TRANSFORM_ROTATE, SVG_TRANSFORM_SKEWX and SVG_TRANSFORM_SKEWY. It holds the angle that was specified.<br/>For SVG_TRANSFORM_MATRIX, SVG_TRANSFORM_TRANSLATE and SVG_TRANSFORM_SCALE, angle will be zero. |
| [SVG_TRANSFORM_UNKNOWN](/svg/python-net/aspose.svg.datatypes/svgtransform/svg_transform_unknown) | The unit type is not one of predefined types. It is invalid to attempt to define a new value of this type or to attempt to switch an existing value to this type. |
| [SVG_TRANSFORM_MATRIX](/svg/python-net/aspose.svg.datatypes/svgtransform/svg_transform_matrix) | A 'matrix(…)' transformation. |
| [SVG_TRANSFORM_TRANSLATE](/svg/python-net/aspose.svg.datatypes/svgtransform/svg_transform_translate) | A 'translate(…)' transformation. |
| [SVG_TRANSFORM_SCALE](/svg/python-net/aspose.svg.datatypes/svgtransform/svg_transform_scale) | A 'scale(…)' transformation. |
| [SVG_TRANSFORM_ROTATE](/svg/python-net/aspose.svg.datatypes/svgtransform/svg_transform_rotate) | A 'rotate(…)' transformation. |
| [SVG_TRANSFORM_SKEWX](/svg/python-net/aspose.svg.datatypes/svgtransform/svg_transform_skewx) | A 'skewX(…)' transformation. |
| [SVG_TRANSFORM_SKEWY](/svg/python-net/aspose.svg.datatypes/svgtransform/svg_transform_skewy) | A 'skewY(…)' transformation. |


### Methods
| Method | Description |
| :- | :- |
| [get_platform_type](/svg/python-net/aspose.svg.datatypes/svgtransform/get_platform_type/#) | This method is used to retrieve ECMAScript object Type. |
| [set_matrix](/svg/python-net/aspose.svg.datatypes/svgtransform/set_matrix/#aspose.svg.datatypes.SVGMatrix) | Sets the transform type to SVG_TRANSFORM_MATRIX, with parameter matrix defining the new transformation. The values from the parameter matrix are copied, the matrix parameter does not replace SVGTransform::matrix. |
| [set_translate](/svg/python-net/aspose.svg.datatypes/svgtransform/set_translate/#float-float) | Sets the transform type to SVG_TRANSFORM_TRANSLATE, with parameters tx and ty defining the translation amounts. |
| [set_scale](/svg/python-net/aspose.svg.datatypes/svgtransform/set_scale/#float-float) | Sets the transform type to SVG_TRANSFORM_SCALE, with parameters sx and sy defining the scale amounts. |
| [set_rotate](/svg/python-net/aspose.svg.datatypes/svgtransform/set_rotate/#float-float-float) | Sets the transform type to SVG_TRANSFORM_ROTATE, with parameter angle defining the rotation angle and parameters cx and cy defining the optional center of rotation. |
| [set_skew_x](/svg/python-net/aspose.svg.datatypes/svgtransform/set_skew_x/#float) | Sets the transform type to SVG_TRANSFORM_SKEWX, with parameter angle defining the amount of skew. |
| [set_skew_y](/svg/python-net/aspose.svg.datatypes/svgtransform/set_skew_y/#float) | Sets the transform type to SVG_TRANSFORM_SKEWY, with parameter angle defining the amount of skew. |



### See Also
* module [`aspose.svg.datatypes`](..)
* class [`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)
* class [`SVGTransform`](/svg/python-net/aspose.svg.datatypes/svgtransform)
* class [`SVGValueType`](/svg/python-net/aspose.svg.datatypes/svgvaluetype)
