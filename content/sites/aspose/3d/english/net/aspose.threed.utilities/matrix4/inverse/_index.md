---
title: Matrix4.Inverse
second_title: Aspose.3D for .NET API Reference
description: Matrix4 method. Inverses this instance
type: docs
weight: 260
url: /net/aspose.threed.utilities/matrix4/inverse/
---
## Matrix4.Inverse method

Inverses this instance.

```csharp
public Matrix4 Inverse()
```

### Return Value

Inverse matrix4

### Examples

The following code shows how to inverse a matrix

```csharp
var t = Matrix4.Translate(0, 10, 9);
var mat = t.Inverse();
Console.WriteLine($"Inversed Matrix: {mat}");
```

### See Also

* struct [Matrix4](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)


