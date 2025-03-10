---
title: Matrix4.Transpose
second_title: Aspose.3D for .NET API Reference
description: Matrix4 method. Transposes this instance
type: docs
weight: 310
url: /net/aspose.threed.utilities/matrix4/transpose/
---
## Matrix4.Transpose method

Transposes this instance.

```csharp
public Matrix4 Transpose()
```

### Return Value

The transposed matrix.

## Examples

The following code shows how to transpose a matrix

```csharp
var t = Matrix4.Translate(0, 10, 9);
var mat = t.Transpose();
Console.WriteLine($"Transposed Matrix: {mat}");
```

### See Also

* struct [Matrix4](../)
* namespace [Aspose.ThreeD.Utilities](../../matrix4/)
* assembly [Aspose.3D](../../../)


