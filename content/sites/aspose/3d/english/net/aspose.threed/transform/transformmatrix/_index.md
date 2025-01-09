---
title: Transform.TransformMatrix
second_title: Aspose.3D for .NET API Reference
description: Transform property. Gets or sets the transform matrix
type: docs
weight: 130
url: /net/aspose.threed/transform/transformmatrix/
---
## Transform.TransformMatrix property

Gets or sets the transform matrix.

```csharp
public Matrix4 TransformMatrix { get; set; }
```

### Remarks

Assign on this will reset the [`Translation`](../translation/), [`Scaling`](../scaling/) and [`Rotation`](../rotation/), the [`GeometricRotation`](../geometricrotation/), [`GeometricScaling`](../geometricscaling/) and [`GeometricTranslation`](../geometrictranslation/) will not be affected.

### Examples

```csharp
Node node = new Node();
node.Transform.TransformMatrix = Matrix4.Identity;
```

### See Also

* struct [Matrix4](../../../aspose.threed.utilities/matrix4/)
* class [Transform](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


