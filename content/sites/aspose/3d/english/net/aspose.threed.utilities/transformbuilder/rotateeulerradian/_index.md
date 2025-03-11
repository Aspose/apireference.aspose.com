---
title: TransformBuilder.RotateEulerRadian
second_title: Aspose.3D for .NET API Reference
description: TransformBuilder method. Chain a rotation by Euler angles in radian
type: docs
weight: 120
url: /net/aspose.threed.utilities/transformbuilder/rotateeulerradian/
---
## RotateEulerRadian(double, double, double) {#rotateeulerradian_1}

Chain a rotation by Euler angles in radian

```csharp
public TransformBuilder RotateEulerRadian(double x, double y, double z)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x | Double |  |
| y | Double |  |
| z | Double |  |

## Examples

```csharp
TransformBuilder tb = new TransformBuilder();
tb.RotateEulerRadian(0, Math.PI, 0);
Console.WriteLine($"Transform Matrix: {tb.Matrix}");
```

### See Also

* class [TransformBuilder](../)
* namespace [Aspose.ThreeD.Utilities](../../transformbuilder/)
* assembly [Aspose.3D](../../../)

---

## RotateEulerRadian(Vector3) {#rotateeulerradian}

Chain a rotation by Euler angles in radian

```csharp
public TransformBuilder RotateEulerRadian(Vector3 r)
```

| Parameter | Type | Description |
| --- | --- | --- |
| r | Vector3 |  |

## Examples

```csharp
TransformBuilder tb = new TransformBuilder();
tb.RotateEulerRadian(new Vector3(0, Math.PI, 0));
Console.WriteLine($"Transform Matrix: {tb.Matrix}");
```

### See Also

* struct [Vector3](../../vector3/)
* class [TransformBuilder](../)
* namespace [Aspose.ThreeD.Utilities](../../transformbuilder/)
* assembly [Aspose.3D](../../../)


