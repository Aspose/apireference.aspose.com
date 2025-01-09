---
title: Enum StencilAction
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Render.StencilAction enum. The stencil test actions
type: docs
weight: 2330
url: /net/aspose.threed.render/stencilaction/
---
## StencilAction enumeration

The stencil test actions

```csharp
public enum StencilAction
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Keep | `0` | Keep the current value |
| Zero | `1` | Sets the stencil buffer value to 0 |
| Replace | `2` | Sets the stencil buffer to ref where defined in [`StencilReference`](../renderstate/stencilreference/) |
| Increment | `3` | Increments the current stencil buffer value, clamps to maximum value. |
| IncrementWrap | `4` | Increments the current stencil buffer value and wrap it to zero when it reaches maximum value. |
| Decrement | `5` | Increments the current stencil buffer value, clamps to 0. |
| DecrementWrap | `6` | Decrements the current stencil buffer value and wrap it to maximum value when it reaches zero. |
| Invert | `7` | Bit-wise inverts the current stencil buffer value. |

### See Also

* namespace [Aspose.ThreeD.Render](../../aspose.threed.render/)
* assembly [Aspose.3D](../../)


