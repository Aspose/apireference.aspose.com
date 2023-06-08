---
title: Class Material
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Material class. The material appearance of a primitive
type: docs
weight: 10480
url: /net/aspose.cad.fileformats.glb/material/
---
## Material class

The material appearance of a primitive.

```csharp
public sealed class Material : LogicalChildOfRoot
```

## Properties

| Name | Description |
| --- | --- |
| [Alpha](../../aspose.cad.fileformats.glb/material/alpha/) { get; set; } | Gets or sets the [`AlphaMode`](../alphamode/). |
| [AlphaCutoff](../../aspose.cad.fileformats.glb/material/alphacutoff/) { get; set; } | Gets or sets the [`AlphaCutoff`](./alphacutoff/) value. It needs to be used in combination with [`Alpha`](./alpha/) = MASK. |
| [Channels](../../aspose.cad.fileformats.glb/material/channels/) { get; } | Gets a collection of [`MaterialChannel`](../materialchannel/) elements available in this `Material` instance. |
| [DoubleSided](../../aspose.cad.fileformats.glb/material/doublesided/) { get; set; } | Gets or sets a value indicating whether this `Material` will render as Double Sided. Default value: False |
| [Extensions](../../aspose.cad.fileformats.glb/extraproperties/extensions/) { get; } | Gets a collection of [`JsonSerializable`](../../aspose.cad.fileformats.glb.io/jsonserializable/) instances. |
| [Extras](../../aspose.cad.fileformats.glb/extraproperties/extras/) { get; set; } | Gets or sets the extras content of this instance. |
| [IndexOfRefraction](../../aspose.cad.fileformats.glb/material/indexofrefraction/) { get; set; } | Gets or sets the index of refraction. |
| [LogicalIndex](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalindex/) { get; } | Gets the zero-based index of this object in the Logical resources of [`GlbImage`](../glbimage/). |
| [LogicalParent](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalparent/) { get; } | Gets the [`GlbImage`](../glbimage/) instance that owns this object. |
| [Name](../../aspose.cad.fileformats.glb/logicalchildofroot/name/) { get; set; } | Gets or sets the display text name, or null. |
| [Unlit](../../aspose.cad.fileformats.glb/material/unlit/) { get; } | Gets a value indicating whether this `Material` instance has Unlit extension. |

## Methods

| Name | Description |
| --- | --- |
| [FindChannel](../../aspose.cad.fileformats.glb/material/findchannel/)(string) | Finds an instance of [`MaterialChannel`](../materialchannel/) |
| [GetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/getextension/)() |  |
| [InitializePBRMetallicRoughness](../../aspose.cad.fileformats.glb/material/initializepbrmetallicroughness/)(params string[]) | Initializes this `Material` instance with PBR Metallic Roughness attributes. |
| [InitializePBRSpecularGlossiness](../../aspose.cad.fileformats.glb/material/initializepbrspecularglossiness/)(bool) | Initializes this `Material` instance with PBR Specular Glossiness attributes. |
| [InitializeUnlit](../../aspose.cad.fileformats.glb/material/initializeunlit/)() | Initializes this `Material` instance with Unlit attributes. |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)(T) |  |
| [SetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/setextension/)(T) |  |
| [UseExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/useextension/)() |  |

### See Also

* class [LogicalChildOfRoot](../logicalchildofroot/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


