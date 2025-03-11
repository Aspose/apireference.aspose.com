---
title: Matrix4.Concatenate
second_title: Aspose.3D for .NET API Reference
description: Matrix4 method. Concatenates the two matrices
type: docs
weight: 240
url: /net/aspose.threed.utilities/matrix4/concatenate/
---
## Matrix4.Concatenate method

Concatenates the two matrices

```csharp
public Matrix4 Concatenate(Matrix4 m2)
```

| Parameter | Type | Description |
| --- | --- | --- |
| m2 | Matrix4 | M2. |

### Return Value

New matrix4

## Examples

```csharp
var t = Matrix4.Translate(0, 10, 9);
var s = Matrix4.Scale(10, 10, 10);
var transform = t.Concatenate(s);
var pos = new Vector3(10, 0, -1);
var transformed = transform * pos;
```

### See Also

* struct [Matrix4](../)
* namespace [Aspose.ThreeD.Utilities](../../matrix4/)
* assembly [Aspose.3D](../../../)


