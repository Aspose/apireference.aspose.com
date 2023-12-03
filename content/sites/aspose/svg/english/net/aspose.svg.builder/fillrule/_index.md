---
title: FillRule Enum
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.FillRule enum. Specifies the rule to determine what parts of a shape are inside or outside in SVG graphics
type: docs
weight: 240
url: /net/aspose.svg.builder/fillrule/
---
## FillRule enumeration

Specifies the rule to determine what parts of a shape are inside or outside in SVG graphics.

```csharp
public enum FillRule
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Nonzero | `0` | The nonzero winding rule: Determines the "insideness" of a point in the shape by drawing a ray from that point to infinity in any direction and counting the number of path segments from the given shape that the ray crosses. If this number is odd, the point is inside; if even, the point is outside. |
| Evenodd | `1` | The even-odd winding rule: Determines the "insideness" of a point in the shape by drawing a ray from that point to infinity in any direction and counting the number of path segments from the given shape that the ray crosses. If this number is even, the point is outside; if odd, the point is inside. |

### See Also

* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
