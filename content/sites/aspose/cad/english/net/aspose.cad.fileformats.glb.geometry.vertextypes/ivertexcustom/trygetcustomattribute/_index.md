---
title: IVertexCustom.TryGetCustomAttribute
second_title: Aspose.CAD for .NET API Reference
description: IVertexCustom method. Tries to get a custom attribute
type: docs
weight: 30
url: /net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/trygetcustomattribute/
---
## IVertexCustom.TryGetCustomAttribute method

Tries to get a custom attribute.

```csharp
public bool TryGetCustomAttribute(string attributeName, out object value)
```

| Parameter | Type | Description |
| --- | --- | --- |
| attributeName | String | The attribute name. |
| value | Object& | the value if found, or null if not found. |

### Return Value

true if the value was found. False otherwise.

## Examples

```csharp
public bool TryGetCustomAttribute(string attributeName, out object value)
{
    if (attributeName != "CustomFloat") { value = null; return false; }
    value = this.CustomValue; return true;
}
```

### See Also

* interface [IVertexCustom](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes](../../ivertexcustom/)
* assembly [Aspose.CAD](../../../)


