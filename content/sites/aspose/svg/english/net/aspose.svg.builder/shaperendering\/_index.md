---
title: ShapeRendering Enum
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.ShapeRendering enum. Specifies the shape rendering mode for SVG elements
type: docs
weight: 1720
url: /net/aspose.svg.builder/shaperendering/
---
## ShapeRendering enumeration

Specifies the shape rendering mode for SVG elements.

```csharp
public enum ShapeRendering
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Auto | `0` | The browser makes trade-offs between speed, smoothness, and geometric precision when rendering shapes. |
| OptimizeSpeed | `1` | The browser emphasizes rendering speed over geometric precision and smoothness. This mode can lead to faster rendering but less accurate shapes. |
| CrispEdges | `2` | The browser attempts to preserve sharp edges and corners. This mode is useful for rendering graphics with straight lines and edges. |
| GeometricPrecision | `3` | The browser emphasizes geometric precision in rendering at the cost of speed. This mode is suitable for high-quality rendering where precise geometry is important. |

### See Also

* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
