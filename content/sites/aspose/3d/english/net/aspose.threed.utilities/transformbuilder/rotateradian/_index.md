---
title: TransformBuilder.RotateRadian
second_title: Aspose.3D for .NET API Reference
description: TransformBuilder method. Chain a rotation transform in radian
type: docs
weight: 130
url: /net/aspose.threed.utilities/transformbuilder/rotateradian/
---
## RotateRadian(double, Vector3) {#rotateradian}

Chain a rotation transform in radian

```csharp
public TransformBuilder RotateRadian(double angle, Vector3 axis)
```

| Parameter | Type | Description |
| --- | --- | --- |
| angle | Double | The angle to rotate in radian |
| axis | Vector3 | The axis to rotate |

### Examples

```csharp
TransformBuilder tb = new TransformBuilder();
tb.RotateRadian(Math.PI, Vector3.YAxis);
Console.WriteLine($"Transform Matrix: {tb.Matrix}");
```

### See Also

* struct [Vector3](../../vector3/)
* class [TransformBuilder](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)

---

## RotateRadian(Vector3, RotationOrder) {#rotateradian_1}

Append rotation with specified order

```csharp
public void RotateRadian(Vector3 rot, RotationOrder order)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rot | Vector3 | Rotation in radian |
| order | RotationOrder |  |

### Examples

```csharp
TransformBuilder tb = new TransformBuilder();
tb.RotateRadian(new Vector3(0.3, 0.4, 0.1), RotationOrder.YZX);
Console.WriteLine($"Transform Matrix: {tb.Matrix}");
```

### See Also

* struct [Vector3](../../vector3/)
* enum [RotationOrder](../../rotationorder/)
* class [TransformBuilder](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)


