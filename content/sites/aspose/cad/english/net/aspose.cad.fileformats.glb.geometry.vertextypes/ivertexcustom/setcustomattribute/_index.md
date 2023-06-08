---
title: IVertexCustom.SetCustomAttribute
second_title: Aspose.CAD for .NET API Reference
description: IVertexCustom method. Sets a custom attribute only if attributeName is defined in the vertex
type: docs
weight: 20
url: /net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/setcustomattribute/
---
## IVertexCustom.SetCustomAttribute method

Sets a custom attribute only if *attributeName* is defined in the vertex.

**⚠️ USE ONLY ON UNBOXED VALUES ⚠️**

```csharp
public void SetCustomAttribute(string attributeName, object value)
```

| Parameter | Type | Description |
| --- | --- | --- |
| attributeName | String | The attribute name. |
| value | Object | The attribute value. |

## Remarks

If *attributeName* is not defined in the custom vertex, the method must not do any action.

## Examples

```csharp
public void SetCustomAttribute(string attributeName, object value)
{
    if (attributeName == "CustomFloat" && value is float f) this.CustomValue = f;
}
```

### See Also

* interface [IVertexCustom](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes](../../ivertexcustom/)
* assembly [Aspose.CAD](../../../)


