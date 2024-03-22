---
title: BoundingBox.op_Multiply
second_title: Aspose.3D for .NET API Reference
description: BoundingBox method. Operator overloading for multiply new bounding boxs minimum and maximum corner will be transformed by the matrix
type: docs
weight: 170
url: /net/aspose.threed.utilities/boundingbox/op_multiply/
---
## BoundingBox Multiply operator

Operator overloading for multiply, new bounding box's minimum and maximum corner will be transformed by the matrix.

```csharp
public static BoundingBox operator *(BoundingBox bbox, Matrix4 mat)
```

| Parameter | Type | Description |
| --- | --- | --- |
| bbox | BoundingBox | The input bounding box. |
| mat | Matrix4 | The matrix used to transform the bounding box's corners |

### Return Value

The product of bounding box and transform matrix.

### See Also

* struct [Matrix4](../../matrix4/)
* struct [BoundingBox](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)


