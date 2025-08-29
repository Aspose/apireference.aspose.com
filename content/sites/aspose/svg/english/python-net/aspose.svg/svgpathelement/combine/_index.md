---
title: combine method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.svg/svgpathelement/combine/
is_root: false
---

## combine {#aspose.svg.SVGGeometryElement-aspose.svg.rendering.BooleanPathOp}

Combines this geometry with another SVG geometry using a boolean operation,
and returns a new `<path>` element containing the result.


### Returns 


A new [`SVGPathElement`](/svg/python-net/aspose.svg/svgpathelement) whose `d` attribute encodes the result
in root `<svg>` user space (CSS px). The element is not appended to the DOM.


```python
def combine(self, geometry_element, op):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| geometry_element | [`SVGGeometryElement`](/svg/python-net/aspose.svg/svggeometryelement) | The other geometry to combine with. Must be in the same document. |
| op | aspose.svg.rendering.BooleanPathOp | The boolean operator to apply: Union (A UNION B), Difference (A - B),<br/>Intersection (A INTERSECT B), or Exclusion (XOR). |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentNullException | Thrown if `geometry_element` is null. |
| InvalidOperationException | Thrown if this element has no owner document. |
| NotSupportedException | Thrown when boolean path operations are unavailable; this feature requires the SkiaSharp backend (install the Aspose.SVG.Drawing.SkiaSharp package). |





### See Also
* module [`aspose.svg`](../../)
* class [`SVGPathElement`](/svg/python-net/aspose.svg/svgpathelement)
