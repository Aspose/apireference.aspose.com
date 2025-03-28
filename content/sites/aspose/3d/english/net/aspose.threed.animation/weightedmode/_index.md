---
title: Enum WeightedMode
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Animation.WeightedMode enum. Weighted mode
type: docs
weight: 120
url: /net/aspose.threed.animation/weightedmode/
---
## WeightedMode enumeration

Weighted mode.

```csharp
[Flags]
public enum WeightedMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | `0` | Both out and next in weights are not used. When calculation needs tangent information, default value(0.3333) will be used. |
| OutWeight | `1` | Out(right) tangent is weighted. |
| NextInWeight | `2` | Next in(left) tangent is weighted. |
| Both | `3` | Both out and next in tangents are weighted. |

### See Also

* namespace [Aspose.ThreeD.Animation](../../aspose.threed.animation/)
* assembly [Aspose.3D](../../)


