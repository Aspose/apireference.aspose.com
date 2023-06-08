---
title: Interface IMeshBuilderTMaterial
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.IMeshBuilder1TMaterial interface. Represents an utility class to help build meshes by adding primitives associated with a given material
type: docs
weight: 9900
url: /net/aspose.cad.fileformats.glb.geometry/imeshbuilder-1/
---
## IMeshBuilder&lt;TMaterial&gt; interface

Represents an utility class to help build meshes by adding primitives associated with a given material.

```csharp
public interface IMeshBuilder<TMaterial>
```

| Parameter | Description |
| --- | --- |
| TMaterial | The material type used by this [`PrimitiveBuilder`](../primitivebuilder-4/) instance. |

## Properties

| Name | Description |
| --- | --- |
| [Extras](../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/extras/) { get; set; } | Gets or sets the custom data of this object. |
| [IsEmpty](../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/isempty/) { get; } | Gets a value indicating whether this mesh does not contain any geometry. |
| [Materials](../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/materials/) { get; } | Gets a collection of materials used by this mesh. |
| [Name](../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/name/) { get; set; } | Gets or sets the display text name, or null. |
| [Primitives](../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/primitives/) { get; } | Gets a collection of primitives used by this mesh. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/clone/)(Func&lt;TMaterial, TMaterial&gt;) |  |
| [UseMorphTarget](../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/usemorphtarget/)(int) |  |
| [UsePrimitive](../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/useprimitive/)(TMaterial, int) | Creates, or uses an existing primitive using *material*. |
| [Validate](../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/validate/)() |  |

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../aspose.cad.fileformats.glb.geometry/)
* assembly [Aspose.CAD](../../)


