---
title: TransformBuilder.RotateDegree
second_title: Aspose.3D for .NET API Reference
description: TransformBuilder method. Chain a rotation transform in degree
type: docs
weight: 100
url: /net/aspose.threed.utilities/transformbuilder/rotatedegree/
---
## RotateDegree(double, Vector3) {#rotatedegree}

Chain a rotation transform in degree

```csharp
public TransformBuilder RotateDegree(double angle, Vector3 axis)
```

| Parameter | Type | Description |
| --- | --- | --- |
| angle | Double | The angle to rotate in degree |
| axis | Vector3 | The axis to rotate |

## Examples

```csharp
TransformBuilder tb = new TransformBuilder();
tb.RotateDegree(90, Vector3.YAxis);
Console.WriteLine($"Transform Matrix: {tb.Matrix}");
```

### See Also

* struct [Vector3](../../vector3/)
* class [TransformBuilder](../)
* namespace [Aspose.ThreeD.Utilities](../../transformbuilder/)
* assembly [Aspose.3D](../../../)

---

## RotateDegree(Vector3, RotationOrder) {#rotatedegree_1}

Append rotation with specified order

```csharp
public void RotateDegree(Vector3 rot, RotationOrder order)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rot | Vector3 | Rotation in degrees |
| order | RotationOrder |  |

### See Also

* struct [Vector3](../../vector3/)
* enum [RotationOrder](../../rotationorder/)
* class [TransformBuilder](../)
* namespace [Aspose.ThreeD.Utilities](../../transformbuilder/)
* assembly [Aspose.3D](../../../)


