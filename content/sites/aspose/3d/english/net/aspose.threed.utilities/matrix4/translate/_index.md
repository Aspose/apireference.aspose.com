---
title: Matrix4.Translate
second_title: Aspose.3D for .NET API Reference
description: Matrix4 method. Creates a matrix that translates along the xaxis the yaxis and the zaxis
type: docs
weight: 60
url: /net/aspose.threed.utilities/matrix4/translate/
---
## Translate(Vector3) {#translate}

Creates a matrix that translates along the x-axis, the y-axis and the z-axis

```csharp
public static Matrix4 Translate(Vector3 t)
```

| Parameter | Type | Description |
| --- | --- | --- |
| t | Vector3 | Translate offset |

### Examples

The following code shows how to create a matrix for translate operation.

```csharp
var t = Matrix4.Translate(new Vector3(10, 0, 0));
var pos = new Vector3(1, 1, 10);
Console.WriteLine($"Transformed: {t * pos}");
```

### See Also

* struct [Vector3](../../vector3/)
* struct [Matrix4](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)

---

## Translate(double, double, double) {#translate_1}

Creates a matrix that translates along the x-axis, the y-axis and the z-axis

```csharp
public static Matrix4 Translate(double tx, double ty, double tz)
```

| Parameter | Type | Description |
| --- | --- | --- |
| tx | Double | X-coordinate offset |
| ty | Double | Y-coordinate offset |
| tz | Double | Z-coordinate offset |

### Examples

The following code shows how to create a matrix for translate operation.

```csharp
var t = Matrix4.Translate(10, 0, 0);
var pos = new Vector3(1, 1, 10);
Console.WriteLine($"Transformed: {t * pos}");
```

### See Also

* struct [Matrix4](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)


