---
title: SVGPoint class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 190
url: /aspose.svg.datatypes/svgpoint/
is_root: false
---

## SVGPoint class

Many of the SVG DOM interfaces refer to objects of class SVGPoint. An SVGPoint is an (x, y) coordinate pair. When used in matrix operations, an SVGPoint is treated as a vector of the form:
[x]
[y]
[1]
If an SVGRect object is designated as read only, then attempting to assign to one of its attributes will result in an exception being thrown.



**Inheritance:** [`SVGPoint`](./aspose.svg.datatypes/svgpoint) → 
[`SVGValueType`](./aspose.svg.datatypes/svgvaluetype) → 
[`DOMObject`](./aspose.svg.dom/domobject)



The SVGPoint type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [x](./aspose.svg.datatypes/svgpoint/x) | The X coordinate. |
| [y](./aspose.svg.datatypes/svgpoint/y) | The Y coordinate. |


### Methods
| Method | Description |
| :- | :- |
| [get_platform_type](./aspose.svg.datatypes/svgpoint/get_platform_type/#) | This method is used to retrieve ECMAScript object Type. |
| [matrix_transform](./aspose.svg.datatypes/svgpoint/matrix_transform/#aspose.svg.datatypes.SVGMatrix) | Applies a 2x3 matrix transformation on this SVGPoint object and returns a new, transformed SVGPoint object:<br/>newpoint = matrix* thispoint |



### See Also
* module [`aspose.svg.datatypes`](..)
* class [`DOMObject`](./aspose.svg.dom/domobject)
* class [`SVGPoint`](./aspose.svg.datatypes/svgpoint)
* class [`SVGValueType`](./aspose.svg.datatypes/svgvaluetype)
