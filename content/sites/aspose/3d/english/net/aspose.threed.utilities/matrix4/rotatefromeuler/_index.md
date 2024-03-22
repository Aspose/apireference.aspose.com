---
title: Matrix4.RotateFromEuler
second_title: Aspose.3D for .NET API Reference
description: Matrix4 method. Create a rotation matrix from Euler angle
type: docs
weight: 40
url: /net/aspose.threed.utilities/matrix4/rotatefromeuler/
---
## RotateFromEuler(Vector3) {#rotatefromeuler}

Create a rotation matrix from Euler angle

```csharp
public static Matrix4 RotateFromEuler(Vector3 eul)
```

| Parameter | Type | Description |
| --- | --- | --- |
| eul | Vector3 | Rotation in radian |

### Examples

The following code shows how to create a matrix for rotate operation.

```csharp
var t = Matrix4.RotateFromEuler(new Vector3(0, Math.PI, 0));
var pos = new Vector3(1, 1, 10);
Console.WriteLine($"Transformed: {t * pos}");
```

### See Also

* struct [Vector3](../../vector3/)
* struct [Matrix4](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)

---

## RotateFromEuler(double, double, double) {#rotatefromeuler_1}

Create a rotation matrix from Euler angle

```csharp
public static Matrix4 RotateFromEuler(double rx, double ry, double rz)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rx | Double | Rotation in x axis in radian |
| ry | Double | Rotation in y axis in radian |
| rz | Double | Rotation in z axis in radian |

### Examples

The following code shows how to create a matrix for rotate operation.

```csharp
var t = Matrix4.RotateFromEuler(0, Math.PI, 0);
var pos = new Vector3(1, 1, 10);
Console.WriteLine($"Transformed: {t * pos}");
```

### See Also

* struct [Matrix4](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)


