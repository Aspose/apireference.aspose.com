---
title: TransformBuilder.Rotate
second_title: Aspose.3D for .NET API Reference
description: TransformBuilder method. Chain a rotation by a quaternion
type: docs
weight: 90
url: /net/aspose.threed.utilities/transformbuilder/rotate/
---
## TransformBuilder.Rotate method

Chain a rotation by a quaternion

```csharp
public TransformBuilder Rotate(Quaternion q)
```

| Parameter | Type | Description |
| --- | --- | --- |
| q | Quaternion |  |

## Examples

```csharp
TransformBuilder tb = new TransformBuilder();
tb.Rotate(Quaternion.FromEulerAngle(0, Math.PI, 0));
Console.WriteLine($"Transform Matrix: {tb.Matrix}");
```

### See Also

* struct [Quaternion](../../quaternion/)
* class [TransformBuilder](../)
* namespace [Aspose.ThreeD.Utilities](../../transformbuilder/)
* assembly [Aspose.3D](../../../)


