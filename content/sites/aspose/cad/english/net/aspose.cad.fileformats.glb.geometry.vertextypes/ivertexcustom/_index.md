---
title: Interface IVertexCustom
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes.IVertexCustom interface. Represents the interface that must be implemented by a custom vertex fragment
type: docs
weight: 10070
url: /net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/
---
## IVertexCustom interface

Represents the interface that must be implemented by a custom vertex fragment.

```csharp
public interface IVertexCustom : IVertexMaterial
```

## Properties

| Name | Description |
| --- | --- |
| [CustomAttributes](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/customattributes/) { get; } | Gets a collection of the attribute keys defined in this vertex. |

## Methods

| Name | Description |
| --- | --- |
| [SetCustomAttribute](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/setcustomattribute/)(string, object) | Sets a custom attribute only if *attributeName* is defined in the vertex. |
| [TryGetCustomAttribute](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/trygetcustomattribute/)(string, out object) | Tries to get a custom attribute. |
| [Validate](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/validate/)() | Validates the custom attributes of the vertex fragment. Called by !:VertexBuilder.Validate. |

### See Also

* interface [IVertexMaterial](../ivertexmaterial/)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes](../../aspose.cad.fileformats.glb.geometry.vertextypes/)
* assembly [Aspose.CAD](../../)


