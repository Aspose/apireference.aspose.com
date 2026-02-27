---
title: SVGGeometryElement.Combine
second_title: Aspose.SVG for .NET API Reference
description: SVGGeometryElement Combine method. Combines this geometry with another SVG geometry using a boolean operation and returns a new path element containing the result
type: docs
weight: 20
url: /net/aspose.svg/svggeometryelement/combine/
---
## SVGGeometryElement.Combine method

Combines this geometry with another SVG geometry using a boolean operation, and returns a new `<path>` element containing the result.

```csharp
public SVGPathElement Combine(SVGGeometryElement geometryElement, BooleanPathOp op)
```

| Parameter | Type | Description |
| --- | --- | --- |
| geometryElement | SVGGeometryElement | The other geometry to combine with. Must be in the same document. |
| op | BooleanPathOp | The boolean operator to apply: Union (A UNION B), Difference (A - B), Intersection (A INTERSECT B), or Exclusion (XOR). |

### Return Value

A new [`SVGPathElement`](../../svgpathelement/) whose `d` attribute encodes the result in root `<svg>` user space (CSS px). The element is not appended to the DOM.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Thrown if *geometryElement* is null. |
| InvalidOperationException | Thrown if this element has no owner document. |
| NotSupportedException | Thrown when boolean path operations are unavailable; this feature requires the SkiaSharp backend (install the Aspose.SVG.Drawing.SkiaSharp package). |

### See Also

* class [SVGPathElement](../../svgpathelement/)
* enum [BooleanPathOp](../../../aspose.svg.rendering/booleanpathop/)
* class [SVGGeometryElement](../)
* namespace [Aspose.Svg](../../../aspose.svg/)
* assembly [Aspose.SVG](../../../)
