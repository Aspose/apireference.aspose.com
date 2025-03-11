---
title: Matrix4.Scale
second_title: Aspose.3D for .NET API Reference
description: Matrix4 method. Creates a matrix that scales along the xaxis the yaxis and the zaxis
type: docs
weight: 50
url: /net/aspose.threed.utilities/matrix4/scale/
---
## Scale(Vector3) {#scale}

Creates a matrix that scales along the x-axis, the y-axis and the z-axis.

```csharp
public static Matrix4 Scale(Vector3 s)
```

| Parameter | Type | Description |
| --- | --- | --- |
| s | Vector3 | Scaling factories applies to the x-axis, the y-axis and the z-axis |

## Examples

The following code shows how to create a matrix for scale operation.

```csharp
var t = Matrix4.Scale(new Vector3(10, 10, 10));
var pos = new Vector3(1, 1, 10);
Console.WriteLine($"Transformed: {t * pos}");
```

### See Also

* struct [Vector3](../../vector3/)
* struct [Matrix4](../)
* namespace [Aspose.ThreeD.Utilities](../../matrix4/)
* assembly [Aspose.3D](../../../)

---

## Scale(double) {#scale_1}

Creates a matrix that scales along the x-axis, the y-axis and the z-axis.

```csharp
public static Matrix4 Scale(double s)
```

| Parameter | Type | Description |
| --- | --- | --- |
| s | Double | Scaling factories applies to all axex |

## Examples

The following code shows how to create a matrix for scale operation.

```csharp
var t = Matrix4.Scale(10);
var pos = new Vector3(1, 1, 10);
Console.WriteLine($"Transformed: {t * pos}");
```

### See Also

* struct [Matrix4](../)
* namespace [Aspose.ThreeD.Utilities](../../matrix4/)
* assembly [Aspose.3D](../../../)

---

## Scale(double, double, double) {#scale_2}

Creates a matrix that scales along the x-axis, the y-axis and the z-axis.

```csharp
public static Matrix4 Scale(double sx, double sy, double sz)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sx | Double | Scaling factories applies to the x-axis |
| sy | Double | Scaling factories applies to the y-axis |
| sz | Double | Scaling factories applies to the z-axis |

## Examples

The following code shows how to create a matrix for scale operation.

```csharp
var t = Matrix4.Scale(10, 20, 10);
var pos = new Vector3(1, 1, 10);
Console.WriteLine($"Transformed: {t * pos}");
```

### See Also

* struct [Matrix4](../)
* namespace [Aspose.ThreeD.Utilities](../../matrix4/)
* assembly [Aspose.3D](../../../)


