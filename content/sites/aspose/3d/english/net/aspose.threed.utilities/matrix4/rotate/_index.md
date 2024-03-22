---
title: Matrix4.Rotate
second_title: Aspose.3D for .NET API Reference
description: Matrix4 method. Create a rotation matrix by rotation angle and axis
type: docs
weight: 30
url: /net/aspose.threed.utilities/matrix4/rotate/
---
## Rotate(double, Vector3) {#rotate_1}

Create a rotation matrix by rotation angle and axis

```csharp
public static Matrix4 Rotate(double angle, Vector3 axis)
```

| Parameter | Type | Description |
| --- | --- | --- |
| angle | Double | Rotate angle in radian |
| axis | Vector3 | Rotation axis |

### Examples

The following code shows how to create a matrix for rotate operation.

```csharp
var t = Matrix4.Rotate(Math.PI, new Vector3(0, 1, 0));
var pos = new Vector3(1, 1, 10);
Console.WriteLine($"Transformed: {t * pos}");
```

### See Also

* struct [Vector3](../../vector3/)
* struct [Matrix4](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)

---

## Rotate(Quaternion) {#rotate}

Create a rotation matrix from a quaternion

```csharp
public static Matrix4 Rotate(Quaternion q)
```

| Parameter | Type | Description |
| --- | --- | --- |
| q | Quaternion | Rotation quaternion |

### Examples

The following code shows how to create a matrix for rotate operation.

```csharp
var t = Matrix4.Rotate(Quaternion.FromAngleAxis(Math.PI, Vector3.YAxis));
var pos = new Vector3(1, 1, 10);
Console.WriteLine($"Transformed: {t * pos}");
```

### See Also

* struct [Quaternion](../../quaternion/)
* struct [Matrix4](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)


