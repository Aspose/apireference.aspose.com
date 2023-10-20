---
title: Enum CombineMode
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Drawing2D.CombineMode enum. Specifies how different clipping regions can be combined
type: docs
weight: 160
url: /net/system.drawing.drawing2d/combinemode/
---
## CombineMode enumeration

Specifies how different clipping regions can be combined.

```csharp
public enum CombineMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Replace | `0` | One clipping region is replaced by another. |
| Intersect | `1` | Two clipping regions are combined by taking their intersection. |
| Union | `2` | Two clipping regions are combined by taking the union of both. |
| Xor | `3` | Two clipping regions are combined by taking only the areas enclosed by one or the other region, but not both. |
| Exclude | `4` | Specifies that the existing region is replaced by the result of the new region being removed from the existing region. Said differently, the new region is excluded from the existing region. |
| Complement | `5` | Specifies that the existing region is replaced by the result of the existing region being removed from the new region. Said differently, the existing region is excluded from the new region. |

### See Also

* namespace [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* assembly [Aspose.Drawing](../../)


