---
title: ClipStrategy Enum
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Rendering.ClipStrategy enum. Specifies the strategy for clipping an SVG element. This enum is used to determine how to apply clipping paths or masks to SVG elements during rendering
type: docs
weight: 2450
url: /net/aspose.svg.rendering/clipstrategy/
---
## ClipStrategy enumeration

Specifies the strategy for clipping an SVG element. This enum is used to determine how to apply clipping paths or masks to SVG elements during rendering.

```csharp
public enum ClipStrategy
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | `0` | Indicates that no clipping will be applied to the SVG element. This strategy is used when there is no clip-path or mask associated with the SVG element. |
| Mask | `1` | This strategy applies a mask for clipping. This strategy is used when the SVG element has a mask element applied to it. Instead of clipping the canvas, a mask layer is used to determine the visibility of the SVG element. A mask is an image where the alpha value of each pixel is used to determine the visibility of the corresponding pixel in the SVG element. |
| Path | `2` | This strategy uses a path for clipping. This strategy is used when the SVG element has a clipPath element applied to it. A clipPath is a region defined by a path; anything outside of this path is clipped out. |

### See Also

* namespace [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* assembly [Aspose.SVG](../../)
