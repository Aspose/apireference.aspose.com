---
title: TransformBuilder.RotateEulerDegree
second_title: Aspose.3D for .NET API Reference
description: TransformBuilder method. Chain a rotation by Euler angles in degree
type: docs
weight: 110
url: /net/aspose.threed.utilities/transformbuilder/rotateeulerdegree/
---
## TransformBuilder.RotateEulerDegree method

Chain a rotation by Euler angles in degree

```csharp
public TransformBuilder RotateEulerDegree(double degX, double degY, double degZ)
```

| Parameter | Type | Description |
| --- | --- | --- |
| degX | Double |  |
| degY | Double |  |
| degZ | Double |  |

### Examples

```csharp
TransformBuilder tb = new TransformBuilder();
tb.RotateEulerDegree(0, 90, 0);
Console.WriteLine($"Transform Matrix: {tb.Matrix}");
```

### See Also

* class [TransformBuilder](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)


